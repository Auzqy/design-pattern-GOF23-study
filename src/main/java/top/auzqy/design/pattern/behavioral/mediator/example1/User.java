package top.auzqy.design.pattern.behavioral.mediator.example1;

import lombok.Data;

/**
 * description:  具体的同事类
 * createTime: 2019-08-03 16:49
 * @author zqy
 */
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
