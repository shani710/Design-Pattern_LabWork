package GOF.Lab3.Decorater.ShapeDecorater;



public class RedShapeDecorator extends ShapeDecorator {


   public int Decorateprice=50;

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);		
   }

   @Override
   public void draw() {
      decoratedShape.draw();	       
      setRedBorder(decoratedShape);
      System.out.println("Price With decoration:"+computeCost());
   }

   private void setRedBorder(Shape decoratedShape){
   
      System.out.println("Border Color: Red");
   }

   @Override
   public int computeCost() {
      return decoratedShape.computeCost()+Decorateprice;
   }

 
}