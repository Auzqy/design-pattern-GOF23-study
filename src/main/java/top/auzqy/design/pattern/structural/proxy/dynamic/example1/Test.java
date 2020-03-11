package top.auzqy.design.pattern.structural.proxy.dynamic.example1;

public class Test {
    public static void main(String[] args) {
        //MetricsCollectorProxy使用举例
        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController userController =
                (IUserController) proxy.createProxy(new UserController());
    }
}
