package top.auzqy.design.pattern.structural.decorator.example1.after;

/**
 * @Description: 具体煎饼
 *
 *              具体的被装饰类
 * @Author: zqy
 * @CreateTime: 2019-07-20 19:49
 */
public class BatterCake extends AbstractBatterCake{
    @Override
    protected String getDesc(){
        return "煎饼";
    }
    @Override
    protected int cost(){
        return 8;
    }
}
