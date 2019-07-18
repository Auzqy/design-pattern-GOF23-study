package top.auzqy.design.pattern.creational.simplefactory.before;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 具体的将要生产的 奔驰汽车
 * @Author: zqy
 * @CreateTime: 2019-07-18 15:12
 */
@Slf4j
public class BenzCar extends Car {
    @Override
    public void produce() {
        log.info("一辆 【奔驰】 汽车生产出来了！");
    }
}
