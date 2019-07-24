package top.auzqy.design.pattern.behavioral.strategy.eg1_2;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 促销策略的工厂类
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:24
 */
public class PromotionStrategyFactory {

    // 维护促销策略的 Map
    private static Map<String, IPromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FAN_XIAN,new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIN_JIAN,new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MAN_JIAN,new ManJianPromotionStrategy());
    }

    public interface PromotionKey{
        String FAN_XIAN = "FAN_XIAN";
        String LIN_JIAN = "LIN_JIAN";
        String MAN_JIAN = "MAN_JIAN";
    }

    // 默认的促销策略
    private static final IPromotionStrategy NON_PROMOTION = new DefaultPromotionStrategy();

    public static IPromotionStrategy getPromotionStrategy(String promotionKey){
        IPromotionStrategy iPromotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return null != iPromotionStrategy ? iPromotionStrategy : NON_PROMOTION;
    }

}
