package top.auzqy.design.pattern.behavioral.observer.example2.eg2_4;

import java.util.concurrent.Executor;

public class AsyncEventBus extends EventBus {
  public AsyncEventBus(Executor executor) {
    super(executor);
  }
}