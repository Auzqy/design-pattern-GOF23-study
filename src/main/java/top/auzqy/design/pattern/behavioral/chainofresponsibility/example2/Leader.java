package top.auzqy.design.pattern.behavioral.chainofresponsibility.example2;

/**
 * description:  领导们的抽象类
 * createTime: 2019-08-05 16:44
 * @author zqy
 */
public abstract class Leader {
    protected Leader leader;

    protected void setNextLeader(Leader leader) {
        this.leader = leader;
    }

    abstract void approve(Salary salary);
}
