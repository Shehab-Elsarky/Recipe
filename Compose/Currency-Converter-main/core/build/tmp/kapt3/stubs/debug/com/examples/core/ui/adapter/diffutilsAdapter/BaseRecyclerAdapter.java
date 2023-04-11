package com.examples.core.ui.adapter.diffutilsAdapter;

import java.lang.System;

/**
 * A generic RecyclerView adapter that uses Data Binding & DiffUtil.
 *
 * @param T Type of the items in the list
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00050\u0004Bg\u0012*\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u000b\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\r\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\r\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013J-\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u001aH$\u00a2\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u0011J\u001e\u0010\u001d\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001aH\u0016R2\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/examples/core/ui/adapter/diffutilsAdapter/BaseRecyclerAdapter;", "VB", "Landroidx/viewbinding/ViewBinding;", "T", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/examples/core/ui/adapter/diffutilsAdapter/Base2ViewHolder;", "inflate", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/examples/core/ui/fragment/Inflate;", "areItemsTheSame", "Lkotlin/Function2;", "areItemsContentsTheSame", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "addToList", "", "newList", "", "bind", "context", "Landroid/content/Context;", "binding", "item", "position", "", "(Landroid/content/Context;Landroidx/viewbinding/ViewBinding;Ljava/lang/Object;I)V", "clear", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "viewType", "core_debug"})
public abstract class BaseRecyclerAdapter<VB extends androidx.viewbinding.ViewBinding, T extends java.lang.Object> extends androidx.recyclerview.widget.ListAdapter<T, com.examples.core.ui.adapter.diffutilsAdapter.Base2ViewHolder<VB>> {
    private final kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> inflate = null;
    
    public BaseRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> inflate, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areItemsTheSame, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super T, ? super T, java.lang.Boolean> areItemsContentsTheSame) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.examples.core.ui.adapter.diffutilsAdapter.Base2ViewHolder<VB> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    /**
     * the layout of the item
     */
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.examples.core.ui.adapter.diffutilsAdapter.Base2ViewHolder<VB> holder, int position) {
    }
    
    /**
     * Bind the item of type [T] to the itemView
     */
    protected abstract void bind(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    VB binding, T item, int position);
    
    public final void addToList(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> newList) {
    }
    
    public final void clear() {
    }
}