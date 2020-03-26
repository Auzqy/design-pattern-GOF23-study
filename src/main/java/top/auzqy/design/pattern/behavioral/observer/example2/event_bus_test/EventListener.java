package top.auzqy.design.pattern.behavioral.observer.example2.event_bus_test;

import com.google.common.eventbus.Subscribe;

public class EventListener {
    public int lastMessage = 0;

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:"+lastMessage);
    }

    public int getLastMessage() {      
        return lastMessage;
    }
}