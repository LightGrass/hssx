package com.sun.hssx.bean;

/**
 * projectName: hssx
 *
 * @author: 12510
 * time: 2020/11/2 16:03
 * description:用于返回前端的封装类
 */
public class Result {

    private int code = 0;
    /**
     * 设置返回状态 0失败 1成功
     */
    private String message;
    /**
     * 提示字段
     */
    private Object data;
    /**
     * 装数据
     */

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}