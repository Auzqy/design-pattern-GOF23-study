package top.auzqy.design.pattern.structural.facade.example3;

public class Circle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Circle::draw()");
   }
}