package com.hyfly.milet.shop.common.vo;

import com.hyfly.milet.shop.common.enums.ResultCodeEnum;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class ResultVo<T extends Serializable> implements Serializable {

    @Serial
    private static final long serialVersionUID = -3948389268046368059L;

    private Integer code;

    private String msg;

    private T data;

    ResultVo() {
    }

    private ResultVo(T data) {
        this.code = 200;
        this.msg = "SUCCESS";
        this.data = data;
    }

    private ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T extends Serializable> ResultVo<T> success() {
        ResultVo<T> result = new ResultVo<>();
        result.setResultCode(ResultCodeEnum.SUCCESS);
        return result;
    }

    public static <T extends Serializable> ResultVo<T> failure(ResultCodeEnum resultCodeEnum) {
        ResultVo<T> result = new ResultVo<>();
        result.setResultCode(resultCodeEnum);
        return result;
    }

    public static <T extends Serializable> ResultVo<T> failure(String failMsg) {
        ResultVo<T> result = new ResultVo<>();
        result.setMsg(failMsg);
        result.setCode(201);
        return result;
    }

    public void setResultCode(ResultCodeEnum code) {
        this.code = code.code();
        this.msg = code.message();
    }

    public ResultVo<T> data(T data) {
        this.setData(data);
        return this;
    }

    public ResultVo<T> msg(String message) {
        this.setMsg(message);
        return this;
    }

    public ResultVo<T> code(Integer code) {
        this.setCode(code);
        return this;
    }
}
