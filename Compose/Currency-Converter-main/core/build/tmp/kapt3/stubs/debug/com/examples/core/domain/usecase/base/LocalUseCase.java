package com.examples.core.domain.usecase.base;

import java.lang.System;

/**
 * @type T represents object type for inserting
 * @type R represents return value for selecting
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0018B\u0005\u00a2\u0006\u0002\u0010\u0004JB\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u00002\'\u0010\u000f\u001a#\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0011\u0012\u0004\u0012\u00020\r0\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0012\u00a2\u0006\u0002\b\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u000e\u001a\u00028\u0000H\u00a4@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/examples/core/domain/usecase/base/LocalUseCase;", "T", "R", "", "()V", "backgroundContext", "Lkotlin/coroutines/CoroutineContext;", "jobs", "Ljava/util/ArrayList;", "Lkotlinx/coroutines/Job;", "Lkotlin/collections/ArrayList;", "parentJob", "execute", "", "parameters", "block", "Lkotlin/Function1;", "Lcom/examples/core/domain/usecase/base/LocalUseCase$Request;", "Lcom/examples/core/domain/usecase/base/CompleteBlock;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeOnBackground", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribe", "Request", "core_debug"})
public abstract class LocalUseCase<T extends java.lang.Object, R extends java.lang.Object> {
    private kotlinx.coroutines.Job parentJob;
    private kotlin.coroutines.CoroutineContext backgroundContext;
    private final java.util.ArrayList<kotlinx.coroutines.Job> jobs = null;
    
    public LocalUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object executeOnBackground(T parameters, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super R> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object execute(T parameters, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.examples.core.domain.usecase.base.LocalUseCase.Request<R>, kotlin.Unit> block, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void unsubscribe() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00028\u0002H\u0086\u0002\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\n\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0006j\u0002`\u0007H\u0086\u0002J\u001e\u0010\u0004\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005J\u001a\u0010\t\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b0\u0005R \u0010\u0004\u001a\u0014\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/examples/core/domain/usecase/base/LocalUseCase$Request;", "T", "", "()V", "onCancel", "Lkotlin/Function1;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "onComplete", "invoke", "result", "(Ljava/lang/Object;)V", "error", "block", "core_debug"})
    public static final class Request<T extends java.lang.Object> {
        private kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onComplete;
        private kotlin.jvm.functions.Function1<? super java.util.concurrent.CancellationException, kotlin.Unit> onCancel;
        
        public Request() {
            super();
        }
        
        public final void onComplete(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> block) {
        }
        
        public final void onCancel(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.util.concurrent.CancellationException, kotlin.Unit> block) {
        }
        
        public final void invoke(T result) {
        }
        
        public final void invoke(@org.jetbrains.annotations.NotNull()
        java.util.concurrent.CancellationException error) {
        }
    }
}