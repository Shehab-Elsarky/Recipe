package com.examples.core.utils.network;

import java.lang.System;

@androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.N)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\nH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProviderImpl;", "Lcom/examples/core/utils/network/ConnectivityProviderBaseImpl;", "cm", "Landroid/net/ConnectivityManager;", "(Landroid/net/ConnectivityManager;)V", "networkCallback", "Lcom/examples/core/utils/network/ConnectivityProviderImpl$ConnectivityCallback;", "getNetworkState", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "subscribe", "", "unsubscribe", "ConnectivityCallback", "core_debug"})
public final class ConnectivityProviderImpl extends com.examples.core.utils.network.ConnectivityProviderBaseImpl {
    private final android.net.ConnectivityManager cm = null;
    private final com.examples.core.utils.network.ConnectivityProviderImpl.ConnectivityCallback networkCallback = null;
    
    public ConnectivityProviderImpl(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProviderImpl$ConnectivityCallback;", "Landroid/net/ConnectivityManager$NetworkCallback;", "(Lcom/examples/core/utils/network/ConnectivityProviderImpl;)V", "onCapabilitiesChanged", "", "network", "Landroid/net/Network;", "capabilities", "Landroid/net/NetworkCapabilities;", "onLost", "core_debug"})
    final class ConnectivityCallback extends android.net.ConnectivityManager.NetworkCallback {
        
        public ConnectivityCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onCapabilitiesChanged(@org.jetbrains.annotations.NotNull()
        android.net.Network network, @org.jetbrains.annotations.NotNull()
        android.net.NetworkCapabilities capabilities) {
        }
        
        @java.lang.Override()
        public void onLost(@org.jetbrains.annotations.NotNull()
        android.net.Network network) {
        }
    }
}