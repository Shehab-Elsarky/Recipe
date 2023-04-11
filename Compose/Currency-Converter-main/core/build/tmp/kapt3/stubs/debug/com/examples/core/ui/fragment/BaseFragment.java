package com.examples.core.ui.fragment;

import java.lang.System;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u0004*\n\b\u0002\u0010\u0005*\u0004\u0018\u00010\u00062\u00020\u0007B1\u0012*\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020&H\u0016J\u0006\u0010*\u001a\u00020&J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\n2\b\u00101\u001a\u0004\u0018\u00010\u000b2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020&H\u0016J\b\u00105\u001a\u00020&H\u0016J\u001a\u00106\u001a\u00020&2\u0006\u00107\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00108\u001a\u00020&H\u0016J\u001f\u00109\u001a\u00020&2\u0006\u0010:\u001a\u00020\u00102\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<\u00a2\u0006\u0002\u0010=J\u0006\u0010>\u001a\u00020&J\u0010\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020\fH\u0016R\u0016\u0010\u000f\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u0011\u0010\u0014\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00028\u0002X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R2\u0010\b\u001a&\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\tj\b\u0012\u0004\u0012\u00028\u0000`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0012\u0010\"\u001a\u00028\u0001X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010$\u00a8\u0006A"}, d2 = {"Lcom/examples/core/ui/fragment/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "VM", "Lcom/examples/core/ui/view_model/BaseViewModel;", "HelperClass", "Lcom/examples/core/ui/fragment/BaseUiHelper;", "Lcom/examples/core/ui/fragment/NetworkBaseFragment;", "inflate", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/examples/core/ui/fragment/Inflate;", "(Lkotlin/jvm/functions/Function3;)V", "TAG", "", "kotlin.jvm.PlatformType", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "fragmentHelper", "getFragmentHelper", "()Lcom/examples/core/ui/fragment/BaseUiHelper;", "mLoader", "Lcom/examples/core/utils/LoadingListener;", "toolbarListener", "Lcom/examples/core/ui/activity/ToolbarListener;", "getToolbarListener", "()Lcom/examples/core/ui/activity/ToolbarListener;", "setToolbarListener", "(Lcom/examples/core/ui/activity/ToolbarListener;)V", "viewModel", "getViewModel", "()Lcom/examples/core/ui/view_model/BaseViewModel;", "handleErrorStatus", "", "it", "Lcom/examples/core/domain/entity/base/ErrorModel;", "handleState", "hideActivityToolbar", "onAttach", "context", "Landroid/content/Context;", "onCreateView", "Landroid/view/View;", "inflater", "container", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onDetach", "onViewCreated", "view", "onViewModelError", "setActivityToolbarTitle", "title", "gravity", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showActivityToolbar", "showLoading", "show", "core_debug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding, VM extends com.examples.core.ui.view_model.BaseViewModel, HelperClass extends com.examples.core.ui.fragment.BaseUiHelper> extends com.examples.core.ui.fragment.NetworkBaseFragment {
    private final kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> inflate = null;
    private VB _binding;
    private final java.lang.String TAG = null;
    private com.examples.core.utils.LoadingListener mLoader;
    @org.jetbrains.annotations.Nullable()
    private com.examples.core.ui.activity.ToolbarListener toolbarListener;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> inflate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VM getViewModel();
    
    public abstract HelperClass getFragmentHelper();
    
    @org.jetbrains.annotations.Nullable()
    protected final com.examples.core.ui.activity.ToolbarListener getToolbarListener() {
        return null;
    }
    
    protected final void setToolbarListener(@org.jetbrains.annotations.Nullable()
    com.examples.core.ui.activity.ToolbarListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void onViewModelError() {
    }
    
    public final void setActivityToolbarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gravity) {
    }
    
    public final void showActivityToolbar() {
    }
    
    public final void hideActivityToolbar() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
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
    
    public void handleState() {
    }
    
    private final void handleErrorStatus(com.examples.core.domain.entity.base.ErrorModel it) {
    }
}