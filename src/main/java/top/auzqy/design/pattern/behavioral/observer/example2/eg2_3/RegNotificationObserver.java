package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;

import com.google.common.eventbus.Subscribe;

public class RegNotificationObserver {
    private NotificationService notificationService;

    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "...");
    }
}