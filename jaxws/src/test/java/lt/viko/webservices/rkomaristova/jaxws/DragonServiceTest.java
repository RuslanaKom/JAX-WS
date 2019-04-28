package lt.viko.webservices.rkomaristova.jaxws;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


import lt.viko.webservices.rkomaristova.jaxws.dao.InMemoryDao;
import lt.viko.webservices.rkomaristova.jaxws.dao.InMemoryDaoImpl;
import lt.viko.webservices.rkomaristova.jaxws.entities.Dragon;
import lt.viko.webservices.rkomaristova.jaxws.entities.Princess;
import lt.viko.webservices.rkomaristova.jaxws.services.DragonService;
import lt.viko.webservices.rkomaristova.jaxws.services.DragonServiceImpl;

public class DragonServiceTest
{
	private static final String DRAGON_NAME = "Alexstrasza";

	DragonServiceImpl dragonService= new DragonServiceImpl();

	@Test
    public void shouldReturnDragonByName(){
		//when
        Dragon result = dragonService.getDragonByName(DRAGON_NAME);
        //then      
        assertThat(result.getName(), is(DRAGON_NAME));
    }

	@Test
    public void shouldGetPrincessStolenByDragonName(){
		//when
        Object result = dragonService.getPrincessStolenByDragonName(DRAGON_NAME);
        //then      
        assertTrue(result instanceof Princess);
    }
	
}
