package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.component.Student;
import com.example.demo.component.StudentImpl2;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {
    
    @Autowired
    private ArrayList<String> array;

    @Autowired
    // @Qualifier("hello-1")
    Student studentImpl;

    @Autowired
    @Qualifier("hello-2")
    StudentImpl2 sdt2;

    @RequestMapping("/api/test")
    String test(HttpServletRequest req) {
        // log.info("123123123123");
        // studentImpl.Stdudent();
        // sdt2.Stdudent();
        // System.out.println(array);
        // sdt2.echo();

        log.info(req.getSession().toString());
        log.info(req.getRequestedSessionId());
        log.info(req.changeSessionId());
        // log.info(req.session);
        
        return "11";
    }
}
