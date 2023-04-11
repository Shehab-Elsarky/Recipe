package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\b\u001a,\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b\u001a\u0012\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004\u001a#\u0010\u0012\u001a\u00020\n*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\n*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\r2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0018\u001a\u00020\n*\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\r\u001a?\u0010\u001a\u001a\u00020\n*\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010 \u00a8\u0006!"}, d2 = {"convertDpToPixel", "", "dp", "context", "Landroid/content/Context;", "getDrawableBackground", "Landroid/graphics/drawable/Drawable;", "drawableId", "", "addImageAtEnd", "", "Landroid/widget/TextView;", "atText", "", "imgSrc", "imgWidth", "imgHeight", "dpToPx", "loadImg", "Landroid/widget/ImageView;", "imgUrl", "placeHolder", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Integer;)V", "loadSVGImg", "setClickableHtmlText", "htmlText", "setMargins", "Landroid/view/View;", "leftMarginDp", "topMarginDp", "rightMarginDp", "bottomMarginDp", "(Landroid/view/View;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "core_debug"})
public final class ViewsHelperKt {
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable getDrawableBackground(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.DrawableRes()
    int drawableId) {
        return null;
    }
    
    public static final void setMargins(@org.jetbrains.annotations.NotNull()
    android.view.View $this$setMargins, @org.jetbrains.annotations.Nullable()
    java.lang.Integer leftMarginDp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer topMarginDp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer rightMarginDp, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bottomMarginDp) {
    }
    
    public static final int dpToPx(int $this$dpToPx, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    public static final void loadImg(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadImg, @org.jetbrains.annotations.NotNull()
    java.lang.String imgUrl, @org.jetbrains.annotations.Nullable()
    java.lang.Integer placeHolder) {
    }
    
    public static final void loadSVGImg(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadSVGImg, @org.jetbrains.annotations.NotNull()
    java.lang.String imgUrl, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.DrawableRes()
    java.lang.Integer placeHolder) {
    }
    
    public static final void addImageAtEnd(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$addImageAtEnd, @org.jetbrains.annotations.NotNull()
    java.lang.String atText, @androidx.annotation.DrawableRes()
    int imgSrc, int imgWidth, int imgHeight) {
    }
    
    public static final void setClickableHtmlText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setClickableHtmlText, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlText) {
    }
    
    public static final float convertDpToPixel(float dp, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0.0F;
    }
}