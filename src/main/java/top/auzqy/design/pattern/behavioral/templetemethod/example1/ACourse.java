package top.auzqy.design.pattern.behavioral.templetemethod.example1;

/**
 * @Description: 网站所有视频课程的抽象类
 * @Author: zqy
 * @CreateTime: 2019-07-24 17:56
 */
public abstract class ACourse {

    /**
     * @Description: 制作视频课程的 模版方法
     *
     *              之所以定义为 final 就是不想被子类所修改
     * @Author: zqy
     * @CreateTime: 2019-07-24 17:57
     */
    protected final void makeCourse(){
        makePPT();
        makeVideo();
        makeSourceCode();
        if (isNeedArticle()) {
            makeArticle();
        }
        packageCourse();
    }

    protected void makePPT(){
        System.out.println("制作ppt");
    }

    protected void makeVideo(){
        System.out.println("录制视频");
    }

    protected void makeSourceCode(){
        System.out.println("上传源代码");
    }

    protected void makeArticle(){
        System.out.println("编写手记");
    }

    /**
     * @Description: 这里定义一个钩子方法
     * @Author: zqy
     * @CreateTime: 2019-07-24 18:02
     * @return
     */
    protected boolean isNeedArticle(){
        return false;
    }

    protected abstract void packageCourse();
}
