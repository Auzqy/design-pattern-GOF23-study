package top.auzqy.design.pattern.behavioral.mediator.example2;

/**
 * description:  联合国机构  (抽象的中介者)
 * createTime: 2019-08-03 16:58
 * @author zqy
 */
public abstract class UnitedNations {
    abstract void declare(Country colleague, String message);
}
