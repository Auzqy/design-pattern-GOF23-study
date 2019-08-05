package top.auzqy.design.pattern.behavioral.chainofresponsibility.example2;

/**
 * description:  老板
 * createTime: 2019-08-05 16:48
 * @author zqy
 */
public class Boss extends Leader {
    @Override
    void approve(Salary salary) {
        if (salary.getMoney() > 3000) {
            System.out.println("我是【"
                    + this.getClass().getSimpleName()
                    + "】,这个数归我管，但是老纸不批");

        }else {
            System.out.println("我是【"
                    + this.getClass().getSimpleName()
                    + "】, 不归我管，别烦我！");
            if (leader != null) {
                leader.approve(salary);
            }
        }
    }
}
