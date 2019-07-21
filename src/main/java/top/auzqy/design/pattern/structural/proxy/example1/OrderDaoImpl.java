package top.auzqy.design.pattern.structural.proxy.example1;

/**
 * @Description: 插入数据库的实现类
 * @Author: zqy
 * @CreateTime: 2019-07-21 16:26
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("成功插入订单数据！");
        return 1;
    }
}
