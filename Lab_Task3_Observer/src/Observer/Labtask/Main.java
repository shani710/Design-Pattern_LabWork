/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.Labtask;

/**
 *
 * @author FA20-BSE-053
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Create some observers
        Observer observer1 = new ConcreteObserver("abbas",053);
       
        Observer observer3 = new ConcreteObserver("Nabeel",171);

        // Attach observers to the subject using the attach method
        subject.attach(observer1);
        
        subject.attach(observer3);

        // Notify observers
        subject.notifyObservers("Hello, observers!");

        // Detach an observer
       

        // Notify observers again
        subject.notifyObservers("Observer 2 has been detached.");
    }
}
