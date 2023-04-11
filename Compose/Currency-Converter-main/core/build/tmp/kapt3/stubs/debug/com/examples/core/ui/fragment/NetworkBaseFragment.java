package com.examples.core.ui.fragment;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0014H\u0016R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/examples/core/ui/fragment/NetworkBaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/examples/core/utils/network/ConnectivityProvider$ConnectivityStateListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "baseNetworkingDialog", "Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "getBaseNetworkingDialog", "()Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "setBaseNetworkingDialog", "(Lcom/examples/core/ui/dialog/BaseNetworkingDialog;)V", "provider", "Lcom/examples/core/utils/network/ConnectivityProvider;", "getProvider", "()Lcom/examples/core/utils/network/ConnectivityProvider;", "provider$delegate", "Lkotlin/Lazy;", "onNetworkStateChange", "", "state", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "onResume", "onStop", "Companion", "core_debug"})
public class NetworkBaseFragment extends androidx.fragment.app.Fragment implements com.examples.core.utils.network.ConnectivityProvider.ConnectivityStateListener {
    private final java.lang.String TAG = null;
    @javax.inject.Inject()
    public com.examples.core.ui.dialog.BaseNetworkingDialog baseNetworkingDialog;
    @org.jetbrains.annotations.NotNull()
    public static final com.examples.core.ui.fragment.NetworkBaseFragment.Companion Companion = null;
    private static boolean isNetworkConnected = true;
    private final kotlin.Lazy provider$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public NetworkBaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.ui.dialog.BaseNetworkingDialog getBaseNetworkingDialog() {
        return null;
    }
    
    public final void setBaseNetworkingDialog(@org.jetbrains.annotations.NotNull()
    com.examples.core.ui.dialog.BaseNetworkingDialog p0) {
    }
    
    private final com.examples.core.utils.network.ConnectivityProvider getProvider() {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onNetworkStateChange(@org.jetbrains.annotations.NotNull()
    com.examples.core.utils.network.ConnectivityProvider.NetworkState state) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/examples/core/ui/fragment/NetworkBaseFragment$Companion;", "", "()V", "isNetworkConnected", "", "()Z", "setNetworkConnected", "(Z)V", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isNetworkConnected() {
            return false;
        }
        
        public final void setNetworkConnected(boolean p0) {
        }
    }
}