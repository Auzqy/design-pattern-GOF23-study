package top.auzqy.design.pattern.behavioral.command.example1;

public class Test {
    public static void main(String[] args) {
        Stuff stuff = new Stuff();

        Video liangJian = new Video("亮剑");
        Video yeWen = new Video("叶问");
        Command liangJianOnlineVideoCommand = new OnlineVideoCommand(liangJian);
        Command yeWenOnlineVideoCommand = new OnlineVideoCommand(yeWen);
        Command liangJianDownLineVideoCommand = new DownLineVideoCommand(liangJian);
        Command yeWenDownLineVideoCommand = new DownLineVideoCommand(yeWen);

        stuff.addCommand(liangJianOnlineVideoCommand);
        stuff.addCommand(yeWenOnlineVideoCommand);
        stuff.addCommand(liangJianDownLineVideoCommand);
        stuff.addCommand(yeWenDownLineVideoCommand);

        stuff.executeCommands();
    }
}
