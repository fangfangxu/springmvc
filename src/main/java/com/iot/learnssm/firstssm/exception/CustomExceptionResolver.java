package com.iot.learnssm.firstssm.exception;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器：只要实现了springmvc提供的HandlerExceptionResolver接口就是全局异常处理器
 * 解析出异常类型
 *
 * 如果该异常类型是系统自定义的异常，直接取出异常信息，在错误页面展示
 * 如果该异常类型不是系统自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）
 */

public class CustomExceptionResolver implements HandlerExceptionResolver, Ordered {




    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        //1、handler就是处理器适配器要执行Handler对象（只有method）
        //2、解析出异常类型
        //如果该 异常类型是系统 自定义的异常，直接取出异常信息，在错误页面展示
        //String message = null;
        //if(ex instanceof CustomException){
        //message = ((CustomException)ex).getMessage();
        //}else{
        ////如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）
        //message="未知错误";
        //}
        //上边代码变为
        CustomException customException;//自定义系统捕获异常类型
        if(e instanceof CustomException) {
            customException=(CustomException)e;
        }else{
            customException=new CustomException("未知错误");
        }
        //错误信息
        String message=customException.getMessage();
        ModelAndView mv=new ModelAndView();
        //将错误信息传到页面
        mv.addObject("message",message);
        //指向错误页面
        mv.setViewName("exception/error");
        return mv;
    }

    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
