package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ch.qos.logback.classic.helpers.MDCInsertingServletFilter;

// @Configuration
public class LogbackConfig {

private final MDCInsertingServletFilter mdcInsertingServletFilter = new MDCInsertingServletFilter();

    @Bean
    public FilterRegistrationBean<MDCInsertingServletFilter> logbackMDCFilter() {
        FilterRegistrationBean<MDCInsertingServletFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(mdcInsertingServletFilter);
        registrationBean.addUrlPatterns("/*"); // 보안을 위해 좁은 범위로 변경 권장.
        return registrationBean;
    }
}