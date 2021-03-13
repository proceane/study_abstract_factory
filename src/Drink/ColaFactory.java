package Drink;

import Meterial.Bottle;
import Meterial.Carbonate;
import Meterial.ColaCyrub;
import Meterial.Cyrub;
import Meterial.MaterialFactory;
import Meterial.PlasticBottle;
import Meterial.StrengthCarbonate;

public class ColaFactory implements MaterialFactory {

	@Override
	public Cyrub makeCyrub() {
		return new ColaCyrub();
	}

	@Override
	public Carbonate makeCarbonate() {
		return new StrengthCarbonate();
	}

	@Override
	public Bottle makeBottle() {
		return new PlasticBottle();
	}

}
