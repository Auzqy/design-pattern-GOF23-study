package top.auzqy.design.pattern.behavioral.strategy.eg1_2;

/**
 * @Description: 立减策略
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:03
 */
public class LiJianPromotionStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("执行立减策略");
    }
}
