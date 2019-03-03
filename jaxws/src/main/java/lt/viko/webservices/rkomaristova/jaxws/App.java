package lt.viko.webservices.rkomaristova.jaxws;

import javax.xml.ws.Endpoint;

import lt.viko.webservices.rkomaristova.jaxws.services.DragonServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        Endpoint.publish("http://localhost:8085/my/dragonservice", new DragonServiceImpl());
    }
}
