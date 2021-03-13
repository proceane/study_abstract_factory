package abstractFactory;

import Drink.Drink;
import VendingMachine.CarbonateVm;

public class Me {
	public static void main(String[] args) {
		CarbonateVm vm = new CarbonateVm();
		Drink drink =  vm.orderDrink("콜라");
		System.out.println(drink.getName());
	}
}
