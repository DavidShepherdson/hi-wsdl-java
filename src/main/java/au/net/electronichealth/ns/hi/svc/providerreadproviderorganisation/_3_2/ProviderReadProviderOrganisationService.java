
package au.net.electronichealth.ns.hi.svc.providerreadproviderorganisation._3_2;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProviderReadProviderOrganisationService", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderReadProviderOrganisation/3.2.0", wsdlLocation = "HI_ProviderReadProviderOrganisation-3.2.0.wsdl")
public class ProviderReadProviderOrganisationService
    extends Service
{

    private final static URL PROVIDERREADPROVIDERORGANISATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROVIDERREADPROVIDERORGANISATIONSERVICE_EXCEPTION;
    private final static QName PROVIDERREADPROVIDERORGANISATIONSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/hi/svc/ProviderReadProviderOrganisation/3.2.0", "ProviderReadProviderOrganisationService");

    static {
        PROVIDERREADPROVIDERORGANISATIONSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.hi.svc.providerreadproviderorganisation._3_2.ProviderReadProviderOrganisationService.class.getResource("HI_ProviderReadProviderOrganisation-3.2.0.wsdl");
        WebServiceException e = null;
        if (PROVIDERREADPROVIDERORGANISATIONSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'HI_ProviderReadProviderOrganisation-3.2.0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PROVIDERREADPROVIDERORGANISATIONSERVICE_EXCEPTION = e;
    }

    public ProviderReadProviderOrganisationService() {
        super(__getWsdlLocation(), PROVIDERREADPROVIDERORGANISATIONSERVICE_QNAME);
    }

    public ProviderReadProviderOrganisationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROVIDERREADPROVIDERORGANISATIONSERVICE_QNAME, features);
    }

    public ProviderReadProviderOrganisationService(URL wsdlLocation) {
        super(wsdlLocation, PROVIDERREADPROVIDERORGANISATIONSERVICE_QNAME);
    }

    public ProviderReadProviderOrganisationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROVIDERREADPROVIDERORGANISATIONSERVICE_QNAME, features);
    }

    public ProviderReadProviderOrganisationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderReadProviderOrganisationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProviderReadProviderOrganisationPortType
     */
    @WebEndpoint(name = "ProviderReadProviderOrganisationSOAP12Port")
    public ProviderReadProviderOrganisationPortType getProviderReadProviderOrganisationSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderReadProviderOrganisation/3.2.0", "ProviderReadProviderOrganisationSOAP12Port"), ProviderReadProviderOrganisationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderReadProviderOrganisationPortType
     */
    @WebEndpoint(name = "ProviderReadProviderOrganisationSOAP12Port")
    public ProviderReadProviderOrganisationPortType getProviderReadProviderOrganisationSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderReadProviderOrganisation/3.2.0", "ProviderReadProviderOrganisationSOAP12Port"), ProviderReadProviderOrganisationPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROVIDERREADPROVIDERORGANISATIONSERVICE_EXCEPTION!= null) {
            throw PROVIDERREADPROVIDERORGANISATIONSERVICE_EXCEPTION;
        }
        return PROVIDERREADPROVIDERORGANISATIONSERVICE_WSDL_LOCATION;
    }

}