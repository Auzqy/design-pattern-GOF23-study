package top.auzqy.design.pattern.behavioral.mediator.example2;

/**
 * description:  安理会 （具体的中介者类）
 * createTime: 2019-08-03 17:18
 * @author zqy
 */
public class SecurityCouncil extends UnitedNations {
    @Override
    void declare(Country colleague, String message) {
        colleague.sendMessage(message);
    }
}
