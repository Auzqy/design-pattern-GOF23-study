package top.auzqy.design.pattern.structural.facade.example1;

/**
 * description:  条件（资格）校验子系统
 * createTime: 2019-08-03 10:52
 * @author zqy
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
