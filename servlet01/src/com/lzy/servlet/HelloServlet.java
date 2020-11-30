package com.lzy.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author: lzy
 * @description:
 * @date: 2020-11-25-10:41
 */
public class HelloServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //類型轉換
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        //获取请求方式
        String method=httpServletRequest.getMethod();
        //System.out.println("Hello Servlet 被访问了！");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
