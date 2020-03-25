package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;

import com.google.common.eventbus.Subscribe;

public class RegNotificationObserver {
    // 依赖注入
    private NotificationService notificationService;

    public RegNotificationObserver(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}