package top.auzqy.design.pattern.behavioral.mediator.example1;

import java.util.Date;

/**
 * description:   中介者类：QQ学习群
 * createTime: 2019-08-03 16:48
 * @author zqy
 */
public class StudyGroup {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " ["
                + user.getName()
                + "] : "
                + message);
    }
}
