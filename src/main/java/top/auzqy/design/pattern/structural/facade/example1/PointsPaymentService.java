package top.auzqy.design.pattern.structural.facade.example1;

/**
 * description:  积分支付系统
 * createTime: 2019-08-03 10:52
 * @author zqy
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
