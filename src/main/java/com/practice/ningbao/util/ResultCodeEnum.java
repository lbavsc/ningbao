package com.practice.ningbao.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * 返回值枚举类
 * @author ${author}
 * @since 2020-11-25
 */
@Getter
@ToString
@AllArgsConstructor
public enum ResultCodeEnum {

    // 找不到网页
    UNKNOWN_ERROR("404", "找不到网页"),
    SUCCESS("200", "成功"),
    USER_NOT_EXIST("1001", "用户不存在"),
    USER_IS_EXISTS("2001", "用户已存在"),
    DATA_IS_NULL("3001", "数据为空"),
    PERMISSION_ERROR("A0300", "权限异常"),
    USER_NAME_NOT_EXIST("A0200", "用户名为空"),
    USER_TYPE_NOT("A0210", "用户类型为空"),
    ;

    private final String code;
    private final String msg;
}