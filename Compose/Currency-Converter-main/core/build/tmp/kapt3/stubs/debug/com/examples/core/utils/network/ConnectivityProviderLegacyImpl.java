package com.examples.core.utils.network;

import java.lang.System;

@kotlin.Suppress(names = {"DEPRECATION"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000eB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProviderLegacyImpl;", "Lcom/examples/core/utils/network/ConnectivityProviderBaseImpl;", "context", "Landroid/content/Context;", "cm", "Landroid/net/ConnectivityManager;", "(Landroid/content/Context;Landroid/net/ConnectivityManager;)V", "receiver", "Lcom/examples/core/utils/network/ConnectivityProviderLegacyImpl$ConnectivityReceiver;", "getNetworkState", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "subscribe", "", "unsubscribe", "ConnectivityReceiver", "core_debug"})
public final class ConnectivityProviderLegacyImpl extends com.examples.core.utils.network.ConnectivityProviderBaseImpl {
    private final android.content.Context context = null;
    private final android.net.ConnectivityManager cm = null;
    private final com.examples.core.utils.network.ConnectivityProviderLegacyImpl.ConnectivityReceiver receiver = null;
    
    public ConnectivityProviderLegacyImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.net.ConnectivityManager cm) {
        super();
    }
    
    @java.lang.Override()
    protected void subscribe() {
    }
    
    @java.lang.Override()
    protected void unsubscribe() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.examples.core.utils.network.ConnectivityProvider.NetworkState getNetworkState() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProviderLegacyImpl$ConnectivityReceiver;", "Landroid/content/BroadcastReceiver;", "(Lcom/examples/core/utils/network/ConnectivityProviderLegacyImpl;)V", "onReceive", "", "c", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "core_debug"})
    final class ConnectivityReceiver extends android.content.BroadcastReceiver {
        
        public ConnectivityReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context c, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
}