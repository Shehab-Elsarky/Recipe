package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0006\u001a,\u0010\u0007\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f\u001a)\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u0002H\u0002\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"add", "", "T", "Landroidx/lifecycle/MutableLiveData;", "", "item", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V", "observeOnce", "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "remove", "core_debug"})
public final class LiveDataExtKt {
    
    /**
     * Single Livedata
     */
    public static final <T extends java.lang.Object>void observeOnce(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeOnce, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
    
    public static final <T extends java.lang.Object>void add(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$add, T item) {
    }
    
    public static final <T extends java.lang.Object>void remove(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<T>> $this$remove, T item) {
    }
}