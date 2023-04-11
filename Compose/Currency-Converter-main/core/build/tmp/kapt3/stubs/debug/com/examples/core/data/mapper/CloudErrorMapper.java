package com.examples.core.data.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/examples/core/data/mapper/CloudErrorMapper;", "", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "getBadRequestHttpError", "Lcom/examples/core/domain/entity/base/ErrorModel;", "body", "Lokhttp3/ResponseBody;", "getHttpError", "mapToDomainErrorException", "throwable", "", "mapToResponseErrorMessage", "message", "", "core_debug"})
public class CloudErrorMapper {
    private final com.google.gson.Gson gson = null;
    
    @javax.inject.Inject()
    public CloudErrorMapper(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.domain.entity.base.ErrorModel mapToDomainErrorException(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable throwable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.examples.core.domain.entity.base.ErrorModel mapToResponseErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    /**
     * attempts to parse http response body and get error data from it
     *
     * @param body retrofit response body
     * @return returns an instance of [ErrorModel] with parsed data or NOT_DEFINED status
     */
    private final com.examples.core.domain.entity.base.ErrorModel getHttpError(okhttp3.ResponseBody body) {
        return null;
    }
    
    private final com.examples.core.domain.entity.base.ErrorModel getBadRequestHttpError(okhttp3.ResponseBody body) {
        return null;
    }
}