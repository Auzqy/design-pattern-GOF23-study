package top.auzqy.design.pattern.behavioral.mediator.example3;

public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");
 
      robert.sendMessage("Hi! John!");
      john.sendMessage("Hello! Robert!");
   }
}