package top.auzqy.design.pattern.behavioral.observer.example2.eg2_3;

import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

public class UserController {

    // 依赖注入
    private UserService userService;

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 20;

    public UserController(UserService userService) {
        this.userService = userService;

        // 同步阻塞模式
//         eventBus = new EventBus();

        // 异步非阻塞模式
        eventBus = new AsyncEventBus(
                Executors.newFixedThreadPool(
                        DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password){
        //省略输入参数的校验代码
        // 省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);
        eventBus.post(userId);

        while (Thread.activeCount() > 1) {
            Thread.yield();
        }
        return userId;
    }
}