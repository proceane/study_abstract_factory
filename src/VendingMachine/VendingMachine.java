package VendingMachine;

import Drink.Drink;

public abstract class VendingMachine {
	
	public Drink orderDrink(String name) {
		Drink drink;
		drink = makeDrink(name);
		return drink;
	}
	
	abstract Drink makeDrink(String name);
}
