package top.auzqy.design.pattern.creational.simplefactory.example1.after;

import top.auzqy.design.pattern.creational.simplefactory.example1.before.Car;

/**
 * @Description: 仅仅是为了测试一下子类继承父类时，对 static 方法的处理
 * @Author: zqy
 * @CreateTime: 2019-07-18 16:01
 */
public class TestSubFactory extends CarFactory {

    /**
     * @Description: 父类中的 non-static method
     * @Author: zqy
     * @CreateTime: 2019-07-18 16:02
     * @param carType   需要建造的车辆类型
     * @return
     */
    public Car produce(String carType){
        System.out.println("子类的 non-static produce 工厂方法");
        return null;
    }


    /**
     * @Description: 父类中的 static method
     * @Author: zqy
     * @CreateTime: 2019-07-18 16:03
     * @param calzz
     * @return
     */
    public static Car produceByReflection(Class calzz){
        System.out.println("子类的 static produceByReflection 工厂方法");
        return null;
    }
}
