package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;

import com.google.common.eventbus.Subscribe;

public class RegPromotionObserver {
    private PromotionService promotionService;

    // 依赖注入
    @Subscribe
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}