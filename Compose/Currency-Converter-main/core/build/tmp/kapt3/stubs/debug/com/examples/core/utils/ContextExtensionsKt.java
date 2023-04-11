package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u001a\u0016\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u001a\u0016\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u001a\"\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004\u00a8\u0006\u0015"}, d2 = {"copyToClipboard", "", "Landroid/content/Context;", "text", "", "getColorCompat", "", "resourceId", "getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "getStringByIdName", "idName", "makeCall", "activity", "Landroid/app/Activity;", "phoneNumber", "callPhonePermissionRequestCode", "sendMail", "emailAddress", "startBrowserIntent", "url", "core_debug"})
public final class ContextExtensionsKt {
    
    /**
     * Created by Nader Nabil on 5/11/2020.
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getStringByIdName(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getStringByIdName, @org.jetbrains.annotations.Nullable()
    java.lang.String idName) {
        return null;
    }
    
    public static final void startBrowserIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$startBrowserIntent, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    /**
     * Extension function to get int value of color from color resource.
     *
     * @receiver Context
     * @param resourceId Int the color res.
     * @return Int value of the color.
     */
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getColorCompat, @androidx.annotation.ColorRes()
    int resourceId) {
        return 0;
    }
    
    /**
     * Extension function to get drawable from drawable resource.
     *
     * @receiver Context
     * @param resourceId Int the drawable res
     * @return Drawable? the instance of drawable
     */
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable getDrawableCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getDrawableCompat, @androidx.annotation.DrawableRes()
    int resourceId) {
        return null;
    }
    
    public static final void makeCall(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$makeCall, @org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, int callPhonePermissionRequestCode) {
    }
    
    public static final void sendMail(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$sendMail, @org.jetbrains.annotations.NotNull()
    java.lang.String emailAddress) {
    }
    
    public static final void copyToClipboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$copyToClipboard, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
}