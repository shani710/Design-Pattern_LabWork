package GOF.Lab6.AbstractFactory;

public class DoubleBorderRectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("Inside Double Rectangle::draw() method.");
   }
}