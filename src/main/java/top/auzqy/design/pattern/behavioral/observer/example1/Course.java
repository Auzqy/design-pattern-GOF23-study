package top.auzqy.design.pattern.behavioral.observer.example1;

import lombok.Getter;

import java.util.Observable;

/**
 * @Description: 课程类
 *
 *              被观察的对象
 * @Author: zqy
 * @CreateTime: 2019-07-23 11:29
 */
public class Course extends Observable {

    @Getter
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println("【" + question.getUserName() + "】"
                + "在【" + courseName + "】课程中,提了一个问题");
        setChanged();
        notifyObservers(question);

    }

}
