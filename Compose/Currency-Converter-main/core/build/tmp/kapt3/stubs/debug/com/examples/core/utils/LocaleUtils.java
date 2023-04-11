package com.examples.core.utils;

import java.lang.System;

/**
 * This class is used to change your application locale and persist this change for the next time
 * that your app is going to be used.
 * You can also change the locale of your application on the fly by using the setLocale method.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0004J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0003J\u001a\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/examples/core/utils/LocaleUtils;", "", "()V", "ARABIC_LANG_CODE", "", "getARABIC_LANG_CODE", "()Ljava/lang/String;", "setARABIC_LANG_CODE", "(Ljava/lang/String;)V", "ENGLISH_LANG_CODE", "getENGLISH_LANG_CODE", "setENGLISH_LANG_CODE", "SELECTED_LANGUAGE", "getCountryCodeUsingLocals", "context", "Landroid/content/Context;", "getLanguage", "getPersistedData", "defaultLanguage", "onAttach", "persist", "", "language", "setLocale", "updateResources", "updateResourcesLegacy", "core_debug"})
public final class LocaleUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.examples.core.utils.LocaleUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ARABIC_LANG_CODE = "ar";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ENGLISH_LANG_CODE = "en";
    private static final java.lang.String SELECTED_LANGUAGE = "Locale.Helper.Selected.Language";
    
    private LocaleUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getARABIC_LANG_CODE() {
        return null;
    }
    
    public final void setARABIC_LANG_CODE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getENGLISH_LANG_CODE() {
        return null;
    }
    
    public final void setENGLISH_LANG_CODE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultLanguage) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context setLocale(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPersistedData(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultLanguage) {
        return null;
    }
    
    private final void persist(android.content.Context context, java.lang.String language) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.N)
    private final android.content.Context updateResources(android.content.Context context, java.lang.String language) {
        return null;
    }
    
    @java.lang.SuppressWarnings(value = {"deprecation"})
    private final android.content.Context updateResourcesLegacy(android.content.Context context, java.lang.String language) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.N)
    public final java.lang.String getCountryCodeUsingLocals(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}