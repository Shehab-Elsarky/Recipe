package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00122\u00020\u0001:\u0002\u0012\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/examples/core/utils/OnSwipeListener;", "Landroid/view/View$OnTouchListener;", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gestureDetector", "Landroid/view/GestureDetector;", "onSwipeBottom", "", "onSwipeLeft", "onSwipeRight", "onSwipeTop", "onTouch", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "Companion", "GestureListener", "core_debug"})
public class OnSwipeListener implements android.view.View.OnTouchListener {
    private final android.view.GestureDetector gestureDetector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.examples.core.utils.OnSwipeListener.Companion Companion = null;
    private static final int SWIPE_THRESHOLD = 100;
    private static final int SWIPE_VELOCITY_THRESHOLD = 100;
    
    public OnSwipeListener(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        super();
    }
    
    @java.lang.Override()
    public boolean onTouch(@org.jetbrains.annotations.Nullable()
    android.view.View v, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public void onSwipeRight() {
    }
    
    public void onSwipeLeft() {
    }
    
    public void onSwipeTop() {
    }
    
    public void onSwipeBottom() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a8\u0006\r"}, d2 = {"Lcom/examples/core/utils/OnSwipeListener$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "(Lcom/examples/core/utils/OnSwipeListener;)V", "onDown", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "core_debug"})
    final class GestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        
        public GestureListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onDown(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onFling(@org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e1, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/examples/core/utils/OnSwipeListener$Companion;", "", "()V", "SWIPE_THRESHOLD", "", "SWIPE_VELOCITY_THRESHOLD", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}