package com.examples.core.ui.activity;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020&H\u0002J\u0012\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010\tH\u0014J\u0006\u0010*\u001a\u00020+J\u001f\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010/J\u001a\u00100\u001a\u00020&2\b\b\u0001\u00101\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0016J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u00020+H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u0018\u0010\"\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013\u00a8\u00066"}, d2 = {"Lcom/examples/core/ui/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/examples/core/utils/LoadingListener;", "Lcom/examples/core/ui/activity/ToolbarListener;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "setBundle", "(Landroid/os/Bundle;)V", "layoutRes", "", "getLayoutRes", "()I", "setLayoutRes", "(I)V", "loadingDialog", "Landroid/app/Dialog;", "getLoadingDialog", "()Landroid/app/Dialog;", "setLoadingDialog", "(Landroid/app/Dialog;)V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navFragment", "Landroidx/navigation/fragment/NavHostFragment;", "navGraphResourceId", "getNavGraphResourceId", "setNavGraphResourceId", "hideActivityToolbar", "", "initLoadingAlertDialog", "onCreate", "savedInstanceState", "popupFragment", "", "setActivityToolbarTitle", "title", "gravity", "(Ljava/lang/String;Ljava/lang/Integer;)V", "setFragmentDestination", "resId", "setNavFragment", "showActivityToolbar", "showLoading", "show", "core_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.examples.core.utils.LoadingListener, com.examples.core.ui.activity.ToolbarListener {
    private final java.lang.String TAG = null;
    private androidx.navigation.fragment.NavHostFragment navFragment;
    public androidx.navigation.NavController navController;
    protected android.os.Bundle bundle;
    public android.app.Dialog loadingDialog;
    @androidx.annotation.LayoutRes()
    private int layoutRes;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    public abstract int getNavGraphResourceId();
    
    public abstract void setNavGraphResourceId(int p0);
    
    @org.jetbrains.annotations.NotNull()
    protected final android.os.Bundle getBundle() {
        return null;
    }
    
    protected final void setBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Dialog getLoadingDialog() {
        return null;
    }
    
    public final void setLoadingDialog(@org.jetbrains.annotations.NotNull()
    android.app.Dialog p0) {
    }
    
    public int getLayoutRes() {
        return 0;
    }
    
    public void setLayoutRes(int p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setNavFragment() {
    }
    
    @java.lang.Override()
    public void showActivityToolbar() {
    }
    
    @java.lang.Override()
    public void hideActivityToolbar() {
    }
    
    @java.lang.Override()
    public void setActivityToolbarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gravity) {
    }
    
    public final void setFragmentDestination(@androidx.annotation.IdRes()
    int resId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public final boolean popupFragment() {
        return false;
    }
    
    @java.lang.Override()
    public void showLoading(boolean show) {
    }
    
    private final void initLoadingAlertDialog() {
    }
}