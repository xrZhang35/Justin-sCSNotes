package io.justin.spring_aop_demos.xml.service;

import org.springframework.stereotype.Component;

@Component
public class AopDemoServiceImpl {
    public void doMethod1(){
        System.out.println("AopDemoServiceImpl : doMethod1");
    }

    public String doMethod2(){
        System.out.println("AopDemoServiceImpl : doMethod2");
        return "Hello World\n";
    }

    public String doMethod3() throws Exception{
        System.out.println("AopDemoServiceImpl : doMethod3");
        throw new Exception("some exception");
    }
}
