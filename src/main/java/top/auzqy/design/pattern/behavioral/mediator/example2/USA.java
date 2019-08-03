package top.auzqy.design.pattern.behavioral.mediator.example2;

/**
 * description:  美国 （具体的同事类）
 * createTime: 2019-08-03 17:01
 * @author zqy
 */
public class USA extends Country {
    public USA(UnitedNations mediator) {
        super(mediator);
    }

    @Override
    void declare(String message) {
        mediator.declare(this,message);
    }

    @Override
    void sendMessage(String message) {
        System.out.println("USA说： " + message);
    }
}
