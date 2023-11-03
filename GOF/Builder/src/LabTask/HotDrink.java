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
public abstract class HotDrink implements Item {

	@Override
	public Packing packing() {
            return new DisposibleCup();
	}

	@Override
	public abstract float price();
        
        public void addToppings(){};
}