package top.auzqy.design.pattern.creational.simplefactory.example1.before;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 具体的将要生产的 宝马汽车
 * @Author: zqy
 * @CreateTime: 2019-07-18 15:12
 */
public class BMWCar extends Car {
    @Override
    public void produce() {
        System.out.println("一辆 【宝马】 汽车生产出来了！");
    }
}
