package proxy.JdkDynamicProxy;

/**
 * Created by Michael on 2017/8/5.
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * ElectricCar的触发管理器
 */
public class ElectricCarProxyInvocationHandler implements InvocationHandler {

    private ElectricCar electricCar;    //被代理者的引用

    /**
     * 构造函数
     * @param electricCar
     */
    public ElectricCarProxyInvocationHandler(ElectricCar electricCar) {
        this.electricCar = electricCar;
    }


    /**
     * 每一个代理类都有一个InvocationHandler的实现类。
     * 代理类的每一个代理方法的调用都会通过调用它的InvocationHandler的实现类的invoke方法，
     * 从而能够调用被调用者的真实方法，并在前后加入额外处理。
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        before();

        method.invoke(electricCar, args);

        after();

        return null;
    }


    private void before() {
        System.out.println("方法调用前添加的操作...");

    }

    private void after() {
        System.out.println("方法调用后添加的操作...");
        System.out.println("------------------------------------------");
    }
}
