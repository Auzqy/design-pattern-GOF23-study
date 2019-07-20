package top.auzqy.design.pattern.structural.decorator.example1.after;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-20 19:55
 */
public class Test {
    public static void main(String[] args) {
        afterDecorator();
    }


    /**
     * @Description: 采用装饰者模式后
     *              以不变应万变
     * @Author: zqy
     * @CreateTime: 2019-07-20 20:15
     */
    public static void afterDecorator(){

        AbstractBatterCake batterCakeBase = new BatterCake();

        // 要一个加鸡蛋的煎饼
        AbstractBatterCake batterCake1 = new EggDecorator(batterCakeBase);
        System.out.println(batterCake1.getDesc() + " 销售价格:" + batterCake1.cost());

        // 要一个加鸡蛋和一个火腿的煎饼
        AbstractBatterCake batterCake2 = new SausageDecorator(
                new EggDecorator(batterCakeBase));
        System.out.println(batterCake2.getDesc() + " 销售价格:" + batterCake2.cost());

        // 要二个加鸡蛋和一个火腿的煎饼
        AbstractBatterCake batterCake3 = new SausageDecorator(
                new EggDecorator(
                        new EggDecorator(batterCakeBase)));
        System.out.println(batterCake3.getDesc() + " 销售价格:" + batterCake3.cost());
    }
}
