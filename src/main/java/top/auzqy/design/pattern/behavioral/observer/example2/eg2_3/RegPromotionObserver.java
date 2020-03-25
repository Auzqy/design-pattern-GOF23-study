package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;

import com.google.common.eventbus.Subscribe;

public class RegPromotionObserver {
    // 依赖注入
    private PromotionService promotionService;

    public RegPromotionObserver(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    public RegPromotionObserver() {
    }



    @Subscribe
    public void handleRegSuccess(long userId) {
        System.out.println("11111");
        promotionService.issueNewUserExperienceCash(userId);
    }
}