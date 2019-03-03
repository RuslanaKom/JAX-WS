
package lt.viko.webservices.rkomaristova.jaxws.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the lt.viko.webservices.rkomaristova.jaxws.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Knight_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "knight");
    private final static QName _Princess_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "princess");
    private final static QName _Dragon_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "dragon");
    private final static QName _GetPrincessStolenByDragonNameResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getPrincessStolenByDragonNameResponse");
    private final static QName _GetDragonByNameResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getDragonByNameResponse");
    private final static QName _GetDragonByName_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getDragonByName");
    private final static QName _GetPrincessStolenByDragonName_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getPrincessStolenByDragonName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.webservices.rkomaristova.jaxws.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dragon }
     * 
     */
    public Dragon createDragon() {
        return new Dragon();
    }

    /**
     * Create an instance of {@link GetDragonByName }
     * 
     */
    public GetDragonByName createGetDragonByName() {
        return new GetDragonByName();
    }

    /**
     * Create an instance of {@link GetPrincessStolenByDragonName }
     * 
     */
    public GetPrincessStolenByDragonName createGetPrincessStolenByDragonName() {
        return new GetPrincessStolenByDragonName();
    }

    /**
     * Create an instance of {@link Knight }
     * 
     */
    public Knight createKnight() {
        return new Knight();
    }

    /**
     * Create an instance of {@link Princess }
     * 
     */
    public Princess createPrincess() {
        return new Princess();
    }

    /**
     * Create an instance of {@link GetPrincessStolenByDragonNameResponse }
     * 
     */
    public GetPrincessStolenByDragonNameResponse createGetPrincessStolenByDragonNameResponse() {
        return new GetPrincessStolenByDragonNameResponse();
    }

    /**
     * Create an instance of {@link GetDragonByNameResponse }
     * 
     */
    public GetDragonByNameResponse createGetDragonByNameResponse() {
        return new GetDragonByNameResponse();
    }

    /**
     * Create an instance of {@link Dragon.KnightsEaten }
     * 
     */
    public Dragon.KnightsEaten createDragonKnightsEaten() {
        return new Dragon.KnightsEaten();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Knight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "knight")
    public JAXBElement<Knight> createKnight(Knight value) {
        return new JAXBElement<Knight>(_Knight_QNAME, Knight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Princess }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "princess")
    public JAXBElement<Princess> createPrincess(Princess value) {
        return new JAXBElement<Princess>(_Princess_QNAME, Princess.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dragon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "dragon")
    public JAXBElement<Dragon> createDragon(Dragon value) {
        return new JAXBElement<Dragon>(_Dragon_QNAME, Dragon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrincessStolenByDragonNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "getPrincessStolenByDragonNameResponse")
    public JAXBElement<GetPrincessStolenByDragonNameResponse> createGetPrincessStolenByDragonNameResponse(GetPrincessStolenByDragonNameResponse value) {
        return new JAXBElement<GetPrincessStolenByDragonNameResponse>(_GetPrincessStolenByDragonNameResponse_QNAME, GetPrincessStolenByDragonNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDragonByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "getDragonByNameResponse")
    public JAXBElement<GetDragonByNameResponse> createGetDragonByNameResponse(GetDragonByNameResponse value) {
        return new JAXBElement<GetDragonByNameResponse>(_GetDragonByNameResponse_QNAME, GetDragonByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDragonByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "getDragonByName")
    public JAXBElement<GetDragonByName> createGetDragonByName(GetDragonByName value) {
        return new JAXBElement<GetDragonByName>(_GetDragonByName_QNAME, GetDragonByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrincessStolenByDragonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "getPrincessStolenByDragonName")
    public JAXBElement<GetPrincessStolenByDragonName> createGetPrincessStolenByDragonName(GetPrincessStolenByDragonName value) {
        return new JAXBElement<GetPrincessStolenByDragonName>(_GetPrincessStolenByDragonName_QNAME, GetPrincessStolenByDragonName.class, null, value);
    }

}
