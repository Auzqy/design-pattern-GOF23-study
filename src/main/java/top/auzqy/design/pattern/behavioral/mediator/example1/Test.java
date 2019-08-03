package top.auzqy.design.pattern.behavioral.mediator.example1;

public class Test {
    public static void main(String[] args) {
        User liMing = new User("LiMing");
        User wangMei= new User("WangMei");

        liMing.sendMessage(" Hey! WangMei! Let's study");
        wangMei.sendMessage("OK! LiMing");
    }
}
