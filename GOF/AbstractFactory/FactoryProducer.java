package GOF.Lab6.AbstractFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String type) {
      if (type.equalsIgnoreCase("RoundShape")) {
         return new RoundedShapeFactory();
      }

      else if (type.equalsIgnoreCase("DoubleBorderShape")) {

         return new DoubleBorderFactory();
      } 
      else if(type.equalsIgnoreCase("DoubleBorderRounded")){

         return new DoubleBorderRoundedFactory();
      }
      
      else {
         return new ShapeFactory();
      }
   }
}