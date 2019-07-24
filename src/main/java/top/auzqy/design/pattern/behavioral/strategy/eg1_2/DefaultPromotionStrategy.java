package top.auzqy.design.pattern.behavioral.strategy.eg1_2;

/**
 * @Description: 默认的促销策略
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:32
 */
public class DefaultPromotionStrategy implements IPromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("默认的促销策略");
    }
}
