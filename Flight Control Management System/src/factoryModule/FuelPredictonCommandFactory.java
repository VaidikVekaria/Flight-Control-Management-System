package factoryModule;

import commandModule.*;

public class FuelPredictonCommandFactory extends CommandFactory{
	
	public Command createCommand() {
		return new FuelPredictionCommand();
	}

}
