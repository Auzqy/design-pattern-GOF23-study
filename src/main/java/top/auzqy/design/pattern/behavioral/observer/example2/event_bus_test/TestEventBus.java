package top.auzqy.design.pattern.behavioral.observer.example2.event_bus_test;

import com.google.common.eventbus.EventBus;
import org.junit.jupiter.api.Test;

public class TestEventBus {


    /**
     * //输出信息
     * event message:200
     * Message:200
     * event message:300
     * Message:300
     * event message:400
     * Message:400
     * LastMessage:400
     * @throws Exception
     */
    @Test
    public void testReceiveEvent() throws Exception {

        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();

        eventBus.register(listener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        eventBus.post(new TestEvent(400));

        System.out.println("LastMessage:"+listener.getLastMessage());
    }
}

