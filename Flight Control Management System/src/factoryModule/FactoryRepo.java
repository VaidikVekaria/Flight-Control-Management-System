package factoryModule;

import java.util.HashMap;

public class FactoryRepo {

	private static FactoryRepo instance = null;
	private HashMap<Integer, CommandFactory> repo = null;

	private FactoryRepo FactoryRepo() {
		return new FactoryRepo();
	}

	public static FactoryRepo getInstance() {
		if (instance == null) {
			instance = new FactoryRepo();
		}
		return instance;
	}

	
	public HashMap<Integer, CommandFactory> getRepo() { return repo; }
	

	public void setRepo(HashMap<Integer, CommandFactory> repo) {
		this.repo = repo;
	}

	public CommandFactory getCommandFromRepo(int selection) {
		return repo.get(selection);

	}
}
