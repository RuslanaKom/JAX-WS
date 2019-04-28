package lt.viko.webservices.rkomaristova.jaxws.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.jws.WebService;

import org.apache.commons.lang3.StringUtils;

import lt.viko.webservices.rkomaristova.jaxws.dao.InMemoryDao;
import lt.viko.webservices.rkomaristova.jaxws.dao.InMemoryDaoImpl;
import lt.viko.webservices.rkomaristova.jaxws.entities.Dragon;
import lt.viko.webservices.rkomaristova.jaxws.entities.Knight;
import lt.viko.webservices.rkomaristova.jaxws.entities.Princess;

@WebService
public class DragonServiceImpl implements DragonService {
	
	private InMemoryDao dao = new InMemoryDaoImpl();

	@Override
	public Dragon getDragonByName(String name) {
		return dao.getDragonByName(name);
	}

	@Override
	public Princess getPrincessStolenByDragonName(String name) {
		return dao.getPrincessByDragonName(name);
	}

	@Override
	public void addKnightEatenByDragonName(String dragonName, String name, String nobleName, int dragonsDefeated) {
		Knight knight = new Knight("Sir", name, nobleName, dragonsDefeated);
		Dragon dragon = dao.getDragonByName(dragonName);
		if (null == dragon.getKnightsEaten()) {
			dragon.setKnightsEaten(new ArrayList<>());
		}
		List<Knight> dublicateKnights = dragon.getKnightsEaten()
				.stream()
				.filter(k->StringUtils.equals(k.getFirstName(),name)&&StringUtils.equals(k.getNobleName(),nobleName))
				.collect(Collectors.toList());
		if (dublicateKnights.isEmpty()) {
			dragon.getKnightsEaten().add(knight);
		}
	}

	@Override
	public Dragon createDragon(String name, String dateOfBirth, boolean canFly) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD");
		return dao.saveDragon(new Dragon(name,LocalDate.parse(dateOfBirth, formatter),canFly));
	}
	
	@Override
	public Dragon deleteDragonByName(String name) {
		return dao.deleteDragon(name);
	}
}
