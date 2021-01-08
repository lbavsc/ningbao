package com.practice.ningbao.util;

import com.practice.ningbao.entity.ResultEntity;

/**
 * 通用返回工具类
 *
 * @author ${author}
 * @since 2020-11-25
 */
public class ResultUtil {

    /**
     * 成功且带数据
     **/
    public static ResultEntity success(Object object) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultCodeEnum.SUCCESS.getCode());
        resultEntity.setMsg(ResultCodeEnum.SUCCESS.getMsg());
        resultEntity.setData(object);
        return resultEntity;
    }

    /**
     * 成功但不带数据
     **/
    public static ResultEntity success() {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultCodeEnum.SUCCESS.getCode());
        resultEntity.setMsg(ResultCodeEnum.SUCCESS.getMsg());
        resultEntity.setData(null);
        return resultEntity;
    }

    /**
     * 失败但不带数据
     **/
    public static ResultEntity error(String code, String msg) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(code);
        resultEntity.setMsg(msg);
        return resultEntity;
    }

    /**
     * 失败但不数据
     **/
    public static ResultEntity error(String code, String msg, Object data) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(code);
        resultEntity.setMsg(msg);
        resultEntity.setData(data);
        return resultEntity;
    }

}
