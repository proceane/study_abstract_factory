package Drink;

import Meterial.Bottle;
import Meterial.Carbonate;
import Meterial.Cyrub;

public abstract class Drink {
	
	String name;
	Cyrub cyrub;
	Carbonate carbonate;
	Bottle bottle;
	
	abstract void assemble();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
