package com.examples.core.ui.dialog;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020\u001fH\u0016J\b\u0010.\u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u000fH\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u00061"}, d2 = {"Lcom/examples/core/ui/dialog/BaseDialogFragment;", "VM", "Lcom/examples/core/ui/view_model/BaseViewModel;", "Landroidx/fragment/app/DialogFragment;", "()V", "TAG", "", "kotlin.jvm.PlatformType", "baseNetworkingDialog", "Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "getBaseNetworkingDialog", "()Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "setBaseNetworkingDialog", "(Lcom/examples/core/ui/dialog/BaseNetworkingDialog;)V", "isRoundedCorners", "", "()Z", "setRoundedCorners", "(Z)V", "layoutResourceId", "", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "mLoader", "Lcom/examples/core/utils/LoadingListener;", "viewModel", "getViewModel", "()Lcom/examples/core/ui/view_model/BaseViewModel;", "handleErrorStatus", "", "it", "Lcom/examples/core/domain/entity/base/ErrorModel;", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDetach", "onStop", "showLoading", "show", "core_debug"})
public abstract class BaseDialogFragment<VM extends com.examples.core.ui.view_model.BaseViewModel> extends androidx.fragment.app.DialogFragment {
    private final java.lang.String TAG = null;
    private com.examples.core.utils.LoadingListener mLoader;
    private boolean isRoundedCorners = true;
    @javax.inject.Inject()
    public com.examples.core.ui.dialog.BaseNetworkingDialog baseNetworkingDialog;
    private java.util.HashMap _$_findViewCache;
    
    public BaseDialogFragment() {
        super();
    }
    
    public abstract int getLayoutResourceId();
    
    public abstract void setLayoutResourceId(int p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getViewModel();
    
    public boolean isRoundedCorners() {
        return false;
    }
    
    public void setRoundedCorners(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.ui.dialog.BaseNetworkingDialog getBaseNetworkingDialog() {
        return null;
    }
    
    public final void setBaseNetworkingDialog(@org.jetbrains.annotations.NotNull()
    com.examples.core.ui.dialog.BaseNetworkingDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void handleErrorStatus(com.examples.core.domain.entity.base.ErrorModel it) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    public void showLoading(boolean show) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
}