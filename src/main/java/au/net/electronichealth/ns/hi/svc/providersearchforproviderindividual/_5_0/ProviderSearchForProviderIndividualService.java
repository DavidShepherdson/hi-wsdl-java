
package au.net.electronichealth.ns.hi.svc.providersearchforproviderindividual._5_0;

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
@WebServiceClient(name = "ProviderSearchForProviderIndividualService", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderIndividual/5.0.0", wsdlLocation = "HI_ProviderSearchForProviderIndividual-5.0.0.wsdl")
public class ProviderSearchForProviderIndividualService
    extends Service
{

    private final static URL PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_WSDL_LOCATION;
    private final static WebServiceException PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_EXCEPTION;
    private final static QName PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_QNAME = new QName("http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderIndividual/5.0.0", "ProviderSearchForProviderIndividualService");

    static {
        PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_WSDL_LOCATION = au.net.electronichealth.ns.hi.svc.providersearchforproviderindividual._5_0.ProviderSearchForProviderIndividualService.class.getResource("HI_ProviderSearchForProviderIndividual-5.0.0.wsdl");
        WebServiceException e = null;
        if (PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'HI_ProviderSearchForProviderIndividual-5.0.0.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_EXCEPTION = e;
    }

    public ProviderSearchForProviderIndividualService() {
        super(__getWsdlLocation(), PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_QNAME);
    }

    public ProviderSearchForProviderIndividualService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_QNAME, features);
    }

    public ProviderSearchForProviderIndividualService(URL wsdlLocation) {
        super(wsdlLocation, PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_QNAME);
    }

    public ProviderSearchForProviderIndividualService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_QNAME, features);
    }

    public ProviderSearchForProviderIndividualService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProviderSearchForProviderIndividualService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProviderSearchForProviderIndividualPortType
     */
    @WebEndpoint(name = "ProviderSearchForProviderIndividualSOAP12Port")
    public ProviderSearchForProviderIndividualPortType getProviderSearchForProviderIndividualSOAP12Port() {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderIndividual/5.0.0", "ProviderSearchForProviderIndividualSOAP12Port"), ProviderSearchForProviderIndividualPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProviderSearchForProviderIndividualPortType
     */
    @WebEndpoint(name = "ProviderSearchForProviderIndividualSOAP12Port")
    public ProviderSearchForProviderIndividualPortType getProviderSearchForProviderIndividualSOAP12Port(WebServiceFeature... features) {
        return super.getPort(new QName("http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderIndividual/5.0.0", "ProviderSearchForProviderIndividualSOAP12Port"), ProviderSearchForProviderIndividualPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_EXCEPTION!= null) {
            throw PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_EXCEPTION;
        }
        return PROVIDERSEARCHFORPROVIDERINDIVIDUALSERVICE_WSDL_LOCATION;
    }

}