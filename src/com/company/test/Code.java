package com.company.test;

/**
 * @Description
 * @Date 2022/8/31 16:38
 * @Created by liuxianglin
 */

public enum Code {

    SUCCESS(8888, "处理成功"),
    FAILURE(0000, "处理失败"),


    // 代码逻辑异常,该部分由研发部各产品组功能维护,请由专人统一维护
    NULL_EXCEPTION(1000, "空指针异常"),
    NO_SUCH_ELEMENT(1001, "未找到对应元素"),
    NUMBER_FORMAT_ERROR(1002, "输入数字格式错误"),
    FILE_OPERATION_ERROR(1003, "文件操作异常"),
    FILE_NOT_FOUND(1004, "找不到文件"),
    REQUEST_TIMEOUT(1005, "请求超时"),
    REQUEST_EXPIRED(1006, "请求已过期"),
    ARGUMENT_VALID_EXCEPTION(1007, "参数异常"),
    TYPE_MISMATCH_EXCEPTION(1008, "参数类型错误"),
    METHOD_ARGUMENT_NOT_VALID_EXCEPTION(1009, "请求方法或参数异常"),
    CONTENT_TYPE_EXCEPTION(1010, "ContentType 异常"),
    MISSING_REQUEST_HEADER_EXCEPTION(1011, "缺少请求头信息"),

    /**
     * 业务代码异常
     */
    ITEM_CONFLICT(4000, "资源已存在"),
    REPEAT_SUBMIT(4002, "重复提交"),
    MULTI_SIGN_IN(4001, "多端登录"),
    ITEM_NOT_FOUND(4004, "资源不存在"),

    TOO_MANY_REQUESTS(4029, "请求频繁"),
    INTERNAL_SERVER(5000, "服务器内部错误");


    private final Integer bCode;
    private final String msg;

    Code(int code, String message) {
        this.bCode = code;
        this.msg = message;
    }

    public int getBCode() {
        return this.bCode;
    }

    public String getMsg() {
        return this.msg;
    }
}

