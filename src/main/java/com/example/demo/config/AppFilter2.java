package com.example.demo.config;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.component.Student;
import com.example.demo.component.StudentImpl2;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebFilter
// @Component
@Order(1)
public class AppFilter2 implements Filter {

    @Autowired
    @Qualifier("hello-2")
    private StudentImpl2 StdImpl;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("AppFilter2 init");
        StdImpl.setValue("init step!");
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
                log.info("AppFilter2 doFilter");
                // System.out.println(testArray);
                StdImpl.echo();
                StdImpl.setValue("AAAAAAAA!!!!!!!!!!!!!!!");
                chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        log.info("AppFilter2 destroy");
        Filter.super.destroy();
    }
    
    
}
