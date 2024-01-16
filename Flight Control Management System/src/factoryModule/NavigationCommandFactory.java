package factoryModule;

import commandModule.Command;
import commandModule.NavigationCommand;

public class NavigationCommandFactory extends CommandFactory{
	
	public Command createCommand() {
		return new NavigationCommand();
	} 

}
