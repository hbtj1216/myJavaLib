package proxy.JdkDynamicProxy;

/**
 * Created by Michael on 2017/8/5.
 */

/**
 * 电动车类（被代理者）
 */
public class ElectricCar implements Vehicle, Rechargable {


    @Override
    public void drive() {
        System.out.println("Electric Car is Moving silently...");
    }

    @Override
    public void recharge() {
        System.out.println("Electric Car is Recharging...");
    }
}
