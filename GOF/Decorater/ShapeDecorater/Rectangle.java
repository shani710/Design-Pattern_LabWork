package GOF.Lab3.Decorater.ShapeDecorater;

public class Rectangle implements Shape {
public int basePrice;

   public Rectangle (int basePrice) {
      this.basePrice=basePrice;
      }
   
   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

   @Override
   public int computeCost() {
      return basePrice;
   }
}