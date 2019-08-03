package top.auzqy.design.pattern.structural.facade.example1;

/**
 * description:  物流子系统
 * createTime: 2019-08-03 10:54
 * @author zqy
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
