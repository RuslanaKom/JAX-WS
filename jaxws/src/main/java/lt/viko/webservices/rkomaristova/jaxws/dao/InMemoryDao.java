package lt.viko.webservices.rkomaristova.jaxws.dao;

import java.util.List;

import lt.viko.webservices.rkomaristova.jaxws.entities.Dragon;
import lt.viko.webservices.rkomaristova.jaxws.entities.Knight;
import lt.viko.webservices.rkomaristova.jaxws.entities.Princess;

public interface InMemoryDao {
	
	List<Dragon> getDragons();
	List<Knight> getKnights();
	List<Princess> getPrincesses();
	
	Dragon getDragonByName(String name);
	
	Princess getPrincessByDragonName(String name);
	
	Dragon saveDragon(Dragon dragon);
	Dragon deleteDragon(String name);

}
