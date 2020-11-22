package com.market.login.filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
public class RequestFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("market login:"+((HttpServletRequest)servletRequest).getRequestURI());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
