package top.auzqy.design.pattern.behavioral.observer.example2.eg2_2;


import com.google.common.eventbus.Subscribe;

import java.util.Collections;

/**
 * @Description: 订阅者（监听者）
 * @Author: zqy
 * @CreateTime: 2019-07-23 13:53
 */
public class Teacher {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    // 这里是不能够有两个参数的
//    @Subscribe
//    public void subscribe(Course course, Question question){
//        System.out.println("【" + teacherName + "】"
//                + "老师，收到了一条关于【"
//                + course.getCourseName()
//                + "】课程的提问，问题的内容为：【"
//                + question.getQuestionContent()
//                + "】。");
//    }

    @Subscribe
    public void subscribe(Course course){
        if (!course.getQuestion().isEmpty()) {
            for (Question question:course.getQuestion()) {
                System.out.println("【" + teacherName + "】"
                        + "老师，收到了一条关于【"
                        + course.getCourseName()
                        + "】课程的，【" + question.getStudentName() + "】发来的提问，问题的内容为：【"
                        + question.getQuestionContent()
                        + "】。");
            }
        }else {
            System.out.println("没啥正经问题，学生逗老师玩呢！");
        }


    }
}
