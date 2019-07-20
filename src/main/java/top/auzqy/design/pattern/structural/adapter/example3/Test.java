package top.auzqy.design.pattern.structural.adapter.example3;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-20 17:04
 */
public class Test {
    public static void main(String[] args) {
        DC5 dc5 = new ElectricAdapter();

        dc5.service();
    }
}
