package top.auzqy.design.pattern.behavioral.observer.example1;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: 教师类
 *
 *              观察者
 * @Author: zqy
 * @CreateTime: 2019-07-23 11:40
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println("【" + teacherName + "】"
                + "老师，收到了一条关于【"
                + course.getCourseName()
                + "】课程的提问，问题的内容为：【"
                + question.getQuestionContent()
                + "】。");
    }
}
