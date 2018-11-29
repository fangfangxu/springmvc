package com.iot.learnssm.firstssm.exception;
/**
 * Created by xufangfang on 2018/11/27.
 *
 * 系统 自定义异常类，针对预期的异常，需要在程序中抛出此类的异常
 */
public class CustomException   extends  Exception{
    //异常信息
    private String message;

    public CustomException(String message){
        super(message);
        this.message=message;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
