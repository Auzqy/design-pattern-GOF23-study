package top.auzqy.design.pattern.behavioral.chainofresponsibility.example1;

/**
 * description:  手记审批人
 * createTime: 2019-08-05 16:31
 * @author zqy
 */
public class ArticleApprover extends Approver {
    @Override
    void release(Course course) {
        if (null != course && course.getArticle() != null) {
            System.out.println("手记审核通过");
            if (null != approver) {
                approver.release(course);
            }
        }else {
            System.out.println("手记审核不通过，视频不准上线！！");
        }
    }
}
