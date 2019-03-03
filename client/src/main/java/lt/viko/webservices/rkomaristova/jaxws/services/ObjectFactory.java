
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

    private final static QName _DeleteDragonByNameResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "deleteDragonByNameResponse");
    private final static QName _AddKnightEatenByDragonName_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "addKnightEatenByDragonName");
    private final static QName _GetPrincessStolenByDragonNameResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getPrincessStolenByDragonNameResponse");
    private final static QName _DeleteDragonByName_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "deleteDragonByName");
    private final static QName _GetDragonByNameResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getDragonByNameResponse");
    private final static QName _CreateDragonResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "createDragonResponse");
    private final static QName _CreateDragon_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "createDragon");
    private final static QName _GetDragonByName_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getDragonByName");
    private final static QName _GetPrincessStolenByDragonName_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "getPrincessStolenByDragonName");
    private final static QName _AddKnightEatenByDragonNameResponse_QNAME = new QName("http://services.jaxws.rkomaristova.webservices.viko.lt/", "addKnightEatenByDragonNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: lt.viko.webservices.rkomaristova.jaxws.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateDragonResponse }
     * 
     */
    public CreateDragonResponse createCreateDragonResponse() {
        return new CreateDragonResponse();
    }

    /**
     * Create an instance of {@link CreateDragon }
     * 
     */
    public CreateDragon createCreateDragon() {
        return new CreateDragon();
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
     * Create an instance of {@link AddKnightEatenByDragonNameResponse }
     * 
     */
    public AddKnightEatenByDragonNameResponse createAddKnightEatenByDragonNameResponse() {
        return new AddKnightEatenByDragonNameResponse();
    }

    /**
     * Create an instance of {@link DeleteDragonByNameResponse }
     * 
     */
    public DeleteDragonByNameResponse createDeleteDragonByNameResponse() {
        return new DeleteDragonByNameResponse();
    }

    /**
     * Create an instance of {@link AddKnightEatenByDragonName }
     * 
     */
    public AddKnightEatenByDragonName createAddKnightEatenByDragonName() {
        return new AddKnightEatenByDragonName();
    }

    /**
     * Create an instance of {@link GetPrincessStolenByDragonNameResponse }
     * 
     */
    public GetPrincessStolenByDragonNameResponse createGetPrincessStolenByDragonNameResponse() {
        return new GetPrincessStolenByDragonNameResponse();
    }

    /**
     * Create an instance of {@link DeleteDragonByName }
     * 
     */
    public DeleteDragonByName createDeleteDragonByName() {
        return new DeleteDragonByName();
    }

    /**
     * Create an instance of {@link GetDragonByNameResponse }
     * 
     */
    public GetDragonByNameResponse createGetDragonByNameResponse() {
        return new GetDragonByNameResponse();
    }

    /**
     * Create an instance of {@link Dragon }
     * 
     */
    public Dragon createDragon() {
        return new Dragon();
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
     * Create an instance of {@link LocalDate }
     * 
     */
    public LocalDate createLocalDate() {
        return new LocalDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDragonByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "deleteDragonByNameResponse")
    public JAXBElement<DeleteDragonByNameResponse> createDeleteDragonByNameResponse(DeleteDragonByNameResponse value) {
        return new JAXBElement<DeleteDragonByNameResponse>(_DeleteDragonByNameResponse_QNAME, DeleteDragonByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKnightEatenByDragonName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "addKnightEatenByDragonName")
    public JAXBElement<AddKnightEatenByDragonName> createAddKnightEatenByDragonName(AddKnightEatenByDragonName value) {
        return new JAXBElement<AddKnightEatenByDragonName>(_AddKnightEatenByDragonName_QNAME, AddKnightEatenByDragonName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDragonByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "deleteDragonByName")
    public JAXBElement<DeleteDragonByName> createDeleteDragonByName(DeleteDragonByName value) {
        return new JAXBElement<DeleteDragonByName>(_DeleteDragonByName_QNAME, DeleteDragonByName.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDragonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "createDragonResponse")
    public JAXBElement<CreateDragonResponse> createCreateDragonResponse(CreateDragonResponse value) {
        return new JAXBElement<CreateDragonResponse>(_CreateDragonResponse_QNAME, CreateDragonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDragon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "createDragon")
    public JAXBElement<CreateDragon> createCreateDragon(CreateDragon value) {
        return new JAXBElement<CreateDragon>(_CreateDragon_QNAME, CreateDragon.class, null, value);
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

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddKnightEatenByDragonNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.jaxws.rkomaristova.webservices.viko.lt/", name = "addKnightEatenByDragonNameResponse")
    public JAXBElement<AddKnightEatenByDragonNameResponse> createAddKnightEatenByDragonNameResponse(AddKnightEatenByDragonNameResponse value) {
        return new JAXBElement<AddKnightEatenByDragonNameResponse>(_AddKnightEatenByDragonNameResponse_QNAME, AddKnightEatenByDragonNameResponse.class, null, value);
    }

}
