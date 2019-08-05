package top.auzqy.design.pattern.behavioral.chainofresponsibility.example1;

/**
 * description:  审批者
 * createTime: 2019-08-05 16:24
 * @author zqy
 */
public abstract class Approver {
    protected Approver approver;

    protected void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    abstract void release(Course course);
}
