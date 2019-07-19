package top.auzqy.design.pattern.creational.simplefactory.example1;

import top.auzqy.design.pattern.creational.simplefactory.example1.after.CarFactory;
import top.auzqy.design.pattern.creational.simplefactory.example1.after.TestSubFactory;
import top.auzqy.design.pattern.creational.simplefactory.example1.before.BMWCar;
import top.auzqy.design.pattern.creational.simplefactory.example1.before.BenzCar;
import top.auzqy.design.pattern.creational.simplefactory.example1.before.Car;

public class Test {
    public static void main(String[] args) {
//        testUseSimpleFactoryBefore();
//        testUseSimpleFactoryAfter();
//        testUseSimpleFactoryAfterByReflection();
        testUseSimpleFactoryAfterByReflectionInSubFactory();
    }

    /**
     * @Description: 没使用 简单工厂时的调用方法演示
     * @Author: zqy
     * @CreateTime: 2019-07-18 15:18
     */
    public static void testUseSimpleFactoryBefore(){
        Car benzCar = new BenzCar();
        benzCar.produce();

        Car bmwCar = new BMWCar();
        bmwCar.produce();
    }

    /**
     * @Description: 使用 简单工厂后的调用方法演示
     * @Author: zqy
     * @CreateTime: 2019-07-18 15:36
     */
    public static void testUseSimpleFactoryAfter(){
        CarFactory carFactory = new CarFactory();

        carFactory.produce("benz");
        carFactory.produce("bmw");

    }

    /**
     * @Description: 使用 简单工厂后，通过反射创建新的对象
     * @Author: zqy
     * @CreateTime: 2019-07-18 15:52
     */
    public static void testUseSimpleFactoryAfterByReflection(){
        Car benzCar = CarFactory.produceByReflection(BenzCar.class);
        benzCar.produce();

        Car bmwCar = CarFactory.produceByReflection(BMWCar.class);
        bmwCar.produce();
    }

    /**
     * @Description: 测试一下子类继承父类的 static 方法
     * @Author: zqy
     * @CreateTime: 2019-07-18 16:04
     */
    public static void testUseSimpleFactoryAfterByReflectionInSubFactory(){
        Car benzCar = TestSubFactory.produceByReflection(BenzCar.class);
//        benzCar.produce();
//
//        Car bmwCar = TestSubFactory.produceByReflection(BMWCar.class);
//        bmwCar.produce();
    }
}
