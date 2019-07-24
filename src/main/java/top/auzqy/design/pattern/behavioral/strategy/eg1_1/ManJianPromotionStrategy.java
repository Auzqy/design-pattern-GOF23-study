package top.auzqy.design.pattern.behavioral.strategy.eg1_1;

/**
 * @Description: 满减策略
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:03
 */
public class ManJianPromotionStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("执行满减策略");
    }
}
