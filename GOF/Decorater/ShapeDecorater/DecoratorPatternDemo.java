package GOF.Lab3.Decorater.ShapeDecorater;

public class DecoratorPatternDemo {
   public static void main(String[] args) {

      Shape circle = new Circle(100);

      Shape redCircle = new RedShapeDecorator(new Circle(100));

      Shape redRectangle = new RedShapeDecorator(new Rectangle(120));
      System.out.println("Circle with normal border");
      circle.draw();

      System.out.println("\nCircle of red border");
      redCircle.draw();

      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}