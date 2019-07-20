package top.auzqy.design.pattern.structural.decorator.example1.after;

/**
 * @Description: 加了火腿的装饰类
 *
 *              具体的装饰类
 * @Author: zqy
 * @CreateTime: 2019-07-20 19:52
 */
public class SausageDecorator extends BatterCakeDecorator {
    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加了一个火腿";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
