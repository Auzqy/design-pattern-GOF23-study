package top.auzqy.design.pattern.behavioral.strategy.eg1_2;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:07
 */
public class Test {

    public static void main(String[] args) {
        factoryStrategyUseCase();
    }

    /**
     * @Description: 使用 工厂方法 + 策略模式的情况
     *          好处：
     *              1。 在客户端消除了 if/else 的判断
     *              2。 避免多次创建重复的对象
     * @Author: zqy
     * @CreateTime: 2019-07-24 15:39
     */
    public static void factoryStrategyUseCase(){
        String promotionKey = PromotionStrategyFactory.PromotionKey.FAN_XIAN;
        PromotionActivity promotionActivity = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }

}
