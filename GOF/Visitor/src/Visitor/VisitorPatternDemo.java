/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author FA20-bse-053
 */
public class VisitorPatternDemo {
   public static void main(String[] args) {

      Computer computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}