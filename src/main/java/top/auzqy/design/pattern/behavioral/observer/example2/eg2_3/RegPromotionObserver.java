package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;

import com.google.common.eventbus.Subscribe;

public class RegPromotionObserver {
    // 依赖注入
    private PromotionService promotionService;

    public RegPromotionObserver(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @Subscribe
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}