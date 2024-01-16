package utilities;

import factoryModule.*;


import java.util.HashMap;

public class FactoryRepoPopulator {

	private static FactoryRepoPopulator instance = null;

	private FactoryRepoPopulator FactoryRepoPopulator() {
		return new FactoryRepoPopulator();
	}

	public static FactoryRepoPopulator getInstance() {
		if (instance == null) {
			instance = new FactoryRepoPopulator();
		}
		return instance;
	}

	public FactoryRepo populateFactoryRepo() {

		FactoryRepo aFactRepo = FactoryRepo.getInstance();

		aFactRepo.setRepo(new HashMap<Integer, CommandFactory>());
		aFactRepo.getRepo().put(1, new NavigationCommandFactory());
		aFactRepo.getRepo().put(2, new FuelPredictonCommandFactory());

		return aFactRepo;

	}
	
}
