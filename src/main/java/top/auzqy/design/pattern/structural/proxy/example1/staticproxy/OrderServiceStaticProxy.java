package top.auzqy.design.pattern.structural.proxy.example1.staticproxy;

import top.auzqy.design.pattern.structural.proxy.example1.IOrderService;
import top.auzqy.design.pattern.structural.proxy.example1.Order;
import top.auzqy.design.pattern.structural.proxy.example1.db.DataSourceContextHolder;

/**
 * @Description: 静态代理
 * @Author: zqy
 * @CreateTime: 2019-07-21 22:50
 */
public class OrderServiceStaticProxy {

    // 持有被代理类的引用
    private IOrderService orderService;

    /**
     * @Description: 这个构造方法为的是代替没有 ioc 容器的依赖注入
     * @Author: zqy
     * @CreateTime: 2019-07-21 23:10
     * @param orderService
     */
    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * @Description: 这个的方法名可以与被代理类的相同也可以不同
     *              并无硬性规定
     * @Author: zqy
     * @CreateTime: 2019-07-21 22:52
     * @param order
     * @return
     */
    public int saveOrder(Order order){

        beforeMethod(order);
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    /**
     * @Description: 代理类做的目标方法之前的增强方法
     * @Author: zqy
     * @CreateTime: 2019-07-21 22:57
     * @param order
     */
    private void beforeMethod(Order order){
        int dbRouter = order.getUserId() % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        // todo 设置数据源
        DataSourceContextHolder.setDBType("db" + dbRouter);
        System.out.println("静态代理 before code");
    }

    /**
     * @Description: 代理类做的目标方法之后的增强方法
     * @Author: zqy
     * @CreateTime: 2019-07-21 23:06
     */
    private void afterMethod(){
        System.out.println("静态代理 after code");
    }
}
