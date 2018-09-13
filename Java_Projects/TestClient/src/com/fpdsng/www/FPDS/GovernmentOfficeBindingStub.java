/**
 * GovernmentOfficeBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fpdsng.www.FPDS;

public class GovernmentOfficeBindingStub extends org.apache.axis.client.Stub implements com.fpdsng.www.FPDS.GovernmentOfficePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOffice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeType"), com.fpdsng.www.FPDS.GovernmentOfficeType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "createGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createContractingOffice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOffice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeType"), com.fpdsng.www.FPDS.GovernmentOfficeType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "createGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "createGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOffice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeType"), com.fpdsng.www.FPDS.GovernmentOfficeType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("get");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOfficeKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType"), com.fpdsng.www.FPDS.GovernmentOfficeKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "getGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOfficeSearchCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeSearchCriteriaType"), com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "getListGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getListGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("exists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOfficeKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType"), com.fpdsng.www.FPDS.GovernmentOfficeKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "existsGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "existsGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOfficeKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType"), com.fpdsng.www.FPDS.GovernmentOfficeKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "deleteGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("disable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOfficeKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType"), com.fpdsng.www.FPDS.GovernmentOfficeKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "disableGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "disableGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("enable");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "governmentOfficeKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType"), com.fpdsng.www.FPDS.GovernmentOfficeKeyType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "enableGovernmentOfficeResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enableGovernmentOfficeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateOrganizationAssociations");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authenticationKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType"), com.fpdsng.www.FPDS.UserAuthenticationKeyType.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOfUpdateOrganizationAssociations"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfUpdateOrganizationAssociationsType"), com.fpdsng.www.FPDS.UpdateOrganizationAssociationType[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociation"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociationsResponseType"));
        oper.setReturnClass(com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "updateOrganizationAssociationsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    public GovernmentOfficeBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public GovernmentOfficeBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public GovernmentOfficeBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "addressType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.AddressType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "agencyIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "agencyNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "agencyType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.AgencyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "auditInformationType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.AuditInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "cityType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "contractingOfficeIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countryCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countryNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countryShortCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countryType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.CountryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "countType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.CountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "createGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "deleteGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "departmentType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.DepartmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "disableGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "elementNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "emailAddressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "enableGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "errorType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ErrorType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "existsGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "firstNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "FPDSDateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionIDType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.FunctionalDimensionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionValueDescriptionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionValueIDType");
            cachedSerQNames.add(qName);
            cls = int.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionalDimensionValueType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "functionNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "getGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "getListGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeFunctionalDimensionalValueType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GovernmentOfficeFunctionalDimensionalValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeKeyType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GovernmentOfficeKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeSearchCriteriaType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GovernmentOfficeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentUserProfileType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GovernmentUserProfileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "infoType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.InfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "lastNameOrFamilyNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfAdministratorsType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userIDType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "administrator");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfAgenciesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfAgenciesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfChildOrganizationsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.OrganizationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfCountriesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfCountriesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfDepartmentsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfDepartmentsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfErrorsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ErrorType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "errorType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfFunctionalDimensionsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfFunctionalDimensionsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfGovernmentOfficeFunctionalDimensionalValueType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.GovernmentOfficeFunctionalDimensionalValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeFunctionalDimensionalValueType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "governmentOfficeFunctionalDimensionalValue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfGovernmentOfficesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfGovernmentOfficesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfInfoMessagesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.InfoType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "infoType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "info");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfOrganizationsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfOrganizationsType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfParametersType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ParameterType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parameterType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfPlacesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfPlacesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfSearchResults");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfSearchResults.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfUpdateOrganizationAssociationsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UpdateOrganizationAssociationType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociationType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfUserPrivilegesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UserPrivilegeType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userPrivilegeType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userPrivilege");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfUsersType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ListOfUsersType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "listOfWarningsType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.WarningType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warningType");
            qName2 = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warning");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "locationCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "messageCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "messageType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "middleInitialType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "objectNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "officeIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationalCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationalNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationCategoryIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "organizationType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.OrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "outputMessagesType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.OutputMessagesType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parameterType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ParameterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "parentOrganizationType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ParentOrganizationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "passwordAuditInformationType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.PasswordAuditInformationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "passwordType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "phoneExtType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "phoneNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeCodeType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.PlaceCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "placeType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.PlaceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "provinceType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "publicUserProfileType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.PublicUserProfileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "rankIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "recvEmailFlagType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "regionCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "requirementStateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "responseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.ResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "roleLevelType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "roleNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "roomNoType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "routingSymbolType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "sequenceNumberType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.NonNegativeInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "stateType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "streetAddressType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "systemUserProfileType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.SystemUserProfileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "typeOfUserType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.TypeOfUserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "unitNameType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateGovernmentOfficeResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociationsResponseType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "updateOrganizationAssociationType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UpdateOrganizationAssociationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userAuthenticationKeyType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UserAuthenticationKeyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userHeaderType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UserHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userIDType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userPrivilegeType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UserPrivilegeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userProfileType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UserProfileType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userTitleType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "userType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.UserType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "warningType");
            cachedSerQNames.add(qName);
            cls = com.fpdsng.www.FPDS.WarningType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.fpdsng.com/FPDS", "ZIPCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType create(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOffice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType createContractingOffice(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "createContractingOffice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOffice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.CreateGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType update(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeType governmentOffice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOffice});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.UpdateGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType get(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "get"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOfficeKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.GetGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType getList(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeSearchCriteriaType governmentOfficeSearchCriteria) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "getList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOfficeSearchCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.GetListGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType exists(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "exists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOfficeKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.ExistsGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType delete(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOfficeKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.DeleteGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType disable(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "disable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOfficeKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.DisableGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType enable(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.GovernmentOfficeKeyType governmentOfficeKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "enable"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, governmentOfficeKey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.EnableGovernmentOfficeResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType updateOrganizationAssociations(com.fpdsng.www.FPDS.UserAuthenticationKeyType authenticationKey, com.fpdsng.www.FPDS.UpdateOrganizationAssociationType[] listOfUpdateOrganizationAssociations) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:FPDS.BusinessServices.DataCollection.organizations.GovernmentOffice", "updateOrganizationAssociations"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authenticationKey, listOfUpdateOrganizationAssociations});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType) org.apache.axis.utils.JavaUtils.convert(_resp, com.fpdsng.www.FPDS.UpdateOrganizationAssociationsResponseType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
