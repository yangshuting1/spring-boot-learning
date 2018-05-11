package com.sugar.springbootlearning.common;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class ErrorCodeResult {
    //状态码
    public final static int SUCCESS = 10000;
    public final static int FAIL = 10001;
    public final static int NO_LOGIN = 10003;
    public final static int NO_PRIVILEGE = 10004;
    public final static int INVALIDATION = 10005;
    public final static int DUPLICATE_DATA = 10006;
    public final static int FILE_INVALID = 10007;
    public final static int OPTION_FORMAT_ERROR = 10008;
    public final static int INVALID_URL = 10009;

    public final static Map<Integer, String> errorMessage = new ImmutableMap.Builder<Integer, String>()
            .put(SUCCESS, "成功")
            .put(FAIL, "失败")
            .put(NO_LOGIN, "未登录")
            .put(NO_PRIVILEGE, "无权限")
            .put(INVALIDATION, "无效请求")
            .put(DUPLICATE_DATA, "重复数据")
            .put(FILE_INVALID, "文件不合法")
            .put(OPTION_FORMAT_ERROR, "请求参数非法")
            .put(INVALID_URL, "错误的URL")
            .build();

}
