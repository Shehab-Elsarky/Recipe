package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/examples/core/utils/FragmentExtensions;", "", "()V", "Companion", "core_debug"})
public final class FragmentExtensions {
    @org.jetbrains.annotations.NotNull()
    public static final com.examples.core.utils.FragmentExtensions.Companion Companion = null;
    
    public FragmentExtensions() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ4\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/examples/core/utils/FragmentExtensions$Companion;", "", "()V", "currentNavigationFragment", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "getCurrentNavigationFragment", "(Landroidx/fragment/app/FragmentManager;)Landroidx/fragment/app/Fragment;", "getCurrentNavigationComponentFragmentId", "", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)Ljava/lang/Integer;", "replaceFragment", "", "supportFragmentManager", "fragmentContainer", "fragment", "tag", "", "isAddToBackStack", "", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final androidx.fragment.app.Fragment getCurrentNavigationFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager $this$currentNavigationFragment) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCurrentNavigationComponentFragmentId(@org.jetbrains.annotations.NotNull()
        androidx.navigation.NavController navController) {
            return null;
        }
        
        public final void replaceFragment(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager supportFragmentManager, @androidx.annotation.IdRes()
        int fragmentContainer, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        java.lang.String tag, boolean isAddToBackStack) {
        }
    }
}