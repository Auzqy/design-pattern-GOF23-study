package top.auzqy.design.pattern.behavioral.command.example2;

import top.auzqy.design.pattern.behavioral.command.example1.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * description:  服务员类
 * createTime: 2019-08-04 15:01
 * @author zqy
 */
public class Waiter {
    private List<ACommand> commandList = new ArrayList<>();

    public void setOrder(ACommand command) {
        commandList.add(command);
    }

    public void cancelOrder(ACommand command) {
        commandList.remove(command);
    }

    public void executeAllCommand() {
        for (ACommand command : commandList) {
            command.executeCommand();
        }
        commandList.clear();
    }
}
