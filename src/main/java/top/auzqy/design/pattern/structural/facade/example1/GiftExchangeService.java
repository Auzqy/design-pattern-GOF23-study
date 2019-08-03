package top.auzqy.design.pattern.structural.facade.example1;

/**
 * description:  积分兑换的门面类
 *
 *          由于在本例子中没有引入 如 spring 等框架，故在此使用了 new 关键字
 * createTime: 2019-08-03 10:51
 * @author zqy
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvailable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:"+shippingOrderNo);
            }
        }
    }

}
