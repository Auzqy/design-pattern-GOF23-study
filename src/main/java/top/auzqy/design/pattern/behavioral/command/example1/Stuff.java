package top.auzqy.design.pattern.behavioral.command.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * description:  员工类 命令的执行者
 * createTime: 2019-08-04 14:32
 * @author zqy
 */
public class Stuff {
    private List<Command> commandList = new ArrayList<Command>();
    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }
}
