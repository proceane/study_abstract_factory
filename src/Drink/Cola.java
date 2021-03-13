package Drink;

import Meterial.MaterialFactory;

public class Cola extends Drink{
	
	//MaterialFactory materialFactory;
	
	ColaFactory colaFactory;
	
//	public Cola(ColaFactory colaFactory) {
//		this.materialFactory = colaFactory;
//	}
	
	@Override
	void assemble() {
//		cyrub = materialFactory.makeCyrub();
//		carbonate = materialFactory.makeCarbonate();
//		bottle = materialFactory.makeBottle();
		
		cyrub = colaFactory.makeCyrub();
		carbonate = colaFactory.makeCarbonate();
		bottle = colaFactory.makeBottle();
	}

}
