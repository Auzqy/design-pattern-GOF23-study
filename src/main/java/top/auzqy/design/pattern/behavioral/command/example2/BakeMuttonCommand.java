package top.auzqy.design.pattern.behavioral.command.example2;

/**
 * description:  具体的烤羊肉串的类
 * createTime: 2019-08-04 14:50
 * @author zqy
 */
public class BakeMuttonCommand extends ACommand {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    void executeCommand() {
        barbecuer.bakeMutton();
    }
}
