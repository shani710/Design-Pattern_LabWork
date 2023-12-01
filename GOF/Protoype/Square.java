package GOF.Lab7.Protoype;

public class Square extends Shape {

   public Square() {

   }

   public Square(Shape target) {
      super(target);
      type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }

   @Override
   public Object clone() {
      return new Square(this);
   }

   public boolean equals(Object object) {

      if (!super.equals(object) && (object instanceof Square))
         return false;

      Shape shape = (Shape) object;

      return this.type == shape.type;

   }
}