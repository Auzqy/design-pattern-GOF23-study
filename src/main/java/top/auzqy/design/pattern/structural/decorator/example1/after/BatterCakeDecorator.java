package top.auzqy.design.pattern.structural.decorator.example1.after;

/**
 * @Description: 抽象的装饰者类
 *          因为你不知道将来的客户到底需要什么样的煎饼
 *
 *          如果 那些具体的装饰类中，有一些基础的共性的动作，那么可以把该类定义为抽象类，
 *          并添加基础公共的方法
 *
 * @Author: zqy
 * @CreateTime: 2019-07-20 20:04
 */
public class BatterCakeDecorator extends AbstractBatterCake{
    private AbstractBatterCake abstractBatterCake;

    public BatterCakeDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    protected String getDesc() {
        return abstractBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return abstractBatterCake.cost();
    }
}
