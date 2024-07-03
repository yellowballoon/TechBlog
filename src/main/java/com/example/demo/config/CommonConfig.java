package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

// @Configuration
public class CommonConfig {

	/**
	 * Request header, body에 관한 logging 설정.
	 * 
	 * <pre>
	 * application.yml 에서 (logging.level.org.springframework.web.filter: debug) 값이 지정되어야 로깅됨.
	 * </pre>
	 * 
	 * @return CommonsRequestLoggingFilter
	 */
    @Bean
	public CommonsRequestLoggingFilter requestLoggingFilter() {
		CommonsRequestLoggingFilter cmmReqLogFilter = new CommonsRequestLoggingFilter();
        cmmReqLogFilter.setIncludeHeaders(true);
		cmmReqLogFilter.setIncludeQueryString(true);
		cmmReqLogFilter.setIncludePayload(true);
		cmmReqLogFilter.setIncludeClientInfo(true);
		cmmReqLogFilter.setMaxPayloadLength(10000);
		return cmmReqLogFilter;
	}
}
