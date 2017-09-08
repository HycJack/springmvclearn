package com.HycJack.Exception;

/**
 * <p></p>
 *
 * @param
 * @author huangyicao 2017/9/8 16:44
 * @return
 * @modificationHistory=========================逻辑或功能性重大变更记录
 * @modify by user: {修改人} 2017/9/8
 * @modify by reason:{原因}
 */
public class ErrorInfo<T> {
    public static final  Integer OK = 0;
    public static final  Integer ERROR = -100;

    private Integer code ;
    private String message;
    private String url;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
