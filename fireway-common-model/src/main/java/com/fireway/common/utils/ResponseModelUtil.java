package com.fireway.common.utils;

import com.fireway.common.entity.ApiResponseModel;

/**
 * @Author: chenhuowei
 * @Date: 2018/11/8 11:26
 * @Description:
 */
public class ResponseModelUtil {

    public static ApiResponseModel success(String message, Object data){

        return  new ApiResponseModel(message,Boolean.TRUE,data,"0");
    }
    public static ApiResponseModel error(String message, Object data){

        return  new ApiResponseModel(message,Boolean.FALSE,data,"-1");
    }

    public static ApiResponseModel no_data_success(String message){

        return  new ApiResponseModel(message,Boolean.TRUE,null,"01");
    }
    public static ApiResponseModel no_data_error(String message){

        return  new ApiResponseModel(message,Boolean.FALSE,null,"-11");
    }



}
