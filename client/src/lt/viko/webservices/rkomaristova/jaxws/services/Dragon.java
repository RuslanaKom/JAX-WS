
package lt.viko.webservices.rkomaristova.jaxws.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for dragon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dragon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountOfGold" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="canFly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="knightsEaten" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="knight" type="{http://services.jaxws.rkomaristova.webservices.viko.lt/}knight" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="princessCurrentlyStolen" type="{http://services.jaxws.rkomaristova.webservices.viko.lt/}princess" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dragon", propOrder = {
    "amountOfGold",
    "canFly",
    "dateOfBirth",
    "knightsEaten",
    "name",
    "princessCurrentlyStolen"
})
public class Dragon {

    protected double amountOfGold;
    protected boolean canFly;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected Dragon.KnightsEaten knightsEaten;
    protected String name;
    protected Princess princessCurrentlyStolen;

    /**
     * Gets the value of the amountOfGold property.
     * 
     */
    public double getAmountOfGold() {
        return amountOfGold;
    }

    /**
     * Sets the value of the amountOfGold property.
     * 
     */
    public void setAmountOfGold(double value) {
        this.amountOfGold = value;
    }

    /**
     * Gets the value of the canFly property.
     * 
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * Sets the value of the canFly property.
     * 
     */
    public void setCanFly(boolean value) {
        this.canFly = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the knightsEaten property.
     * 
     * @return
     *     possible object is
     *     {@link Dragon.KnightsEaten }
     *     
     */
    public Dragon.KnightsEaten getKnightsEaten() {
        return knightsEaten;
    }

    /**
     * Sets the value of the knightsEaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dragon.KnightsEaten }
     *     
     */
    public void setKnightsEaten(Dragon.KnightsEaten value) {
        this.knightsEaten = value;
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
     * Gets the value of the princessCurrentlyStolen property.
     * 
     * @return
     *     possible object is
     *     {@link Princess }
     *     
     */
    public Princess getPrincessCurrentlyStolen() {
        return princessCurrentlyStolen;
    }

    /**
     * Sets the value of the princessCurrentlyStolen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Princess }
     *     
     */
    public void setPrincessCurrentlyStolen(Princess value) {
        this.princessCurrentlyStolen = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="knight" type="{http://services.jaxws.rkomaristova.webservices.viko.lt/}knight" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "knight"
    })
    public static class KnightsEaten {

        protected List<Knight> knight;

        /**
         * Gets the value of the knight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the knight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKnight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Knight }
         * 
         * 
         */
        public List<Knight> getKnight() {
            if (knight == null) {
                knight = new ArrayList<Knight>();
            }
            return this.knight;
        }

    }

}
