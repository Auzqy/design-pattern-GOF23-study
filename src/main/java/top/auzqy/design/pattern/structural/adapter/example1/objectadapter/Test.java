package top.auzqy.design.pattern.structural.adapter.example1.objectadapter;

/**
 * @Description: 客户端
 *          测试或者说表演一下这哥几个是如何在一起工作的
 *
 *
 * @Author: zqy
 * @CreateTime: 2019-07-19 23:59
 */
public class Test {
    public static void main(String[] args) {
        // 原来系统的运行情况模拟
        Target oldOnlineSystem = new TargetImpl();
        oldOnlineSystem.alreadyOnlineMethod();

        // 有了新的需求，但又需要复用老的接口（功能）或者说使用了适配器的情况
        Target adapterSystem = new Adapter();
        adapterSystem.alreadyOnlineMethod();
    }
}
