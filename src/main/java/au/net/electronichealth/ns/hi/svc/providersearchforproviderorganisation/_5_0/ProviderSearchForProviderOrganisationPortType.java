
package au.net.electronichealth.ns.hi.svc.providersearchforproviderorganisation._5_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Holder;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ProductType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.SignatureContainerType;
import au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.TimestampType;
import au.net.electronichealth.ns.hi.xsd.common.qualifiedidentifier._3.QualifiedId;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProviderSearchForProviderOrganisationPortType", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderOrganisation/5.0.0")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    au.net.electronichealth.ns.hi.svc.providersearchforproviderorganisation._5_0.ObjectFactory.class,
    au.net.electronichealth.ns.hi.xsd.common.commoncoreelements._3.ObjectFactory.class,
    au.net.electronichealth.ns.hi.xsd.common.qualifiedidentifier._3.ObjectFactory.class,
    au.net.electronichealth.ns.hi.xsd.providercore.elements._3_2.ObjectFactory.class,
    au.net.electronichealth.ns.hi.xsd.providercore.providercoreelements._5_0.ObjectFactory.class,
    au.net.electronichealth.ns.hi.xsd.providermessages.searchorganisation._5_0.ObjectFactory.class,
    hi_override.org.w3.xmldsig.ObjectFactory.class,
    au.net.electronichealth.ns.hi.xsd.common.commoncoredatatypes._3.ObjectFactory.class
})
public interface ProviderSearchForProviderOrganisationPortType {


    /**
     * 
     * @param hpioHeader
     * @param productHeader
     * @param request
     * @param timestampHeader
     * @param userHeader
     * @param signatureHeader
     * @return
     *     returns au.net.electronichealth.ns.hi.svc.providersearchforproviderorganisation._5_0.SearchForProviderOrganisationResponse
     * @throws StandardErrorMsg
     */
    @WebMethod
    @WebResult(name = "searchForProviderOrganisationResponse", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderOrganisation/5.0.0", partName = "response")
    @Action(input = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderOrganisation/5.0.0/ProviderSearchForProviderOrganisationPortType/searchForProviderOrganisationRequest", output = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderOrganisation/5.0.0/ProviderSearchForProviderOrganisationPortType/searchForProviderOrganisationResponse", fault = {
        @FaultAction(className = StandardErrorMsg.class, value = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderOrganisation/5.0.0/ProviderSearchForProviderOrganisationPortType/searchForProviderOrganisation/Fault/standardError")
    })
    public SearchForProviderOrganisationResponse searchForProviderOrganisation(
        @WebParam(name = "searchForProviderOrganisation", targetNamespace = "http://ns.electronichealth.net.au/hi/svc/ProviderSearchForProviderOrganisation/5.0.0", partName = "request")
        SearchForProviderOrganisation request,
        @WebParam(name = "product", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", header = true, mode = WebParam.Mode.INOUT, partName = "productHeader")
        Holder<ProductType> productHeader,
        @WebParam(name = "timestamp", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", header = true, partName = "timestampHeader")
        TimestampType timestampHeader,
        @WebParam(name = "signature", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", header = true, mode = WebParam.Mode.INOUT, partName = "signatureHeader")
        Holder<SignatureContainerType> signatureHeader,
        @WebParam(name = "user", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", header = true, partName = "userHeader")
        QualifiedId userHeader,
        @WebParam(name = "hpio", targetNamespace = "http://ns.electronichealth.net.au/hi/xsd/common/CommonCoreElements/3.0", header = true, partName = "hpioHeader")
        QualifiedId hpioHeader)
        throws StandardErrorMsg
    ;

}