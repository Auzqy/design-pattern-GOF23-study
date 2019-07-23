package top.auzqy.design.pattern.behavioral.observer.example2.eg2_1;

import com.google.common.eventbus.Subscribe;

/**
 * @Description: 使用 guava 中的观察者
 * @Author: zqy
 * @CreateTime: 2019-07-23 13:35
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(String str){
        // 业务逻辑
        System.out.println("执行 subscribe 方法，传入的参数是：" + str);
    }
}
