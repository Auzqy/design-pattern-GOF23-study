package top.auzqy.design.pattern.structural.adapter.example3;

/**
 * @Description: 电源适配器
 *
 *              适配器
 * @Author: zqy
 * @CreateTime: 2019-07-20 16:59
 */
public class ElectricAdapter implements DC5{

    AC220 ac220 = new AC220();

    @Override
    public void service() {
        ac220.service();
        System.out.println("将上面的电转换为 5V 直流电");
    }
}
