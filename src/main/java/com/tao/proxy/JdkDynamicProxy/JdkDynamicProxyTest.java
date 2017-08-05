package proxy.JdkDynamicProxy;

/**
 * Created by Michael on 2017/8/5.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JdkDynamicProxy测试
 */
public class JdkDynamicProxyTest {

    public static void main(String[] args) {

        //1) 创建被代理对象
        ElectricCar electricCar = new ElectricCar();

        //2) 获取ClassLoader对象
        ClassLoader classLoader = electricCar.getClass().getClassLoader();

        //3) 获取接口
        Class<?>[] interfaces = electricCar.getClass().getInterfaces();

        //4) 创建触发管理器对象
        InvocationHandler invocationHandler = new ElectricCarProxyInvocationHandler(electricCar);

        //5) 生成代理对象
        Object proxy = Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);

        //6) 使用代理对象
        Vehicle vehicleProxy = (Vehicle) proxy;
        vehicleProxy.drive();

        Rechargable rechargableProxy = (Rechargable) proxy;
        rechargableProxy.recharge();
    }
}
