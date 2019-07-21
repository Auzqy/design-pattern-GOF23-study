package top.auzqy.design.pattern.structural.proxy.example1.staticproxy;

import top.auzqy.design.pattern.structural.proxy.example1.Order;
import top.auzqy.design.pattern.structural.proxy.example1.OrderDaoImpl;
import top.auzqy.design.pattern.structural.proxy.example1.OrderServiceImpl;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-21 23:11
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderInfo(new Object());
        order.setUserId(0);

        // 里面 new 出来的那对对象，非设计模式的代码，而是为了解决没有ioc容器的问题
        OrderServiceStaticProxy orderServiceStaticProxy =
                new OrderServiceStaticProxy(
                        new OrderServiceImpl(
                                new OrderDaoImpl()));

        orderServiceStaticProxy.saveOrder(order);
    }
}
