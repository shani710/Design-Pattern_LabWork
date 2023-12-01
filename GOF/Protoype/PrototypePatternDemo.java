package GOF.Lab7.Protoype;

public class PrototypePatternDemo {
   public static void main(String[] args) {
      ShapeCache.loadCache();

      ShapeType Shape1 = ShapeCache.getShape("1");

      Shape orginalShape1 = Shape1.shape1;
      Shape clonedShape1 = Shape1.shape2;

      System.out.println("orignal Shape Color:" + orginalShape1.color + " cloned Shape Color:" + clonedShape1.color);
      System.out.println( "equals:" + orginalShape1.equals(clonedShape1));
      System.out.println("orignal object address:" +orginalShape1 +"cloned object address:"+clonedShape1);

      ShapeType Shape2 = ShapeCache.getShape("1");

      ShapeType Shape3 = ShapeCache.getShape("1");

   }
}