package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;


import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserController userController = new UserController(userService);

        List<Object> observers = new ArrayList<>();
        NotificationService notificationService = new NotificationService();
        RegNotificationObserver regNotificationObserver =
                new RegNotificationObserver(notificationService);
        PromotionService promotionService = new PromotionService();
        RegPromotionObserver regPromotionObserver =
                new RegPromotionObserver(promotionService);

        observers.add(regNotificationObserver);
        observers.add(regPromotionObserver);
        userController.setRegObservers(observers);

        userController.register("123","name");
    }
}