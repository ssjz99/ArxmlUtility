//
// ????? JavaTM Architecture for XML Binding (JAXB) ???? v2.2.8-b130911.1802 ???
// ??? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// ?????????, ??????????????
// ????: 2018.03.12 ?? 11:42:22 PM CET 
//


package Ar421;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IDENTIFIABLE--SUBTYPES-ENUM? Java ??
 * 
 * <p>????????????????????
 * <p>
 * <pre>
 * &lt;simpleType name="IDENTIFIABLE--SUBTYPES-ENUM">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AR-ELEMENT"/>
 *     &lt;enumeration value="AR-PACKAGE"/>
 *     &lt;enumeration value="ABSTRACT-CAN-CLUSTER"/>
 *     &lt;enumeration value="ABSTRACT-CAN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="ABSTRACT-CAN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="ABSTRACT-CAN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="ABSTRACT-EVENT"/>
 *     &lt;enumeration value="ABSTRACT-PROVIDED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="ABSTRACT-REQUIRED-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="ABSTRACT-SERVICE-INSTANCE"/>
 *     &lt;enumeration value="ACL-OBJECT-SET"/>
 *     &lt;enumeration value="ACL-OPERATION"/>
 *     &lt;enumeration value="ACL-PERMISSION"/>
 *     &lt;enumeration value="ACL-ROLE"/>
 *     &lt;enumeration value="AGE-CONSTRAINT"/>
 *     &lt;enumeration value="ALIAS-NAME-SET"/>
 *     &lt;enumeration value="ANALYZED-EXECUTION-TIME"/>
 *     &lt;enumeration value="APPLICATION-ARRAY-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-ARRAY-ELEMENT"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="APPLICATION-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-ENDPOINT"/>
 *     &lt;enumeration value="APPLICATION-ERROR"/>
 *     &lt;enumeration value="APPLICATION-PRIMITIVE-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-DATA-TYPE"/>
 *     &lt;enumeration value="APPLICATION-RECORD-ELEMENT"/>
 *     &lt;enumeration value="APPLICATION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ARBITRARY-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="ARGUMENT-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="ASSEMBLY-SW-CONNECTOR"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-POINT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"/>
 *     &lt;enumeration value="ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="ATOMIC-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ATP-BLUEPRINT"/>
 *     &lt;enumeration value="ATP-BLUEPRINTABLE"/>
 *     &lt;enumeration value="ATP-CLASSIFIER"/>
 *     &lt;enumeration value="ATP-FEATURE"/>
 *     &lt;enumeration value="ATP-PROTOTYPE"/>
 *     &lt;enumeration value="ATP-STRUCTURE-ELEMENT"/>
 *     &lt;enumeration value="ATP-TYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="AUTOSAR-DATA-TYPE"/>
 *     &lt;enumeration value="AUTOSAR-OPERATION-ARGUMENT-INSTANCE"/>
 *     &lt;enumeration value="AUTOSAR-VARIABLE-INSTANCE"/>
 *     &lt;enumeration value="BACKGROUND-EVENT"/>
 *     &lt;enumeration value="BASE-TYPE"/>
 *     &lt;enumeration value="BLUEPRINT-MAPPING-SET"/>
 *     &lt;enumeration value="BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"/>
 *     &lt;enumeration value="BSW-BACKGROUND-EVENT"/>
 *     &lt;enumeration value="BSW-CALLED-ENTITY"/>
 *     &lt;enumeration value="BSW-DATA-RECEIVED-EVENT"/>
 *     &lt;enumeration value="BSW-DEBUG-INFO"/>
 *     &lt;enumeration value="BSW-EVENT"/>
 *     &lt;enumeration value="BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="BSW-IMPLEMENTATION"/>
 *     &lt;enumeration value="BSW-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="BSW-INTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="BSW-INTERNAL-TRIGGERING-POINT"/>
 *     &lt;enumeration value="BSW-INTERRUPT-ENTITY"/>
 *     &lt;enumeration value="BSW-MGR-NEEDS"/>
 *     &lt;enumeration value="BSW-MODE-MANAGER-ERROR-EVENT"/>
 *     &lt;enumeration value="BSW-MODE-SWITCH-EVENT"/>
 *     &lt;enumeration value="BSW-MODE-SWITCHED-ACK-EVENT"/>
 *     &lt;enumeration value="BSW-MODULE-DEPENDENCY"/>
 *     &lt;enumeration value="BSW-MODULE-DESCRIPTION"/>
 *     &lt;enumeration value="BSW-MODULE-ENTITY"/>
 *     &lt;enumeration value="BSW-MODULE-ENTRY"/>
 *     &lt;enumeration value="BSW-MODULE-TIMING"/>
 *     &lt;enumeration value="BSW-OPERATION-INVOKED-EVENT"/>
 *     &lt;enumeration value="BSW-SCHEDULABLE-ENTITY"/>
 *     &lt;enumeration value="BSW-SCHEDULE-EVENT"/>
 *     &lt;enumeration value="BSW-SERVICE-DEPENDENCY-IDENT"/>
 *     &lt;enumeration value="BSW-TIMING-EVENT"/>
 *     &lt;enumeration value="BUILD-ACTION"/>
 *     &lt;enumeration value="BUILD-ACTION-ENTITY"/>
 *     &lt;enumeration value="BUILD-ACTION-ENVIRONMENT"/>
 *     &lt;enumeration value="BUILD-ACTION-MANIFEST"/>
 *     &lt;enumeration value="BURST-PATTERN-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="CALIBRATION-PARAMETER-VALUE-SET"/>
 *     &lt;enumeration value="CAN-CLUSTER"/>
 *     &lt;enumeration value="CAN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="CAN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="CAN-FRAME"/>
 *     &lt;enumeration value="CAN-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="CAN-NM-CLUSTER"/>
 *     &lt;enumeration value="CAN-NM-NODE"/>
 *     &lt;enumeration value="CAN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="CAN-TP-ADDRESS"/>
 *     &lt;enumeration value="CAN-TP-CHANNEL"/>
 *     &lt;enumeration value="CAN-TP-CONFIG"/>
 *     &lt;enumeration value="CAN-TP-NODE"/>
 *     &lt;enumeration value="CHAPTER"/>
 *     &lt;enumeration value="CLIENT-ID-DEFINITION"/>
 *     &lt;enumeration value="CLIENT-ID-DEFINITION-SET"/>
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE"/>
 *     &lt;enumeration value="CLIENT-SERVER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="CLIENT-SERVER-OPERATION"/>
 *     &lt;enumeration value="CODE"/>
 *     &lt;enumeration value="COLLECTABLE-ELEMENT"/>
 *     &lt;enumeration value="COLLECTION"/>
 *     &lt;enumeration value="COM-MGR-USER-NEEDS"/>
 *     &lt;enumeration value="COMM-CONNECTOR-PORT"/>
 *     &lt;enumeration value="COMMUNICATION-CLUSTER"/>
 *     &lt;enumeration value="COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="COMPILER"/>
 *     &lt;enumeration value="COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPOSITION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="COMPU-METHOD"/>
 *     &lt;enumeration value="CONCRETE-PATTERN-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="CONSISTENCY-NEEDS"/>
 *     &lt;enumeration value="CONSISTENCY-NEEDS-BLUEPRINT-SET"/>
 *     &lt;enumeration value="CONSTANT-SPECIFICATION"/>
 *     &lt;enumeration value="CONSTANT-SPECIFICATION-MAPPING-SET"/>
 *     &lt;enumeration value="CONSUMED-EVENT-GROUP"/>
 *     &lt;enumeration value="CONSUMED-SERVICE-INSTANCE"/>
 *     &lt;enumeration value="CONTAINER-I-PDU"/>
 *     &lt;enumeration value="COUPLING-ELEMENT"/>
 *     &lt;enumeration value="COUPLING-PORT"/>
 *     &lt;enumeration value="COUPLING-PORT-FIFO"/>
 *     &lt;enumeration value="COUPLING-PORT-SCHEDULER"/>
 *     &lt;enumeration value="COUPLING-PORT-SHAPER"/>
 *     &lt;enumeration value="COUPLING-PORT-STRUCTURAL-ELEMENT"/>
 *     &lt;enumeration value="CRYPTO-SERVICE-NEEDS"/>
 *     &lt;enumeration value="DATA-CONSTR"/>
 *     &lt;enumeration value="DATA-INTERFACE"/>
 *     &lt;enumeration value="DATA-PROTOTYPE"/>
 *     &lt;enumeration value="DATA-PROTOTYPE-GROUP"/>
 *     &lt;enumeration value="DATA-RECEIVE-ERROR-EVENT"/>
 *     &lt;enumeration value="DATA-RECEIVED-EVENT"/>
 *     &lt;enumeration value="DATA-SEND-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DATA-TRANSFORMATION"/>
 *     &lt;enumeration value="DATA-TRANSFORMATION-SET"/>
 *     &lt;enumeration value="DATA-TYPE-MAPPING-SET"/>
 *     &lt;enumeration value="DATA-WRITE-COMPLETED-EVENT"/>
 *     &lt;enumeration value="DCM-I-PDU"/>
 *     &lt;enumeration value="DELEGATION-SW-CONNECTOR"/>
 *     &lt;enumeration value="DEPENDENCY-ON-ARTIFACT"/>
 *     &lt;enumeration value="DIAG-EVENT-DEBOUNCE-ALGORITHM"/>
 *     &lt;enumeration value="DIAG-EVENT-DEBOUNCE-COUNTER-BASED"/>
 *     &lt;enumeration value="DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL"/>
 *     &lt;enumeration value="DIAG-EVENT-DEBOUNCE-TIME-BASED"/>
 *     &lt;enumeration value="DIAGNOSTIC-ABSTRACT-DATA-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-ACCESS-PERMISSION"/>
 *     &lt;enumeration value="DIAGNOSTIC-AGING"/>
 *     &lt;enumeration value="DIAGNOSTIC-CAPABILITY-ELEMENT"/>
 *     &lt;enumeration value="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION"/>
 *     &lt;enumeration value="DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-COM-CONTROL"/>
 *     &lt;enumeration value="DIAGNOSTIC-COM-CONTROL-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-COMMON-ELEMENT"/>
 *     &lt;enumeration value="DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONDITION"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONDITION-GROUP"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONNECTED-INDICATOR"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONNECTION"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONTRIBUTION-SET"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONTROL-DTC-SETTING"/>
 *     &lt;enumeration value="DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-CUSTOM-SERVICE-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-DATA-BY-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-DATA-ELEMENT"/>
 *     &lt;enumeration value="DIAGNOSTIC-DATA-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-DATA-IDENTIFIER-SET"/>
 *     &lt;enumeration value="DIAGNOSTIC-DATA-TRANSFER"/>
 *     &lt;enumeration value="DIAGNOSTIC-DATA-TRANSFER-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-ECU-RESET"/>
 *     &lt;enumeration value="DIAGNOSTIC-ECU-RESET-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-ENABLE-CONDITION"/>
 *     &lt;enumeration value="DIAGNOSTIC-ENABLE-CONDITION-GROUP"/>
 *     &lt;enumeration value="DIAGNOSTIC-ENABLE-CONDITION-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-INFO-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-MANAGER-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-PORT-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-EXTENDED-DATA-RECORD"/>
 *     &lt;enumeration value="DIAGNOSTIC-FREEZE-FRAME"/>
 *     &lt;enumeration value="DIAGNOSTIC-IO-CONTROL"/>
 *     &lt;enumeration value="DIAGNOSTIC-INDICATOR"/>
 *     &lt;enumeration value="DIAGNOSTIC-IO-CONTROL-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-IO-CONTROL-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-ADDRESSABLE-RANGE-ACCESS"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-BY-ADDRESS"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED"/>
 *     &lt;enumeration value="DIAGNOSTIC-MEMORY-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-OPERATION-CYCLE"/>
 *     &lt;enumeration value="DIAGNOSTIC-OPERATION-CYCLE-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-DTC-INFORMATION"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-DTC-INFORMATION-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-DATA-BY-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS"/>
 *     &lt;enumeration value="DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-DOWNLOAD"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-FILE-TRANSFER"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-ROUTINE-RESULTS"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-UPLOAD"/>
 *     &lt;enumeration value="DIAGNOSTIC-REQUEST-UPLOAD-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-RESPONSE-ON-EVENT"/>
 *     &lt;enumeration value="DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-ROUTINE"/>
 *     &lt;enumeration value="DIAGNOSTIC-ROUTINE-CONTROL"/>
 *     &lt;enumeration value="DIAGNOSTIC-ROUTINE-CONTROL-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-ROUTINE-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-SECURITY-ACCESS"/>
 *     &lt;enumeration value="DIAGNOSTIC-SECURITY-ACCESS-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-SECURITY-LEVEL"/>
 *     &lt;enumeration value="DIAGNOSTIC-SERVICE-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-SERVICE-DATA-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-SERVICE-INSTANCE"/>
 *     &lt;enumeration value="DIAGNOSTIC-SERVICE-SW-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-SERVICE-TABLE"/>
 *     &lt;enumeration value="DIAGNOSTIC-SESSION"/>
 *     &lt;enumeration value="DIAGNOSTIC-SESSION-CONTROL"/>
 *     &lt;enumeration value="DIAGNOSTIC-SESSION-CONTROL-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-START-ROUTINE"/>
 *     &lt;enumeration value="DIAGNOSTIC-STOP-ROUTINE"/>
 *     &lt;enumeration value="DIAGNOSTIC-STORAGE-CONDITION"/>
 *     &lt;enumeration value="DIAGNOSTIC-STORAGE-CONDITION-GROUP"/>
 *     &lt;enumeration value="DIAGNOSTIC-STORAGE-CONDITION-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-SW-MAPPING"/>
 *     &lt;enumeration value="DIAGNOSTIC-TRANSFER-EXIT"/>
 *     &lt;enumeration value="DIAGNOSTIC-TRANSFER-EXIT-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-GROUP"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-J-1939"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-OBD"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-PROPS"/>
 *     &lt;enumeration value="DIAGNOSTIC-TROUBLE-CODE-UDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-VALUE-NEEDS"/>
 *     &lt;enumeration value="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER"/>
 *     &lt;enumeration value="DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS"/>
 *     &lt;enumeration value="DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS"/>
 *     &lt;enumeration value="DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS"/>
 *     &lt;enumeration value="DLT-USER-NEEDS"/>
 *     &lt;enumeration value="DO-IP-ACTIVATION-LINE-NEEDS"/>
 *     &lt;enumeration value="DO-IP-GID-NEEDS"/>
 *     &lt;enumeration value="DO-IP-GID-SYNCHRONIZATION-NEEDS"/>
 *     &lt;enumeration value="DO-IP-POWER-MODE-STATUS-NEEDS"/>
 *     &lt;enumeration value="DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS"/>
 *     &lt;enumeration value="DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS"/>
 *     &lt;enumeration value="DO-IP-SERVICE-NEEDS"/>
 *     &lt;enumeration value="DOCUMENTATION"/>
 *     &lt;enumeration value="DTC-STATUS-CHANGE-NOTIFICATION-NEEDS"/>
 *     &lt;enumeration value="ECU-MAPPING"/>
 *     &lt;enumeration value="EOC-EVENT-REF"/>
 *     &lt;enumeration value="EOC-EXECUTABLE-ENTITY-REF"/>
 *     &lt;enumeration value="EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"/>
 *     &lt;enumeration value="EOC-EXECUTABLE-ENTITY-REF-GROUP"/>
 *     &lt;enumeration value="ECU-ABSTRACTION-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="ECU-INSTANCE"/>
 *     &lt;enumeration value="ECU-PARTITION"/>
 *     &lt;enumeration value="ECU-STATE-MGR-USER-NEEDS"/>
 *     &lt;enumeration value="ECU-TIMING"/>
 *     &lt;enumeration value="ECUC-ABSTRACT-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-ABSTRACT-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-ADD-INFO-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-BOOLEAN-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-CHOICE-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-CHOICE-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-COMMON-ATTRIBUTES"/>
 *     &lt;enumeration value="ECUC-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-CONTAINER-VALUE"/>
 *     &lt;enumeration value="ECUC-DEFINITION-COLLECTION"/>
 *     &lt;enumeration value="ECUC-DEFINITION-ELEMENT"/>
 *     &lt;enumeration value="ECUC-DESTINATION-URI-DEF"/>
 *     &lt;enumeration value="ECUC-DESTINATION-URI-DEF-SET"/>
 *     &lt;enumeration value="ECUC-ENUMERATION-LITERAL-DEF"/>
 *     &lt;enumeration value="ECUC-ENUMERATION-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-FLOAT-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-FOREIGN-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-FUNCTION-NAME-DEF"/>
 *     &lt;enumeration value="ECUC-INSTANCE-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-INTEGER-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-LINKER-SYMBOL-DEF"/>
 *     &lt;enumeration value="ECUC-MODULE-CONFIGURATION-VALUES"/>
 *     &lt;enumeration value="ECUC-MODULE-DEF"/>
 *     &lt;enumeration value="ECUC-MULTILINE-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-PARAM-CONF-CONTAINER-DEF"/>
 *     &lt;enumeration value="ECUC-PARAMETER-DEF"/>
 *     &lt;enumeration value="ECUC-QUERY"/>
 *     &lt;enumeration value="ECUC-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-STRING-PARAM-DEF"/>
 *     &lt;enumeration value="ECUC-SYMBOLIC-NAME-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-URI-REFERENCE-DEF"/>
 *     &lt;enumeration value="ECUC-VALIDATION-CONDITION"/>
 *     &lt;enumeration value="ECUC-VALUE-COLLECTION"/>
 *     &lt;enumeration value="END-TO-END-PROTECTION"/>
 *     &lt;enumeration value="END-TO-END-PROTECTION-SET"/>
 *     &lt;enumeration value="ETHERNET-CLUSTER"/>
 *     &lt;enumeration value="ETHERNET-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="ETHERNET-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="ETHERNET-FRAME"/>
 *     &lt;enumeration value="ETHERNET-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="ETHERNET-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="EVALUATED-VARIANT-SET"/>
 *     &lt;enumeration value="EVENT-TRIGGERING-CONSTRAINT"/>
 *     &lt;enumeration value="EXCLUSIVE-AREA"/>
 *     &lt;enumeration value="EXECUTABLE-ENTITY"/>
 *     &lt;enumeration value="EXECUTION-ORDER-CONSTRAINT"/>
 *     &lt;enumeration value="EXECUTION-TIME"/>
 *     &lt;enumeration value="EXECUTION-TIME-CONSTRAINT"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="EXTERNAL-TRIGGERING-POINT-IDENT"/>
 *     &lt;enumeration value="FM-ATTRIBUTE-DEF"/>
 *     &lt;enumeration value="FM-FEATURE"/>
 *     &lt;enumeration value="FM-FEATURE-MAP"/>
 *     &lt;enumeration value="FM-FEATURE-MAP-ASSERTION"/>
 *     &lt;enumeration value="FM-FEATURE-MAP-CONDITION"/>
 *     &lt;enumeration value="FM-FEATURE-MAP-ELEMENT"/>
 *     &lt;enumeration value="FM-FEATURE-MODEL"/>
 *     &lt;enumeration value="FM-FEATURE-RELATION"/>
 *     &lt;enumeration value="FM-FEATURE-RESTRICTION"/>
 *     &lt;enumeration value="FM-FEATURE-SELECTION"/>
 *     &lt;enumeration value="FM-FEATURE-SELECTION-SET"/>
 *     &lt;enumeration value="FIBEX-ELEMENT"/>
 *     &lt;enumeration value="FLAT-INSTANCE-DESCRIPTOR"/>
 *     &lt;enumeration value="FLAT-MAP"/>
 *     &lt;enumeration value="FLEXRAY-AR-TP-CONFIG"/>
 *     &lt;enumeration value="FLEXRAY-AR-TP-NODE"/>
 *     &lt;enumeration value="FLEXRAY-CLUSTER"/>
 *     &lt;enumeration value="FLEXRAY-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="FLEXRAY-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="FLEXRAY-FRAME"/>
 *     &lt;enumeration value="FLEXRAY-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="FLEXRAY-NM-CLUSTER"/>
 *     &lt;enumeration value="FLEXRAY-NM-NODE"/>
 *     &lt;enumeration value="FLEXRAY-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="FLEXRAY-TP-CONFIG"/>
 *     &lt;enumeration value="FLEXRAY-TP-CONNECTION-CONTROL"/>
 *     &lt;enumeration value="FLEXRAY-TP-NODE"/>
 *     &lt;enumeration value="FLEXRAY-TP-PDU-POOL"/>
 *     &lt;enumeration value="FRAME"/>
 *     &lt;enumeration value="FRAME-PORT"/>
 *     &lt;enumeration value="FRAME-TRIGGERING"/>
 *     &lt;enumeration value="FUNCTION-INHIBITION-NEEDS"/>
 *     &lt;enumeration value="GATEWAY"/>
 *     &lt;enumeration value="GENERAL-PARAMETER"/>
 *     &lt;enumeration value="GENERAL-PURPOSE-I-PDU"/>
 *     &lt;enumeration value="GENERAL-PURPOSE-PDU"/>
 *     &lt;enumeration value="GENERIC-ETHERNET-FRAME"/>
 *     &lt;enumeration value="GLOBAL-TIME-CAN-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-CAN-SLAVE"/>
 *     &lt;enumeration value="GLOBAL-TIME-DOMAIN"/>
 *     &lt;enumeration value="GLOBAL-TIME-ETH-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-ETH-SLAVE"/>
 *     &lt;enumeration value="GLOBAL-TIME-FR-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-FR-SLAVE"/>
 *     &lt;enumeration value="GLOBAL-TIME-GATEWAY"/>
 *     &lt;enumeration value="GLOBAL-TIME-MASTER"/>
 *     &lt;enumeration value="GLOBAL-TIME-SLAVE"/>
 *     &lt;enumeration value="HEAP-USAGE"/>
 *     &lt;enumeration value="HW-ATTRIBUTE-DEF"/>
 *     &lt;enumeration value="HW-ATTRIBUTE-LITERAL-DEF"/>
 *     &lt;enumeration value="HW-CATEGORY"/>
 *     &lt;enumeration value="HW-ELEMENT"/>
 *     &lt;enumeration value="HW-PIN"/>
 *     &lt;enumeration value="HW-PIN-GROUP"/>
 *     &lt;enumeration value="HW-TYPE"/>
 *     &lt;enumeration value="I-PDU"/>
 *     &lt;enumeration value="I-PDU-PORT"/>
 *     &lt;enumeration value="I-SIGNAL"/>
 *     &lt;enumeration value="I-SIGNAL-GROUP"/>
 *     &lt;enumeration value="I-SIGNAL-I-PDU"/>
 *     &lt;enumeration value="I-SIGNAL-I-PDU-GROUP"/>
 *     &lt;enumeration value="I-SIGNAL-PORT"/>
 *     &lt;enumeration value="I-SIGNAL-TO-I-PDU-MAPPING"/>
 *     &lt;enumeration value="I-SIGNAL-TRIGGERING"/>
 *     &lt;enumeration value="IDENT-CAPTION"/>
 *     &lt;enumeration value="IDENTIFIABLE"/>
 *     &lt;enumeration value="IEEE-1722-TP-ETHERNET-FRAME"/>
 *     &lt;enumeration value="IMPLEMENTATION"/>
 *     &lt;enumeration value="IMPLEMENTATION-DATA-TYPE"/>
 *     &lt;enumeration value="IMPLEMENTATION-DATA-TYPE-ELEMENT"/>
 *     &lt;enumeration value="INIT-EVENT"/>
 *     &lt;enumeration value="INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="INTERNAL-TRIGGER-OCCURRED-EVENT"/>
 *     &lt;enumeration value="INTERNAL-TRIGGERING-POINT"/>
 *     &lt;enumeration value="INTERPOLATION-ROUTINE-MAPPING-SET"/>
 *     &lt;enumeration value="J-1939-CLUSTER"/>
 *     &lt;enumeration value="J-1939-DCM-I-PDU"/>
 *     &lt;enumeration value="J-1939-NM-CLUSTER"/>
 *     &lt;enumeration value="J-1939-NM-NODE"/>
 *     &lt;enumeration value="J-1939-TP-CONFIG"/>
 *     &lt;enumeration value="J-1939-TP-NODE"/>
 *     &lt;enumeration value="KEYWORD"/>
 *     &lt;enumeration value="KEYWORD-SET"/>
 *     &lt;enumeration value="LATENCY-TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="LIFE-CYCLE-INFO-SET"/>
 *     &lt;enumeration value="LIFE-CYCLE-STATE"/>
 *     &lt;enumeration value="LIFE-CYCLE-STATE-DEFINITION-GROUP"/>
 *     &lt;enumeration value="LIN-CLUSTER"/>
 *     &lt;enumeration value="LIN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="LIN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="LIN-EVENT-TRIGGERED-FRAME"/>
 *     &lt;enumeration value="LIN-FRAME"/>
 *     &lt;enumeration value="LIN-FRAME-TRIGGERING"/>
 *     &lt;enumeration value="LIN-MASTER"/>
 *     &lt;enumeration value="LIN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="LIN-SCHEDULE-TABLE"/>
 *     &lt;enumeration value="LIN-SLAVE"/>
 *     &lt;enumeration value="LIN-SPORADIC-FRAME"/>
 *     &lt;enumeration value="LIN-TP-CONFIG"/>
 *     &lt;enumeration value="LIN-TP-NODE"/>
 *     &lt;enumeration value="LIN-UNCONDITIONAL-FRAME"/>
 *     &lt;enumeration value="LINKER"/>
 *     &lt;enumeration value="LOGIC-ADDRESS"/>
 *     &lt;enumeration value="MAC-MULTICAST-GROUP"/>
 *     &lt;enumeration value="MC-DATA-INSTANCE"/>
 *     &lt;enumeration value="MC-FUNCTION"/>
 *     &lt;enumeration value="MEASURED-EXECUTION-TIME"/>
 *     &lt;enumeration value="MEASURED-HEAP-USAGE"/>
 *     &lt;enumeration value="MEASURED-STACK-USAGE"/>
 *     &lt;enumeration value="MEMORY-SECTION"/>
 *     &lt;enumeration value="MODE-ACCESS-POINT-IDENT"/>
 *     &lt;enumeration value="MODE-DECLARATION"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP"/>
 *     &lt;enumeration value="MODE-DECLARATION-GROUP-PROTOTYPE"/>
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING"/>
 *     &lt;enumeration value="MODE-DECLARATION-MAPPING-SET"/>
 *     &lt;enumeration value="MODE-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="MODE-SWITCH-INTERFACE"/>
 *     &lt;enumeration value="MODE-SWITCH-POINT"/>
 *     &lt;enumeration value="MODE-SWITCHED-ACK-EVENT"/>
 *     &lt;enumeration value="MODE-TRANSITION"/>
 *     &lt;enumeration value="MULTIPLEXED-I-PDU"/>
 *     &lt;enumeration value="N-PDU"/>
 *     &lt;enumeration value="NETWORK-ENDPOINT"/>
 *     &lt;enumeration value="NM-CLUSTER"/>
 *     &lt;enumeration value="NM-CONFIG"/>
 *     &lt;enumeration value="NM-ECU"/>
 *     &lt;enumeration value="NM-NODE"/>
 *     &lt;enumeration value="NM-PDU"/>
 *     &lt;enumeration value="NV-BLOCK-DESCRIPTOR"/>
 *     &lt;enumeration value="NV-BLOCK-NEEDS"/>
 *     &lt;enumeration value="NV-BLOCK-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="NV-DATA-INTERFACE"/>
 *     &lt;enumeration value="OBD-CONTROL-SERVICE-NEEDS"/>
 *     &lt;enumeration value="OBD-INFO-SERVICE-NEEDS"/>
 *     &lt;enumeration value="OBD-MONITOR-SERVICE-NEEDS"/>
 *     &lt;enumeration value="OBD-PID-SERVICE-NEEDS"/>
 *     &lt;enumeration value="OBD-RATIO-SERVICE-NEEDS"/>
 *     &lt;enumeration value="OFFSET-TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="OPERATION-INVOKED-EVENT"/>
 *     &lt;enumeration value="P-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PR-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PACKAGEABLE-ELEMENT"/>
 *     &lt;enumeration value="PARAMETER-ACCESS"/>
 *     &lt;enumeration value="PARAMETER-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="PARAMETER-INTERFACE"/>
 *     &lt;enumeration value="PARAMETER-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="PASS-THROUGH-SW-CONNECTOR"/>
 *     &lt;enumeration value="PDU"/>
 *     &lt;enumeration value="PDU-TO-FRAME-MAPPING"/>
 *     &lt;enumeration value="PDU-TRIGGERING"/>
 *     &lt;enumeration value="PDUR-I-PDU-GROUP"/>
 *     &lt;enumeration value="PER-INSTANCE-MEMORY"/>
 *     &lt;enumeration value="PERIODIC-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="PHYSICAL-DIMENSION"/>
 *     &lt;enumeration value="PHYSICAL-DIMENSION-MAPPING-SET"/>
 *     &lt;enumeration value="PORT-GROUP"/>
 *     &lt;enumeration value="PORT-INTERFACE"/>
 *     &lt;enumeration value="PORT-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="PORT-INTERFACE-MAPPING-SET"/>
 *     &lt;enumeration value="PORT-PROTOTYPE"/>
 *     &lt;enumeration value="PORT-PROTOTYPE-BLUEPRINT"/>
 *     &lt;enumeration value="POST-BUILD-VARIANT-CRITERION"/>
 *     &lt;enumeration value="POST-BUILD-VARIANT-CRITERION-VALUE-SET"/>
 *     &lt;enumeration value="PREDEFINED-VARIANT"/>
 *     &lt;enumeration value="PROVIDED-SERVICE-INSTANCE"/>
 *     &lt;enumeration value="R-PORT-PROTOTYPE"/>
 *     &lt;enumeration value="RTE-EVENT"/>
 *     &lt;enumeration value="RAPID-PROTOTYPING-SCENARIO"/>
 *     &lt;enumeration value="RESOURCE-CONSUMPTION"/>
 *     &lt;enumeration value="ROOT-SW-COMPOSITION-PROTOTYPE"/>
 *     &lt;enumeration value="ROUGH-ESTIMATE-HEAP-USAGE"/>
 *     &lt;enumeration value="ROUGH-ESTIMATE-OF-EXECUTION-TIME"/>
 *     &lt;enumeration value="ROUGH-ESTIMATE-STACK-USAGE"/>
 *     &lt;enumeration value="RPT-CONTAINER"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY"/>
 *     &lt;enumeration value="RUNNABLE-ENTITY-GROUP"/>
 *     &lt;enumeration value="SECURED-I-PDU"/>
 *     &lt;enumeration value="SENDER-RECEIVER-INTERFACE"/>
 *     &lt;enumeration value="SENSOR-ACTUATOR-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERIALIZATION-TECHNOLOGY"/>
 *     &lt;enumeration value="SERVER-CALL-POINT"/>
 *     &lt;enumeration value="SERVICE-NEEDS"/>
 *     &lt;enumeration value="SERVICE-PROXY-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SERVICE-SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SIMULATED-EXECUTION-TIME"/>
 *     &lt;enumeration value="SO-AD-ROUTING-GROUP"/>
 *     &lt;enumeration value="SOCKET-ADDRESS"/>
 *     &lt;enumeration value="SPORADIC-EVENT-TRIGGERING"/>
 *     &lt;enumeration value="STACK-USAGE"/>
 *     &lt;enumeration value="STRUCTURED-REQ"/>
 *     &lt;enumeration value="SUPERVISED-ENTITY-NEEDS"/>
 *     &lt;enumeration value="SW-ADDR-METHOD"/>
 *     &lt;enumeration value="SW-AXIS-TYPE"/>
 *     &lt;enumeration value="SW-BASE-TYPE"/>
 *     &lt;enumeration value="SW-COMPONENT-PROTOTYPE"/>
 *     &lt;enumeration value="SW-COMPONENT-TYPE"/>
 *     &lt;enumeration value="SW-CONNECTOR"/>
 *     &lt;enumeration value="SW-GENERIC-AXIS-PARAM-TYPE"/>
 *     &lt;enumeration value="SW-RECORD-LAYOUT"/>
 *     &lt;enumeration value="SW-SERVICE-ARG"/>
 *     &lt;enumeration value="SW-SYSTEMCONST"/>
 *     &lt;enumeration value="SW-SYSTEMCONSTANT-VALUE-SET"/>
 *     &lt;enumeration value="SWC-BSW-MAPPING"/>
 *     &lt;enumeration value="SWC-IMPLEMENTATION"/>
 *     &lt;enumeration value="SWC-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="SWC-MODE-MANAGER-ERROR-EVENT"/>
 *     &lt;enumeration value="SWC-MODE-SWITCH-EVENT"/>
 *     &lt;enumeration value="SWC-SERVICE-DEPENDENCY"/>
 *     &lt;enumeration value="SWC-TIMING"/>
 *     &lt;enumeration value="SWC-TO-ECU-MAPPING"/>
 *     &lt;enumeration value="SWC-TO-IMPL-MAPPING"/>
 *     &lt;enumeration value="SYNC-TIME-BASE-MGR-USER-NEEDS"/>
 *     &lt;enumeration value="SYNCHRONIZATION-TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="SYNCHRONOUS-SERVER-CALL-POINT"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="SYSTEM-MAPPING"/>
 *     &lt;enumeration value="SYSTEM-SIGNAL"/>
 *     &lt;enumeration value="SYSTEM-SIGNAL-GROUP"/>
 *     &lt;enumeration value="SYSTEM-TIMING"/>
 *     &lt;enumeration value="TD-EVENT-BSW"/>
 *     &lt;enumeration value="TD-EVENT-BSW-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="TD-EVENT-BSW-MODE-DECLARATION"/>
 *     &lt;enumeration value="TD-EVENT-BSW-MODULE"/>
 *     &lt;enumeration value="TD-EVENT-COM"/>
 *     &lt;enumeration value="TD-EVENT-COMPLEX"/>
 *     &lt;enumeration value="TD-EVENT-CYCLE-START"/>
 *     &lt;enumeration value="TD-EVENT-FR-CLUSTER-CYCLE-START"/>
 *     &lt;enumeration value="TD-EVENT-FRAME"/>
 *     &lt;enumeration value="TD-EVENT-I-PDU"/>
 *     &lt;enumeration value="TD-EVENT-I-SIGNAL"/>
 *     &lt;enumeration value="TD-EVENT-MODE-DECLARATION"/>
 *     &lt;enumeration value="TD-EVENT-OPERATION"/>
 *     &lt;enumeration value="TD-EVENT-SWC"/>
 *     &lt;enumeration value="TD-EVENT-SWC-INTERNAL-BEHAVIOR"/>
 *     &lt;enumeration value="TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"/>
 *     &lt;enumeration value="TD-EVENT-TT-CAN-CYCLE-START"/>
 *     &lt;enumeration value="TD-EVENT-TRIGGER"/>
 *     &lt;enumeration value="TD-EVENT-VARIABLE-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="TD-EVENT-VFB"/>
 *     &lt;enumeration value="TD-EVENT-VFB-PORT"/>
 *     &lt;enumeration value="TD-EVENT-VFB-REFERENCE"/>
 *     &lt;enumeration value="TIMING-CONSTRAINT"/>
 *     &lt;enumeration value="TIMING-DESCRIPTION"/>
 *     &lt;enumeration value="TIMING-DESCRIPTION-EVENT"/>
 *     &lt;enumeration value="TIMING-DESCRIPTION-EVENT-CHAIN"/>
 *     &lt;enumeration value="TIMING-EVENT"/>
 *     &lt;enumeration value="TIMING-EXTENSION"/>
 *     &lt;enumeration value="TOPIC-1"/>
 *     &lt;enumeration value="TP-ADDRESS"/>
 *     &lt;enumeration value="TP-CONFIG"/>
 *     &lt;enumeration value="TRACEABLE-TEXT"/>
 *     &lt;enumeration value="TRANSFORMATION-TECHNOLOGY"/>
 *     &lt;enumeration value="TRANSFORMER-HARD-ERROR-EVENT"/>
 *     &lt;enumeration value="TRIGGER"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE"/>
 *     &lt;enumeration value="TRIGGER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="TTCAN-CLUSTER"/>
 *     &lt;enumeration value="TTCAN-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="TTCAN-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="TTCAN-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="UDP-NM-CLUSTER"/>
 *     &lt;enumeration value="UDP-NM-NODE"/>
 *     &lt;enumeration value="UNIT"/>
 *     &lt;enumeration value="UNIT-GROUP"/>
 *     &lt;enumeration value="USER-DEFINED-CLUSTER"/>
 *     &lt;enumeration value="USER-DEFINED-COMMUNICATION-CONNECTOR"/>
 *     &lt;enumeration value="USER-DEFINED-COMMUNICATION-CONTROLLER"/>
 *     &lt;enumeration value="USER-DEFINED-ETHERNET-FRAME"/>
 *     &lt;enumeration value="USER-DEFINED-I-PDU"/>
 *     &lt;enumeration value="USER-DEFINED-PDU"/>
 *     &lt;enumeration value="USER-DEFINED-PHYSICAL-CHANNEL"/>
 *     &lt;enumeration value="VARIABLE-ACCESS"/>
 *     &lt;enumeration value="VARIABLE-AND-PARAMETER-INTERFACE-MAPPING"/>
 *     &lt;enumeration value="VARIABLE-DATA-PROTOTYPE"/>
 *     &lt;enumeration value="VARIATION-POINT-PROXY"/>
 *     &lt;enumeration value="VFB-TIMING"/>
 *     &lt;enumeration value="VIEW-MAP"/>
 *     &lt;enumeration value="VIEW-MAP-SET"/>
 *     &lt;enumeration value="VLAN-CONFIG"/>
 *     &lt;enumeration value="WAIT-POINT"/>
 *     &lt;enumeration value="WARNING-INDICATOR-REQUESTED-BIT-NEEDS"/>
 *     &lt;enumeration value="WORST-CASE-HEAP-USAGE"/>
 *     &lt;enumeration value="WORST-CASE-STACK-USAGE"/>
 *     &lt;enumeration value="XCP-PDU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IDENTIFIABLE--SUBTYPES-ENUM")
@XmlEnum
public enum IDENTIFIABLESUBTYPESENUM {

    @XmlEnumValue("AR-ELEMENT")
    AR___ELEMENT("AR-ELEMENT"),
    @XmlEnumValue("AR-PACKAGE")
    AR___PACKAGE("AR-PACKAGE"),
    @XmlEnumValue("ABSTRACT-CAN-CLUSTER")
    ABSTRACT___CAN___CLUSTER("ABSTRACT-CAN-CLUSTER"),
    @XmlEnumValue("ABSTRACT-CAN-COMMUNICATION-CONNECTOR")
    ABSTRACT___CAN___COMMUNICATION___CONNECTOR("ABSTRACT-CAN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("ABSTRACT-CAN-COMMUNICATION-CONTROLLER")
    ABSTRACT___CAN___COMMUNICATION___CONTROLLER("ABSTRACT-CAN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("ABSTRACT-CAN-PHYSICAL-CHANNEL")
    ABSTRACT___CAN___PHYSICAL___CHANNEL("ABSTRACT-CAN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("ABSTRACT-EVENT")
    ABSTRACT___EVENT("ABSTRACT-EVENT"),
    @XmlEnumValue("ABSTRACT-PROVIDED-PORT-PROTOTYPE")
    ABSTRACT___PROVIDED___PORT___PROTOTYPE("ABSTRACT-PROVIDED-PORT-PROTOTYPE"),
    @XmlEnumValue("ABSTRACT-REQUIRED-PORT-PROTOTYPE")
    ABSTRACT___REQUIRED___PORT___PROTOTYPE("ABSTRACT-REQUIRED-PORT-PROTOTYPE"),
    @XmlEnumValue("ABSTRACT-SERVICE-INSTANCE")
    ABSTRACT___SERVICE___INSTANCE("ABSTRACT-SERVICE-INSTANCE"),
    @XmlEnumValue("ACL-OBJECT-SET")
    ACL___OBJECT___SET("ACL-OBJECT-SET"),
    @XmlEnumValue("ACL-OPERATION")
    ACL___OPERATION("ACL-OPERATION"),
    @XmlEnumValue("ACL-PERMISSION")
    ACL___PERMISSION("ACL-PERMISSION"),
    @XmlEnumValue("ACL-ROLE")
    ACL___ROLE("ACL-ROLE"),
    @XmlEnumValue("AGE-CONSTRAINT")
    AGE___CONSTRAINT("AGE-CONSTRAINT"),
    @XmlEnumValue("ALIAS-NAME-SET")
    ALIAS___NAME___SET("ALIAS-NAME-SET"),
    @XmlEnumValue("ANALYZED-EXECUTION-TIME")
    ANALYZED___EXECUTION___TIME("ANALYZED-EXECUTION-TIME"),
    @XmlEnumValue("APPLICATION-ARRAY-DATA-TYPE")
    APPLICATION___ARRAY___DATA___TYPE("APPLICATION-ARRAY-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-ARRAY-ELEMENT")
    APPLICATION___ARRAY___ELEMENT("APPLICATION-ARRAY-ELEMENT"),
    @XmlEnumValue("APPLICATION-COMPOSITE-DATA-TYPE")
    APPLICATION___COMPOSITE___DATA___TYPE("APPLICATION-COMPOSITE-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE")
    APPLICATION___COMPOSITE___ELEMENT___DATA___PROTOTYPE("APPLICATION-COMPOSITE-ELEMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("APPLICATION-DATA-TYPE")
    APPLICATION___DATA___TYPE("APPLICATION-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-ENDPOINT")
    APPLICATION___ENDPOINT("APPLICATION-ENDPOINT"),
    @XmlEnumValue("APPLICATION-ERROR")
    APPLICATION___ERROR("APPLICATION-ERROR"),
    @XmlEnumValue("APPLICATION-PRIMITIVE-DATA-TYPE")
    APPLICATION___PRIMITIVE___DATA___TYPE("APPLICATION-PRIMITIVE-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-RECORD-DATA-TYPE")
    APPLICATION___RECORD___DATA___TYPE("APPLICATION-RECORD-DATA-TYPE"),
    @XmlEnumValue("APPLICATION-RECORD-ELEMENT")
    APPLICATION___RECORD___ELEMENT("APPLICATION-RECORD-ELEMENT"),
    @XmlEnumValue("APPLICATION-SW-COMPONENT-TYPE")
    APPLICATION___SW___COMPONENT___TYPE("APPLICATION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ARBITRARY-EVENT-TRIGGERING")
    ARBITRARY___EVENT___TRIGGERING("ARBITRARY-EVENT-TRIGGERING"),
    @XmlEnumValue("ARGUMENT-DATA-PROTOTYPE")
    ARGUMENT___DATA___PROTOTYPE("ARGUMENT-DATA-PROTOTYPE"),
    @XmlEnumValue("ASSEMBLY-SW-CONNECTOR")
    ASSEMBLY___SW___CONNECTOR("ASSEMBLY-SW-CONNECTOR"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-POINT")
    ASYNCHRONOUS___SERVER___CALL___POINT("ASYNCHRONOUS-SERVER-CALL-POINT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT")
    ASYNCHRONOUS___SERVER___CALL___RESULT___POINT("ASYNCHRONOUS-SERVER-CALL-RESULT-POINT"),
    @XmlEnumValue("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("ATOMIC-SW-COMPONENT-TYPE")
    ATOMIC___SW___COMPONENT___TYPE("ATOMIC-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ATP-BLUEPRINT")
    ATP___BLUEPRINT("ATP-BLUEPRINT"),
    @XmlEnumValue("ATP-BLUEPRINTABLE")
    ATP___BLUEPRINTABLE("ATP-BLUEPRINTABLE"),
    @XmlEnumValue("ATP-CLASSIFIER")
    ATP___CLASSIFIER("ATP-CLASSIFIER"),
    @XmlEnumValue("ATP-FEATURE")
    ATP___FEATURE("ATP-FEATURE"),
    @XmlEnumValue("ATP-PROTOTYPE")
    ATP___PROTOTYPE("ATP-PROTOTYPE"),
    @XmlEnumValue("ATP-STRUCTURE-ELEMENT")
    ATP___STRUCTURE___ELEMENT("ATP-STRUCTURE-ELEMENT"),
    @XmlEnumValue("ATP-TYPE")
    ATP___TYPE("ATP-TYPE"),
    @XmlEnumValue("AUTOSAR-DATA-PROTOTYPE")
    AUTOSAR___DATA___PROTOTYPE("AUTOSAR-DATA-PROTOTYPE"),
    @XmlEnumValue("AUTOSAR-DATA-TYPE")
    AUTOSAR___DATA___TYPE("AUTOSAR-DATA-TYPE"),
    @XmlEnumValue("AUTOSAR-OPERATION-ARGUMENT-INSTANCE")
    AUTOSAR___OPERATION___ARGUMENT___INSTANCE("AUTOSAR-OPERATION-ARGUMENT-INSTANCE"),
    @XmlEnumValue("AUTOSAR-VARIABLE-INSTANCE")
    AUTOSAR___VARIABLE___INSTANCE("AUTOSAR-VARIABLE-INSTANCE"),
    @XmlEnumValue("BACKGROUND-EVENT")
    BACKGROUND___EVENT("BACKGROUND-EVENT"),
    @XmlEnumValue("BASE-TYPE")
    BASE___TYPE("BASE-TYPE"),
    @XmlEnumValue("BLUEPRINT-MAPPING-SET")
    BLUEPRINT___MAPPING___SET("BLUEPRINT-MAPPING-SET"),
    @XmlEnumValue("BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT")
    BSW___ASYNCHRONOUS___SERVER___CALL___RETURNS___EVENT("BSW-ASYNCHRONOUS-SERVER-CALL-RETURNS-EVENT"),
    @XmlEnumValue("BSW-BACKGROUND-EVENT")
    BSW___BACKGROUND___EVENT("BSW-BACKGROUND-EVENT"),
    @XmlEnumValue("BSW-CALLED-ENTITY")
    BSW___CALLED___ENTITY("BSW-CALLED-ENTITY"),
    @XmlEnumValue("BSW-DATA-RECEIVED-EVENT")
    BSW___DATA___RECEIVED___EVENT("BSW-DATA-RECEIVED-EVENT"),
    @XmlEnumValue("BSW-DEBUG-INFO")
    BSW___DEBUG___INFO("BSW-DEBUG-INFO"),
    @XmlEnumValue("BSW-EVENT")
    BSW___EVENT("BSW-EVENT"),
    @XmlEnumValue("BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT")
    BSW___EXTERNAL___TRIGGER___OCCURRED___EVENT("BSW-EXTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("BSW-IMPLEMENTATION")
    BSW___IMPLEMENTATION("BSW-IMPLEMENTATION"),
    @XmlEnumValue("BSW-INTERNAL-BEHAVIOR")
    BSW___INTERNAL___BEHAVIOR("BSW-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("BSW-INTERNAL-TRIGGER-OCCURRED-EVENT")
    BSW___INTERNAL___TRIGGER___OCCURRED___EVENT("BSW-INTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("BSW-INTERNAL-TRIGGERING-POINT")
    BSW___INTERNAL___TRIGGERING___POINT("BSW-INTERNAL-TRIGGERING-POINT"),
    @XmlEnumValue("BSW-INTERRUPT-ENTITY")
    BSW___INTERRUPT___ENTITY("BSW-INTERRUPT-ENTITY"),
    @XmlEnumValue("BSW-MGR-NEEDS")
    BSW___MGR___NEEDS("BSW-MGR-NEEDS"),
    @XmlEnumValue("BSW-MODE-MANAGER-ERROR-EVENT")
    BSW___MODE___MANAGER___ERROR___EVENT("BSW-MODE-MANAGER-ERROR-EVENT"),
    @XmlEnumValue("BSW-MODE-SWITCH-EVENT")
    BSW___MODE___SWITCH___EVENT("BSW-MODE-SWITCH-EVENT"),
    @XmlEnumValue("BSW-MODE-SWITCHED-ACK-EVENT")
    BSW___MODE___SWITCHED___ACK___EVENT("BSW-MODE-SWITCHED-ACK-EVENT"),
    @XmlEnumValue("BSW-MODULE-DEPENDENCY")
    BSW___MODULE___DEPENDENCY("BSW-MODULE-DEPENDENCY"),
    @XmlEnumValue("BSW-MODULE-DESCRIPTION")
    BSW___MODULE___DESCRIPTION("BSW-MODULE-DESCRIPTION"),
    @XmlEnumValue("BSW-MODULE-ENTITY")
    BSW___MODULE___ENTITY("BSW-MODULE-ENTITY"),
    @XmlEnumValue("BSW-MODULE-ENTRY")
    BSW___MODULE___ENTRY("BSW-MODULE-ENTRY"),
    @XmlEnumValue("BSW-MODULE-TIMING")
    BSW___MODULE___TIMING("BSW-MODULE-TIMING"),
    @XmlEnumValue("BSW-OPERATION-INVOKED-EVENT")
    BSW___OPERATION___INVOKED___EVENT("BSW-OPERATION-INVOKED-EVENT"),
    @XmlEnumValue("BSW-SCHEDULABLE-ENTITY")
    BSW___SCHEDULABLE___ENTITY("BSW-SCHEDULABLE-ENTITY"),
    @XmlEnumValue("BSW-SCHEDULE-EVENT")
    BSW___SCHEDULE___EVENT("BSW-SCHEDULE-EVENT"),
    @XmlEnumValue("BSW-SERVICE-DEPENDENCY-IDENT")
    BSW___SERVICE___DEPENDENCY___IDENT("BSW-SERVICE-DEPENDENCY-IDENT"),
    @XmlEnumValue("BSW-TIMING-EVENT")
    BSW___TIMING___EVENT("BSW-TIMING-EVENT"),
    @XmlEnumValue("BUILD-ACTION")
    BUILD___ACTION("BUILD-ACTION"),
    @XmlEnumValue("BUILD-ACTION-ENTITY")
    BUILD___ACTION___ENTITY("BUILD-ACTION-ENTITY"),
    @XmlEnumValue("BUILD-ACTION-ENVIRONMENT")
    BUILD___ACTION___ENVIRONMENT("BUILD-ACTION-ENVIRONMENT"),
    @XmlEnumValue("BUILD-ACTION-MANIFEST")
    BUILD___ACTION___MANIFEST("BUILD-ACTION-MANIFEST"),
    @XmlEnumValue("BURST-PATTERN-EVENT-TRIGGERING")
    BURST___PATTERN___EVENT___TRIGGERING("BURST-PATTERN-EVENT-TRIGGERING"),
    @XmlEnumValue("CALIBRATION-PARAMETER-VALUE-SET")
    CALIBRATION___PARAMETER___VALUE___SET("CALIBRATION-PARAMETER-VALUE-SET"),
    @XmlEnumValue("CAN-CLUSTER")
    CAN___CLUSTER("CAN-CLUSTER"),
    @XmlEnumValue("CAN-COMMUNICATION-CONNECTOR")
    CAN___COMMUNICATION___CONNECTOR("CAN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("CAN-COMMUNICATION-CONTROLLER")
    CAN___COMMUNICATION___CONTROLLER("CAN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("CAN-FRAME")
    CAN___FRAME("CAN-FRAME"),
    @XmlEnumValue("CAN-FRAME-TRIGGERING")
    CAN___FRAME___TRIGGERING("CAN-FRAME-TRIGGERING"),
    @XmlEnumValue("CAN-NM-CLUSTER")
    CAN___NM___CLUSTER("CAN-NM-CLUSTER"),
    @XmlEnumValue("CAN-NM-NODE")
    CAN___NM___NODE("CAN-NM-NODE"),
    @XmlEnumValue("CAN-PHYSICAL-CHANNEL")
    CAN___PHYSICAL___CHANNEL("CAN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("CAN-TP-ADDRESS")
    CAN___TP___ADDRESS("CAN-TP-ADDRESS"),
    @XmlEnumValue("CAN-TP-CHANNEL")
    CAN___TP___CHANNEL("CAN-TP-CHANNEL"),
    @XmlEnumValue("CAN-TP-CONFIG")
    CAN___TP___CONFIG("CAN-TP-CONFIG"),
    @XmlEnumValue("CAN-TP-NODE")
    CAN___TP___NODE("CAN-TP-NODE"),
    CHAPTER("CHAPTER"),
    @XmlEnumValue("CLIENT-ID-DEFINITION")
    CLIENT___ID___DEFINITION("CLIENT-ID-DEFINITION"),
    @XmlEnumValue("CLIENT-ID-DEFINITION-SET")
    CLIENT___ID___DEFINITION___SET("CLIENT-ID-DEFINITION-SET"),
    @XmlEnumValue("CLIENT-SERVER-INTERFACE")
    CLIENT___SERVER___INTERFACE("CLIENT-SERVER-INTERFACE"),
    @XmlEnumValue("CLIENT-SERVER-INTERFACE-MAPPING")
    CLIENT___SERVER___INTERFACE___MAPPING("CLIENT-SERVER-INTERFACE-MAPPING"),
    @XmlEnumValue("CLIENT-SERVER-OPERATION")
    CLIENT___SERVER___OPERATION("CLIENT-SERVER-OPERATION"),
    CODE("CODE"),
    @XmlEnumValue("COLLECTABLE-ELEMENT")
    COLLECTABLE___ELEMENT("COLLECTABLE-ELEMENT"),
    COLLECTION("COLLECTION"),
    @XmlEnumValue("COM-MGR-USER-NEEDS")
    COM___MGR___USER___NEEDS("COM-MGR-USER-NEEDS"),
    @XmlEnumValue("COMM-CONNECTOR-PORT")
    COMM___CONNECTOR___PORT("COMM-CONNECTOR-PORT"),
    @XmlEnumValue("COMMUNICATION-CLUSTER")
    COMMUNICATION___CLUSTER("COMMUNICATION-CLUSTER"),
    @XmlEnumValue("COMMUNICATION-CONNECTOR")
    COMMUNICATION___CONNECTOR("COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("COMMUNICATION-CONTROLLER")
    COMMUNICATION___CONTROLLER("COMMUNICATION-CONTROLLER"),
    COMPILER("COMPILER"),
    @XmlEnumValue("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE")
    COMPLEX___DEVICE___DRIVER___SW___COMPONENT___TYPE("COMPLEX-DEVICE-DRIVER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPOSITION-SW-COMPONENT-TYPE")
    COMPOSITION___SW___COMPONENT___TYPE("COMPOSITION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("COMPU-METHOD")
    COMPU___METHOD("COMPU-METHOD"),
    @XmlEnumValue("CONCRETE-PATTERN-EVENT-TRIGGERING")
    CONCRETE___PATTERN___EVENT___TRIGGERING("CONCRETE-PATTERN-EVENT-TRIGGERING"),
    @XmlEnumValue("CONSISTENCY-NEEDS")
    CONSISTENCY___NEEDS("CONSISTENCY-NEEDS"),
    @XmlEnumValue("CONSISTENCY-NEEDS-BLUEPRINT-SET")
    CONSISTENCY___NEEDS___BLUEPRINT___SET("CONSISTENCY-NEEDS-BLUEPRINT-SET"),
    @XmlEnumValue("CONSTANT-SPECIFICATION")
    CONSTANT___SPECIFICATION("CONSTANT-SPECIFICATION"),
    @XmlEnumValue("CONSTANT-SPECIFICATION-MAPPING-SET")
    CONSTANT___SPECIFICATION___MAPPING___SET("CONSTANT-SPECIFICATION-MAPPING-SET"),
    @XmlEnumValue("CONSUMED-EVENT-GROUP")
    CONSUMED___EVENT___GROUP("CONSUMED-EVENT-GROUP"),
    @XmlEnumValue("CONSUMED-SERVICE-INSTANCE")
    CONSUMED___SERVICE___INSTANCE("CONSUMED-SERVICE-INSTANCE"),
    @XmlEnumValue("CONTAINER-I-PDU")
    CONTAINER___I___PDU("CONTAINER-I-PDU"),
    @XmlEnumValue("COUPLING-ELEMENT")
    COUPLING___ELEMENT("COUPLING-ELEMENT"),
    @XmlEnumValue("COUPLING-PORT")
    COUPLING___PORT("COUPLING-PORT"),
    @XmlEnumValue("COUPLING-PORT-FIFO")
    COUPLING___PORT___FIFO("COUPLING-PORT-FIFO"),
    @XmlEnumValue("COUPLING-PORT-SCHEDULER")
    COUPLING___PORT___SCHEDULER("COUPLING-PORT-SCHEDULER"),
    @XmlEnumValue("COUPLING-PORT-SHAPER")
    COUPLING___PORT___SHAPER("COUPLING-PORT-SHAPER"),
    @XmlEnumValue("COUPLING-PORT-STRUCTURAL-ELEMENT")
    COUPLING___PORT___STRUCTURAL___ELEMENT("COUPLING-PORT-STRUCTURAL-ELEMENT"),
    @XmlEnumValue("CRYPTO-SERVICE-NEEDS")
    CRYPTO___SERVICE___NEEDS("CRYPTO-SERVICE-NEEDS"),
    @XmlEnumValue("DATA-CONSTR")
    DATA___CONSTR("DATA-CONSTR"),
    @XmlEnumValue("DATA-INTERFACE")
    DATA___INTERFACE("DATA-INTERFACE"),
    @XmlEnumValue("DATA-PROTOTYPE")
    DATA___PROTOTYPE("DATA-PROTOTYPE"),
    @XmlEnumValue("DATA-PROTOTYPE-GROUP")
    DATA___PROTOTYPE___GROUP("DATA-PROTOTYPE-GROUP"),
    @XmlEnumValue("DATA-RECEIVE-ERROR-EVENT")
    DATA___RECEIVE___ERROR___EVENT("DATA-RECEIVE-ERROR-EVENT"),
    @XmlEnumValue("DATA-RECEIVED-EVENT")
    DATA___RECEIVED___EVENT("DATA-RECEIVED-EVENT"),
    @XmlEnumValue("DATA-SEND-COMPLETED-EVENT")
    DATA___SEND___COMPLETED___EVENT("DATA-SEND-COMPLETED-EVENT"),
    @XmlEnumValue("DATA-TRANSFORMATION")
    DATA___TRANSFORMATION("DATA-TRANSFORMATION"),
    @XmlEnumValue("DATA-TRANSFORMATION-SET")
    DATA___TRANSFORMATION___SET("DATA-TRANSFORMATION-SET"),
    @XmlEnumValue("DATA-TYPE-MAPPING-SET")
    DATA___TYPE___MAPPING___SET("DATA-TYPE-MAPPING-SET"),
    @XmlEnumValue("DATA-WRITE-COMPLETED-EVENT")
    DATA___WRITE___COMPLETED___EVENT("DATA-WRITE-COMPLETED-EVENT"),
    @XmlEnumValue("DCM-I-PDU")
    DCM___I___PDU("DCM-I-PDU"),
    @XmlEnumValue("DELEGATION-SW-CONNECTOR")
    DELEGATION___SW___CONNECTOR("DELEGATION-SW-CONNECTOR"),
    @XmlEnumValue("DEPENDENCY-ON-ARTIFACT")
    DEPENDENCY___ON___ARTIFACT("DEPENDENCY-ON-ARTIFACT"),
    @XmlEnumValue("DIAG-EVENT-DEBOUNCE-ALGORITHM")
    DIAG___EVENT___DEBOUNCE___ALGORITHM("DIAG-EVENT-DEBOUNCE-ALGORITHM"),
    @XmlEnumValue("DIAG-EVENT-DEBOUNCE-COUNTER-BASED")
    DIAG___EVENT___DEBOUNCE___COUNTER___BASED("DIAG-EVENT-DEBOUNCE-COUNTER-BASED"),
    @XmlEnumValue("DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL")
    DIAG___EVENT___DEBOUNCE___MONITOR___INTERNAL("DIAG-EVENT-DEBOUNCE-MONITOR-INTERNAL"),
    @XmlEnumValue("DIAG-EVENT-DEBOUNCE-TIME-BASED")
    DIAG___EVENT___DEBOUNCE___TIME___BASED("DIAG-EVENT-DEBOUNCE-TIME-BASED"),
    @XmlEnumValue("DIAGNOSTIC-ABSTRACT-DATA-IDENTIFIER")
    DIAGNOSTIC___ABSTRACT___DATA___IDENTIFIER("DIAGNOSTIC-ABSTRACT-DATA-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-ACCESS-PERMISSION")
    DIAGNOSTIC___ACCESS___PERMISSION("DIAGNOSTIC-ACCESS-PERMISSION"),
    @XmlEnumValue("DIAGNOSTIC-AGING")
    DIAGNOSTIC___AGING("DIAGNOSTIC-AGING"),
    @XmlEnumValue("DIAGNOSTIC-CAPABILITY-ELEMENT")
    DIAGNOSTIC___CAPABILITY___ELEMENT("DIAGNOSTIC-CAPABILITY-ELEMENT"),
    @XmlEnumValue("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION")
    DIAGNOSTIC___CLEAR___DIAGNOSTIC___INFORMATION("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION"),
    @XmlEnumValue("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS")
    DIAGNOSTIC___CLEAR___DIAGNOSTIC___INFORMATION___CLASS("DIAGNOSTIC-CLEAR-DIAGNOSTIC-INFORMATION-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-COM-CONTROL")
    DIAGNOSTIC___COM___CONTROL("DIAGNOSTIC-COM-CONTROL"),
    @XmlEnumValue("DIAGNOSTIC-COM-CONTROL-CLASS")
    DIAGNOSTIC___COM___CONTROL___CLASS("DIAGNOSTIC-COM-CONTROL-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-COMMON-ELEMENT")
    DIAGNOSTIC___COMMON___ELEMENT("DIAGNOSTIC-COMMON-ELEMENT"),
    @XmlEnumValue("DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS")
    DIAGNOSTIC___COMMUNICATION___MANAGER___NEEDS("DIAGNOSTIC-COMMUNICATION-MANAGER-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-CONDITION")
    DIAGNOSTIC___CONDITION("DIAGNOSTIC-CONDITION"),
    @XmlEnumValue("DIAGNOSTIC-CONDITION-GROUP")
    DIAGNOSTIC___CONDITION___GROUP("DIAGNOSTIC-CONDITION-GROUP"),
    @XmlEnumValue("DIAGNOSTIC-CONNECTED-INDICATOR")
    DIAGNOSTIC___CONNECTED___INDICATOR("DIAGNOSTIC-CONNECTED-INDICATOR"),
    @XmlEnumValue("DIAGNOSTIC-CONNECTION")
    DIAGNOSTIC___CONNECTION("DIAGNOSTIC-CONNECTION"),
    @XmlEnumValue("DIAGNOSTIC-CONTRIBUTION-SET")
    DIAGNOSTIC___CONTRIBUTION___SET("DIAGNOSTIC-CONTRIBUTION-SET"),
    @XmlEnumValue("DIAGNOSTIC-CONTROL-DTC-SETTING")
    DIAGNOSTIC___CONTROL___DTC___SETTING("DIAGNOSTIC-CONTROL-DTC-SETTING"),
    @XmlEnumValue("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS")
    DIAGNOSTIC___CONTROL___DTC___SETTING___CLASS("DIAGNOSTIC-CONTROL-DTC-SETTING-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-CUSTOM-SERVICE-CLASS")
    DIAGNOSTIC___CUSTOM___SERVICE___CLASS("DIAGNOSTIC-CUSTOM-SERVICE-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-DATA-BY-IDENTIFIER")
    DIAGNOSTIC___DATA___BY___IDENTIFIER("DIAGNOSTIC-DATA-BY-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-DATA-ELEMENT")
    DIAGNOSTIC___DATA___ELEMENT("DIAGNOSTIC-DATA-ELEMENT"),
    @XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER")
    DIAGNOSTIC___DATA___IDENTIFIER("DIAGNOSTIC-DATA-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-DATA-IDENTIFIER-SET")
    DIAGNOSTIC___DATA___IDENTIFIER___SET("DIAGNOSTIC-DATA-IDENTIFIER-SET"),
    @XmlEnumValue("DIAGNOSTIC-DATA-TRANSFER")
    DIAGNOSTIC___DATA___TRANSFER("DIAGNOSTIC-DATA-TRANSFER"),
    @XmlEnumValue("DIAGNOSTIC-DATA-TRANSFER-CLASS")
    DIAGNOSTIC___DATA___TRANSFER___CLASS("DIAGNOSTIC-DATA-TRANSFER-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING")
    DIAGNOSTIC___DEM___PROVIDED___DATA___MAPPING("DIAGNOSTIC-DEM-PROVIDED-DATA-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER")
    DIAGNOSTIC___DYNAMIC___DATA___IDENTIFIER("DIAGNOSTIC-DYNAMIC-DATA-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER")
    DIAGNOSTIC___DYNAMICALLY___DEFINE___DATA___IDENTIFIER("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS")
    DIAGNOSTIC___DYNAMICALLY___DEFINE___DATA___IDENTIFIER___CLASS("DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-ECU-RESET")
    DIAGNOSTIC___ECU___RESET("DIAGNOSTIC-ECU-RESET"),
    @XmlEnumValue("DIAGNOSTIC-ECU-RESET-CLASS")
    DIAGNOSTIC___ECU___RESET___CLASS("DIAGNOSTIC-ECU-RESET-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION")
    DIAGNOSTIC___ENABLE___CONDITION("DIAGNOSTIC-ENABLE-CONDITION"),
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-GROUP")
    DIAGNOSTIC___ENABLE___CONDITION___GROUP("DIAGNOSTIC-ENABLE-CONDITION-GROUP"),
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-NEEDS")
    DIAGNOSTIC___ENABLE___CONDITION___NEEDS("DIAGNOSTIC-ENABLE-CONDITION-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING")
    DIAGNOSTIC___ENABLE___CONDITION___PORT___MAPPING("DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EVENT")
    DIAGNOSTIC___EVENT("DIAGNOSTIC-EVENT"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-INFO-NEEDS")
    DIAGNOSTIC___EVENT___INFO___NEEDS("DIAGNOSTIC-EVENT-INFO-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-MANAGER-NEEDS")
    DIAGNOSTIC___EVENT___MANAGER___NEEDS("DIAGNOSTIC-EVENT-MANAGER-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-NEEDS")
    DIAGNOSTIC___EVENT___NEEDS("DIAGNOSTIC-EVENT-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-PORT-MAPPING")
    DIAGNOSTIC___EVENT___PORT___MAPPING("DIAGNOSTIC-EVENT-PORT-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING")
    DIAGNOSTIC___EVENT___TO___DEBOUNCE___ALGORITHM___MAPPING("DIAGNOSTIC-EVENT-TO-DEBOUNCE-ALGORITHM-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING")
    DIAGNOSTIC___EVENT___TO___ENABLE___CONDITION___GROUP___MAPPING("DIAGNOSTIC-EVENT-TO-ENABLE-CONDITION-GROUP-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING")
    DIAGNOSTIC___EVENT___TO___OPERATION___CYCLE___MAPPING("DIAGNOSTIC-EVENT-TO-OPERATION-CYCLE-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING")
    DIAGNOSTIC___EVENT___TO___STORAGE___CONDITION___GROUP___MAPPING("DIAGNOSTIC-EVENT-TO-STORAGE-CONDITION-GROUP-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING")
    DIAGNOSTIC___EVENT___TO___TROUBLE___CODE___UDS___MAPPING("DIAGNOSTIC-EVENT-TO-TROUBLE-CODE-UDS-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-EXTENDED-DATA-RECORD")
    DIAGNOSTIC___EXTENDED___DATA___RECORD("DIAGNOSTIC-EXTENDED-DATA-RECORD"),
    @XmlEnumValue("DIAGNOSTIC-FREEZE-FRAME")
    DIAGNOSTIC___FREEZE___FRAME("DIAGNOSTIC-FREEZE-FRAME"),
    @XmlEnumValue("DIAGNOSTIC-IO-CONTROL")
    DIAGNOSTIC___IO___CONTROL("DIAGNOSTIC-IO-CONTROL"),
    @XmlEnumValue("DIAGNOSTIC-INDICATOR")
    DIAGNOSTIC___INDICATOR("DIAGNOSTIC-INDICATOR"),
    @XmlEnumValue("DIAGNOSTIC-IO-CONTROL-CLASS")
    DIAGNOSTIC___IO___CONTROL___CLASS("DIAGNOSTIC-IO-CONTROL-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-IO-CONTROL-NEEDS")
    DIAGNOSTIC___IO___CONTROL___NEEDS("DIAGNOSTIC-IO-CONTROL-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-MAPPING")
    DIAGNOSTIC___MAPPING("DIAGNOSTIC-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-ADDRESSABLE-RANGE-ACCESS")
    DIAGNOSTIC___MEMORY___ADDRESSABLE___RANGE___ACCESS("DIAGNOSTIC-MEMORY-ADDRESSABLE-RANGE-ACCESS"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-BY-ADDRESS")
    DIAGNOSTIC___MEMORY___BY___ADDRESS("DIAGNOSTIC-MEMORY-BY-ADDRESS"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION")
    DIAGNOSTIC___MEMORY___DESTINATION("DIAGNOSTIC-MEMORY-DESTINATION"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR")
    DIAGNOSTIC___MEMORY___DESTINATION___MIRROR("DIAGNOSTIC-MEMORY-DESTINATION-MIRROR"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY")
    DIAGNOSTIC___MEMORY___DESTINATION___PRIMARY("DIAGNOSTIC-MEMORY-DESTINATION-PRIMARY"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED")
    DIAGNOSTIC___MEMORY___DESTINATION___USER___DEFINED("DIAGNOSTIC-MEMORY-DESTINATION-USER-DEFINED"),
    @XmlEnumValue("DIAGNOSTIC-MEMORY-IDENTIFIER")
    DIAGNOSTIC___MEMORY___IDENTIFIER("DIAGNOSTIC-MEMORY-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE")
    DIAGNOSTIC___OPERATION___CYCLE("DIAGNOSTIC-OPERATION-CYCLE"),
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE-NEEDS")
    DIAGNOSTIC___OPERATION___CYCLE___NEEDS("DIAGNOSTIC-OPERATION-CYCLE-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING")
    DIAGNOSTIC___OPERATION___CYCLE___PORT___MAPPING("DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-READ-DTC-INFORMATION")
    DIAGNOSTIC___READ___DTC___INFORMATION("DIAGNOSTIC-READ-DTC-INFORMATION"),
    @XmlEnumValue("DIAGNOSTIC-READ-DTC-INFORMATION-CLASS")
    DIAGNOSTIC___READ___DTC___INFORMATION___CLASS("DIAGNOSTIC-READ-DTC-INFORMATION-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER")
    DIAGNOSTIC___READ___DATA___BY___IDENTIFIER("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC___READ___DATA___BY___IDENTIFIER___CLASS("DIAGNOSTIC-READ-DATA-BY-IDENTIFIER-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID")
    DIAGNOSTIC___READ___DATA___BY___PERIODIC___ID("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID"),
    @XmlEnumValue("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS")
    DIAGNOSTIC___READ___DATA___BY___PERIODIC___ID___CLASS("DIAGNOSTIC-READ-DATA-BY-PERIODIC-ID-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS")
    DIAGNOSTIC___READ___MEMORY___BY___ADDRESS("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS"),
    @XmlEnumValue("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS")
    DIAGNOSTIC___READ___MEMORY___BY___ADDRESS___CLASS("DIAGNOSTIC-READ-MEMORY-BY-ADDRESS-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-DOWNLOAD")
    DIAGNOSTIC___REQUEST___DOWNLOAD("DIAGNOSTIC-REQUEST-DOWNLOAD"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS")
    DIAGNOSTIC___REQUEST___DOWNLOAD___CLASS("DIAGNOSTIC-REQUEST-DOWNLOAD-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-FILE-TRANSFER")
    DIAGNOSTIC___REQUEST___FILE___TRANSFER("DIAGNOSTIC-REQUEST-FILE-TRANSFER"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS")
    DIAGNOSTIC___REQUEST___FILE___TRANSFER___CLASS("DIAGNOSTIC-REQUEST-FILE-TRANSFER-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-ROUTINE-RESULTS")
    DIAGNOSTIC___REQUEST___ROUTINE___RESULTS("DIAGNOSTIC-REQUEST-ROUTINE-RESULTS"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-UPLOAD")
    DIAGNOSTIC___REQUEST___UPLOAD("DIAGNOSTIC-REQUEST-UPLOAD"),
    @XmlEnumValue("DIAGNOSTIC-REQUEST-UPLOAD-CLASS")
    DIAGNOSTIC___REQUEST___UPLOAD___CLASS("DIAGNOSTIC-REQUEST-UPLOAD-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-RESPONSE-ON-EVENT")
    DIAGNOSTIC___RESPONSE___ON___EVENT("DIAGNOSTIC-RESPONSE-ON-EVENT"),
    @XmlEnumValue("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS")
    DIAGNOSTIC___RESPONSE___ON___EVENT___CLASS("DIAGNOSTIC-RESPONSE-ON-EVENT-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-ROUTINE")
    DIAGNOSTIC___ROUTINE("DIAGNOSTIC-ROUTINE"),
    @XmlEnumValue("DIAGNOSTIC-ROUTINE-CONTROL")
    DIAGNOSTIC___ROUTINE___CONTROL("DIAGNOSTIC-ROUTINE-CONTROL"),
    @XmlEnumValue("DIAGNOSTIC-ROUTINE-CONTROL-CLASS")
    DIAGNOSTIC___ROUTINE___CONTROL___CLASS("DIAGNOSTIC-ROUTINE-CONTROL-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-ROUTINE-NEEDS")
    DIAGNOSTIC___ROUTINE___NEEDS("DIAGNOSTIC-ROUTINE-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-SECURITY-ACCESS")
    DIAGNOSTIC___SECURITY___ACCESS("DIAGNOSTIC-SECURITY-ACCESS"),
    @XmlEnumValue("DIAGNOSTIC-SECURITY-ACCESS-CLASS")
    DIAGNOSTIC___SECURITY___ACCESS___CLASS("DIAGNOSTIC-SECURITY-ACCESS-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-SECURITY-LEVEL")
    DIAGNOSTIC___SECURITY___LEVEL("DIAGNOSTIC-SECURITY-LEVEL"),
    @XmlEnumValue("DIAGNOSTIC-SERVICE-CLASS")
    DIAGNOSTIC___SERVICE___CLASS("DIAGNOSTIC-SERVICE-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-SERVICE-DATA-MAPPING")
    DIAGNOSTIC___SERVICE___DATA___MAPPING("DIAGNOSTIC-SERVICE-DATA-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-SERVICE-INSTANCE")
    DIAGNOSTIC___SERVICE___INSTANCE("DIAGNOSTIC-SERVICE-INSTANCE"),
    @XmlEnumValue("DIAGNOSTIC-SERVICE-SW-MAPPING")
    DIAGNOSTIC___SERVICE___SW___MAPPING("DIAGNOSTIC-SERVICE-SW-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-SERVICE-TABLE")
    DIAGNOSTIC___SERVICE___TABLE("DIAGNOSTIC-SERVICE-TABLE"),
    @XmlEnumValue("DIAGNOSTIC-SESSION")
    DIAGNOSTIC___SESSION("DIAGNOSTIC-SESSION"),
    @XmlEnumValue("DIAGNOSTIC-SESSION-CONTROL")
    DIAGNOSTIC___SESSION___CONTROL("DIAGNOSTIC-SESSION-CONTROL"),
    @XmlEnumValue("DIAGNOSTIC-SESSION-CONTROL-CLASS")
    DIAGNOSTIC___SESSION___CONTROL___CLASS("DIAGNOSTIC-SESSION-CONTROL-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-START-ROUTINE")
    DIAGNOSTIC___START___ROUTINE("DIAGNOSTIC-START-ROUTINE"),
    @XmlEnumValue("DIAGNOSTIC-STOP-ROUTINE")
    DIAGNOSTIC___STOP___ROUTINE("DIAGNOSTIC-STOP-ROUTINE"),
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION")
    DIAGNOSTIC___STORAGE___CONDITION("DIAGNOSTIC-STORAGE-CONDITION"),
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-GROUP")
    DIAGNOSTIC___STORAGE___CONDITION___GROUP("DIAGNOSTIC-STORAGE-CONDITION-GROUP"),
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-NEEDS")
    DIAGNOSTIC___STORAGE___CONDITION___NEEDS("DIAGNOSTIC-STORAGE-CONDITION-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING")
    DIAGNOSTIC___STORAGE___CONDITION___PORT___MAPPING("DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-SW-MAPPING")
    DIAGNOSTIC___SW___MAPPING("DIAGNOSTIC-SW-MAPPING"),
    @XmlEnumValue("DIAGNOSTIC-TRANSFER-EXIT")
    DIAGNOSTIC___TRANSFER___EXIT("DIAGNOSTIC-TRANSFER-EXIT"),
    @XmlEnumValue("DIAGNOSTIC-TRANSFER-EXIT-CLASS")
    DIAGNOSTIC___TRANSFER___EXIT___CLASS("DIAGNOSTIC-TRANSFER-EXIT-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE")
    DIAGNOSTIC___TROUBLE___CODE("DIAGNOSTIC-TROUBLE-CODE"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-GROUP")
    DIAGNOSTIC___TROUBLE___CODE___GROUP("DIAGNOSTIC-TROUBLE-CODE-GROUP"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-J-1939")
    DIAGNOSTIC___TROUBLE___CODE___J___1939("DIAGNOSTIC-TROUBLE-CODE-J-1939"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-OBD")
    DIAGNOSTIC___TROUBLE___CODE___OBD("DIAGNOSTIC-TROUBLE-CODE-OBD"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-PROPS")
    DIAGNOSTIC___TROUBLE___CODE___PROPS("DIAGNOSTIC-TROUBLE-CODE-PROPS"),
    @XmlEnumValue("DIAGNOSTIC-TROUBLE-CODE-UDS")
    DIAGNOSTIC___TROUBLE___CODE___UDS("DIAGNOSTIC-TROUBLE-CODE-UDS"),
    @XmlEnumValue("DIAGNOSTIC-VALUE-NEEDS")
    DIAGNOSTIC___VALUE___NEEDS("DIAGNOSTIC-VALUE-NEEDS"),
    @XmlEnumValue("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER")
    DIAGNOSTIC___WRITE___DATA___BY___IDENTIFIER("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER"),
    @XmlEnumValue("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS")
    DIAGNOSTIC___WRITE___DATA___BY___IDENTIFIER___CLASS("DIAGNOSTIC-WRITE-DATA-BY-IDENTIFIER-CLASS"),
    @XmlEnumValue("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS")
    DIAGNOSTIC___WRITE___MEMORY___BY___ADDRESS("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS"),
    @XmlEnumValue("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS")
    DIAGNOSTIC___WRITE___MEMORY___BY___ADDRESS___CLASS("DIAGNOSTIC-WRITE-MEMORY-BY-ADDRESS-CLASS"),
    @XmlEnumValue("DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS")
    DIAGNOSTICS___COMMUNICATION___SECURITY___NEEDS("DIAGNOSTICS-COMMUNICATION-SECURITY-NEEDS"),
    @XmlEnumValue("DLT-USER-NEEDS")
    DLT___USER___NEEDS("DLT-USER-NEEDS"),
    @XmlEnumValue("DO-IP-ACTIVATION-LINE-NEEDS")
    DO___IP___ACTIVATION___LINE___NEEDS("DO-IP-ACTIVATION-LINE-NEEDS"),
    @XmlEnumValue("DO-IP-GID-NEEDS")
    DO___IP___GID___NEEDS("DO-IP-GID-NEEDS"),
    @XmlEnumValue("DO-IP-GID-SYNCHRONIZATION-NEEDS")
    DO___IP___GID___SYNCHRONIZATION___NEEDS("DO-IP-GID-SYNCHRONIZATION-NEEDS"),
    @XmlEnumValue("DO-IP-POWER-MODE-STATUS-NEEDS")
    DO___IP___POWER___MODE___STATUS___NEEDS("DO-IP-POWER-MODE-STATUS-NEEDS"),
    @XmlEnumValue("DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS")
    DO___IP___ROUTING___ACTIVATION___AUTHENTICATION___NEEDS("DO-IP-ROUTING-ACTIVATION-AUTHENTICATION-NEEDS"),
    @XmlEnumValue("DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS")
    DO___IP___ROUTING___ACTIVATION___CONFIRMATION___NEEDS("DO-IP-ROUTING-ACTIVATION-CONFIRMATION-NEEDS"),
    @XmlEnumValue("DO-IP-SERVICE-NEEDS")
    DO___IP___SERVICE___NEEDS("DO-IP-SERVICE-NEEDS"),
    DOCUMENTATION("DOCUMENTATION"),
    @XmlEnumValue("DTC-STATUS-CHANGE-NOTIFICATION-NEEDS")
    DTC___STATUS___CHANGE___NOTIFICATION___NEEDS("DTC-STATUS-CHANGE-NOTIFICATION-NEEDS"),
    @XmlEnumValue("ECU-MAPPING")
    ECU___MAPPING("ECU-MAPPING"),
    @XmlEnumValue("EOC-EVENT-REF")
    EOC___EVENT___REF("EOC-EVENT-REF"),
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF")
    EOC___EXECUTABLE___ENTITY___REF("EOC-EXECUTABLE-ENTITY-REF"),
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF-ABSTRACT")
    EOC___EXECUTABLE___ENTITY___REF___ABSTRACT("EOC-EXECUTABLE-ENTITY-REF-ABSTRACT"),
    @XmlEnumValue("EOC-EXECUTABLE-ENTITY-REF-GROUP")
    EOC___EXECUTABLE___ENTITY___REF___GROUP("EOC-EXECUTABLE-ENTITY-REF-GROUP"),
    @XmlEnumValue("ECU-ABSTRACTION-SW-COMPONENT-TYPE")
    ECU___ABSTRACTION___SW___COMPONENT___TYPE("ECU-ABSTRACTION-SW-COMPONENT-TYPE"),
    @XmlEnumValue("ECU-INSTANCE")
    ECU___INSTANCE("ECU-INSTANCE"),
    @XmlEnumValue("ECU-PARTITION")
    ECU___PARTITION("ECU-PARTITION"),
    @XmlEnumValue("ECU-STATE-MGR-USER-NEEDS")
    ECU___STATE___MGR___USER___NEEDS("ECU-STATE-MGR-USER-NEEDS"),
    @XmlEnumValue("ECU-TIMING")
    ECU___TIMING("ECU-TIMING"),
    @XmlEnumValue("ECUC-ABSTRACT-REFERENCE-DEF")
    ECUC___ABSTRACT___REFERENCE___DEF("ECUC-ABSTRACT-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-ABSTRACT-STRING-PARAM-DEF")
    ECUC___ABSTRACT___STRING___PARAM___DEF("ECUC-ABSTRACT-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-ADD-INFO-PARAM-DEF")
    ECUC___ADD___INFO___PARAM___DEF("ECUC-ADD-INFO-PARAM-DEF"),
    @XmlEnumValue("ECUC-BOOLEAN-PARAM-DEF")
    ECUC___BOOLEAN___PARAM___DEF("ECUC-BOOLEAN-PARAM-DEF"),
    @XmlEnumValue("ECUC-CHOICE-CONTAINER-DEF")
    ECUC___CHOICE___CONTAINER___DEF("ECUC-CHOICE-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-CHOICE-REFERENCE-DEF")
    ECUC___CHOICE___REFERENCE___DEF("ECUC-CHOICE-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-COMMON-ATTRIBUTES")
    ECUC___COMMON___ATTRIBUTES("ECUC-COMMON-ATTRIBUTES"),
    @XmlEnumValue("ECUC-CONTAINER-DEF")
    ECUC___CONTAINER___DEF("ECUC-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-CONTAINER-VALUE")
    ECUC___CONTAINER___VALUE("ECUC-CONTAINER-VALUE"),
    @XmlEnumValue("ECUC-DEFINITION-COLLECTION")
    ECUC___DEFINITION___COLLECTION("ECUC-DEFINITION-COLLECTION"),
    @XmlEnumValue("ECUC-DEFINITION-ELEMENT")
    ECUC___DEFINITION___ELEMENT("ECUC-DEFINITION-ELEMENT"),
    @XmlEnumValue("ECUC-DESTINATION-URI-DEF")
    ECUC___DESTINATION___URI___DEF("ECUC-DESTINATION-URI-DEF"),
    @XmlEnumValue("ECUC-DESTINATION-URI-DEF-SET")
    ECUC___DESTINATION___URI___DEF___SET("ECUC-DESTINATION-URI-DEF-SET"),
    @XmlEnumValue("ECUC-ENUMERATION-LITERAL-DEF")
    ECUC___ENUMERATION___LITERAL___DEF("ECUC-ENUMERATION-LITERAL-DEF"),
    @XmlEnumValue("ECUC-ENUMERATION-PARAM-DEF")
    ECUC___ENUMERATION___PARAM___DEF("ECUC-ENUMERATION-PARAM-DEF"),
    @XmlEnumValue("ECUC-FLOAT-PARAM-DEF")
    ECUC___FLOAT___PARAM___DEF("ECUC-FLOAT-PARAM-DEF"),
    @XmlEnumValue("ECUC-FOREIGN-REFERENCE-DEF")
    ECUC___FOREIGN___REFERENCE___DEF("ECUC-FOREIGN-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-FUNCTION-NAME-DEF")
    ECUC___FUNCTION___NAME___DEF("ECUC-FUNCTION-NAME-DEF"),
    @XmlEnumValue("ECUC-INSTANCE-REFERENCE-DEF")
    ECUC___INSTANCE___REFERENCE___DEF("ECUC-INSTANCE-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-INTEGER-PARAM-DEF")
    ECUC___INTEGER___PARAM___DEF("ECUC-INTEGER-PARAM-DEF"),
    @XmlEnumValue("ECUC-LINKER-SYMBOL-DEF")
    ECUC___LINKER___SYMBOL___DEF("ECUC-LINKER-SYMBOL-DEF"),
    @XmlEnumValue("ECUC-MODULE-CONFIGURATION-VALUES")
    ECUC___MODULE___CONFIGURATION___VALUES("ECUC-MODULE-CONFIGURATION-VALUES"),
    @XmlEnumValue("ECUC-MODULE-DEF")
    ECUC___MODULE___DEF("ECUC-MODULE-DEF"),
    @XmlEnumValue("ECUC-MULTILINE-STRING-PARAM-DEF")
    ECUC___MULTILINE___STRING___PARAM___DEF("ECUC-MULTILINE-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-PARAM-CONF-CONTAINER-DEF")
    ECUC___PARAM___CONF___CONTAINER___DEF("ECUC-PARAM-CONF-CONTAINER-DEF"),
    @XmlEnumValue("ECUC-PARAMETER-DEF")
    ECUC___PARAMETER___DEF("ECUC-PARAMETER-DEF"),
    @XmlEnumValue("ECUC-QUERY")
    ECUC___QUERY("ECUC-QUERY"),
    @XmlEnumValue("ECUC-REFERENCE-DEF")
    ECUC___REFERENCE___DEF("ECUC-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-STRING-PARAM-DEF")
    ECUC___STRING___PARAM___DEF("ECUC-STRING-PARAM-DEF"),
    @XmlEnumValue("ECUC-SYMBOLIC-NAME-REFERENCE-DEF")
    ECUC___SYMBOLIC___NAME___REFERENCE___DEF("ECUC-SYMBOLIC-NAME-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-URI-REFERENCE-DEF")
    ECUC___URI___REFERENCE___DEF("ECUC-URI-REFERENCE-DEF"),
    @XmlEnumValue("ECUC-VALIDATION-CONDITION")
    ECUC___VALIDATION___CONDITION("ECUC-VALIDATION-CONDITION"),
    @XmlEnumValue("ECUC-VALUE-COLLECTION")
    ECUC___VALUE___COLLECTION("ECUC-VALUE-COLLECTION"),
    @XmlEnumValue("END-TO-END-PROTECTION")
    END___TO___END___PROTECTION("END-TO-END-PROTECTION"),
    @XmlEnumValue("END-TO-END-PROTECTION-SET")
    END___TO___END___PROTECTION___SET("END-TO-END-PROTECTION-SET"),
    @XmlEnumValue("ETHERNET-CLUSTER")
    ETHERNET___CLUSTER("ETHERNET-CLUSTER"),
    @XmlEnumValue("ETHERNET-COMMUNICATION-CONNECTOR")
    ETHERNET___COMMUNICATION___CONNECTOR("ETHERNET-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("ETHERNET-COMMUNICATION-CONTROLLER")
    ETHERNET___COMMUNICATION___CONTROLLER("ETHERNET-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("ETHERNET-FRAME")
    ETHERNET___FRAME("ETHERNET-FRAME"),
    @XmlEnumValue("ETHERNET-FRAME-TRIGGERING")
    ETHERNET___FRAME___TRIGGERING("ETHERNET-FRAME-TRIGGERING"),
    @XmlEnumValue("ETHERNET-PHYSICAL-CHANNEL")
    ETHERNET___PHYSICAL___CHANNEL("ETHERNET-PHYSICAL-CHANNEL"),
    @XmlEnumValue("EVALUATED-VARIANT-SET")
    EVALUATED___VARIANT___SET("EVALUATED-VARIANT-SET"),
    @XmlEnumValue("EVENT-TRIGGERING-CONSTRAINT")
    EVENT___TRIGGERING___CONSTRAINT("EVENT-TRIGGERING-CONSTRAINT"),
    @XmlEnumValue("EXCLUSIVE-AREA")
    EXCLUSIVE___AREA("EXCLUSIVE-AREA"),
    @XmlEnumValue("EXECUTABLE-ENTITY")
    EXECUTABLE___ENTITY("EXECUTABLE-ENTITY"),
    @XmlEnumValue("EXECUTION-ORDER-CONSTRAINT")
    EXECUTION___ORDER___CONSTRAINT("EXECUTION-ORDER-CONSTRAINT"),
    @XmlEnumValue("EXECUTION-TIME")
    EXECUTION___TIME("EXECUTION-TIME"),
    @XmlEnumValue("EXECUTION-TIME-CONSTRAINT")
    EXECUTION___TIME___CONSTRAINT("EXECUTION-TIME-CONSTRAINT"),
    @XmlEnumValue("EXTERNAL-TRIGGER-OCCURRED-EVENT")
    EXTERNAL___TRIGGER___OCCURRED___EVENT("EXTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("EXTERNAL-TRIGGERING-POINT-IDENT")
    EXTERNAL___TRIGGERING___POINT___IDENT("EXTERNAL-TRIGGERING-POINT-IDENT"),
    @XmlEnumValue("FM-ATTRIBUTE-DEF")
    FM___ATTRIBUTE___DEF("FM-ATTRIBUTE-DEF"),
    @XmlEnumValue("FM-FEATURE")
    FM___FEATURE("FM-FEATURE"),
    @XmlEnumValue("FM-FEATURE-MAP")
    FM___FEATURE___MAP("FM-FEATURE-MAP"),
    @XmlEnumValue("FM-FEATURE-MAP-ASSERTION")
    FM___FEATURE___MAP___ASSERTION("FM-FEATURE-MAP-ASSERTION"),
    @XmlEnumValue("FM-FEATURE-MAP-CONDITION")
    FM___FEATURE___MAP___CONDITION("FM-FEATURE-MAP-CONDITION"),
    @XmlEnumValue("FM-FEATURE-MAP-ELEMENT")
    FM___FEATURE___MAP___ELEMENT("FM-FEATURE-MAP-ELEMENT"),
    @XmlEnumValue("FM-FEATURE-MODEL")
    FM___FEATURE___MODEL("FM-FEATURE-MODEL"),
    @XmlEnumValue("FM-FEATURE-RELATION")
    FM___FEATURE___RELATION("FM-FEATURE-RELATION"),
    @XmlEnumValue("FM-FEATURE-RESTRICTION")
    FM___FEATURE___RESTRICTION("FM-FEATURE-RESTRICTION"),
    @XmlEnumValue("FM-FEATURE-SELECTION")
    FM___FEATURE___SELECTION("FM-FEATURE-SELECTION"),
    @XmlEnumValue("FM-FEATURE-SELECTION-SET")
    FM___FEATURE___SELECTION___SET("FM-FEATURE-SELECTION-SET"),
    @XmlEnumValue("FIBEX-ELEMENT")
    FIBEX___ELEMENT("FIBEX-ELEMENT"),
    @XmlEnumValue("FLAT-INSTANCE-DESCRIPTOR")
    FLAT___INSTANCE___DESCRIPTOR("FLAT-INSTANCE-DESCRIPTOR"),
    @XmlEnumValue("FLAT-MAP")
    FLAT___MAP("FLAT-MAP"),
    @XmlEnumValue("FLEXRAY-AR-TP-CONFIG")
    FLEXRAY___AR___TP___CONFIG("FLEXRAY-AR-TP-CONFIG"),
    @XmlEnumValue("FLEXRAY-AR-TP-NODE")
    FLEXRAY___AR___TP___NODE("FLEXRAY-AR-TP-NODE"),
    @XmlEnumValue("FLEXRAY-CLUSTER")
    FLEXRAY___CLUSTER("FLEXRAY-CLUSTER"),
    @XmlEnumValue("FLEXRAY-COMMUNICATION-CONNECTOR")
    FLEXRAY___COMMUNICATION___CONNECTOR("FLEXRAY-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("FLEXRAY-COMMUNICATION-CONTROLLER")
    FLEXRAY___COMMUNICATION___CONTROLLER("FLEXRAY-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("FLEXRAY-FRAME")
    FLEXRAY___FRAME("FLEXRAY-FRAME"),
    @XmlEnumValue("FLEXRAY-FRAME-TRIGGERING")
    FLEXRAY___FRAME___TRIGGERING("FLEXRAY-FRAME-TRIGGERING"),
    @XmlEnumValue("FLEXRAY-NM-CLUSTER")
    FLEXRAY___NM___CLUSTER("FLEXRAY-NM-CLUSTER"),
    @XmlEnumValue("FLEXRAY-NM-NODE")
    FLEXRAY___NM___NODE("FLEXRAY-NM-NODE"),
    @XmlEnumValue("FLEXRAY-PHYSICAL-CHANNEL")
    FLEXRAY___PHYSICAL___CHANNEL("FLEXRAY-PHYSICAL-CHANNEL"),
    @XmlEnumValue("FLEXRAY-TP-CONFIG")
    FLEXRAY___TP___CONFIG("FLEXRAY-TP-CONFIG"),
    @XmlEnumValue("FLEXRAY-TP-CONNECTION-CONTROL")
    FLEXRAY___TP___CONNECTION___CONTROL("FLEXRAY-TP-CONNECTION-CONTROL"),
    @XmlEnumValue("FLEXRAY-TP-NODE")
    FLEXRAY___TP___NODE("FLEXRAY-TP-NODE"),
    @XmlEnumValue("FLEXRAY-TP-PDU-POOL")
    FLEXRAY___TP___PDU___POOL("FLEXRAY-TP-PDU-POOL"),
    FRAME("FRAME"),
    @XmlEnumValue("FRAME-PORT")
    FRAME___PORT("FRAME-PORT"),
    @XmlEnumValue("FRAME-TRIGGERING")
    FRAME___TRIGGERING("FRAME-TRIGGERING"),
    @XmlEnumValue("FUNCTION-INHIBITION-NEEDS")
    FUNCTION___INHIBITION___NEEDS("FUNCTION-INHIBITION-NEEDS"),
    GATEWAY("GATEWAY"),
    @XmlEnumValue("GENERAL-PARAMETER")
    GENERAL___PARAMETER("GENERAL-PARAMETER"),
    @XmlEnumValue("GENERAL-PURPOSE-I-PDU")
    GENERAL___PURPOSE___I___PDU("GENERAL-PURPOSE-I-PDU"),
    @XmlEnumValue("GENERAL-PURPOSE-PDU")
    GENERAL___PURPOSE___PDU("GENERAL-PURPOSE-PDU"),
    @XmlEnumValue("GENERIC-ETHERNET-FRAME")
    GENERIC___ETHERNET___FRAME("GENERIC-ETHERNET-FRAME"),
    @XmlEnumValue("GLOBAL-TIME-CAN-MASTER")
    GLOBAL___TIME___CAN___MASTER("GLOBAL-TIME-CAN-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-CAN-SLAVE")
    GLOBAL___TIME___CAN___SLAVE("GLOBAL-TIME-CAN-SLAVE"),
    @XmlEnumValue("GLOBAL-TIME-DOMAIN")
    GLOBAL___TIME___DOMAIN("GLOBAL-TIME-DOMAIN"),
    @XmlEnumValue("GLOBAL-TIME-ETH-MASTER")
    GLOBAL___TIME___ETH___MASTER("GLOBAL-TIME-ETH-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-ETH-SLAVE")
    GLOBAL___TIME___ETH___SLAVE("GLOBAL-TIME-ETH-SLAVE"),
    @XmlEnumValue("GLOBAL-TIME-FR-MASTER")
    GLOBAL___TIME___FR___MASTER("GLOBAL-TIME-FR-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-FR-SLAVE")
    GLOBAL___TIME___FR___SLAVE("GLOBAL-TIME-FR-SLAVE"),
    @XmlEnumValue("GLOBAL-TIME-GATEWAY")
    GLOBAL___TIME___GATEWAY("GLOBAL-TIME-GATEWAY"),
    @XmlEnumValue("GLOBAL-TIME-MASTER")
    GLOBAL___TIME___MASTER("GLOBAL-TIME-MASTER"),
    @XmlEnumValue("GLOBAL-TIME-SLAVE")
    GLOBAL___TIME___SLAVE("GLOBAL-TIME-SLAVE"),
    @XmlEnumValue("HEAP-USAGE")
    HEAP___USAGE("HEAP-USAGE"),
    @XmlEnumValue("HW-ATTRIBUTE-DEF")
    HW___ATTRIBUTE___DEF("HW-ATTRIBUTE-DEF"),
    @XmlEnumValue("HW-ATTRIBUTE-LITERAL-DEF")
    HW___ATTRIBUTE___LITERAL___DEF("HW-ATTRIBUTE-LITERAL-DEF"),
    @XmlEnumValue("HW-CATEGORY")
    HW___CATEGORY("HW-CATEGORY"),
    @XmlEnumValue("HW-ELEMENT")
    HW___ELEMENT("HW-ELEMENT"),
    @XmlEnumValue("HW-PIN")
    HW___PIN("HW-PIN"),
    @XmlEnumValue("HW-PIN-GROUP")
    HW___PIN___GROUP("HW-PIN-GROUP"),
    @XmlEnumValue("HW-TYPE")
    HW___TYPE("HW-TYPE"),
    @XmlEnumValue("I-PDU")
    I___PDU("I-PDU"),
    @XmlEnumValue("I-PDU-PORT")
    I___PDU___PORT("I-PDU-PORT"),
    @XmlEnumValue("I-SIGNAL")
    I___SIGNAL("I-SIGNAL"),
    @XmlEnumValue("I-SIGNAL-GROUP")
    I___SIGNAL___GROUP("I-SIGNAL-GROUP"),
    @XmlEnumValue("I-SIGNAL-I-PDU")
    I___SIGNAL___I___PDU("I-SIGNAL-I-PDU"),
    @XmlEnumValue("I-SIGNAL-I-PDU-GROUP")
    I___SIGNAL___I___PDU___GROUP("I-SIGNAL-I-PDU-GROUP"),
    @XmlEnumValue("I-SIGNAL-PORT")
    I___SIGNAL___PORT("I-SIGNAL-PORT"),
    @XmlEnumValue("I-SIGNAL-TO-I-PDU-MAPPING")
    I___SIGNAL___TO___I___PDU___MAPPING("I-SIGNAL-TO-I-PDU-MAPPING"),
    @XmlEnumValue("I-SIGNAL-TRIGGERING")
    I___SIGNAL___TRIGGERING("I-SIGNAL-TRIGGERING"),
    @XmlEnumValue("IDENT-CAPTION")
    IDENT___CAPTION("IDENT-CAPTION"),
    IDENTIFIABLE("IDENTIFIABLE"),
    @XmlEnumValue("IEEE-1722-TP-ETHERNET-FRAME")
    IEEE___1722___TP___ETHERNET___FRAME("IEEE-1722-TP-ETHERNET-FRAME"),
    IMPLEMENTATION("IMPLEMENTATION"),
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE")
    IMPLEMENTATION___DATA___TYPE("IMPLEMENTATION-DATA-TYPE"),
    @XmlEnumValue("IMPLEMENTATION-DATA-TYPE-ELEMENT")
    IMPLEMENTATION___DATA___TYPE___ELEMENT("IMPLEMENTATION-DATA-TYPE-ELEMENT"),
    @XmlEnumValue("INIT-EVENT")
    INIT___EVENT("INIT-EVENT"),
    @XmlEnumValue("INTERNAL-BEHAVIOR")
    INTERNAL___BEHAVIOR("INTERNAL-BEHAVIOR"),
    @XmlEnumValue("INTERNAL-TRIGGER-OCCURRED-EVENT")
    INTERNAL___TRIGGER___OCCURRED___EVENT("INTERNAL-TRIGGER-OCCURRED-EVENT"),
    @XmlEnumValue("INTERNAL-TRIGGERING-POINT")
    INTERNAL___TRIGGERING___POINT("INTERNAL-TRIGGERING-POINT"),
    @XmlEnumValue("INTERPOLATION-ROUTINE-MAPPING-SET")
    INTERPOLATION___ROUTINE___MAPPING___SET("INTERPOLATION-ROUTINE-MAPPING-SET"),
    @XmlEnumValue("J-1939-CLUSTER")
    J___1939___CLUSTER("J-1939-CLUSTER"),
    @XmlEnumValue("J-1939-DCM-I-PDU")
    J___1939___DCM___I___PDU("J-1939-DCM-I-PDU"),
    @XmlEnumValue("J-1939-NM-CLUSTER")
    J___1939___NM___CLUSTER("J-1939-NM-CLUSTER"),
    @XmlEnumValue("J-1939-NM-NODE")
    J___1939___NM___NODE("J-1939-NM-NODE"),
    @XmlEnumValue("J-1939-TP-CONFIG")
    J___1939___TP___CONFIG("J-1939-TP-CONFIG"),
    @XmlEnumValue("J-1939-TP-NODE")
    J___1939___TP___NODE("J-1939-TP-NODE"),
    KEYWORD("KEYWORD"),
    @XmlEnumValue("KEYWORD-SET")
    KEYWORD___SET("KEYWORD-SET"),
    @XmlEnumValue("LATENCY-TIMING-CONSTRAINT")
    LATENCY___TIMING___CONSTRAINT("LATENCY-TIMING-CONSTRAINT"),
    @XmlEnumValue("LIFE-CYCLE-INFO-SET")
    LIFE___CYCLE___INFO___SET("LIFE-CYCLE-INFO-SET"),
    @XmlEnumValue("LIFE-CYCLE-STATE")
    LIFE___CYCLE___STATE("LIFE-CYCLE-STATE"),
    @XmlEnumValue("LIFE-CYCLE-STATE-DEFINITION-GROUP")
    LIFE___CYCLE___STATE___DEFINITION___GROUP("LIFE-CYCLE-STATE-DEFINITION-GROUP"),
    @XmlEnumValue("LIN-CLUSTER")
    LIN___CLUSTER("LIN-CLUSTER"),
    @XmlEnumValue("LIN-COMMUNICATION-CONNECTOR")
    LIN___COMMUNICATION___CONNECTOR("LIN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("LIN-COMMUNICATION-CONTROLLER")
    LIN___COMMUNICATION___CONTROLLER("LIN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("LIN-EVENT-TRIGGERED-FRAME")
    LIN___EVENT___TRIGGERED___FRAME("LIN-EVENT-TRIGGERED-FRAME"),
    @XmlEnumValue("LIN-FRAME")
    LIN___FRAME("LIN-FRAME"),
    @XmlEnumValue("LIN-FRAME-TRIGGERING")
    LIN___FRAME___TRIGGERING("LIN-FRAME-TRIGGERING"),
    @XmlEnumValue("LIN-MASTER")
    LIN___MASTER("LIN-MASTER"),
    @XmlEnumValue("LIN-PHYSICAL-CHANNEL")
    LIN___PHYSICAL___CHANNEL("LIN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("LIN-SCHEDULE-TABLE")
    LIN___SCHEDULE___TABLE("LIN-SCHEDULE-TABLE"),
    @XmlEnumValue("LIN-SLAVE")
    LIN___SLAVE("LIN-SLAVE"),
    @XmlEnumValue("LIN-SPORADIC-FRAME")
    LIN___SPORADIC___FRAME("LIN-SPORADIC-FRAME"),
    @XmlEnumValue("LIN-TP-CONFIG")
    LIN___TP___CONFIG("LIN-TP-CONFIG"),
    @XmlEnumValue("LIN-TP-NODE")
    LIN___TP___NODE("LIN-TP-NODE"),
    @XmlEnumValue("LIN-UNCONDITIONAL-FRAME")
    LIN___UNCONDITIONAL___FRAME("LIN-UNCONDITIONAL-FRAME"),
    LINKER("LINKER"),
    @XmlEnumValue("LOGIC-ADDRESS")
    LOGIC___ADDRESS("LOGIC-ADDRESS"),
    @XmlEnumValue("MAC-MULTICAST-GROUP")
    MAC___MULTICAST___GROUP("MAC-MULTICAST-GROUP"),
    @XmlEnumValue("MC-DATA-INSTANCE")
    MC___DATA___INSTANCE("MC-DATA-INSTANCE"),
    @XmlEnumValue("MC-FUNCTION")
    MC___FUNCTION("MC-FUNCTION"),
    @XmlEnumValue("MEASURED-EXECUTION-TIME")
    MEASURED___EXECUTION___TIME("MEASURED-EXECUTION-TIME"),
    @XmlEnumValue("MEASURED-HEAP-USAGE")
    MEASURED___HEAP___USAGE("MEASURED-HEAP-USAGE"),
    @XmlEnumValue("MEASURED-STACK-USAGE")
    MEASURED___STACK___USAGE("MEASURED-STACK-USAGE"),
    @XmlEnumValue("MEMORY-SECTION")
    MEMORY___SECTION("MEMORY-SECTION"),
    @XmlEnumValue("MODE-ACCESS-POINT-IDENT")
    MODE___ACCESS___POINT___IDENT("MODE-ACCESS-POINT-IDENT"),
    @XmlEnumValue("MODE-DECLARATION")
    MODE___DECLARATION("MODE-DECLARATION"),
    @XmlEnumValue("MODE-DECLARATION-GROUP")
    MODE___DECLARATION___GROUP("MODE-DECLARATION-GROUP"),
    @XmlEnumValue("MODE-DECLARATION-GROUP-PROTOTYPE")
    MODE___DECLARATION___GROUP___PROTOTYPE("MODE-DECLARATION-GROUP-PROTOTYPE"),
    @XmlEnumValue("MODE-DECLARATION-MAPPING")
    MODE___DECLARATION___MAPPING("MODE-DECLARATION-MAPPING"),
    @XmlEnumValue("MODE-DECLARATION-MAPPING-SET")
    MODE___DECLARATION___MAPPING___SET("MODE-DECLARATION-MAPPING-SET"),
    @XmlEnumValue("MODE-INTERFACE-MAPPING")
    MODE___INTERFACE___MAPPING("MODE-INTERFACE-MAPPING"),
    @XmlEnumValue("MODE-SWITCH-INTERFACE")
    MODE___SWITCH___INTERFACE("MODE-SWITCH-INTERFACE"),
    @XmlEnumValue("MODE-SWITCH-POINT")
    MODE___SWITCH___POINT("MODE-SWITCH-POINT"),
    @XmlEnumValue("MODE-SWITCHED-ACK-EVENT")
    MODE___SWITCHED___ACK___EVENT("MODE-SWITCHED-ACK-EVENT"),
    @XmlEnumValue("MODE-TRANSITION")
    MODE___TRANSITION("MODE-TRANSITION"),
    @XmlEnumValue("MULTIPLEXED-I-PDU")
    MULTIPLEXED___I___PDU("MULTIPLEXED-I-PDU"),
    @XmlEnumValue("N-PDU")
    N___PDU("N-PDU"),
    @XmlEnumValue("NETWORK-ENDPOINT")
    NETWORK___ENDPOINT("NETWORK-ENDPOINT"),
    @XmlEnumValue("NM-CLUSTER")
    NM___CLUSTER("NM-CLUSTER"),
    @XmlEnumValue("NM-CONFIG")
    NM___CONFIG("NM-CONFIG"),
    @XmlEnumValue("NM-ECU")
    NM___ECU("NM-ECU"),
    @XmlEnumValue("NM-NODE")
    NM___NODE("NM-NODE"),
    @XmlEnumValue("NM-PDU")
    NM___PDU("NM-PDU"),
    @XmlEnumValue("NV-BLOCK-DESCRIPTOR")
    NV___BLOCK___DESCRIPTOR("NV-BLOCK-DESCRIPTOR"),
    @XmlEnumValue("NV-BLOCK-NEEDS")
    NV___BLOCK___NEEDS("NV-BLOCK-NEEDS"),
    @XmlEnumValue("NV-BLOCK-SW-COMPONENT-TYPE")
    NV___BLOCK___SW___COMPONENT___TYPE("NV-BLOCK-SW-COMPONENT-TYPE"),
    @XmlEnumValue("NV-DATA-INTERFACE")
    NV___DATA___INTERFACE("NV-DATA-INTERFACE"),
    @XmlEnumValue("OBD-CONTROL-SERVICE-NEEDS")
    OBD___CONTROL___SERVICE___NEEDS("OBD-CONTROL-SERVICE-NEEDS"),
    @XmlEnumValue("OBD-INFO-SERVICE-NEEDS")
    OBD___INFO___SERVICE___NEEDS("OBD-INFO-SERVICE-NEEDS"),
    @XmlEnumValue("OBD-MONITOR-SERVICE-NEEDS")
    OBD___MONITOR___SERVICE___NEEDS("OBD-MONITOR-SERVICE-NEEDS"),
    @XmlEnumValue("OBD-PID-SERVICE-NEEDS")
    OBD___PID___SERVICE___NEEDS("OBD-PID-SERVICE-NEEDS"),
    @XmlEnumValue("OBD-RATIO-SERVICE-NEEDS")
    OBD___RATIO___SERVICE___NEEDS("OBD-RATIO-SERVICE-NEEDS"),
    @XmlEnumValue("OFFSET-TIMING-CONSTRAINT")
    OFFSET___TIMING___CONSTRAINT("OFFSET-TIMING-CONSTRAINT"),
    @XmlEnumValue("OPERATION-INVOKED-EVENT")
    OPERATION___INVOKED___EVENT("OPERATION-INVOKED-EVENT"),
    @XmlEnumValue("P-PORT-PROTOTYPE")
    P___PORT___PROTOTYPE("P-PORT-PROTOTYPE"),
    @XmlEnumValue("PR-PORT-PROTOTYPE")
    PR___PORT___PROTOTYPE("PR-PORT-PROTOTYPE"),
    @XmlEnumValue("PACKAGEABLE-ELEMENT")
    PACKAGEABLE___ELEMENT("PACKAGEABLE-ELEMENT"),
    @XmlEnumValue("PARAMETER-ACCESS")
    PARAMETER___ACCESS("PARAMETER-ACCESS"),
    @XmlEnumValue("PARAMETER-DATA-PROTOTYPE")
    PARAMETER___DATA___PROTOTYPE("PARAMETER-DATA-PROTOTYPE"),
    @XmlEnumValue("PARAMETER-INTERFACE")
    PARAMETER___INTERFACE("PARAMETER-INTERFACE"),
    @XmlEnumValue("PARAMETER-SW-COMPONENT-TYPE")
    PARAMETER___SW___COMPONENT___TYPE("PARAMETER-SW-COMPONENT-TYPE"),
    @XmlEnumValue("PASS-THROUGH-SW-CONNECTOR")
    PASS___THROUGH___SW___CONNECTOR("PASS-THROUGH-SW-CONNECTOR"),
    PDU("PDU"),
    @XmlEnumValue("PDU-TO-FRAME-MAPPING")
    PDU___TO___FRAME___MAPPING("PDU-TO-FRAME-MAPPING"),
    @XmlEnumValue("PDU-TRIGGERING")
    PDU___TRIGGERING("PDU-TRIGGERING"),
    @XmlEnumValue("PDUR-I-PDU-GROUP")
    PDUR___I___PDU___GROUP("PDUR-I-PDU-GROUP"),
    @XmlEnumValue("PER-INSTANCE-MEMORY")
    PER___INSTANCE___MEMORY("PER-INSTANCE-MEMORY"),
    @XmlEnumValue("PERIODIC-EVENT-TRIGGERING")
    PERIODIC___EVENT___TRIGGERING("PERIODIC-EVENT-TRIGGERING"),
    @XmlEnumValue("PHYSICAL-CHANNEL")
    PHYSICAL___CHANNEL("PHYSICAL-CHANNEL"),
    @XmlEnumValue("PHYSICAL-DIMENSION")
    PHYSICAL___DIMENSION("PHYSICAL-DIMENSION"),
    @XmlEnumValue("PHYSICAL-DIMENSION-MAPPING-SET")
    PHYSICAL___DIMENSION___MAPPING___SET("PHYSICAL-DIMENSION-MAPPING-SET"),
    @XmlEnumValue("PORT-GROUP")
    PORT___GROUP("PORT-GROUP"),
    @XmlEnumValue("PORT-INTERFACE")
    PORT___INTERFACE("PORT-INTERFACE"),
    @XmlEnumValue("PORT-INTERFACE-MAPPING")
    PORT___INTERFACE___MAPPING("PORT-INTERFACE-MAPPING"),
    @XmlEnumValue("PORT-INTERFACE-MAPPING-SET")
    PORT___INTERFACE___MAPPING___SET("PORT-INTERFACE-MAPPING-SET"),
    @XmlEnumValue("PORT-PROTOTYPE")
    PORT___PROTOTYPE("PORT-PROTOTYPE"),
    @XmlEnumValue("PORT-PROTOTYPE-BLUEPRINT")
    PORT___PROTOTYPE___BLUEPRINT("PORT-PROTOTYPE-BLUEPRINT"),
    @XmlEnumValue("POST-BUILD-VARIANT-CRITERION")
    POST___BUILD___VARIANT___CRITERION("POST-BUILD-VARIANT-CRITERION"),
    @XmlEnumValue("POST-BUILD-VARIANT-CRITERION-VALUE-SET")
    POST___BUILD___VARIANT___CRITERION___VALUE___SET("POST-BUILD-VARIANT-CRITERION-VALUE-SET"),
    @XmlEnumValue("PREDEFINED-VARIANT")
    PREDEFINED___VARIANT("PREDEFINED-VARIANT"),
    @XmlEnumValue("PROVIDED-SERVICE-INSTANCE")
    PROVIDED___SERVICE___INSTANCE("PROVIDED-SERVICE-INSTANCE"),
    @XmlEnumValue("R-PORT-PROTOTYPE")
    R___PORT___PROTOTYPE("R-PORT-PROTOTYPE"),
    @XmlEnumValue("RTE-EVENT")
    RTE___EVENT("RTE-EVENT"),
    @XmlEnumValue("RAPID-PROTOTYPING-SCENARIO")
    RAPID___PROTOTYPING___SCENARIO("RAPID-PROTOTYPING-SCENARIO"),
    @XmlEnumValue("RESOURCE-CONSUMPTION")
    RESOURCE___CONSUMPTION("RESOURCE-CONSUMPTION"),
    @XmlEnumValue("ROOT-SW-COMPOSITION-PROTOTYPE")
    ROOT___SW___COMPOSITION___PROTOTYPE("ROOT-SW-COMPOSITION-PROTOTYPE"),
    @XmlEnumValue("ROUGH-ESTIMATE-HEAP-USAGE")
    ROUGH___ESTIMATE___HEAP___USAGE("ROUGH-ESTIMATE-HEAP-USAGE"),
    @XmlEnumValue("ROUGH-ESTIMATE-OF-EXECUTION-TIME")
    ROUGH___ESTIMATE___OF___EXECUTION___TIME("ROUGH-ESTIMATE-OF-EXECUTION-TIME"),
    @XmlEnumValue("ROUGH-ESTIMATE-STACK-USAGE")
    ROUGH___ESTIMATE___STACK___USAGE("ROUGH-ESTIMATE-STACK-USAGE"),
    @XmlEnumValue("RPT-CONTAINER")
    RPT___CONTAINER("RPT-CONTAINER"),
    @XmlEnumValue("RUNNABLE-ENTITY")
    RUNNABLE___ENTITY("RUNNABLE-ENTITY"),
    @XmlEnumValue("RUNNABLE-ENTITY-GROUP")
    RUNNABLE___ENTITY___GROUP("RUNNABLE-ENTITY-GROUP"),
    @XmlEnumValue("SECURED-I-PDU")
    SECURED___I___PDU("SECURED-I-PDU"),
    @XmlEnumValue("SENDER-RECEIVER-INTERFACE")
    SENDER___RECEIVER___INTERFACE("SENDER-RECEIVER-INTERFACE"),
    @XmlEnumValue("SENSOR-ACTUATOR-SW-COMPONENT-TYPE")
    SENSOR___ACTUATOR___SW___COMPONENT___TYPE("SENSOR-ACTUATOR-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERIALIZATION-TECHNOLOGY")
    SERIALIZATION___TECHNOLOGY("SERIALIZATION-TECHNOLOGY"),
    @XmlEnumValue("SERVER-CALL-POINT")
    SERVER___CALL___POINT("SERVER-CALL-POINT"),
    @XmlEnumValue("SERVICE-NEEDS")
    SERVICE___NEEDS("SERVICE-NEEDS"),
    @XmlEnumValue("SERVICE-PROXY-SW-COMPONENT-TYPE")
    SERVICE___PROXY___SW___COMPONENT___TYPE("SERVICE-PROXY-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SERVICE-SW-COMPONENT-TYPE")
    SERVICE___SW___COMPONENT___TYPE("SERVICE-SW-COMPONENT-TYPE"),
    @XmlEnumValue("SIMULATED-EXECUTION-TIME")
    SIMULATED___EXECUTION___TIME("SIMULATED-EXECUTION-TIME"),
    @XmlEnumValue("SO-AD-ROUTING-GROUP")
    SO___AD___ROUTING___GROUP("SO-AD-ROUTING-GROUP"),
    @XmlEnumValue("SOCKET-ADDRESS")
    SOCKET___ADDRESS("SOCKET-ADDRESS"),
    @XmlEnumValue("SPORADIC-EVENT-TRIGGERING")
    SPORADIC___EVENT___TRIGGERING("SPORADIC-EVENT-TRIGGERING"),
    @XmlEnumValue("STACK-USAGE")
    STACK___USAGE("STACK-USAGE"),
    @XmlEnumValue("STRUCTURED-REQ")
    STRUCTURED___REQ("STRUCTURED-REQ"),
    @XmlEnumValue("SUPERVISED-ENTITY-NEEDS")
    SUPERVISED___ENTITY___NEEDS("SUPERVISED-ENTITY-NEEDS"),
    @XmlEnumValue("SW-ADDR-METHOD")
    SW___ADDR___METHOD("SW-ADDR-METHOD"),
    @XmlEnumValue("SW-AXIS-TYPE")
    SW___AXIS___TYPE("SW-AXIS-TYPE"),
    @XmlEnumValue("SW-BASE-TYPE")
    SW___BASE___TYPE("SW-BASE-TYPE"),
    @XmlEnumValue("SW-COMPONENT-PROTOTYPE")
    SW___COMPONENT___PROTOTYPE("SW-COMPONENT-PROTOTYPE"),
    @XmlEnumValue("SW-COMPONENT-TYPE")
    SW___COMPONENT___TYPE("SW-COMPONENT-TYPE"),
    @XmlEnumValue("SW-CONNECTOR")
    SW___CONNECTOR("SW-CONNECTOR"),
    @XmlEnumValue("SW-GENERIC-AXIS-PARAM-TYPE")
    SW___GENERIC___AXIS___PARAM___TYPE("SW-GENERIC-AXIS-PARAM-TYPE"),
    @XmlEnumValue("SW-RECORD-LAYOUT")
    SW___RECORD___LAYOUT("SW-RECORD-LAYOUT"),
    @XmlEnumValue("SW-SERVICE-ARG")
    SW___SERVICE___ARG("SW-SERVICE-ARG"),
    @XmlEnumValue("SW-SYSTEMCONST")
    SW___SYSTEMCONST("SW-SYSTEMCONST"),
    @XmlEnumValue("SW-SYSTEMCONSTANT-VALUE-SET")
    SW___SYSTEMCONSTANT___VALUE___SET("SW-SYSTEMCONSTANT-VALUE-SET"),
    @XmlEnumValue("SWC-BSW-MAPPING")
    SWC___BSW___MAPPING("SWC-BSW-MAPPING"),
    @XmlEnumValue("SWC-IMPLEMENTATION")
    SWC___IMPLEMENTATION("SWC-IMPLEMENTATION"),
    @XmlEnumValue("SWC-INTERNAL-BEHAVIOR")
    SWC___INTERNAL___BEHAVIOR("SWC-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("SWC-MODE-MANAGER-ERROR-EVENT")
    SWC___MODE___MANAGER___ERROR___EVENT("SWC-MODE-MANAGER-ERROR-EVENT"),
    @XmlEnumValue("SWC-MODE-SWITCH-EVENT")
    SWC___MODE___SWITCH___EVENT("SWC-MODE-SWITCH-EVENT"),
    @XmlEnumValue("SWC-SERVICE-DEPENDENCY")
    SWC___SERVICE___DEPENDENCY("SWC-SERVICE-DEPENDENCY"),
    @XmlEnumValue("SWC-TIMING")
    SWC___TIMING("SWC-TIMING"),
    @XmlEnumValue("SWC-TO-ECU-MAPPING")
    SWC___TO___ECU___MAPPING("SWC-TO-ECU-MAPPING"),
    @XmlEnumValue("SWC-TO-IMPL-MAPPING")
    SWC___TO___IMPL___MAPPING("SWC-TO-IMPL-MAPPING"),
    @XmlEnumValue("SYNC-TIME-BASE-MGR-USER-NEEDS")
    SYNC___TIME___BASE___MGR___USER___NEEDS("SYNC-TIME-BASE-MGR-USER-NEEDS"),
    @XmlEnumValue("SYNCHRONIZATION-TIMING-CONSTRAINT")
    SYNCHRONIZATION___TIMING___CONSTRAINT("SYNCHRONIZATION-TIMING-CONSTRAINT"),
    @XmlEnumValue("SYNCHRONOUS-SERVER-CALL-POINT")
    SYNCHRONOUS___SERVER___CALL___POINT("SYNCHRONOUS-SERVER-CALL-POINT"),
    SYSTEM("SYSTEM"),
    @XmlEnumValue("SYSTEM-MAPPING")
    SYSTEM___MAPPING("SYSTEM-MAPPING"),
    @XmlEnumValue("SYSTEM-SIGNAL")
    SYSTEM___SIGNAL("SYSTEM-SIGNAL"),
    @XmlEnumValue("SYSTEM-SIGNAL-GROUP")
    SYSTEM___SIGNAL___GROUP("SYSTEM-SIGNAL-GROUP"),
    @XmlEnumValue("SYSTEM-TIMING")
    SYSTEM___TIMING("SYSTEM-TIMING"),
    @XmlEnumValue("TD-EVENT-BSW")
    TD___EVENT___BSW("TD-EVENT-BSW"),
    @XmlEnumValue("TD-EVENT-BSW-INTERNAL-BEHAVIOR")
    TD___EVENT___BSW___INTERNAL___BEHAVIOR("TD-EVENT-BSW-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("TD-EVENT-BSW-MODE-DECLARATION")
    TD___EVENT___BSW___MODE___DECLARATION("TD-EVENT-BSW-MODE-DECLARATION"),
    @XmlEnumValue("TD-EVENT-BSW-MODULE")
    TD___EVENT___BSW___MODULE("TD-EVENT-BSW-MODULE"),
    @XmlEnumValue("TD-EVENT-COM")
    TD___EVENT___COM("TD-EVENT-COM"),
    @XmlEnumValue("TD-EVENT-COMPLEX")
    TD___EVENT___COMPLEX("TD-EVENT-COMPLEX"),
    @XmlEnumValue("TD-EVENT-CYCLE-START")
    TD___EVENT___CYCLE___START("TD-EVENT-CYCLE-START"),
    @XmlEnumValue("TD-EVENT-FR-CLUSTER-CYCLE-START")
    TD___EVENT___FR___CLUSTER___CYCLE___START("TD-EVENT-FR-CLUSTER-CYCLE-START"),
    @XmlEnumValue("TD-EVENT-FRAME")
    TD___EVENT___FRAME("TD-EVENT-FRAME"),
    @XmlEnumValue("TD-EVENT-I-PDU")
    TD___EVENT___I___PDU("TD-EVENT-I-PDU"),
    @XmlEnumValue("TD-EVENT-I-SIGNAL")
    TD___EVENT___I___SIGNAL("TD-EVENT-I-SIGNAL"),
    @XmlEnumValue("TD-EVENT-MODE-DECLARATION")
    TD___EVENT___MODE___DECLARATION("TD-EVENT-MODE-DECLARATION"),
    @XmlEnumValue("TD-EVENT-OPERATION")
    TD___EVENT___OPERATION("TD-EVENT-OPERATION"),
    @XmlEnumValue("TD-EVENT-SWC")
    TD___EVENT___SWC("TD-EVENT-SWC"),
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR")
    TD___EVENT___SWC___INTERNAL___BEHAVIOR("TD-EVENT-SWC-INTERNAL-BEHAVIOR"),
    @XmlEnumValue("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE")
    TD___EVENT___SWC___INTERNAL___BEHAVIOR___REFERENCE("TD-EVENT-SWC-INTERNAL-BEHAVIOR-REFERENCE"),
    @XmlEnumValue("TD-EVENT-TT-CAN-CYCLE-START")
    TD___EVENT___TT___CAN___CYCLE___START("TD-EVENT-TT-CAN-CYCLE-START"),
    @XmlEnumValue("TD-EVENT-TRIGGER")
    TD___EVENT___TRIGGER("TD-EVENT-TRIGGER"),
    @XmlEnumValue("TD-EVENT-VARIABLE-DATA-PROTOTYPE")
    TD___EVENT___VARIABLE___DATA___PROTOTYPE("TD-EVENT-VARIABLE-DATA-PROTOTYPE"),
    @XmlEnumValue("TD-EVENT-VFB")
    TD___EVENT___VFB("TD-EVENT-VFB"),
    @XmlEnumValue("TD-EVENT-VFB-PORT")
    TD___EVENT___VFB___PORT("TD-EVENT-VFB-PORT"),
    @XmlEnumValue("TD-EVENT-VFB-REFERENCE")
    TD___EVENT___VFB___REFERENCE("TD-EVENT-VFB-REFERENCE"),
    @XmlEnumValue("TIMING-CONSTRAINT")
    TIMING___CONSTRAINT("TIMING-CONSTRAINT"),
    @XmlEnumValue("TIMING-DESCRIPTION")
    TIMING___DESCRIPTION("TIMING-DESCRIPTION"),
    @XmlEnumValue("TIMING-DESCRIPTION-EVENT")
    TIMING___DESCRIPTION___EVENT("TIMING-DESCRIPTION-EVENT"),
    @XmlEnumValue("TIMING-DESCRIPTION-EVENT-CHAIN")
    TIMING___DESCRIPTION___EVENT___CHAIN("TIMING-DESCRIPTION-EVENT-CHAIN"),
    @XmlEnumValue("TIMING-EVENT")
    TIMING___EVENT("TIMING-EVENT"),
    @XmlEnumValue("TIMING-EXTENSION")
    TIMING___EXTENSION("TIMING-EXTENSION"),
    @XmlEnumValue("TOPIC-1")
    TOPIC___1("TOPIC-1"),
    @XmlEnumValue("TP-ADDRESS")
    TP___ADDRESS("TP-ADDRESS"),
    @XmlEnumValue("TP-CONFIG")
    TP___CONFIG("TP-CONFIG"),
    @XmlEnumValue("TRACEABLE-TEXT")
    TRACEABLE___TEXT("TRACEABLE-TEXT"),
    @XmlEnumValue("TRANSFORMATION-TECHNOLOGY")
    TRANSFORMATION___TECHNOLOGY("TRANSFORMATION-TECHNOLOGY"),
    @XmlEnumValue("TRANSFORMER-HARD-ERROR-EVENT")
    TRANSFORMER___HARD___ERROR___EVENT("TRANSFORMER-HARD-ERROR-EVENT"),
    TRIGGER("TRIGGER"),
    @XmlEnumValue("TRIGGER-INTERFACE")
    TRIGGER___INTERFACE("TRIGGER-INTERFACE"),
    @XmlEnumValue("TRIGGER-INTERFACE-MAPPING")
    TRIGGER___INTERFACE___MAPPING("TRIGGER-INTERFACE-MAPPING"),
    @XmlEnumValue("TTCAN-CLUSTER")
    TTCAN___CLUSTER("TTCAN-CLUSTER"),
    @XmlEnumValue("TTCAN-COMMUNICATION-CONNECTOR")
    TTCAN___COMMUNICATION___CONNECTOR("TTCAN-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("TTCAN-COMMUNICATION-CONTROLLER")
    TTCAN___COMMUNICATION___CONTROLLER("TTCAN-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("TTCAN-PHYSICAL-CHANNEL")
    TTCAN___PHYSICAL___CHANNEL("TTCAN-PHYSICAL-CHANNEL"),
    @XmlEnumValue("UDP-NM-CLUSTER")
    UDP___NM___CLUSTER("UDP-NM-CLUSTER"),
    @XmlEnumValue("UDP-NM-NODE")
    UDP___NM___NODE("UDP-NM-NODE"),
    UNIT("UNIT"),
    @XmlEnumValue("UNIT-GROUP")
    UNIT___GROUP("UNIT-GROUP"),
    @XmlEnumValue("USER-DEFINED-CLUSTER")
    USER___DEFINED___CLUSTER("USER-DEFINED-CLUSTER"),
    @XmlEnumValue("USER-DEFINED-COMMUNICATION-CONNECTOR")
    USER___DEFINED___COMMUNICATION___CONNECTOR("USER-DEFINED-COMMUNICATION-CONNECTOR"),
    @XmlEnumValue("USER-DEFINED-COMMUNICATION-CONTROLLER")
    USER___DEFINED___COMMUNICATION___CONTROLLER("USER-DEFINED-COMMUNICATION-CONTROLLER"),
    @XmlEnumValue("USER-DEFINED-ETHERNET-FRAME")
    USER___DEFINED___ETHERNET___FRAME("USER-DEFINED-ETHERNET-FRAME"),
    @XmlEnumValue("USER-DEFINED-I-PDU")
    USER___DEFINED___I___PDU("USER-DEFINED-I-PDU"),
    @XmlEnumValue("USER-DEFINED-PDU")
    USER___DEFINED___PDU("USER-DEFINED-PDU"),
    @XmlEnumValue("USER-DEFINED-PHYSICAL-CHANNEL")
    USER___DEFINED___PHYSICAL___CHANNEL("USER-DEFINED-PHYSICAL-CHANNEL"),
    @XmlEnumValue("VARIABLE-ACCESS")
    VARIABLE___ACCESS("VARIABLE-ACCESS"),
    @XmlEnumValue("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING")
    VARIABLE___AND___PARAMETER___INTERFACE___MAPPING("VARIABLE-AND-PARAMETER-INTERFACE-MAPPING"),
    @XmlEnumValue("VARIABLE-DATA-PROTOTYPE")
    VARIABLE___DATA___PROTOTYPE("VARIABLE-DATA-PROTOTYPE"),
    @XmlEnumValue("VARIATION-POINT-PROXY")
    VARIATION___POINT___PROXY("VARIATION-POINT-PROXY"),
    @XmlEnumValue("VFB-TIMING")
    VFB___TIMING("VFB-TIMING"),
    @XmlEnumValue("VIEW-MAP")
    VIEW___MAP("VIEW-MAP"),
    @XmlEnumValue("VIEW-MAP-SET")
    VIEW___MAP___SET("VIEW-MAP-SET"),
    @XmlEnumValue("VLAN-CONFIG")
    VLAN___CONFIG("VLAN-CONFIG"),
    @XmlEnumValue("WAIT-POINT")
    WAIT___POINT("WAIT-POINT"),
    @XmlEnumValue("WARNING-INDICATOR-REQUESTED-BIT-NEEDS")
    WARNING___INDICATOR___REQUESTED___BIT___NEEDS("WARNING-INDICATOR-REQUESTED-BIT-NEEDS"),
    @XmlEnumValue("WORST-CASE-HEAP-USAGE")
    WORST___CASE___HEAP___USAGE("WORST-CASE-HEAP-USAGE"),
    @XmlEnumValue("WORST-CASE-STACK-USAGE")
    WORST___CASE___STACK___USAGE("WORST-CASE-STACK-USAGE"),
    @XmlEnumValue("XCP-PDU")
    XCP___PDU("XCP-PDU");
    private final String value;

    IDENTIFIABLESUBTYPESENUM(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IDENTIFIABLESUBTYPESENUM fromValue(String v) {
        for (IDENTIFIABLESUBTYPESENUM c: IDENTIFIABLESUBTYPESENUM.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
