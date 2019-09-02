package com.souche.springmvc.controller.interceptors;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: spring_mvc_dev
 * @ClassName: HelloInterceptor
 * @description: 测试拦截器
 * @author: malin
 * @create: 2019-08-28 09:13
 **/
public class HelloInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.err.println("HelloInterceptor-preHandle 拦截器前置");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.err.println("HelloInterceptor-postHandle 拦截器执行后");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.err.println("HelloInterceptor-afterCompletion 拦截器完成渲染后");
    }
}
