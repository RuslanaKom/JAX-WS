
package lt.viko.webservices.rkomaristova.jaxws.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for knight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="knight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nobleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfDragonsDefeated" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knight", propOrder = {
    "firstName",
    "nobleName",
    "numberOfDragonsDefeated",
    "title"
})
public class Knight {

    protected String firstName;
    protected String nobleName;
    protected int numberOfDragonsDefeated;
    protected String title;

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the nobleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNobleName() {
        return nobleName;
    }

    /**
     * Sets the value of the nobleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNobleName(String value) {
        this.nobleName = value;
    }

    /**
     * Gets the value of the numberOfDragonsDefeated property.
     * 
     */
    public int getNumberOfDragonsDefeated() {
        return numberOfDragonsDefeated;
    }

    /**
     * Sets the value of the numberOfDragonsDefeated property.
     * 
     */
    public void setNumberOfDragonsDefeated(int value) {
        this.numberOfDragonsDefeated = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
