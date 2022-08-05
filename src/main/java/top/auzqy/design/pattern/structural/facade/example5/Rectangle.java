package top.auzqy.design.pattern.structural.facade.example5;

public class Rectangle implements Shape {
 
   @Override
   public void draw() {
      System.out.println("Rectangle::draw()");
   }
}