package VendingMachine;

import Drink.Cola;
import Drink.ColaFactory;
import Drink.Cydar;
import Drink.CydarFactory;
import Drink.Drink;
import Meterial.MaterialFactory;

public class CarbonateVm extends VendingMachine{

	@Override
	Drink makeDrink(String name) {
		
		Drink drink = null;
//		MaterialFactory colaFactory = new ColaFactory();
//		MaterialFactory cydarFactory = new CydarFactory();
		
		if(name.equals("콜라")) {
			drink = new Cola();
			drink.setName("강한 탄산, 페트병 콜라");
		} else if(name.equals("사이다")) {
			drink = new Cydar();
			drink.setName("중간 탄산, 유리병 사이다");
		}		
		return drink;
	}
	
	

}
