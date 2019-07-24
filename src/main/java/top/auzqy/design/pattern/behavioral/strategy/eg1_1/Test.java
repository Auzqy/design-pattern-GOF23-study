package top.auzqy.design.pattern.behavioral.strategy.eg1_1;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: 测试类
 * @Author: zqy
 * @CreateTime: 2019-07-24 15:07
 */
public class Test {

    public static void main(String[] args) {

        noDynamicUseCase();
        System.out.println("============");
        relativeDynamicUseCase();
    }


    /**
     * @Description: 如下这样的话真正在使用时，还是不够动态，相对动态的使用方式如下
     * @Author: zqy
     * @CreateTime: 2019-07-24 15:12
     */
    public static void noDynamicUseCase(){
        IPromotionStrategy manJianPromotionStrategy = new ManJianPromotionStrategy();
        IPromotionStrategy fanXianPromotionStrategy = new FanXianPromotionStrategy();

        // 618 时的活动策略
        PromotionActivity promotionActivity618 = new PromotionActivity(manJianPromotionStrategy);
        // 1111 时的活动策略
        PromotionActivity promotionActivity1111 = new PromotionActivity(fanXianPromotionStrategy);

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }


    /**
     * @Description: 真是项目中相对动态一点的使用场景
     * @Author: zqy
     * @CreateTime: 2019-07-24 15:12
     */
    public static void relativeDynamicUseCase(){

        PromotionActivity promotionActivity = null;

        String promotionKey = "LIJIAN";

        if(StringUtils.equals(promotionKey,"LIJIAN")){
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        }else if(StringUtils.equals(promotionKey,"FANXIAN")){
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }//...... todo 如有变动这里时需要修改的

        promotionActivity.executePromotionStrategy();
    }
}
