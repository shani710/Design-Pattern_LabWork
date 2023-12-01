package GOF.Lab7.Protoype;

public abstract class Shape implements Cloneable {

   private String id;
   protected String type;

   String color;

   public Shape() {
   }

   public Shape(Shape target) {

      if (target != null) {
         this.color = target.color;
      }
   }

   abstract void draw();

   public String getType() {
      return type;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public abstract Object clone();
   // {
   // Object clone = null;

   // try {
   // clone = super.clone();

   // } catch (CloneNotSupportedException e) {
   // e.printStackTrace();
   // }

   // return clone;
   // }

   public boolean equals(Object object) {

      if (!(object instanceof Shape))
         return false;

      Shape shape1 = (Shape) object;

      return this.color == shape1.color;

   }
}
