
package com.yjcloud.health.vcard.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yjcloud.health.vcard.webservices package. 
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

    private final static QName _DoService_QNAME = new QName("http://webservices.vcard.health.yjcloud.com/", "doService");
    private final static QName _DoServiceResponse_QNAME = new QName("http://webservices.vcard.health.yjcloud.com/", "doServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yjcloud.health.vcard.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DoService }
     * 
     */
    public DoService createDoService() {
        return new DoService();
    }

    /**
     * Create an instance of {@link DoServiceResponse }
     * 
     */
    public DoServiceResponse createDoServiceResponse() {
        return new DoServiceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.vcard.health.yjcloud.com/", name = "doService")
    public JAXBElement<DoService> createDoService(DoService value) {
        return new JAXBElement<DoService>(_DoService_QNAME, DoService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.vcard.health.yjcloud.com/", name = "doServiceResponse")
    public JAXBElement<DoServiceResponse> createDoServiceResponse(DoServiceResponse value) {
        return new JAXBElement<DoServiceResponse>(_DoServiceResponse_QNAME, DoServiceResponse.class, null, value);
    }

}
