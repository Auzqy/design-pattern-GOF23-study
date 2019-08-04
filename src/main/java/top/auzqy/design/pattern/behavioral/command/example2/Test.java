package top.auzqy.design.pattern.behavioral.command.example2;

public class Test {
    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        ACommand bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
        ACommand bakeMuttonCommand2 = new BakeMuttonCommand(barbecuer);
        ACommand bakeChickenWingCommand = new BakeChickenWingCommand(barbecuer);

        Waiter girl = new Waiter();
        girl.setOrder(bakeMuttonCommand1);
        girl.setOrder(bakeMuttonCommand2);
        girl.setOrder(bakeChickenWingCommand);

        girl.executeAllCommand();
    }
}
