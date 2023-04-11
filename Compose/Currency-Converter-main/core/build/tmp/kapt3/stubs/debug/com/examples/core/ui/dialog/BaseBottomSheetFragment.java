package com.examples.core.ui.dialog;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\n\b\u0002\u0010\u0005*\u0004\u0018\u00010\u00062\u00020\u0007B1\u0012*\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\n2\b\u00107\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00108\u001a\u00020*H\u0016J\b\u00109\u001a\u00020*H\u0016J\b\u0010:\u001a\u00020*H\u0016J\u0010\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020*2\u0006\u0010?\u001a\u00020\fH\u0016R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0012\u0010\u001d\u001a\u00028\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR2\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010&\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010(\u00a8\u0006@"}, d2 = {"Lcom/examples/core/ui/dialog/BaseBottomSheetFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Lcom/examples/core/ui/view_model/BaseViewModel;", "HelperClass", "Lcom/examples/core/ui/fragment/BaseUiHelper;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "inflate", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/examples/core/ui/fragment/Inflate;", "(Lkotlin/jvm/functions/Function3;)V", "TAG", "", "kotlin.jvm.PlatformType", "_binding", "Landroidx/viewbinding/ViewBinding;", "baseNetworkingDialog", "Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "getBaseNetworkingDialog", "()Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "setBaseNetworkingDialog", "(Lcom/examples/core/ui/dialog/BaseNetworkingDialog;)V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "fragmentHelper", "getFragmentHelper", "()Lcom/examples/core/ui/fragment/BaseUiHelper;", "isRoundedCorners", "()Z", "setRoundedCorners", "(Z)V", "mLoader", "Lcom/examples/core/utils/LoadingListener;", "viewModel", "getViewModel", "()Lcom/examples/core/ui/view_model/BaseViewModel;", "handleErrorStatus", "", "it", "Lcom/examples/core/domain/entity/base/ErrorModel;", "onAttach", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "container", "onDestroy", "onDetach", "onStop", "setupBottomSheet", "dialogInterface", "Landroid/content/DialogInterface;", "showLoading", "show", "core_debug"})
public abstract class BaseBottomSheetFragment<VB extends androidx.viewbinding.ViewBinding, VM extends com.examples.core.ui.view_model.BaseViewModel, HelperClass extends com.examples.core.ui.fragment.BaseUiHelper> extends com.google.android.material.bottomsheet.BottomSheetDialogFragment {
    private final kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> inflate = null;
    private final java.lang.String TAG = null;
    @javax.inject.Inject()
    public com.examples.core.ui.dialog.BaseNetworkingDialog baseNetworkingDialog;
    private VB _binding;
    private com.examples.core.utils.LoadingListener mLoader;
    private boolean isRoundedCorners = true;
    private java.util.HashMap _$_findViewCache;
    
    public BaseBottomSheetFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> inflate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.ui.dialog.BaseNetworkingDialog getBaseNetworkingDialog() {
        return null;
    }
    
    public final void setBaseNetworkingDialog(@org.jetbrains.annotations.NotNull()
    com.examples.core.ui.dialog.BaseNetworkingDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getViewModel();
    
    public boolean isRoundedCorners() {
        return false;
    }
    
    public void setRoundedCorners(boolean p0) {
    }
    
    public abstract HelperClass getFragmentHelper();
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public void setupBottomSheet(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialogInterface) {
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
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void handleErrorStatus(com.examples.core.domain.entity.base.ErrorModel it) {
    }
}