package top.auzqy.design.pattern.structural.decorator.example3;

public class RedShapeDecorator extends ShapeDecorator {
 
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);     
   }
 
   @Override
   public void draw() {
      decoratedShape.draw();         
      setRedBorder(decoratedShape);
   }
 
   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}