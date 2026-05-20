package com.neokred.pos;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.neokred.pos.databinding.ActivityCurrencySelectionBindingImpl;
import com.neokred.pos.databinding.ActivityDeviceSelectionBindingImpl;
import com.neokred.pos.databinding.ActivityMainBindingImpl;
import com.neokred.pos.databinding.ActivityPaymentBindingImpl;
import com.neokred.pos.databinding.ActivityPaymentGenerateBindingImpl;
import com.neokred.pos.databinding.ActivityPaymentMetholdBindingImpl;
import com.neokred.pos.databinding.ActivityPaymentstatusBindingImpl;
import com.neokred.pos.databinding.ActivityPrintTicketBindingImpl;
import com.neokred.pos.databinding.ActivityPrinterBaseBindingImpl;
import com.neokred.pos.databinding.ActivityReissueReceiptBindingImpl;
import com.neokred.pos.databinding.ActivityScanBindingImpl;
import com.neokred.pos.databinding.ActivityTitleBindingImpl;
import com.neokred.pos.databinding.ActivityTransactionDetailsBindingImpl;
import com.neokred.pos.databinding.ActivityTransactionFilterBindingImpl;
import com.neokred.pos.databinding.AppBarMainBindingImpl;
import com.neokred.pos.databinding.ContentMainBindingImpl;
import com.neokred.pos.databinding.FragmentBasePagerBindingImpl;
import com.neokred.pos.databinding.FragmentConnectionSettingsBindingImpl;
import com.neokred.pos.databinding.FragmentHomeBindingImpl;
import com.neokred.pos.databinding.FragmentInputMoney1BindingImpl;
import com.neokred.pos.databinding.FragmentTransactionBindingImpl;
import com.neokred.pos.databinding.ItemCurrencyBindingImpl;
import com.neokred.pos.databinding.NavHeaderMainBindingImpl;
import com.neokred.pos.databinding.PrinterWorkItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCURRENCYSELECTION = 1;

  private static final int LAYOUT_ACTIVITYDEVICESELECTION = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_ACTIVITYPAYMENT = 4;

  private static final int LAYOUT_ACTIVITYPAYMENTGENERATE = 5;

  private static final int LAYOUT_ACTIVITYPAYMENTMETHOLD = 6;

  private static final int LAYOUT_ACTIVITYPAYMENTSTATUS = 7;

  private static final int LAYOUT_ACTIVITYPRINTTICKET = 8;

  private static final int LAYOUT_ACTIVITYPRINTERBASE = 9;

  private static final int LAYOUT_ACTIVITYREISSUERECEIPT = 10;

  private static final int LAYOUT_ACTIVITYSCAN = 11;

  private static final int LAYOUT_ACTIVITYTITLE = 12;

  private static final int LAYOUT_ACTIVITYTRANSACTIONDETAILS = 13;

  private static final int LAYOUT_ACTIVITYTRANSACTIONFILTER = 14;

  private static final int LAYOUT_APPBARMAIN = 15;

  private static final int LAYOUT_CONTENTMAIN = 16;

  private static final int LAYOUT_FRAGMENTBASEPAGER = 17;

  private static final int LAYOUT_FRAGMENTCONNECTIONSETTINGS = 18;

  private static final int LAYOUT_FRAGMENTHOME = 19;

  private static final int LAYOUT_FRAGMENTINPUTMONEY1 = 20;

  private static final int LAYOUT_FRAGMENTTRANSACTION = 21;

  private static final int LAYOUT_ITEMCURRENCY = 22;

  private static final int LAYOUT_NAVHEADERMAIN = 23;

  private static final int LAYOUT_PRINTERWORKITEM = 24;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(24);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_currency_selection, LAYOUT_ACTIVITYCURRENCYSELECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_device_selection, LAYOUT_ACTIVITYDEVICESELECTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_payment, LAYOUT_ACTIVITYPAYMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_payment_generate, LAYOUT_ACTIVITYPAYMENTGENERATE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_payment_methold, LAYOUT_ACTIVITYPAYMENTMETHOLD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_paymentstatus, LAYOUT_ACTIVITYPAYMENTSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_print_ticket, LAYOUT_ACTIVITYPRINTTICKET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_printer_base, LAYOUT_ACTIVITYPRINTERBASE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_reissue_receipt, LAYOUT_ACTIVITYREISSUERECEIPT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_scan, LAYOUT_ACTIVITYSCAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_title, LAYOUT_ACTIVITYTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_transaction_details, LAYOUT_ACTIVITYTRANSACTIONDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.activity_transaction_filter, LAYOUT_ACTIVITYTRANSACTIONFILTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.app_bar_main, LAYOUT_APPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.content_main, LAYOUT_CONTENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.fragment_base_pager, LAYOUT_FRAGMENTBASEPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.fragment_connection_settings, LAYOUT_FRAGMENTCONNECTIONSETTINGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.fragment_input_money1, LAYOUT_FRAGMENTINPUTMONEY1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.fragment_transaction, LAYOUT_FRAGMENTTRANSACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.item_currency, LAYOUT_ITEMCURRENCY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.nav_header_main, LAYOUT_NAVHEADERMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.neokred.pos.R.layout.printer_work_item, LAYOUT_PRINTERWORKITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCURRENCYSELECTION: {
          if ("layout/activity_currency_selection_0".equals(tag)) {
            return new ActivityCurrencySelectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_currency_selection is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDEVICESELECTION: {
          if ("layout/activity_device_selection_0".equals(tag)) {
            return new ActivityDeviceSelectionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_device_selection is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAYMENT: {
          if ("layout/activity_payment_0".equals(tag)) {
            return new ActivityPaymentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_payment is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAYMENTGENERATE: {
          if ("layout/activity_payment_generate_0".equals(tag)) {
            return new ActivityPaymentGenerateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_payment_generate is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAYMENTMETHOLD: {
          if ("layout/activity_payment_methold_0".equals(tag)) {
            return new ActivityPaymentMetholdBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_payment_methold is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPAYMENTSTATUS: {
          if ("layout/activity_paymentstatus_0".equals(tag)) {
            return new ActivityPaymentstatusBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_paymentstatus is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRINTTICKET: {
          if ("layout/activity_print_ticket_0".equals(tag)) {
            return new ActivityPrintTicketBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_print_ticket is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRINTERBASE: {
          if ("layout/activity_printer_base_0".equals(tag)) {
            return new ActivityPrinterBaseBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_printer_base is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREISSUERECEIPT: {
          if ("layout/activity_reissue_receipt_0".equals(tag)) {
            return new ActivityReissueReceiptBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_reissue_receipt is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSCAN: {
          if ("layout/activity_scan_0".equals(tag)) {
            return new ActivityScanBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_scan is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTITLE: {
          if ("layout/activity_title_0".equals(tag)) {
            return new ActivityTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_title is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTRANSACTIONDETAILS: {
          if ("layout/activity_transaction_details_0".equals(tag)) {
            return new ActivityTransactionDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_transaction_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYTRANSACTIONFILTER: {
          if ("layout/activity_transaction_filter_0".equals(tag)) {
            return new ActivityTransactionFilterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_transaction_filter is invalid. Received: " + tag);
        }
        case  LAYOUT_APPBARMAIN: {
          if ("layout/app_bar_main_0".equals(tag)) {
            return new AppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMAIN: {
          if ("layout/content_main_0".equals(tag)) {
            return new ContentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBASEPAGER: {
          if ("layout/fragment_base_pager_0".equals(tag)) {
            return new FragmentBasePagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_base_pager is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCONNECTIONSETTINGS: {
          if ("layout/fragment_connection_settings_0".equals(tag)) {
            return new FragmentConnectionSettingsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_connection_settings is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTINPUTMONEY1: {
          if ("layout/fragment_input_money1_0".equals(tag)) {
            return new FragmentInputMoney1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_input_money1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRANSACTION: {
          if ("layout/fragment_transaction_0".equals(tag)) {
            return new FragmentTransactionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_transaction is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCURRENCY: {
          if ("layout/item_currency_0".equals(tag)) {
            return new ItemCurrencyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_currency is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVHEADERMAIN: {
          if ("layout/nav_header_main_0".equals(tag)) {
            return new NavHeaderMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for nav_header_main is invalid. Received: " + tag);
        }
        case  LAYOUT_PRINTERWORKITEM: {
          if ("layout/printer_work_item_0".equals(tag)) {
            return new PrinterWorkItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for printer_work_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(5);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new me.goldze.mvvmhabit.DataBinderMapperImpl());
    result.add(new me.tatarka.bindingcollectionadapter2.DataBinderMapperImpl());
    result.add(new me.tatarka.bindingcollectionadapter2.recyclerview.DataBinderMapperImpl());
    result.add(new me.tatarka.bindingcollectionadapter2.viewpager2.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "currency");
      sKeys.put(2, "item");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(24);

    static {
      sKeys.put("layout/activity_currency_selection_0", com.neokred.pos.R.layout.activity_currency_selection);
      sKeys.put("layout/activity_device_selection_0", com.neokred.pos.R.layout.activity_device_selection);
      sKeys.put("layout/activity_main_0", com.neokred.pos.R.layout.activity_main);
      sKeys.put("layout/activity_payment_0", com.neokred.pos.R.layout.activity_payment);
      sKeys.put("layout/activity_payment_generate_0", com.neokred.pos.R.layout.activity_payment_generate);
      sKeys.put("layout/activity_payment_methold_0", com.neokred.pos.R.layout.activity_payment_methold);
      sKeys.put("layout/activity_paymentstatus_0", com.neokred.pos.R.layout.activity_paymentstatus);
      sKeys.put("layout/activity_print_ticket_0", com.neokred.pos.R.layout.activity_print_ticket);
      sKeys.put("layout/activity_printer_base_0", com.neokred.pos.R.layout.activity_printer_base);
      sKeys.put("layout/activity_reissue_receipt_0", com.neokred.pos.R.layout.activity_reissue_receipt);
      sKeys.put("layout/activity_scan_0", com.neokred.pos.R.layout.activity_scan);
      sKeys.put("layout/activity_title_0", com.neokred.pos.R.layout.activity_title);
      sKeys.put("layout/activity_transaction_details_0", com.neokred.pos.R.layout.activity_transaction_details);
      sKeys.put("layout/activity_transaction_filter_0", com.neokred.pos.R.layout.activity_transaction_filter);
      sKeys.put("layout/app_bar_main_0", com.neokred.pos.R.layout.app_bar_main);
      sKeys.put("layout/content_main_0", com.neokred.pos.R.layout.content_main);
      sKeys.put("layout/fragment_base_pager_0", com.neokred.pos.R.layout.fragment_base_pager);
      sKeys.put("layout/fragment_connection_settings_0", com.neokred.pos.R.layout.fragment_connection_settings);
      sKeys.put("layout/fragment_home_0", com.neokred.pos.R.layout.fragment_home);
      sKeys.put("layout/fragment_input_money1_0", com.neokred.pos.R.layout.fragment_input_money1);
      sKeys.put("layout/fragment_transaction_0", com.neokred.pos.R.layout.fragment_transaction);
      sKeys.put("layout/item_currency_0", com.neokred.pos.R.layout.item_currency);
      sKeys.put("layout/nav_header_main_0", com.neokred.pos.R.layout.nav_header_main);
      sKeys.put("layout/printer_work_item_0", com.neokred.pos.R.layout.printer_work_item);
    }
  }
}
