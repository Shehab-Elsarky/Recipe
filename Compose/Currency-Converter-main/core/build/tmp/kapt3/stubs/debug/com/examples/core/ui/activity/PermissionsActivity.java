package com.examples.core.ui.activity;

import java.lang.System;

/**
 * Created by Shehab Elsarky
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR%\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00050\u00050\u00040\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/examples/core/ui/activity/PermissionsActivity;", "Lcom/examples/core/ui/activity/BaseActivity;", "()V", "permissions", "", "", "getPermissions", "()[Ljava/lang/String;", "setPermissions", "([Ljava/lang/String;)V", "requestPermissionsLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "getRequestPermissionsLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "core_debug"})
public abstract class PermissionsActivity extends com.examples.core.ui.activity.BaseActivity {
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> requestPermissionsLauncher = null;
    private java.util.HashMap _$_findViewCache;
    
    public PermissionsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String[] getPermissions();
    
    public abstract void setPermissions(@org.jetbrains.annotations.NotNull()
    java.lang.String[] p0);
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> getRequestPermissionsLauncher() {
        return null;
    }
}