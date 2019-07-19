package top.auzqy.design.pattern.creational.simplefactory.example1.after;

import lombok.extern.slf4j.Slf4j;
import top.auzqy.design.pattern.creational.simplefactory.example1.before.BMWCar;
import top.auzqy.design.pattern.creational.simplefactory.example1.before.BenzCar;
import top.auzqy.design.pattern.creational.simplefactory.example1.before.Car;

/**
 * @Description: 使用简单工厂设计模式后
 *
 *              todo 对这句话的不是理解，后期注意一下吧
 *              todo 如果当前这个工厂类没有被继承或者重写的需求的话，
 *              todo 那么这里的方法还可以写成静态方法，调用的时候会方便一些。
 *
 *              todo 测试一下上面说的继承和重写的 static 情况
 * @Author: zqy
 * @CreateTime: 2019-07-18 15:31
 */
@Slf4j
public class CarFactory {

    /**
     * @Description: 这种方式如果扩展的话，需要增加新的 if/else 的判断
     *              违反了开闭原则
     *
     *              相对对应的解决违反开闭原则的方式可以使用反射，如
     * @Author: zqy
     * @CreateTime: 2019-07-18 15:39
     * @param carType   需要建造的车辆类型
     * @return
     */
    public Car produce(String carType){
        if("benz".equalsIgnoreCase(carType)){
            log.info("一辆 【奔驰】 汽车生产出来了！");
            return new BenzCar();
        } else if ("bmw".equalsIgnoreCase(carType)) {
            log.info("一辆 【宝马】 汽车生产出来了！");
            return new BMWCar();
        } else {
            log.error("所传车辆类型工厂当前无法建造！");
            return null;
        }
    }

    /**
     * @Description: 通过反射创建对象，一定程度上遵守了开闭原则
     * @Author: zqy
     * @CreateTime: 2019-07-18 15:48
     * @param calzz 需要建造的车辆类型
     * @return
     */
    public static Car produceByReflection(Class calzz){
        try {
            Car car = (Car)Class.forName(calzz.getName()).newInstance();
            return car;
        } catch (InstantiationException e) {
            log.error("发生异常，" + e);
        } catch (IllegalAccessException e) {
            log.error("发生异常，" + e);
        } catch (ClassNotFoundException e) {
            log.error("发生异常，" + e);
        }
        return null;
    }
}
