package top.auzqy.design.pattern.structural.decorator.example1.before;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-20 19:55
 */
public class Test {
    public static void main(String[] args) {
        beforeDecorator();
    }

    /**
     * @Description: 使用装饰者模式之前
     *          在现有条件下只能满足这两种需求
     *
     *          如果客户还有别的需求怎么办？比如，需要加5个火腿2个鸡蛋
     * @Author: zqy
     * @CreateTime: 2019-07-20 19:58
     */
    public static void beforeDecorator(){
        // 要一个加鸡蛋的煎饼
        BatterCake batterCake1 = new BatterCakeWithEgg();
        System.out.println(batterCake1.getDesc() + " 销售价格:" + batterCake1.cost());

        // 要一个加鸡蛋和一个火腿的煎饼
        BatterCake batterCake2 = new BatterCakeWithEggSausage();
        System.out.println(batterCake2.getDesc() + " 销售价格:" + batterCake2.cost());
    }

}
