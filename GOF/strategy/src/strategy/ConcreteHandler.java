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
public interface ConcreteHandler {
    int computeInRange(int num1, int num2);

    public void setNext(ConcreteHandler handler);
}