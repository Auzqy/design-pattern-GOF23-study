package top.auzqy.design.pattern.structural.proxy.example1;

import lombok.Data;

/**
 * @Description: 订单对象
 * @Author: zqy
 * @CreateTime: 2019-07-21 16:19
 */
@Data
public class Order {

    /**
     * @Description: 订单信息
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:22
     */
    private Object orderInfo;

    /**
     * @Description: 模拟用户id（只做演示说明，不要计较这里具体的声明类型）
     * @Author: zqy
     * @CreateTime: 2019-07-21 16:21
     */
    private Integer userId;

}
