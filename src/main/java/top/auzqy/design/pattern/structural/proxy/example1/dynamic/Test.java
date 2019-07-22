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

        orderServiceDynamicProxy.saveOrder(order);
    }
}
