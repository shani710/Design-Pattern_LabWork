/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_Of_Responsibility_LabTask;

/**
 *
 * @author fa20-bse-053
 */
public class WarningLogger extends AbstractLogger2 {

   public WarningLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {
      System.out.println("Warning Console::Logger2: " + message);
   }
}

