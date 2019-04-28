package lt.viko.webservices.rkomaristova.client;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import lt.viko.webservices.rkomaristova.jaxws.services.Dragon;
import lt.viko.webservices.rkomaristova.jaxws.services.DragonServiceImpl;
import lt.viko.webservices.rkomaristova.jaxws.services.DragonServiceImplService;
import lt.viko.webservices.rkomaristova.jaxws.services.Knight;
import lt.viko.webservices.rkomaristova.jaxws.services.Princess;


public class DragonServiceTest
{

	@Test
    public void shouldReturnDragonByName(){
		//given
		DragonServiceImpl service= new DragonServiceImplService().getDragonServiceImplPort();
    	//when
    	Dragon dragon = service.getDragonByName("Alexstrasza");
    	Princess princess = service.getPrincessStolenByDragonName(dragon.getName());
    	List<Knight> knights=dragon.getKnightsEaten();
    	//then
    	assertThat(dragon.getName(), is("Alexstrasza"));
    	
    	assertThat(princess.getName(), is("Emeralda"));
    	assertThat(knights.get(0).getNobleName(), is("The Mouse Slayer"));
    }
	
}
