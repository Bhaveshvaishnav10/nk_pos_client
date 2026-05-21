# Migration Documentation

**Prepared:** 2026-05-17  
**Last Updated:** 2026-05-21  
**SDK Version Change:** `neokred-sdk-release.aar` (Apr 6) → `neokred-sdk-release1.0.1.aar` (May 20)

---

## Overview

The migration from the source project  to the current project  is primarily a **Neokred SDK upgrade**. The package structure, app ID, build config, resources, manifest, and 84 of the 88 source files are identical. Only **4 Java files** were modified to adapt to the new SDK API.

---

## 1. SDK Library Change

| Property | Source Project | Current Project |
|---|---|---|
| AAR filename | `neokred-sdk-release.aar` | `neokred-sdk-release1.0.1.aar` |
| AAR size | 7.2 MB | 7.2 MB |
| AAR date | Apr 6 | May 20 |
| `mvvmhabit-release.aar` | Same (350 KB, Apr 2) | Same (350 KB, Apr 2) |

**Action required during migration:** Replace `app/libs/neokred-sdk-release.aar` with `app/libs/neokred-sdk-release1.0.1.aar` and update `app/build.gradle` if the filename is hard-coded (in this project both use `fileTree(dir: 'libs', include: ['*.aar', '*.jar'])` so no change to build.gradle is needed).

---

## 2. Files Changed (4 files)

### 2.1 `PaymentActivity.java` — Major changes (SDK callback rename + NFC handling)

**Path:** `app/src/main/java/com/neokred/pos/ui/payment/PaymentActivity.java`

#### 2.1.1 Connection Callback Method Renames

| Source (old SDK) | Current (new SDK 1.0.1) |
|---|---|
| `onDeviceNotFound()` | `onRequestNoQposDetected()` |
| `onConnected()` | `onRequestQposConnected()` |
| `onDisconnected()` | `onRequestQposDisconnected()` |

#### 2.1.2 Transaction Callback Method Renames

| Source (old SDK) | Current (new SDK 1.0.1) |
|---|---|
| `onEmvAppSelectionRequired(List<String> appList)` | `onRequestSelectEmvApp(List<String> appNames)` |
| `onPinRequested(NKPinRequest pinRequest)` | `onQposRequestPinResult(NKPinRequest pinRequest)` |
| `onOfflinePinRequested()` | `onRequestSetPin()` |
| `onDisplayMessage(NKDisplayMessage displayMsg)` | `onRequestDisplay(NKDisplayMessage message)` |
| `onCardRead(NKCardData cardData)` | `onDoTradeResult(NKCardData cardData)` |
| `onTransactionComplete(NKTransactionResult result)` | `onRequestTransactionResult(NKTransactionResult result)` |
| `onOnlineAuthRequested(String tlv, NKCardData cardData)` | `onRequestOnlineProcess(String tlv, NKCardData cardData)` |

#### 2.1.3 New Callbacks Added in Current Project

Two new callback methods were added that did **not exist** in the source project:

```java
@Override
public void onReturnGetPinInputResult(int digitsEntered, boolean success, String reason, int minLen, int maxLen)
```
- Called by the SDK during PIN entry to update the PIN digit count display.
- `digitsEntered == -1` signals PIN entry is complete (hides keyboard, clears field).
- Otherwise updates `pinpadEditText` with asterisks matching digit count.

```java
@Override
public void onReturnReversalData(String tlv)
```
- Called by the SDK when reversal TLV data is available.
- Currently just logs the TLV string.

#### 2.1.4 PIN Keyboard Initialization Change

**Source** — `onPinRequested()` used a static `MyKeyboardView.setKeyBoardListener()` with an inline `pinBuilder` accumulating keystrokes, then called `initKeyboard()` without a listener:

```java
final StringBuilder pinBuilder = new StringBuilder();
MyKeyboardView.setKeyBoardListener(value -> {
    // accumulate key presses into pinBuilder
    pos.pinMapSync(value, 20);
});
keyboardUtil.initKeyboard(MyKeyboardView.KEYBOARDTYPE_Only_Num_Pwd, binding.pinpadEditText);
```

**Current** — `onQposRequestPinResult()` removes the `pinBuilder` entirely. The listener is set via a separate `MyKeyboardView.setKeyBoardListener()` call inside `initKeyboard()`, and the PIN timeout was increased from 20 → 60 seconds:

```java
MyKeyboardView.setKeyBoardListener(value -> pos.pinMapSync(value, 60));
// ... then later:
keyboardUtil.initKeyboard(MyKeyboardView.KEYBOARDTYPE_Only_Num_Pwd, binding.pinpadEditText);
```

The SDK now tracks individual key presses and reports them back via `onReturnGetPinInputResult()` (see §2.1.3), which is why the app-side `pinBuilder` accumulator is no longer needed.

#### 2.1.5 `onRequestSetPin()` — Offline PIN Dialog Change

**Source:** `setPayClickListener` was called with `pos.getQPOSService()` (inner service reference):
```java
pinPadDialog.getPayViewPass().setRandomNumber(true).setPayClickListener(pos.getQPOSService(), ...)
```

**Current:** `setPayClickListener` now accepts the `NeokredPOSService` directly:
```java
pinPadDialog.getPayViewPass().setRandomNumber(true).setPayClickListener(pos, ...)
```

#### 2.1.6 `onRequestDisplay()` — Display Message Logic Change

**Source:** `PLEASE_WAIT` triggered pinpad visibility:
```java
} else if (displayMsg == NKDisplayMessage.PLEASE_WAIT) {
    // show pinpad
    viewModel.showPinpad.set(true);
```

**Current:** `INPUT_ONLINE_PIN` or `INPUT_OFFLINE_PIN` triggers pinpad visibility (PLEASE_WAIT no longer used for this):
```java
} else if (message == NKDisplayMessage.INPUT_ONLINE_PIN || message == NKDisplayMessage.INPUT_OFFLINE_PIN) {
    // show pinpad
```

#### 2.1.7 `onDoTradeResult()` — Extended NFC Card Handling

The source only handled `isNFC()`. The current SDK exposes more specific NFC states:

| Card State | Source | Current |
|---|---|---|
| NFC online (contactless) | `cardData.isNFC()` | `cardData.isNFCOnline()` |
| NFC offline (approved locally) | Not handled | `cardData.isNFCOffline()` → calls `setTransactionSuccess()` |
| NFC declined | Not handled | `cardData.isNFCDeclined()` → calls `paymentStatus("","","","NFC Declined")` |
| Please see phone (Wallet/3DS) | `else` catch-all | `cardData.isPlsSeePhone()` explicit |

For NFC online path, the current project also adds a null-safe fallback when `batchData` is empty:
```java
Hashtable<String, String> dataToProcess = (batchData != null && !batchData.isEmpty())
        ? batchData : cardData.getRawData();
```

#### 2.1.8 `onRequestTransactionResult()` — Complete Rewrite with Typed Status Switch

This is the largest single change. The source used a simple `if (result.isApproved()) / else` pattern. The current project replaces this with a full `switch` on `NKTransactionResult.Status`.

**Source:**
```java
viewModel.startLoading("processing");
if (result.isApproved()) {
    // handle approved
} else {
    String desc = result.getDescription();
    if (desc != null && !desc.isEmpty()) {
        paymentStatus("", "", "", desc);
        viewModel.setTransactionFailed(desc);
    }
}
```

**Current:**
```java
terminalTime = result.getTerminalTime();   // ← captured first (new)
NKTransactionResult.Status status = result.getStatus();
switch (status) {
    case APPROVED:
        viewModel.startLoading("processing");
        // ... handle TLV, card number, paymentStatus(...)
        break;
    case BAD_SWIPE:
        viewModel.startLoading("Bad swipe, please try again");
        break;
    case TRY_ANOTHER_INTERFACE:   failTransaction("Please insert card");           break;
    case MULTIPLE_CARDS:          failTransaction("Multiple cards detected...");   break;
    case CARD_REMOVED:            failTransaction("Card removed, please try again"); break;
    case TIMEOUT:
    case NO_RESPONSE:
    case ICC_ONLINE_TIMEOUT:      failTransaction("Transaction timed out...");     break;
    case NOT_ICC:                 failTransaction("Please swipe card");            break;
    case CARD_BLOCKED_APDU_ERROR_6A81:
    case APP_BLOCKED_APDU_ERROR_6A83: failTransaction("Card blocked or not supported"); break;
    case CAPK_FAIL:               failTransaction("Card verification failed...");  break;
    case AID_MISSING:
    case APP_SELECT_TIMEOUT:      failTransaction("Application selection failed..."); break;
    case DEVICE_ERROR:            failTransaction("Device error, please restart..."); break;
    case APDU_ERROR:
    case ICC_EXISTS_ERROR:        failTransaction("Card read error, please try again"); break;
    case TERMINATED:              failTransaction("Transaction terminated");        break;
    case DECLINED:                failTransaction("Transaction declined");          break;
    case CANCEL:                  failTransaction("Transaction cancelled");         break;
    default:
        String desc = result.getDescription();
        failTransaction((desc != null && !desc.isEmpty()) ? desc : status.name());
        break;
}
```

New statuses handled explicitly: `BAD_SWIPE`, `TRY_ANOTHER_INTERFACE`, `MULTIPLE_CARDS`, `CARD_REMOVED`, `TIMEOUT`, `NO_RESPONSE`, `ICC_ONLINE_TIMEOUT`, `NOT_ICC`, `CARD_BLOCKED_APDU_ERROR_6A81`, `APP_BLOCKED_APDU_ERROR_6A83`, `CAPK_FAIL`, `AID_MISSING`, `APP_SELECT_TIMEOUT`, `DEVICE_ERROR`, `APDU_ERROR`, `ICC_EXISTS_ERROR`, `TERMINATED`, `DECLINED`, `CANCEL`.

#### 2.1.9 New Helper Method: `failTransaction(String message)`

The current project extracted the repeated failure UI logic into a private helper, called from every non-APPROVED switch branch:

```java
private void failTransaction(String message) {
    viewModel.showPinpad.set(false);
    if (keyboardUtil != null) keyboardUtil.hide();
    binding.animationView.pauseAnimation();
    paymentStatus("", "", "", message);
    viewModel.setTransactionFailed(message);
}
```

This did not exist in the source.

#### 2.1.10 `onError()` — Removed `setTransactionFailed()` Call

**Source:** `onError()` called `viewModel.setTransactionFailed(message)` directly.  
**Current:** `onError()` no longer calls `setTransactionFailed()` — the comment explains that `onRequestTransactionResult()` now handles all typed error outcomes. `onError()` is now only used for logging/non-fatal device events. This avoids double-failure state when both callbacks fire.

---

### 2.2 `PinPadView.java` — SDK import replacement

**Path:** `app/src/main/java/com/neokred/pos/ui/payment/pinkeyboard/PinPadView.java`

#### Changes

| Source | Current |
|---|---|
| `import com.dspread.xpos.QPOSService` | `import com.neokred.sdk.payment.NeokredPOSService` |
| `import com.dspread.xpos.Util` | (removed) |
| `private QPOSService pos` | `private NeokredPOSService pos` |
| `setPayClickListener(QPOSService qPOSService, ...)` | `setPayClickListener(NeokredPOSService posService, ...)` |
| `Util.convertHexToString(pos.getCvmKeyList())` | `pos.convertHexToString(pos.getCvmKeyList())` |

**Key point:** `convertHexToString()` was previously a static utility from `com.dspread.xpos.Util`. In SDK 1.0.1 it is now an instance method on `NeokredPOSService` itself. The `com.dspread.xpos` package is no longer referenced anywhere in the app.

---

### 2.3 `PrinterBaseActivity.java` — Printer callback API change

**Path:** `app/src/main/java/com/neokred/pos/ui/printer/activities/base/PrinterBaseActivity.java`

#### Changes

**Source** used a lambda-based callback with a raw integer status code:
```java
printer.setCallback((success, status, rawValue) -> {
    if (!success && status == NKPrinterStatus.UNDEFINED && "-9".equals(rawValue)) {
        showLowBatteryDialog();
    }
    onReturnPrintResult(success, rawValue, status);
});
```

**Current** uses a typed `NKPrintCallback` interface with two explicit overrides, and low battery is now detected via `NKPrinterStatus.LOW_BATTERY` instead of raw value `"-9"`:
```java
printer.setCallback(new NKPrintCallback() {
    @Override
    public void onPrintResult(boolean success, NKPrinterStatus status) {
        if (!success && status == NKPrinterStatus.LOW_BATTERY) {
            showLowBatteryDialog();
        }
        onReturnPrintResult(success, status.name(), status);
    }

    @Override
    public void onError(NKPrinterStatus status) {
        onReturnPrintResult(false, status.name(), status);
    }
});
```

**New import added:**
```java
import com.neokred.sdk.printer.callback.NKPrintCallback;
```

---

### 2.4 `NKPOSUtil.java` — PIN block logic moved into SDK

**Path:** `app/src/main/java/com/neokred/pos/utils/NKPOSUtil.java`

#### Removed from source (no longer needed in current project)

The following were removed because the SDK now handles this internally:

| Removed | Reason |
|---|---|
| `import com.dspread.xpos.Util` | `com.dspread.xpos` package gone |
| `import com.dspread.xpos.utils.AESUtil` | AES encryption now in SDK |
| `import java.io.BufferedReader / InputStream / InputStreamReader / IOException` | No longer needed |
| `import java.util.Map` | No longer needed |
| `import me.goldze.mvvmhabit.utils.ToastUtils` | No longer needed here |
| `getRequiredParam(Map<String, byte[]> params, String key)` | Moved into SDK |
| `buildPinDataBlock(String userPin, String randomData)` | Moved into SDK |
| `buildPanDataBlock(String pan)` | Moved into SDK |
| Full ISO-4 PIN block construction logic in `buildISO4PinBlock()` | Moved into SDK |

#### Before (source) — `buildISO4PinBlock()` body:
```java
// ~50 lines: validate params, extract RandomData/PAN/AESKey,
// build pinBlock, build panBlock, AES-encrypt, XOR, re-encrypt
```

#### After (current) — `buildISO4PinBlock()` body:
```java
import com.neokred.sdk.payment.NeokredPOSService;
...
return NeokredPOSService.buildISO4PinBlockStatic(pinParams, userPin);
```

The method signature is unchanged. Only the implementation changed. The SDK now exposes `NeokredPOSService.buildISO4PinBlockStatic()` as a static utility.

---

## 3. Files Identical (No Changes)

All other files are byte-for-byte identical between the two projects. For completeness:

| Layer | Files unchanged |
|---|---|
| App entry | `TerminalApplication.java`, `TitleProviderListener.java` |
| Common | `BaseAppViewModel.java`, `BaseFragment.java`, `CallbackChange.java`, `POS_TYPE.java`, `PaymentType.java` |
| Network | `RetrofitClient.java`, `RequestOnlineAuthAPI.java`, `AuthRequest.java`, `TransactionRequest.java` |
| Managers | `FragmentCacheManager.java`, `QPOSCallbackManager.java` |
| UI — Home | `HomeFragment.java`, `HomeViewModel.java` |
| UI — Main | `MainActivity.java`, `MainViewModel.java`, `MainViewModelFactory.java` |
| UI — Payment | `PaymentGenerateActivity.java`, `PaymentGenerateViewModel.java`, `PaymentMethodActivity.java`, `PaymentMethodViewModel.java`, `PaymentModel.java`, `PaymentResult.java`, `PaymentStatusActivity.java`, `PaymentStatusViewModel.java`, `PaymentViewModel.java` |
| UI — PIN keyboard | `KeyBoardNumInterface.java`, `KeyboardTool.java`, `KeyboardUtil.java`, `MyKeyboardView.java`, `PinPadDialog.java` |
| UI — Printer | `PrinterItemViewModel.java`, `PrinterViewModel.java`, `PrintTicketActivity.java`, `PrintTicketViewModel.java`, `BasePrinterViewModel.java`, `PrintDialog.java`, `PrinterAdapter.java`, `PrinterAlertDialog.java` |
| UI — Scan | `ScanCodeActivity.java`, `ScanViewModel.java` |
| UI — Settings | `ConnectionSettingsFragment.java`, `ConnectionSettingsViewModel.java`, `DeviceConfigActivity.java`, `DeviceConfigAdapter.java`, `DeviceConfigItem.java`, `DeviceConfigSelectionViewModel.java`, `BluetoothDeviceAdapter.java`, `DeviceSelectionActivity.java`, `DeviceSelectionViewModel.java` |
| UI — Transactions | `JsonParser.java`, `ListItem.java`, `PaymentsAdapter.java`, `SerachKeyboardUtils.java`, `Transaction.java`, `TransactionDateFilter.java`, `TransactionFragment.java`, `TransactionSorter.java`, `TransactionViewModel.java`, `TransactionDetailActivity.java`, `TransactionDetailsViewModel.java`, `TransactionFilterActivity.java`, `TransactionFilterViewModel.java`, `ReissueReceiptActivity.java`, `TransactionReissueReceipViewModel.java` |
| Utils | `AdvancedBinDetector.java`, `BannerItem.java`, `BitmapReadyListener.java`, `BuglyCustomLogException.java`, `DevUtils.java`, `DeviceUtils.java`, `DialogUtils.java`, `FileUtils.java`, `HandleTxnsResultUtils.java`, `JsonUtil.java`, `LogFileConfig.java`, `Mydialog.java`, `OnlineRequestFromAWS.java`, `PrintDialogUtils.java`, `ReceiptGenerator.java`, `SystemKeyListener.java`, `TLV.java`, `TLVParser.java`, `TRACE.java`, `USBClass.java` |
| Views | `AutoShrinkEditText.java`, `BindingAdapters.java`, `PaymentMethodsLayout.java` |
| Tests | `DeviceUtilsTest.java`, `NKPOSUtilTest.java`, `TLVParserTest.java` |
| Build/Config | `build.gradle` (app), `config.gradle`, `settings.gradle` |
| Resources | All `res/` files (layouts, drawables, values, etc.) |
| Manifest | `AndroidManifest.xml` |

---

## 4. Migration Checklist

Use this checklist when applying these changes to another project or reverting to the source:

**SDK**
- [ ] Replace `neokred-sdk-release.aar` with `neokred-sdk-release1.0.1.aar` in `app/libs/`

**`PaymentActivity.java`**
- [ ] Rename 3 connection callback methods (see §2.1.1)
- [ ] Rename 7 transaction callback methods (see §2.1.2)
- [ ] Add `onReturnGetPinInputResult()` and `onReturnReversalData()` callback overrides (§2.1.3)
- [ ] Remove `pinBuilder` and the old inline key accumulator; replace with `MyKeyboardView.setKeyBoardListener(value -> pos.pinMapSync(value, 60))` before `initKeyboard()` call; increase timeout 20→60s (§2.1.4)
- [ ] Update `setPayClickListener()` to pass `pos` directly instead of `pos.getQPOSService()` (§2.1.5)
- [ ] Change display message PIN trigger from `PLEASE_WAIT` to `INPUT_ONLINE_PIN || INPUT_OFFLINE_PIN`; remove `viewModel.showPinpad.set(true)` from the old `PLEASE_WAIT` branch (§2.1.6)
- [ ] Replace `isNFC()` with `isNFCOnline()`; add `isNFCOffline()` and `isNFCDeclined()` branches; add null-safe `batchData` fallback; set `maskedPAN` via `setMaskedPAN()` before calling `handleDoTradeResult()` (§2.1.7)
- [ ] Rewrite `onRequestTransactionResult()` as a `switch` on `NKTransactionResult.Status`; capture `terminalTime = result.getTerminalTime()` at the top; move `viewModel.startLoading("processing")` inside the `APPROVED` case (§2.1.8)
- [ ] Add private `failTransaction(String message)` helper method (§2.1.9)
- [ ] Remove `viewModel.setTransactionFailed(message)` from `onError()` — error handling is now fully in `onRequestTransactionResult()` (§2.1.10)

**`PinPadView.java`**
- [ ] Replace `QPOSService` + `com.dspread.xpos.Util` imports with `NeokredPOSService`; update field type and method signature; change `Util.convertHexToString()` to `pos.convertHexToString()` (§2.2)

**`PrinterBaseActivity.java`**
- [ ] Add `import com.neokred.sdk.printer.callback.NKPrintCallback`; replace lambda callback with `new NKPrintCallback()` anonymous class; change low-battery check from raw `"-9"` to `NKPrinterStatus.LOW_BATTERY` (§2.3)

**`NKPOSUtil.java`**
- [ ] Remove `com.dspread.xpos.*` imports and 5 unused imports; remove 3 private helper methods (`getRequiredParam`, `buildPinDataBlock`, `buildPanDataBlock`); replace `buildISO4PinBlock()` body with `return NeokredPOSService.buildISO4PinBlockStatic(pinParams, userPin)` (§2.4)

---

## 5. Risk Assessment

| Area | Risk | Notes |
|---|---|---|
| Callback renames (connection + transaction) | Low | Pure renames, logic unchanged |
| `onQposRequestPinResult` keyboard init | Medium | `pinBuilder` removed; PIN accumulation is now fully inside the SDK. Verify PIN entry end-to-end on device, especially cancel/delete/confirm flows |
| `onRequestDisplay` trigger change | Medium | `PLEASE_WAIT` no longer shows the pinpad; `INPUT_ONLINE_PIN`/`INPUT_OFFLINE_PIN` do instead. Verify no timing gap between card read and pinpad appearing |
| `onError()` no longer calls `setTransactionFailed()` | Medium | Both `onError()` and `onRequestTransactionResult()` can fire for the same event. Removing `setTransactionFailed()` from `onError()` avoids double-failure state — verify all failure paths still show the correct UI |
| NFC `isNFCOffline` / `isNFCDeclined` new branches | Medium | New SDK states — test contactless offline approval and contactless declined flows on real hardware |
| `onRequestTransactionResult()` status switch | Medium | 18 new named statuses vs old boolean `isApproved()`. Verify each reachable status produces correct user-facing message. Pay particular attention to `BAD_SWIPE` (retries) vs `DECLINED` (hard stop) |
| `NKPrintCallback` typed interface | Low | `LOW_BATTERY` enum is clearer than magic string `"-9"` — no behavioural change |
| `buildISO4PinBlockStatic` | Low | Algorithm moved to SDK; existing `NKPOSUtilTest` should still pass |
| `PinPadView.setPayClickListener` signature | Low | Only one call site in `PaymentActivity.java`, which was updated in sync |
