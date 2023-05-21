package io.justin.spring_aop_demos.anno;

public class JdkProxyDemoServiceImpl implements IJdkProxyService{
    @Override
    public void doMethod1() {
        System.out.println("JdkProxyServiceImpl.doMethod1()");
    }

    @Override
    public String doMethod2() {
        System.out.println("JdkProxyServiceImpl.doMethod2()");
        return "Hello World";
    }

    @Override
    public String doMethod3() throws Exception {
        System.out.println("JdkProxyServiceImpl.doMethod1()");
        throw new Exception("some exception");
    }
}
