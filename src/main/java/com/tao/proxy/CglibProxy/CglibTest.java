package com.tao.proxy.CglibProxy;

/**
 * Created by michael on 17-8-5.
 */
public class CglibTest {

    public static void main(String[] args) {

        //1) 创建被代理的对象
        Base base = new Base();

        //2) 新创建拦截器
        BaseProxyInterceptor interceptor = new BaseProxyInterceptor();

        //3) 创建cglib代理对象
        Base cglibProxy = (Base) CglibProxyFactory.getProxy(base, interceptor);

        //4) 使用
        cglibProxy.add();
        cglibProxy.delete();



    }
}
