package Drink;

import Meterial.Bottle;
import Meterial.Carbonate;
import Meterial.CydarCyrub;
import Meterial.Cyrub;
import Meterial.GlassBottle;
import Meterial.MaterialFactory;
import Meterial.MiddleCarbonate;

public class CydarFactory implements MaterialFactory {

	@Override
	public Cyrub makeCyrub() {
		return new CydarCyrub();
	}

	@Override
	public Carbonate makeCarbonate() {
		return new MiddleCarbonate();
	}

	@Override
	public Bottle makeBottle() {
		return new GlassBottle();
	}

}
