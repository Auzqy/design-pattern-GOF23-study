package top.auzqy.design.pattern.behavioral.command.example2;

/**
 * description:  烤鸡翅的具体命令
 * createTime: 2019-08-04 14:56
 * @author zqy
 */
public class BakeChickenWingCommand extends ACommand {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void executeCommand() {
        barbecuer.bakeChickenWing();
    }
}
