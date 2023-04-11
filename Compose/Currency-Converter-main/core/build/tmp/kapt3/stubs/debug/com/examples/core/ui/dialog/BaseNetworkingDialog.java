package com.examples.core.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\fJ\b\u0010\u0013\u001a\u00020\u0011H\u0002J\"\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0002J\b\u0010\u001e\u001a\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001f"}, d2 = {"Lcom/examples/core/ui/dialog/BaseNetworkingDialog;", "", "()V", "btnOk", "Landroid/widget/TextView;", "dialog", "Landroid/app/Dialog;", "dialogDetails", "dialogImage", "Landroid/widget/ImageView;", "dialogTitle", "isShown", "", "()Z", "setShown", "(Z)V", "dismiss", "", "withDelay", "initViews", "showDialog", "context", "Landroid/content/Context;", "errorStatus", "Lcom/examples/core/domain/entity/base/ErrorStatus;", "errorMessage", "", "updateEmptyResponseUi", "updateNoInternetConnectionUi", "updateServerErrorUi", "updateUnknownHostUi", "core_debug"})
public final class BaseNetworkingDialog {
    private android.app.Dialog dialog;
    private android.widget.ImageView dialogImage;
    private android.widget.TextView dialogTitle;
    private android.widget.TextView dialogDetails;
    private android.widget.TextView btnOk;
    private boolean isShown = false;
    
    @javax.inject.Inject()
    public BaseNetworkingDialog() {
        super();
    }
    
    public final boolean isShown() {
        return false;
    }
    
    public final void setShown(boolean p0) {
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.examples.core.domain.entity.base.ErrorStatus errorStatus, @org.jetbrains.annotations.Nullable()
    java.lang.String errorMessage) {
    }
    
    public final void dismiss(boolean withDelay) {
    }
    
    private final void initViews() {
    }
    
    private final void updateNoInternetConnectionUi() {
    }
    
    private final void updateServerErrorUi() {
    }
    
    private final void updateUnknownHostUi() {
    }
    
    private final void updateEmptyResponseUi(java.lang.String errorMessage) {
    }
}