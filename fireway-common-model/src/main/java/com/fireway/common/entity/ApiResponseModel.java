package com.fireway.common.entity;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/8 11:23
 * @Description:
 */
public class ApiResponseModel {

    private String message;
    private Boolean success;
    private Object data;
    private String code;

    public ApiResponseModel() {
    }

    public ApiResponseModel(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public ApiResponseModel(String message, Boolean success, Object data, String code) {
        this.message = message;
        this.success = success;
        this.data = data;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
