package com.examples.core.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0003\t\n\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\f"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider;", "", "addListener", "", "listener", "Lcom/examples/core/utils/network/ConnectivityProvider$ConnectivityStateListener;", "getNetworkState", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "removeListener", "Companion", "ConnectivityStateListener", "NetworkState", "core_debug"})
public abstract interface ConnectivityProvider {
    @org.jetbrains.annotations.NotNull()
    public static final com.examples.core.utils.network.ConnectivityProvider.Companion Companion = null;
    
    public abstract void addListener(@org.jetbrains.annotations.NotNull()
    com.examples.core.utils.network.ConnectivityProvider.ConnectivityStateListener listener);
    
    public abstract void removeListener(@org.jetbrains.annotations.NotNull()
    com.examples.core.utils.network.ConnectivityProvider.ConnectivityStateListener listener);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.examples.core.utils.network.ConnectivityProvider.NetworkState getNetworkState();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$ConnectivityStateListener;", "", "onNetworkStateChange", "", "state", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "core_debug"})
    public static abstract interface ConnectivityStateListener {
        
        public abstract void onNetworkStateChange(@org.jetbrains.annotations.NotNull()
        com.examples.core.utils.network.ConnectivityProvider.NetworkState state);
    }
    
    @kotlin.Suppress(names = {"MemberVisibilityCanBePrivate", "CanBeParameter"})
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "", "()V", "ConnectedState", "NotConnectedState", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$NotConnectedState;", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState;", "core_debug"})
    public static abstract class NetworkState {
        
        private NetworkState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$NotConnectedState;", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "()V", "core_debug"})
        public static final class NotConnectedState extends com.examples.core.utils.network.ConnectivityProvider.NetworkState {
            @org.jetbrains.annotations.NotNull()
            public static final com.examples.core.utils.network.ConnectivityProvider.NetworkState.NotConnectedState INSTANCE = null;
            
            private NotConnectedState() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState;", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState;", "hasInternet", "", "(Z)V", "getHasInternet", "()Z", "Connected", "ConnectedLegacy", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState$Connected;", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState$ConnectedLegacy;", "core_debug"})
        public static abstract class ConnectedState extends com.examples.core.utils.network.ConnectivityProvider.NetworkState {
            private final boolean hasInternet = false;
            
            private ConnectedState(boolean hasInternet) {
                super();
            }
            
            public final boolean getHasInternet() {
                return false;
            }
            
            @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState$Connected;", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState;", "capabilities", "Landroid/net/NetworkCapabilities;", "(Landroid/net/NetworkCapabilities;)V", "getCapabilities", "()Landroid/net/NetworkCapabilities;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_debug"})
            public static final class Connected extends com.examples.core.utils.network.ConnectivityProvider.NetworkState.ConnectedState {
                @org.jetbrains.annotations.NotNull()
                private final android.net.NetworkCapabilities capabilities = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.examples.core.utils.network.ConnectivityProvider.NetworkState.ConnectedState.Connected copy(@org.jetbrains.annotations.NotNull()
                android.net.NetworkCapabilities capabilities) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public Connected(@org.jetbrains.annotations.NotNull()
                android.net.NetworkCapabilities capabilities) {
                    super(false);
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkCapabilities component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkCapabilities getCapabilities() {
                    return null;
                }
            }
            
            @kotlin.Suppress(names = {"DEPRECATION"})
            @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState$ConnectedLegacy;", "Lcom/examples/core/utils/network/ConnectivityProvider$NetworkState$ConnectedState;", "networkInfo", "Landroid/net/NetworkInfo;", "(Landroid/net/NetworkInfo;)V", "getNetworkInfo", "()Landroid/net/NetworkInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core_debug"})
            public static final class ConnectedLegacy extends com.examples.core.utils.network.ConnectivityProvider.NetworkState.ConnectedState {
                @org.jetbrains.annotations.NotNull()
                private final android.net.NetworkInfo networkInfo = null;
                
                @org.jetbrains.annotations.NotNull()
                public final com.examples.core.utils.network.ConnectivityProvider.NetworkState.ConnectedState.ConnectedLegacy copy(@org.jetbrains.annotations.NotNull()
                android.net.NetworkInfo networkInfo) {
                    return null;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                public ConnectedLegacy(@org.jetbrains.annotations.NotNull()
                android.net.NetworkInfo networkInfo) {
                    super(false);
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkInfo component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final android.net.NetworkInfo getNetworkInfo() {
                    return null;
                }
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/examples/core/utils/network/ConnectivityProvider$Companion;", "", "()V", "createProvider", "Lcom/examples/core/utils/network/ConnectivityProvider;", "context", "Landroid/content/Context;", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.examples.core.utils.network.ConnectivityProvider createProvider(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}