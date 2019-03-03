package lt.viko.webservices.rkomaristova.jaxws.services;

import java.time.LocalDate;
import java.util.Date;

import lt.viko.webservices.rkomaristova.jaxws.entities.Dragon;
import lt.viko.webservices.rkomaristova.jaxws.entities.Princess;

public interface DragonService {
	
	Dragon getDragonByName(String name);
	
	Princess getPrincessStolenByDragonName(String name);
	
	void addKnightEatenByDragonName(String dragonName, String name, String nobleName, int dragonsDefeated);
	
	Dragon createDragon(String name, String dateOfBirth, boolean canFly);

	Dragon deleteDragonByName(String name);
}
