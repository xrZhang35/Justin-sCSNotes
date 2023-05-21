package io.justin.spring_aop_demos.xml;

import io.justin.spring_aop_demos.xml.service.AopDemoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("log_aop.xml");
        AopDemoServiceImpl impl = applicationContext.getBean("demoService",AopDemoServiceImpl.class);

        impl.doMethod1();
        impl.doMethod2();
        try {
            impl.doMethod3();
        } catch (Exception e) {
        }
    }
}
