package top.auzqy.design.pattern.behavioral.templetemethod.example1;

/**
 * @Description: 前端的课程
 *
 *              该类与 GOF23Course 其实不应该是一个级别的课程，
 *              但由于某种原因设计时没有考虑的那么全面，
 *              有的前端课程需要手记，有的则不需要，怎么办？
 *              于是多定义了一个 needArticle 的属性。
 *
 * @Author: zqy
 * @CreateTime: 2019-07-24 18:29
 */
public class FECourse extends ACourse {

    private boolean needArticle;

    @Override
    protected void packageCourse() {
        System.out.println("前端的视频");
    }

    public FECourse(boolean needArticle) {
        this.needArticle = needArticle;
    }

    @Override
    protected boolean isNeedArticle() {
        return this.needArticle;
    }
}
