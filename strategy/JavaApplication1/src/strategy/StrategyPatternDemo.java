/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author FA20-bse-053
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context();
      int result = context.executeStrategy(10, 5); // 15
      System.out.println(result);
      
      result = context.executeStrategy(100, 50); // 50
      System.out.println(result);

     result = context.executeStrategy(1000, 500); // 500000
     System.out.println(result);

    result = context.executeStrategy(10000, 2); // -1
    System.out.println(result);


   }
}