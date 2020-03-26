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


    /**
     * 注意这里的参数类型如果是基本类型，要使用包装类型
     * 如果使用基本类型，这里是映射不到的
     *
     * @param userId
     */
    @Subscribe
    public void handleRegSuccess(Long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}