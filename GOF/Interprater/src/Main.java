/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fa20-bse-053
 */


/**
 *
 * @author fa20-bse-044
 */
public class Main {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("Robert");
      Expression john = new TerminalExpression("John");
      return new OrExpression(robert, john);		
   }
   public static Expression getSonExpression() {
    Expression robert = new TerminalExpression("Robert");
    Expression stuart = new TerminalExpression("Stuart");
    return new SonExpression(robert, stuart);
}

   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Julie");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
   
public static Expression getDaughterExpression() {
    Expression julie = new TerminalExpression("Julie");
    Expression samantha = new TerminalExpression("Samantha");
    return new DaughterExpression(julie, samantha);
}
   public static void main(String[] args) {
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();
      Expression isSon = getSonExpression();
      Expression isDaughter = getDaughterExpression();
      

      System.out.println("John is male? " + isMale.interpret("John"));
      System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
      System.out.println("Stuart is a son of Robert? " + isSon.interpret("Stuart is a son of Robert"));
      System.out.println("Samantha is a daughter of Julie? " + isDaughter.interpret("Samantha is a daughter of Julie? "));
}
   }