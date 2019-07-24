package top.auzqy.design.pattern.behavioral.strategy.eg1_1;

/**
 * @Description: 促销活动
 * @Author: zqy
 * @CreateTime: 2019-07-24 14:59
 */
public class PromotionActivity {

    private IPromotionStrategy iPromotionStrategy;

    public PromotionActivity(IPromotionStrategy iPromotionStrategy) {
        this.iPromotionStrategy = iPromotionStrategy;
    }

    public void executePromotionStrategy() {
        iPromotionStrategy.doPromotion();
    }
}
