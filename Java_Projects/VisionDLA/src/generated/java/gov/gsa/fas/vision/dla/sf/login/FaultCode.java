
package gov.gsa.fas.vision.dla.sf.login;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


/**
 * <p>Java class for FaultCode simple type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;simpleType name="FaultCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}QName">
 *     &lt;enumeration value="fns:APEX_TRIGGER_COUPLING_LIMIT"/>
 *     &lt;enumeration value="fns:API_CURRENTLY_DISABLED"/>
 *     &lt;enumeration value="fns:API_DISABLED_FOR_ORG"/>
 *     &lt;enumeration value="fns:ARGUMENT_OBJECT_PARSE_ERROR"/>
 *     &lt;enumeration value="fns:BATCH_PROCESSING_HALTED"/>
 *     &lt;enumeration value="fns:CANNOT_DELETE_OWNER"/>
 *     &lt;enumeration value="fns:CANT_ADD_STANDADRD_PORTAL_USER_TO_TERRITORY"/>
 *     &lt;enumeration value="fns:CANT_ADD_STANDARD_PORTAL_USER_TO_TERRITORY"/>
 *     &lt;enumeration value="fns:CIRCULAR_OBJECT_GRAPH"/>
 *     &lt;enumeration value="fns:CLIENT_NOT_ACCESSIBLE_FOR_USER"/>
 *     &lt;enumeration value="fns:CLIENT_REQUIRE_UPDATE_FOR_USER"/>
 *     &lt;enumeration value="fns:CUSTOM_METADATA_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="fns:DATACLOUD_API_CLIENT_EXCEPTION"/>
 *     &lt;enumeration value="fns:DATACLOUD_API_SERVER_BUSY_EXCEPTION"/>
 *     &lt;enumeration value="fns:DATACLOUD_API_SERVER_EXCEPTION"/>
 *     &lt;enumeration value="fns:DATACLOUD_API_UNAVAILABLE"/>
 *     &lt;enumeration value="fns:DUPLICATE_ARGUMENT_VALUE"/>
 *     &lt;enumeration value="fns:DUPLICATE_VALUE"/>
 *     &lt;enumeration value="fns:EMAIL_BATCH_SIZE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="fns:EMAIL_TO_CASE_INVALID_ROUTING"/>
 *     &lt;enumeration value="fns:EMAIL_TO_CASE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="fns:EMAIL_TO_CASE_NOT_ENABLED"/>
 *     &lt;enumeration value="fns:ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"/>
 *     &lt;enumeration value="fns:EXCEEDED_ID_LIMIT"/>
 *     &lt;enumeration value="fns:EXCEEDED_LEAD_CONVERT_LIMIT"/>
 *     &lt;enumeration value="fns:EXCEEDED_MAX_SIZE_REQUEST"/>
 *     &lt;enumeration value="fns:EXCEEDED_MAX_TYPES_LIMIT"/>
 *     &lt;enumeration value="fns:EXCEEDED_QUOTA"/>
 *     &lt;enumeration value="fns:EXTERNAL_OBJECT_AUTHENTICATION_EXCEPTION"/>
 *     &lt;enumeration value="fns:EXTERNAL_OBJECT_CONNECTION_EXCEPTION"/>
 *     &lt;enumeration value="fns:EXTERNAL_OBJECT_EXCEPTION"/>
 *     &lt;enumeration value="fns:EXTERNAL_OBJECT_UNSUPPORTED_EXCEPTION"/>
 *     &lt;enumeration value="fns:FEDERATED_SEARCH_ERROR"/>
 *     &lt;enumeration value="fns:FEED_NOT_ENABLED_FOR_OBJECT"/>
 *     &lt;enumeration value="fns:FUNCTIONALITY_NOT_ENABLED"/>
 *     &lt;enumeration value="fns:FUNCTIONALITY_TEMPORARILY_UNAVAILABLE"/>
 *     &lt;enumeration value="fns:ILLEGAL_QUERY_PARAMETER_VALUE"/>
 *     &lt;enumeration value="fns:INACTIVE_OWNER_OR_USER"/>
 *     &lt;enumeration value="fns:INACTIVE_PORTAL"/>
 *     &lt;enumeration value="fns:INSUFFICIENT_ACCESS"/>
 *     &lt;enumeration value="fns:INVALID_ASSIGNMENT_RULE"/>
 *     &lt;enumeration value="fns:INVALID_BATCH_REQUEST"/>
 *     &lt;enumeration value="fns:INVALID_BATCH_SIZE"/>
 *     &lt;enumeration value="fns:INVALID_CLIENT"/>
 *     &lt;enumeration value="fns:INVALID_CROSS_REFERENCE_KEY"/>
 *     &lt;enumeration value="fns:INVALID_FIELD"/>
 *     &lt;enumeration value="fns:INVALID_FILTER_LANGUAGE"/>
 *     &lt;enumeration value="fns:INVALID_FILTER_VALUE"/>
 *     &lt;enumeration value="fns:INVALID_ID_FIELD"/>
 *     &lt;enumeration value="fns:INVALID_INPUT_COMBINATION"/>
 *     &lt;enumeration value="fns:INVALID_LOCALE_LANGUAGE"/>
 *     &lt;enumeration value="fns:INVALID_LOCATOR"/>
 *     &lt;enumeration value="fns:INVALID_LOGIN"/>
 *     &lt;enumeration value="fns:INVALID_MULTIPART_REQUEST"/>
 *     &lt;enumeration value="fns:INVALID_NEW_PASSWORD"/>
 *     &lt;enumeration value="fns:INVALID_OPERATION"/>
 *     &lt;enumeration value="fns:INVALID_OPERATION_WITH_EXPIRED_PASSWORD"/>
 *     &lt;enumeration value="fns:INVALID_PAGING_OPTION"/>
 *     &lt;enumeration value="fns:INVALID_QUERY_FILTER_OPERATOR"/>
 *     &lt;enumeration value="fns:INVALID_QUERY_LOCATOR"/>
 *     &lt;enumeration value="fns:INVALID_QUERY_SCOPE"/>
 *     &lt;enumeration value="fns:INVALID_REPLICATION_DATE"/>
 *     &lt;enumeration value="fns:INVALID_SEARCH"/>
 *     &lt;enumeration value="fns:INVALID_SEARCH_SCOPE"/>
 *     &lt;enumeration value="fns:INVALID_SESSION_ID"/>
 *     &lt;enumeration value="fns:INVALID_SOAP_HEADER"/>
 *     &lt;enumeration value="fns:INVALID_SORT_OPTION"/>
 *     &lt;enumeration value="fns:INVALID_SSO_GATEWAY_URL"/>
 *     &lt;enumeration value="fns:INVALID_TYPE"/>
 *     &lt;enumeration value="fns:INVALID_TYPE_FOR_OPERATION"/>
 *     &lt;enumeration value="fns:JIGSAW_ACTION_DISABLED"/>
 *     &lt;enumeration value="fns:JIGSAW_IMPORT_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="fns:JIGSAW_REQUEST_NOT_SUPPORTED"/>
 *     &lt;enumeration value="fns:JSON_PARSER_ERROR"/>
 *     &lt;enumeration value="fns:LICENSING_UNKNOWN_ERROR"/>
 *     &lt;enumeration value="fns:LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="fns:LOGIN_CHALLENGE_ISSUED"/>
 *     &lt;enumeration value="fns:LOGIN_CHALLENGE_PENDING"/>
 *     &lt;enumeration value="fns:LOGIN_DURING_RESTRICTED_DOMAIN"/>
 *     &lt;enumeration value="fns:LOGIN_DURING_RESTRICTED_TIME"/>
 *     &lt;enumeration value="fns:LOGIN_MUST_USE_SECURITY_TOKEN"/>
 *     &lt;enumeration value="fns:MALFORMED_ID"/>
 *     &lt;enumeration value="fns:MALFORMED_QUERY"/>
 *     &lt;enumeration value="fns:MALFORMED_SEARCH"/>
 *     &lt;enumeration value="fns:MISSING_ARGUMENT"/>
 *     &lt;enumeration value="fns:MISSING_RECORD"/>
 *     &lt;enumeration value="fns:MUTUAL_AUTHENTICATION_FAILED"/>
 *     &lt;enumeration value="fns:NOT_MODIFIED"/>
 *     &lt;enumeration value="fns:NO_SOFTPHONE_LAYOUT"/>
 *     &lt;enumeration value="fns:NUMBER_OUTSIDE_VALID_RANGE"/>
 *     &lt;enumeration value="fns:OPERATION_TOO_LARGE"/>
 *     &lt;enumeration value="fns:ORG_IN_MAINTENANCE"/>
 *     &lt;enumeration value="fns:ORG_IS_DOT_ORG"/>
 *     &lt;enumeration value="fns:ORG_IS_SIGNING_UP"/>
 *     &lt;enumeration value="fns:ORG_LOCKED"/>
 *     &lt;enumeration value="fns:ORG_NOT_OWNED_BY_INSTANCE"/>
 *     &lt;enumeration value="fns:PASSWORD_LOCKOUT"/>
 *     &lt;enumeration value="fns:PORTAL_NO_ACCESS"/>
 *     &lt;enumeration value="fns:POST_BODY_PARSE_ERROR"/>
 *     &lt;enumeration value="fns:QUERY_TIMEOUT"/>
 *     &lt;enumeration value="fns:QUERY_TOO_COMPLICATED"/>
 *     &lt;enumeration value="fns:REQUEST_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="fns:REQUEST_RUNNING_TOO_LONG"/>
 *     &lt;enumeration value="fns:SERVER_UNAVAILABLE"/>
 *     &lt;enumeration value="fns:SOCIALCRM_FEEDSERVICE_API_CLIENT_EXCEPTION"/>
 *     &lt;enumeration value="fns:SOCIALCRM_FEEDSERVICE_API_SERVER_EXCEPTION"/>
 *     &lt;enumeration value="fns:SOCIALCRM_FEEDSERVICE_API_UNAVAILABLE"/>
 *     &lt;enumeration value="fns:SSO_SERVICE_DOWN"/>
 *     &lt;enumeration value="fns:TOO_MANY_APEX_REQUESTS"/>
 *     &lt;enumeration value="fns:TOO_MANY_RECIPIENTS"/>
 *     &lt;enumeration value="fns:TOO_MANY_RECORDS"/>
 *     &lt;enumeration value="fns:TRIAL_EXPIRED"/>
 *     &lt;enumeration value="fns:UNABLE_TO_LOCK_ROW"/>
 *     &lt;enumeration value="fns:UNKNOWN_ATTACHMENT_EXCEPTION"/>
 *     &lt;enumeration value="fns:UNKNOWN_EXCEPTION"/>
 *     &lt;enumeration value="fns:UNSUPPORTED_API_VERSION"/>
 *     &lt;enumeration value="fns:UNSUPPORTED_ATTACHMENT_ENCODING"/>
 *     &lt;enumeration value="fns:UNSUPPORTED_CLIENT"/>
 *     &lt;enumeration value="fns:UNSUPPORTED_MEDIA_TYPE"/>
 *     &lt;enumeration value="fns:XML_PARSER_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultCode", namespace = "urn:fault.partner.soap.sforce.com", propOrder = {
    "value"
})
public class FaultCode {

    @XmlValue
    protected QName value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setValue(QName value) {
        this.value = value;
    }

}
