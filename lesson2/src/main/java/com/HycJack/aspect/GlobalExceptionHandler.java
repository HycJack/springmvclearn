package com.HycJack.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <p></p>
 *
 * @param
 * @author huangyicao 2017/9/8 16:19
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/9/8
 * @modify by reason:{原因}
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    public static  final  String DEFAULT_ERROR_VIEW = "ERROR";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request,Exception ex)throws Exception{
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception",ex);
        mav.addObject("url",request.getRequestURL());
        mav.setViewName(DEFAULT_ERROR_VIEW);
        return mav;
    }
}
