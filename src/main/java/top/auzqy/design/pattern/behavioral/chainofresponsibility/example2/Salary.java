package top.auzqy.design.pattern.behavioral.chainofresponsibility.example2;

import lombok.Getter;

/**
 * description:  薪水 （将要被审批的事物）
 * createTime: 2019-08-05 16:46
 * @author zqy
 */
public class Salary {
    @Getter
    private int money;

    public Salary(int money) {
        this.money = money;
    }
}
