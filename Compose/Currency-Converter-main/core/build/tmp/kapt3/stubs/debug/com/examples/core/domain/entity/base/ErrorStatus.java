package com.examples.core.domain.entity.base;

import java.lang.System;

/**
 * various error status to know what happened if something goes wrong with a repository call
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/examples/core/domain/entity/base/ErrorStatus;", "", "(Ljava/lang/String;I)V", "NO_CONNECTION", "BAD_RESPONSE", "TIMEOUT", "SSL_EXCEPTION", "EMPTY_RESPONSE", "NOT_DEFINED", "UNAUTHORIZED", "INTERNAL_SERVER_ERROR", "UNKNOWN_HOST", "FORRBIDEN", "NOT_FOUND", "NO_DATA", "core_debug"})
public enum ErrorStatus {
    /*public static final*/ NO_CONNECTION /* = new NO_CONNECTION() */,
    /*public static final*/ BAD_RESPONSE /* = new BAD_RESPONSE() */,
    /*public static final*/ TIMEOUT /* = new TIMEOUT() */,
    /*public static final*/ SSL_EXCEPTION /* = new SSL_EXCEPTION() */,
    /*public static final*/ EMPTY_RESPONSE /* = new EMPTY_RESPONSE() */,
    /*public static final*/ NOT_DEFINED /* = new NOT_DEFINED() */,
    /*public static final*/ UNAUTHORIZED /* = new UNAUTHORIZED() */,
    /*public static final*/ INTERNAL_SERVER_ERROR /* = new INTERNAL_SERVER_ERROR() */,
    /*public static final*/ UNKNOWN_HOST /* = new UNKNOWN_HOST() */,
    /*public static final*/ FORRBIDEN /* = new FORRBIDEN() */,
    /*public static final*/ NOT_FOUND /* = new NOT_FOUND() */,
    /*public static final*/ NO_DATA /* = new NO_DATA() */;
    
    ErrorStatus() {
    }
}