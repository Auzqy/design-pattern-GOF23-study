package top.auzqy.design.pattern.structural.proxy.example1;

/**
 * @Description: 模拟 mvc 架构的方式，此为 dao 类的接口
 * @Author: zqy
 * @CreateTime: 2019-07-21 16:24
 */
public interface IOrderDao {

    /**
     * @Description: 入库的方法，插入订单记录
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:25
     * @param order
     * @return
     */
    int insert(Order order);
}
