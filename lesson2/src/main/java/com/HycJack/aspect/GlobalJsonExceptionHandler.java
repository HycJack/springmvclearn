package com.HycJack.aspect;

import com.HycJack.Exception.ErrorInfo;
import com.HycJack.Exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

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
public class GlobalJsonExceptionHandler {

    public static  final  String DEFAULT_ERROR_VIEW = "ERROR";

    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> defaultErrorHandler(HttpServletRequest request, Exception ex)throws Exception{
        ErrorInfo<String> error = new ErrorInfo();
        error.setMessage(ex.getMessage());
        error.setCode(ErrorInfo.ERROR);
        error.setData("Some Data");
        error.setUrl(request.getRequestURL().toString());
        return error;
    }
}
