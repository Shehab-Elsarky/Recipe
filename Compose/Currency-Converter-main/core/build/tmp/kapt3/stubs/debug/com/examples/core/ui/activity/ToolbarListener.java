package com.examples.core.ui.activity;

import java.lang.System;

/**
 * To be implemented by components that host top-level navigation destinations.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J!\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/examples/core/ui/activity/ToolbarListener;", "", "hideActivityToolbar", "", "setActivityToolbarTitle", "title", "", "gravity", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "showActivityToolbar", "core_debug"})
public abstract interface ToolbarListener {
    
    public abstract void setActivityToolbarTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Integer gravity);
    
    /**
     * Called by BaseFragment to show fragment toolbar and hide the activity toolbar
     */
    public abstract void hideActivityToolbar();
    
    /**
     * Called show the activity toolbar
     */
    public abstract void showActivityToolbar();
    
    /**
     * To be implemented by components that host top-level navigation destinations.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}