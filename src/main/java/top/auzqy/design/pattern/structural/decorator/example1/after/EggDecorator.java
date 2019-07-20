package top.auzqy.design.pattern.structural.decorator.example1.after;

/**
 * @Description: 加了鸡蛋的装饰类
 *
 *              具体的装饰类
 * @Author: zqy
 * @CreateTime: 2019-07-20 19:52
 */
public class EggDecorator extends BatterCakeDecorator {


    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加了一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
