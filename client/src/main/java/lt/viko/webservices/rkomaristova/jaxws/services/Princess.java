
package lt.viko.webservices.rkomaristova.jaxws.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for princess complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="princess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beautiful" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="kingdom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stolen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "princess", propOrder = {
    "beautiful",
    "kingdom",
    "name",
    "stolen"
})
public class Princess {

    protected boolean beautiful;
    protected String kingdom;
    protected String name;
    protected boolean stolen;

    /**
     * Gets the value of the beautiful property.
     * 
     */
    public boolean isBeautiful() {
        return beautiful;
    }

    /**
     * Sets the value of the beautiful property.
     * 
     */
    public void setBeautiful(boolean value) {
        this.beautiful = value;
    }

    /**
     * Gets the value of the kingdom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * Sets the value of the kingdom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKingdom(String value) {
        this.kingdom = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the stolen property.
     * 
     */
    public boolean isStolen() {
        return stolen;
    }

    /**
     * Sets the value of the stolen property.
     * 
     */
    public void setStolen(boolean value) {
        this.stolen = value;
    }

}
