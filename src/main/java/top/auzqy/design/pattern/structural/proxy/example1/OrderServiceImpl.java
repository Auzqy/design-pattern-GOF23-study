package top.auzqy.design.pattern.structural.proxy.example1;


/**
 * @Description: 订单业务的实现类
 * @Author: zqy
 * @CreateTime: 2019-07-21 16:28
 */
public class OrderServiceImpl implements IOrderService {

    /**
     * @Description: 这里没有引入具有依赖注入功能的容器，
     *              故就不加 @Autowire 或者 @Resources 的注解等
     *
     *
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:29
     */
    private IOrderDao orderDao;

    /**
     * @Description: 这里用构造器的方式来模拟 Spring 的 ioc 功能
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:32
     * @param orderDao
     */
    public OrderServiceImpl(IOrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     * @param order
     * @return
     * @Description: 插入订单数据
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:28
     */
    @Override
    public int saveOrder(Order order) {
        System.out.println("Service层调用Dao层添加Order的方法");
        return orderDao.insert(order);
    }
}
