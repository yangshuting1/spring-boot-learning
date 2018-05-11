package com.sugar.springbootlearning.common;

public enum ErrorCodeEnum implements ErrorCode{
    SUCCESS(10000, "成功"),
    FAIL(10001, "失败"),
    NO_LOGIN(10003, "未登录"),
    NO_PRIVILEGE(10004, "无权限"),
    INVALIDATION(10005, "无效请求"),
    DUPLICATE_DATA(10006, "重复数据"),
    FILE_INVALID(10007, "文件不合法"),
    OPTION_FORMAT_ERROR(10008, "请求参数非法"),
    INVALID_URL(10009, "错误的URL");

    private int code;
    private String message;

    ErrorCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
