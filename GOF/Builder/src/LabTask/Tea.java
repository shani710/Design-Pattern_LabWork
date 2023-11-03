/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask;

/**
 *
 * @author FA20-bse-053
 */
public class Tea extends HotDrink {
    
    String toppings = "Add Cream";
    float toppingPrice;

    @Override
    public float price() {
       return 60.0f;
    }

    @Override
    public String name() {
       return "Tea";
    }

    @Override
    public void addToppings(){

    }
}
