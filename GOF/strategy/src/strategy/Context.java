/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-bse-053
 */
public class Context {
    private ConcreteHandler head;

    public Context() {
        // Create a list of all of the Strategy and ConcreteHandler classes
        List<ConcreteHandler> handlers = new ArrayList<>();
        handlers.add(new OperationAdd());
        handlers.add(new OperationSubstract());
        handlers.add(new OperationMultiply());
        handlers.add(new OperationPower());
        // ... other ConcreteHandlers

        // Iterate through the list and add each handler to the chain
        ConcreteHandler currentHandler = null;
        for (ConcreteHandler handler : handlers) {
            if (currentHandler == null) {
                head = handler;
            } else {
                currentHandler.setNext(handler);
            }
            currentHandler = handler;
        }
    }

    public int executeStrategy(int num1, int num2) {
        return head.computeInRange(num1, num2);
    }
    public ConcreteHandler getHead() {
        return head;
    }

    public void setHead(ConcreteHandler head) {
       this.head = head;
    }
}