package GOF.Lab7.Protoype;

public class Rectangle extends Shape {


   public Rectangle(){}
   public Rectangle(Shape target) {

      super(target);

      type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }

   @Override
   public Object clone() {
      return new Rectangle(this);
   }

   public boolean equals(Object object) {

      if (!super.equals(object) && !(object instanceof Rectangle))
         return false;

      Shape shape = (Shape) object;

      return this.type == shape.type;

   }
}