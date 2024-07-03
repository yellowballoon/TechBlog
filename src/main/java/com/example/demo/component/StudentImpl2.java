package com.example.demo.component;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component(value = "hello-2")
public class StudentImpl2 implements Student {

    String a;

    public void echo(){
        log.info(a);
    }

    public void setValue(String value){
        this.a = value;
    }

    @Override
    public void Stdudent() {
        // System.out.println("hello-2");
    }


}
