package top.auzqy.design.pattern.structural.proxy.example1.dynamic;

import top.auzqy.design.pattern.structural.proxy.example1.IOrderService;
import top.auzqy.design.pattern.structural.proxy.example1.Order;
import top.auzqy.design.pattern.structural.proxy.example1.OrderDaoImpl;
import top.auzqy.design.pattern.structural.proxy.example1.OrderServiceImpl;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy =
                (IOrderService) new OrderServiceDynamicProxy(
                    new OrderServiceImpl(
                            new OrderDaoImpl())).bind();

        /*
            todo 源码没看懂，不知道这个方法执行的时候，
                为什么断点就走到了
                top.auzqy.design.pattern.structural.proxy.example1
                    .dynamic.OrderServiceDynamicProxy.invoke
         */
        orderServiceDynamicProxy.saveOrder(order);
    }
}
