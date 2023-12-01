package GOF.Lab3.Decorater.ShapeDecorater;

public class Circle implements Shape {
   public int basePrice;

   public Circle(int basePrice) {
      this.basePrice = basePrice;
   }

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

   @Override
   public int computeCost() {
      return basePrice;
   }
}
