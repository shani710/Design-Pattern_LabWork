package GOF.Lab7.Protoype;

public class Circle extends Shape {

   public Circle(){}
   public Circle(Shape target) {
      super(target);
      type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }

   @Override
   public Object clone() {
      return new Circle(this);
   }

   public boolean equals(Object object) {

      if (!super.equals(object) && !(object instanceof Circle))
         return false;

      Shape shape = (Shape) object;

      return this.type == shape.type;

   }

}
