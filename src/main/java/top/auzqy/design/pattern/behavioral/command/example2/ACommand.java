package top.auzqy.design.pattern.behavioral.command.example2;

/**
 * description:  命令模式的抽象类
 * createTime: 2019-08-04 14:47
 * @author zqy
 */
public abstract class ACommand {
    protected Barbecuer barbecuer;

    public ACommand(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    abstract void executeCommand();
}
