package com.neokred.pos.common.manager;

import com.neokred.sdk.payment.callback.NKConnectionCallback;
import com.neokred.sdk.payment.callback.NKTransactionCallback;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QPOSCallbackManager {
    private static QPOSCallbackManager instance;

    public final Map<Class<?>, Object> callbackMap = new ConcurrentHashMap<>();

    public static QPOSCallbackManager getInstance() {
        if (instance == null) {
            synchronized (QPOSCallbackManager.class) {
                if (instance == null) {
                    instance = new QPOSCallbackManager();
                }
            }
        }
        return instance;
    }

    public void registerPaymentCallback(NKTransactionCallback callback) {
        callbackMap.put(NKTransactionCallback.class, callback);
    }

    public void registerConnectionCallback(NKConnectionCallback callback) {
        callbackMap.put(NKConnectionCallback.class, callback);
    }

    public void unregisterPaymentCallback() {
        callbackMap.remove(NKTransactionCallback.class);
    }

    public void unregisterConnectionCallback() {
        callbackMap.remove(NKConnectionCallback.class);
    }

    @SuppressWarnings("unchecked")
    public NKTransactionCallback getPaymentCallback() {
        return (NKTransactionCallback) callbackMap.get(NKTransactionCallback.class);
    }

    @SuppressWarnings("unchecked")
    public NKConnectionCallback getConnectionCallback() {
        return (NKConnectionCallback) callbackMap.get(NKConnectionCallback.class);
    }
}
