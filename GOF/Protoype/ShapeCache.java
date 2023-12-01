package GOF.Lab7.Protoype;

import java.util.Hashtable;

public class ShapeCache {

   private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

   public static ShapeType getShape(String shapeId) {
      Shape cachedShape = shapeMap.get(shapeId);

      return new ShapeType(cachedShape, (Shape) cachedShape.clone());

   }

   public static void loadCache() {

      Circle circle = new Circle();
      circle.color = "red";
      circle.setId("1");
      shapeMap.put(circle.getId(), circle);

      Square square = new Square();
      square.color = "blue";

      square.setId("2");
      shapeMap.put(square.getId(), square);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      rectangle.color = "green";

      shapeMap.put(rectangle.getId(), rectangle);
   }
}