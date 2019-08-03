package top.auzqy.design.pattern.behavioral.mediator.example2;

/**
 * description:  抽象的国家 （抽象的同事类）
 * createTime: 2019-08-03 16:59
 * @author zqy
 */
public abstract class Country {
    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

    abstract void declare(String message);
    abstract void sendMessage(String message);
}
