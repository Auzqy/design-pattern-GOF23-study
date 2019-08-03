package top.auzqy.design.pattern.behavioral.mediator.example2;

/**
 * description:  伊拉克 （具体的同事类）
 * createTime: 2019-08-03 17:05
 * @author zqy
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    void declare(String message) {
        mediator.declare(this,message);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("伊拉克说： " + message);
    }
}
