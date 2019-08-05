package top.auzqy.design.pattern.behavioral.chainofresponsibility.example1;

/**
 * description:  视频审批人
 * createTime: 2019-08-05 16:30
 * @author zqy
 */
public class VideoApprover extends Approver {
    @Override
    void release(Course course) {
        if (null != course && course.getVideo() != null) {
            System.out.println("视频审核通过");
            if (null != approver) {
                approver.release(course);
            }
        }else {
            System.out.println("视频审核不通过，视频不准上线！！");
        }
    }
}
