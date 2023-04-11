package com.examples.core.domain.entity.base;

import java.lang.System;

/**
 * Default error model that comes from server if something goes wrong with a repository call
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B!\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J0\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0004R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001d"}, d2 = {"Lcom/examples/core/domain/entity/base/ErrorModel;", "", "errorStatus", "Lcom/examples/core/domain/entity/base/ErrorStatus;", "(Lcom/examples/core/domain/entity/base/ErrorStatus;)V", "errorCode", "", "(Lcom/examples/core/domain/entity/base/ErrorStatus;I)V", "message", "", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/examples/core/domain/entity/base/ErrorStatus;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorStatus", "()Lcom/examples/core/domain/entity/base/ErrorStatus;", "setErrorStatus", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/examples/core/domain/entity/base/ErrorStatus;)Lcom/examples/core/domain/entity/base/ErrorModel;", "equals", "", "other", "hashCode", "toString", "core_debug"})
public final class ErrorModel {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer errorCode = null;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.Transient()
    private transient com.examples.core.domain.entity.base.ErrorStatus errorStatus;
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.domain.entity.base.ErrorModel copy(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer errorCode, @org.jetbrains.annotations.NotNull()
    com.examples.core.domain.entity.base.ErrorStatus errorStatus) {
        return null;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Default error model that comes from server if something goes wrong with a repository call
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public ErrorModel(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.Integer errorCode, @org.jetbrains.annotations.NotNull()
    com.examples.core.domain.entity.base.ErrorStatus errorStatus) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getErrorCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.domain.entity.base.ErrorStatus component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.domain.entity.base.ErrorStatus getErrorStatus() {
        return null;
    }
    
    public final void setErrorStatus(@org.jetbrains.annotations.NotNull()
    com.examples.core.domain.entity.base.ErrorStatus p0) {
    }
    
    public ErrorModel(@org.jetbrains.annotations.NotNull()
    com.examples.core.domain.entity.base.ErrorStatus errorStatus) {
        super();
    }
    
    public ErrorModel(@org.jetbrains.annotations.NotNull()
    com.examples.core.domain.entity.base.ErrorStatus errorStatus, int errorCode) {
        super();
    }
}