package top.auzqy.design.pattern.behavioral.observer.example2.eg2_2;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Description:
 * @Author: zqy
 * @CreateTime: 2019-07-23 13:50
 */
public class Course {

    @Getter
    private String courseName;

    @Getter
    private List<Question> question = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    // todo question 添加/删除/清楚所有等的操作

}
