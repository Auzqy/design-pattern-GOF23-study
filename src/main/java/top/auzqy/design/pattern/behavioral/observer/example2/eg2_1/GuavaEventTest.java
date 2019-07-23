package top.auzqy.design.pattern.behavioral.observer.example2.eg2_1;

import com.google.common.eventbus.EventBus;

/**
 * @Description: guava 中 观察者的测试类
 * @Author: zqy
 * @CreateTime: 2019-07-23 13:40
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("balabala");
    }
}
