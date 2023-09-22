/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer.Labtask;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FA20-BSE-053
 */
interface Observer {
    void update(String message);
}

// Concrete Observer
class ConcreteObserver implements Observer {
    private String name;
    private int roll_no;

    public ConcreteObserver(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    @Override
    public void update(String message) {
        System.out.println(name+" " + roll_no +" "+ " received message: " + message);
    }
}
