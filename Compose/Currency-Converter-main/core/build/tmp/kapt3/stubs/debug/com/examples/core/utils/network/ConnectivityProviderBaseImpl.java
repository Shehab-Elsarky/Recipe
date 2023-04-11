package com.examples.core.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0004J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u000bH$J\b\u0010\u0012\u001a\u00020\u000bH$J\b\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProviderBaseImpl;", "Lcom/examples/core/utils/network/ConnectivityProvider;", "()V", "handler", "Landroid/os/Handler;", "listeners", "", "Lcom/examples/core/utils/network/ConnectivityProvider$ConnectivityStateListener;", "subscribed", "", "addListener", "", "listener", "dispatchChange", "state", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "removeListener", "subscribe", "unsubscribe", "verifySubscription", "core_debug"})
public abstract class ConnectivityProviderBaseImpl implements com.examples.core.utils.network.ConnectivityProvider {
    private final android.os.Handler handler = null;
    private final java.util.Set<com.examples.core.utils.network.ConnectivityProvider.ConnectivityStateListener> listeners = null;
    private boolean subscribed = false;
    
    public ConnectivityProviderBaseImpl() {
        super();
    }
    
    @java.lang.Override()
    public void addListener(@org.jetbrains.annotations.NotNull()
    com.examples.core.utils.network.ConnectivityProvider.ConnectivityStateListener listener) {
    }
    
    @java.lang.Override()
    public void removeListener(@org.jetbrains.annotations.NotNull()
    com.examples.core.utils.network.ConnectivityProvider.ConnectivityStateListener listener) {
    }
    
    private final void verifySubscription() {
    }
    
    protected final void dispatchChange(@org.jetbrains.annotations.NotNull()
    com.examples.core.utils.network.ConnectivityProvider.NetworkState state) {
    }
    
    protected abstract void subscribe();
    
    protected abstract void unsubscribe();
}