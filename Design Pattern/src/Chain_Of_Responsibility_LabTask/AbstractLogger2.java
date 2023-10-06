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
public abstract class AbstractLogger2 {
   public static int INFO = 1;
   public static int WARNING = 2;
   public static int ERROR = 3;

   protected int level;

   // next element in chain of responsibility
   protected AbstractLogger2 nextLogger;

   public void setNextLogger(AbstractLogger2 nextLogger){
      this.nextLogger = nextLogger;
   }

   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(nextLogger != null && this.level <= level){
         nextLogger.logMessage(level, message);
      }
   }

   abstract protected void write(String message);
}

