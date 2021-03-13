package Drink;

import Meterial.MaterialFactory;

public class Cydar extends Drink{

	//MaterialFactory materialFactory;
	
	CydarFactory cydarFactory;
	
//	public Cydar(CydarFactory cydarFactory) {
//		this.materialFactory = cydarFactory;
//	}
	
	@Override
	void assemble() {
//		cyrub = materialFactory.makeCyrub();
//		carbonate = materialFactory.makeCarbonate();
//		bottle = materialFactory.makeBottle();
		
		cyrub = cydarFactory.makeCyrub();
		carbonate = cydarFactory.makeCarbonate();
		bottle = cydarFactory.makeBottle();
	}

}
