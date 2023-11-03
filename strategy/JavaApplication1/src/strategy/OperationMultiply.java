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
public class OperationMultiply implements Strategy, ConcreteHandler {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int computeInRange(int num1, int num2) {
        if (1000 <= num1 && num1 <= 5000 && 1000 <= num2 && num2 <= 5000) {
            return num1 * num2;
        } else {
            return -1;
        }
    }

    @Override
    public void setNext(ConcreteHandler handler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}