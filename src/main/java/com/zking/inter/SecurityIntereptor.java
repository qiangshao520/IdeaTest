package com.zking.inter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class SecurityIntereptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取请求的uri
        String uri=request.getRequestURI();
        //除了login.jsp公开访问，其他的uri都进行拦截控制 http:127.0.0.1:8080
        if(uri.indexOf("/login")>=0){
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/login.jsp");
        return false;
    }
}
