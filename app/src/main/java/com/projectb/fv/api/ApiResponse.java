package com.projectb.fv.api;

public class ApiResponse<T> {

    private T responseEntity;
    private Throwable error;

    public ApiResponse(T masterResponseEntity) {
        this.responseEntity = masterResponseEntity;
        this.error = null;
    }

    public ApiResponse(Throwable error) {
        this.error = error;
        this.responseEntity = null;
    }

    public T getResponseEntity() {
        return responseEntity;
    }

    public void setResponseEntity(T responseEntity) {
        this.responseEntity = responseEntity;
    }

    public Throwable getError() {
        return error;
    }

    public void setError(Throwable error) {
        this.error = error;
    }


}

