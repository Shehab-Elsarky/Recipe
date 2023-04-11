package com.examples.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000h\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u0002H\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u001a+\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u0002H\u00020\u0007j\b\u0012\u0004\u0012\u0002H\u0002`\b\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\tH\u0086\b\u001a*\u0010\n\u001a\n \u000b*\u0004\u0018\u0001H\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086\b\u00a2\u0006\u0002\u0010\u000f\u001a*\u0010\u0010\u001a\u0002H\u0002\"\u000e\b\u0000\u0010\u0002\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eH\u0086\b\u00a2\u0006\u0002\u0010\u0014\u001a\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\u0017\u001a\"\u0010\u0018\u001a\u0002H\u0002\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00192\u0006\u0010\u001a\u001a\u0002H\u0002H\u0086\b\u00a2\u0006\u0002\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u001d*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0011\u001a\u0012\u0010\u001f\u001a\u00020\u001d*\u00020\u00172\u0006\u0010 \u001a\u00020!\u001a&\u0010\"\u001a\u00020\u001d*\u00020#2\u0006\u0010$\u001a\u00020%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\'0\u0004\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006("}, d2 = {"convertTo", "R", "T", "transform", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "copyList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "fromJson", "kotlin.jvm.PlatformType", "Lcom/google/gson/Gson;", "json", "", "(Lcom/google/gson/Gson;Ljava/lang/String;)Ljava/lang/Object;", "getEnum", "", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Enum;", "getIntent", "Landroid/content/Intent;", "Landroidx/fragment/app/Fragment;", "mapTo", "", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putEnum", "", "enum", "showDialog", "dialog", "Landroidx/fragment/app/DialogFragment;", "showPopup", "Landroid/view/View;", "menuRes", "", "onItemClickAction", "", "core_debug"})
public final class ExtentionsKt {
    
    public static final void putEnum(@org.jetbrains.annotations.NotNull()
    android.os.Bundle $this$putEnum, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Enum<?> p2_1559168) {
    }
    
    public static final void showPopup(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showPopup, int menuRes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> onItemClickAction) {
    }
    
    public static final void showDialog(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$showDialog, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment dialog) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $this$getIntent) {
        return null;
    }
    
    public static final <T extends java.lang.Object, R extends java.lang.Object>R convertTo(T $this$convertTo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, ? extends R> transform) {
        return null;
    }
}