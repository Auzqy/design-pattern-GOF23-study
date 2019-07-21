package top.auzqy.design.pattern.structural.proxy.example1;

/**
 * @Description: 模拟 mvc 架构的方式，此为 service 类的接口
 * @Author: zqy
 * @CreateTime: 2019-07-21 16:22
 */
public interface IOrderService {

    /**
     * @Description: 插入订单数据
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:28
     * @param order
     * @return
     */
    int saveOrder(Order order);
}
