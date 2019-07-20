package top.auzqy.design.pattern.structural.decorator.example1.before;

/**
 * @Description: 加了鸡蛋的煎饼
 * @Author: zqy
 * @CreateTime: 2019-07-20 19:52
 */
public class BatterCakeWithEgg extends AbstractBatterCake {
    @Override
    protected String getDesc() {
        return super.getDesc() + "加了一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
