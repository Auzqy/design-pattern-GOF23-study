package top.auzqy.design.pattern.behavioral.strategy.eg1_1;

/**
 * @Description: 返现策略
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:03
 */
public class FanXianPromotionStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("执行立减策略");
    }
}
