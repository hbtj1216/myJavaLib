package com.tao.proxy.CglibProxy;

/**
 * Created by michael on 17-8-5.
 */

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * Cglib的代理类
 */
public class CglibProxyFactory {


    /**
     * 获得代理对象,即增强过的目标类.
     */
    public static Object getProxy(Object target, MethodInterceptor methodInterceptor) {

        //使用Enhancer生成代理类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(methodInterceptor);

        //创建代理对象并返回
        return enhancer.create();
    }
}
