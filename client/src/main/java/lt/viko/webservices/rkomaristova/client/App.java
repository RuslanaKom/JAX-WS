package lt.viko.webservices.rkomaristova.client;

import java.util.List;

import lt.viko.webservices.rkomaristova.jaxws.services.Dragon;
import lt.viko.webservices.rkomaristova.jaxws.services.DragonServiceImpl;
import lt.viko.webservices.rkomaristova.jaxws.services.DragonServiceImplService;
import lt.viko.webservices.rkomaristova.jaxws.services.Knight;
import lt.viko.webservices.rkomaristova.jaxws.services.Princess;

public class App 
{
    public static void main( String[] args )
    {
        //call web service
    	//URL: http://localhost:8085/my/dragonservice?wsdl
    	//wsimport -keep -verbose -s ./src/ -d ./target/ http://localhost:8085/my/dragonservice?wsdl
    	
    	DragonServiceImpl service= new DragonServiceImplService().getDragonServiceImplPort();
    	
    	Dragon dragon = service.getDragonByName("Alexstrasza");
    	Princess princess = service.getPrincessStolenByDragonName(dragon.getName());
    	System.out.println("Dragon "+dragon.getName()+" has now princess "+princess.getName()+" form "+princess.getKingdom());
    	System.out.println(princess.isBeautiful()?"Princess is beautiful":"Princess is not beautiful");
    	List<Knight> knights=dragon.getKnightsEaten();
    	System.out.println("Beware of "+ dragon.getName()+ ", it has already eaten:");
    	knights.stream().forEach(k->System.out.println(k.getTitle()+" "+k.getFirstName()+" "+k.getNobleName()));

    	System.out.println("Long live the new dragon "+ service.createDragon("Smaug", "2019-01-05", false));

    	System.out.println("The dragon defeated "+ service.deleteDragonByName("Smaug"));
    }
}
