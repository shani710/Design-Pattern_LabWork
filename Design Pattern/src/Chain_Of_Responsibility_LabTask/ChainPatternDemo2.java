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
public class ChainPatternDemo2 {

   private static AbstractLogger2 getChainOfLoggers(){

      AbstractLogger2 warningLogger = new WarningLogger(AbstractLogger2.WARNING);
      AbstractLogger2 infoLogger = new ConsoleLogger2(AbstractLogger2.INFO);

      warningLogger.setNextLogger(infoLogger);

      return warningLogger;
   }

   public static void main(String[] args) {
      AbstractLogger2 loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger2.INFO,
         "This is an information.");

      loggerChain.logMessage(AbstractLogger2.WARNING,
         "This is a warning.");

      loggerChain.logMessage(AbstractLogger2.ERROR,
         "This is an error information.");
   }
}
