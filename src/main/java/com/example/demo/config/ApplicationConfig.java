package com.example.demo.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    ArrayList<String> test = new ArrayList<String>();

    ApplicationConfig(){
        // System.out.println("constructor");
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
    }
	// @Bean(name="test")
	@Bean
    public ArrayList<String> array() {
        return test;
    }
}

