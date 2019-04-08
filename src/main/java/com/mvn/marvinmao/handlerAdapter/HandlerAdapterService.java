package com.mvn.marvinmao.handlerAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;
import java.util.Map;

//由JamesHandlerAdapter实现
public interface HandlerAdapterService {

    public Object[] hand(HttpServletRequest request,//拿request请求里的参数
                         HttpServletResponse response,//
                         Method method,
                         Map<String, Object> beans);
}
