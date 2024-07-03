package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

// @Configuration
public class FilterConfig {
    
    @Bean
    public FilterRegistrationBean<AppFilter1> addAppFilter(){
        FilterRegistrationBean<AppFilter1> regist = new FilterRegistrationBean<>(new AppFilter1());
        // regist.setOrder(1);
        // regist.addUrlPatterns("/api/test1");
        return regist;
    }

        
    // @Bean
    // public FilterRegistrationBean<AppFilter2> addAppFilter2(){
    //     FilterRegistrationBean<AppFilter2> regist = new FilterRegistrationBean<>(new AppFilter2());
    //     // regist.setOrder(0);
    //     // regist.addUrlPatterns("/api/test");
    //     return regist;
    // }



}
