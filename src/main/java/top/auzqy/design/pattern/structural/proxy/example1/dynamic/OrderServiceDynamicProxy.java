package top.auzqy.design.pattern.structural.proxy.example1.dynamic;

import top.auzqy.design.pattern.structural.proxy.example1.Order;
import top.auzqy.design.pattern.structural.proxy.example1.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: 动态代理类
 * @Author: zqy
 * @CreateTime: 2019-07-21 23:18
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    /**
     * @Description: 实际被代理的对象
     * @Author: zqy
     * @CreateTime: 2019-07-22 16:17
     */
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind(){
        Class cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0]; // todo 为啥这个就是这个对象
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }


    /**
     * @Description: 前置增强方法
     * @Author: zqy
     * @CreateTime: 2019-07-22 16:22
     * @param obj
     */
    private void beforeMethod(Object obj){
        int userId = 0; // 意思就是默认放到 userId 中
        System.out.println("动态代理 before code");
        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db"+dbRouter+"】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));
    }

    /**
     * @Description: 后置增强方法
     * @Author: zqy
     * @CreateTime: 2019-07-22 16:25
     */
    private void afterMethod(){
        System.out.println("动态代理 after code");
    }
}
