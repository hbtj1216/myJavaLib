package com.tao.proxy.CglibProxy;

/**
 * Created by michael on 17-8-5.
 */

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类的拦截器.
 * 实现MethodInterceptor接口的实现类.
 */
public class BaseProxyInterceptor implements MethodInterceptor {


    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        before();

        //调用被代理方法
        proxy.invokeSuper(obj, args);

        after();

        return null;
    }



    private void before() {
        System.out.println("被代理类方法执行之前添加的额外处理.");
    }

    private void after() {
        System.out.println("被代理类方法执行之后添加的额外处理.");
    }
}
