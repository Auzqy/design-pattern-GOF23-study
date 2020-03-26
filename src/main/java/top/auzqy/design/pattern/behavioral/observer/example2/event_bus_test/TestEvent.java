package top.auzqy.design.pattern.behavioral.observer.example2.event_bus_test;

public class TestEvent {
    private final int message;
    public TestEvent(int message) {        
        this.message = message;
        System.out.println("event message:"+message);
    }
    public int getMessage() {
        return message;
    }
}