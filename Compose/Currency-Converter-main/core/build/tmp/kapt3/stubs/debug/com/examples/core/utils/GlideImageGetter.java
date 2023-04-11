package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/examples/core/utils/GlideImageGetter;", "Landroid/text/Html$ImageGetter;", "textView", "Landroid/widget/TextView;", "matchParentWidth", "", "densityAware", "imagesHandler", "Lcom/examples/core/utils/GlideImageGetter$HtmlImagesHandler;", "(Landroid/widget/TextView;ZZLcom/examples/core/utils/GlideImageGetter$HtmlImagesHandler;)V", "container", "Ljava/lang/ref/WeakReference;", "density", "", "getDrawable", "Landroid/graphics/drawable/Drawable;", "source", "", "BitmapDrawablePlaceholder", "HtmlImagesHandler", "core_debug"})
public final class GlideImageGetter implements android.text.Html.ImageGetter {
    private final boolean matchParentWidth = false;
    private final com.examples.core.utils.GlideImageGetter.HtmlImagesHandler imagesHandler = null;
    private final java.lang.ref.WeakReference<android.widget.TextView> container = null;
    private float density = 1.0F;
    
    public GlideImageGetter(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, boolean matchParentWidth, boolean densityAware, @org.jetbrains.annotations.Nullable()
    com.examples.core.utils.GlideImageGetter.HtmlImagesHandler imagesHandler) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.graphics.drawable.Drawable getDrawable(@org.jetbrains.annotations.NotNull()
    java.lang.String source) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0012\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0016J\"\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00032\u0010\u0010\u001b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0003\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\b\u0010\u001e\u001a\u00020\u000bH\u0016J\u0010\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0012H\u0016J\u0012\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\b\u0010\t\u00a8\u0006#"}, d2 = {"Lcom/examples/core/utils/GlideImageGetter$BitmapDrawablePlaceholder;", "Landroid/graphics/drawable/BitmapDrawable;", "Lcom/bumptech/glide/request/target/Target;", "Landroid/graphics/Bitmap;", "(Lcom/examples/core/utils/GlideImageGetter;)V", "value", "Landroid/graphics/drawable/Drawable;", "drawable", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "draw", "", "canvas", "Landroid/graphics/Canvas;", "getRequest", "Lcom/bumptech/glide/request/Request;", "getSize", "sizeReadyCallback", "Lcom/bumptech/glide/request/target/SizeReadyCallback;", "onDestroy", "onLoadCleared", "placeholderDrawable", "onLoadFailed", "errorDrawable", "onLoadStarted", "onResourceReady", "bitmap", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "onStart", "onStop", "removeCallback", "cb", "setRequest", "request", "core_debug"})
    final class BitmapDrawablePlaceholder extends android.graphics.drawable.BitmapDrawable implements com.bumptech.glide.request.target.Target<android.graphics.Bitmap> {
        private android.graphics.drawable.Drawable drawable;
        
        public BitmapDrawablePlaceholder() {
            super();
        }
        
        private final void setDrawable(android.graphics.drawable.Drawable value) {
        }
        
        @java.lang.Override()
        public void draw(@org.jetbrains.annotations.NotNull()
        android.graphics.Canvas canvas) {
        }
        
        @java.lang.Override()
        public void onLoadStarted(@org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable placeholderDrawable) {
        }
        
        @java.lang.Override()
        public void onLoadFailed(@org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable errorDrawable) {
        }
        
        @java.lang.Override()
        public void onResourceReady(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap, @org.jetbrains.annotations.Nullable()
        com.bumptech.glide.request.transition.Transition<? super android.graphics.Bitmap> transition) {
        }
        
        @java.lang.Override()
        public void onLoadCleared(@org.jetbrains.annotations.Nullable()
        android.graphics.drawable.Drawable placeholderDrawable) {
        }
        
        @java.lang.Override()
        public void getSize(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.request.target.SizeReadyCallback sizeReadyCallback) {
        }
        
        @java.lang.Override()
        public void removeCallback(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.request.target.SizeReadyCallback cb) {
        }
        
        @java.lang.Override()
        public void setRequest(@org.jetbrains.annotations.Nullable()
        com.bumptech.glide.request.Request request) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public com.bumptech.glide.request.Request getRequest() {
            return null;
        }
        
        @java.lang.Override()
        public void onStart() {
        }
        
        @java.lang.Override()
        public void onStop() {
        }
        
        @java.lang.Override()
        public void onDestroy() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/examples/core/utils/GlideImageGetter$HtmlImagesHandler;", "", "addImage", "", "uri", "", "core_debug"})
    public static abstract interface HtmlImagesHandler {
        
        public abstract void addImage(@org.jetbrains.annotations.Nullable()
        java.lang.String uri);
    }
}