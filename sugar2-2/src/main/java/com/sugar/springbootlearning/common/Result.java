package com.sugar.springbootlearning.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Result<T> {

    private static final long serialVersionUID = 1L;
    private int code;
    private String message = "";
    private T data;

    public static class Builder<T> {

        private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
        private static final String DEFAULT_FAIL_MESSAGE = "FAIL";

        private Result<T> result;

        public Builder() {
            result = new Result<>();
        }

        public Builder(T data) {
            result = new Result<>();
            result.setData(data);
        }

        public Builder<T> setCode(int code) {
            result.setCode(code);
            if (ErrorCodeResult.errorMessage.containsKey(code)) {
                result.setMessage(ErrorCodeResult.errorMessage.get(code));
            }
            return this;
        }

        public Builder<T> setData(T data) {
            result.setData(data);
            return this;
        }

        public Builder<T> setMessage(String message) {
            result.setMessage(message);
            return this;
        }

        @Deprecated
        public Builder<T> generateResult(boolean isSuccess) {
            generateResult(isSuccess, isSuccess ? DEFAULT_SUCCESS_MESSAGE : DEFAULT_FAIL_MESSAGE);
            return this;
        }

        @Deprecated
        public Builder<T> generateResult(boolean isSuccess, String message) {
            generateResult(isSuccess, null, message);
            return this;
        }

        @Deprecated
        public Builder<T> generateResultWithoutMessage(boolean isSuccess, T data) {
            generateResult(isSuccess, data, isSuccess ? DEFAULT_SUCCESS_MESSAGE : DEFAULT_FAIL_MESSAGE);
            return this;
        }

        @Deprecated
        public Builder<T> generateResult(boolean isSuccess, T data, String message) {
            generateResult(isSuccess ? ErrorCodeResult.SUCCESS : ErrorCodeResult.FAIL, data, message);
            return this;
        }

        @Deprecated
        public Builder<T> generateResult(int code, T data, String message) {
            result.setCode(code);
            result.setData(data);
            result.setMessage(message);
            return this;
        }

        @Deprecated
        public Builder<T> generateResult(int code, String message) {
            result.setCode(code);
            result.setMessage(message);
            return this;
        }

        public Result<T> build() {
            return result;
        }
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }




}
