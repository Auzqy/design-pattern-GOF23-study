package top.auzqy.design.pattern.structural.facade.example1;

/**
 * description:  测试类
 * createTime: 2019-08-03 10:55
 * @author zqy
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
