<xsl:transform version="1.0"
               xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
               xmlns:AR="http://autosar.org/schema/r4.0"
               xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               exclude-result-prefixes="AR">
  <xsl:output method="xml"
              version="1.0"
              encoding="utf-8"
              indent="yes"
              xalan:indent-amount="0"
              xmlns:xalan="http://xml.apache.org/xslt" />
  <!-- ============================================================ -->
  <!-- Template for root node                                       -->
  <xsl:template match="AR:AUTOSAR">
    <xsl:choose>
      <xsl:when test="contains(string(@*), 'AUTOSAR_4-3-0.xsd')">
        <xsl:variable name="ARPATH"
                      select="substring-after(string(@*), 'r4.0 ')" />
        <AUTOSAR xsi:schemaLocation="{concat('http://autosar.org/schema/r4.0 ', concat(substring-before($ARPATH, '4-3-0'), '4-2-2', substring-after($ARPATH, '4-3-0') ))}"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xmlns="http://autosar.org/schema/r4.0">
          <xsl:apply-templates />
        </AUTOSAR>
      </xsl:when>
      <xsl:otherwise>
        <AUTOSAR xsi:schemaLocation="http://autosar.org/schema/r4.0 AUTOSAR_4-2-2.xsd"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xmlns="http://autosar.org/schema/r4.0">
          <xsl:apply-templates />
        </AUTOSAR>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  <!-- ============================================================ -->
  <!--AR-Elements that don't exist in 4.2.2:                        -->
  <xsl:template match="AR:APPLICATION-PARTITION" />
  <xsl:template match="AR:BSW-ENTRY-RELATIONSHIP-SET" />
  <xsl:template match="AR:CLIENT-SERVER-INTERFACE-TO-BSW-MODULE-ENTRY-BLUEPRINT-MAPPING" />
  <xsl:template match="AR:DATA-EXCHANGE-POINT" />
  <xsl:template match="AR:DIAGNOSTIC-CLEAR-RESET-EMISSION-RELATED-INFO" />
  <xsl:template match="AR:DIAGNOSTIC-CLEAR-RESET-EMISSION-RELATED-INFO-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-ECU-INSTANCE-PROPS" />
  <xsl:template match="AR:DIAGNOSTIC-ENVIRONMENTAL-CONDITION" />
  <xsl:template match="AR:DIAGNOSTIC-FIM-ALIAS-EVENT" />
  <xsl:template match="AR:DIAGNOSTIC-FIM-ALIAS-EVENT-GROUP" />
  <xsl:template match="AR:DIAGNOSTIC-FIM-ALIAS-EVENT-GROUP-MAPPING" />
  <xsl:template match="AR:DIAGNOSTIC-FIM-ALIAS-EVENT-MAPPING" />
  <xsl:template match="AR:DIAGNOSTIC-FIM-EVENT-GROUP" />
  <xsl:template match="AR:DIAGNOSTIC-FIM-FUNCTION-MAPPING" />
  <xsl:template match="AR:DIAGNOSTIC-FUNCTION-IDENTIFIER" />
  <xsl:template match="AR:DIAGNOSTIC-FUNCTION-IDENTIFIER-INHIBIT" />
  <xsl:template match="AR:DIAGNOSTIC-INFO-TYPE" />
  <xsl:template match="AR:DIAGNOSTIC-INHIBIT-SOURCE-EVENT-MAPPING" />
  <xsl:template match="AR:DIAGNOSTIC-IUMPR" />
  <xsl:template match="AR:DIAGNOSTIC-IUMPR-DENOMINATOR-GROUP" />
  <xsl:template match="AR:DIAGNOSTIC-IUMPR-GROUP" />
  <xsl:template match="AR:DIAGNOSTIC-J-1939-EXPANDED-FREEZE-FRAME" />
  <xsl:template match="AR:DIAGNOSTIC-J-1939-FREEZE-FRAME" />
  <xsl:template match="AR:DIAGNOSTIC-J-1939-NODE" />
  <xsl:template match="AR:DIAGNOSTIC-J-1939-SPN" />
  <xsl:template match="AR:DIAGNOSTIC-J-1939-SPN-MAPPING" />
  <xsl:template match="AR:DIAGNOSTIC-J-1939-SW-MAPPING" />
  <xsl:template match="AR:DIAGNOSTIC-MEASUREMENT-IDENTIFIER" />
  <xsl:template match="AR:DIAGNOSTIC-PARAMETER-IDENTIFIER" />
  <xsl:template match="AR:DIAGNOSTIC-POWERTRAIN-FREEZE-FRAME" />
  <xsl:template match="AR:DIAGNOSTIC-PROTOCOL" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-CONTROL-OF-ON-BOARD-DEVICE" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-CONTROL-OF-ON-BOARD-DEVICE-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-CURRENT-POWERTRAIN-DATA" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-CURRENT-POWERTRAIN-DATA-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC-PERMANENT-STATUS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC-PERMANENT-STATUS-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-ON-BOARD-MONITORING-TEST-RESULTS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-ON-BOARD-MONITORING-TEST-RESULTS-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-POWERTRAIN-FREEZE-FRAME-DATA" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-POWERTRAIN-FREEZE-FRAME-DATA-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-VEHICLE-INFO" />
  <xsl:template match="AR:DIAGNOSTIC-REQUEST-VEHICLE-INFO-CLASS" />
  <xsl:template match="AR:DIAGNOSTIC-TEST-RESULT" />
  <xsl:template match="AR:DIAGNOSTIC-TEST-ROUTINE-IDENTIFIER" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-UDS-TO-TROUBLE-CODE-OBD-MAPPING" />
  <xsl:template match="AR:ENUMERATION-MAPPING-TABLE" />
  <xsl:template match="AR:I-PV-6-EXT-HEADER-FILTER-SET" />
  <xsl:template match="AR:J-1939-CONTROLLER-APPLICATION" />
  <xsl:template match="AR:SDG-DEF" />
  <xsl:template match="AR:SECURE-COMMUNICATION-PROPS-SET" />
  <xsl:template match="AR:SOMEIP-TP-CONFIG" />
  <xsl:template match="AR:TCP-OPTION-FILTER-SET" />
  <xsl:template match="AR:TRANSFORMATION-PROPS-SET" />
  
  <!-- ============================================================ -->
  <!-- SubElements that don't exist in 4.2.2:                       -->
  <xsl:template match="AR:ACCESS-COUNT-SETS" />
  <xsl:template match="AR:APPLICATION-ARRAY-ELEMENT/AR:INDEX-DATA-TYPE-REF" />
  <xsl:template match="AR:ASSIGN-FRAME-ID/AR:MESSAGE-ID" />
  <xsl:template match="AR:AUTOSAR-OPERATION-ARGUMENT-INSTANCE/AR:VARIATION-POINT" />
  <xsl:template match="AR:AUTOSAR-VARIABLE-INSTANCE/AR:VARIATION-POINT" />
  <xsl:template match="AR:BSW-EXCLUSIVE-AREA-POLICY/AR:API-PRINCIPLE" />
  <xsl:template match="AR:BSW-INTERNAL-BEHAVIOR/AR:AR-TYPED-PER-INSTANCE-MEMORYS" />
  <xsl:template match="AR:BSW-MODULE-DESCRIPTION/AR:EXPECTED-ENTRYS" />
  <xsl:template match="AR:BSW-MODULE-DESCRIPTION/AR:IMPLEMENTED-ENTRYS" />
  <xsl:template match="AR:BSW-MODULE-ENTRY/AR:BSW-ENTRY-KIND" />
  <xsl:template match="AR:BSW-MODULE-ENTRY/AR:FUNCTION-PROTOTYPE-EMITTER" />
  <xsl:template match="AR:CLIENT-SERVER-OPERATION-MAPPING/AR:FIRST-TO-SECOND-DATA-TRANSFORMATION-REF" />
  <xsl:template match="AR:COMPOSITE-RULE-BASED-VALUE-SPECIFICATION" />
  <xsl:template match="AR:COUPLING-PORT/AR:COUPLING-PORT-ROLE" />
  <xsl:template match="AR:COUPLING-PORT/AR:MAC-LAYER-TYPE" />
  <xsl:template match="AR:COUPLING-PORT/AR:PNC-MAPPING-REFS" />
  <xsl:template match="AR:COUPLING-PORT/AR:RECEIVE-ACTIVITY" />
  <xsl:template match="AR:COUPLING-PORT/AR:VARIATION-POINT" />
  <xsl:template match="AR:COUPLING-PORT-CONNECTION/AR:VARIATION-POINT" />
  <xsl:template match="AR:COUPLING-PORT-DETAILS/AR:GLOBAL-TIME-PROPS" />
  <xsl:template match="AR:COUPLING-PORT-DETAILS/AR:RATE-POLICYS" />
  <xsl:template match="AR:COUPLING-PORT-FIFO/AR:MINIMUM-FIFO-LENGTH" />
  <xsl:template match="AR:DATA-PROTOTYPE-TRANSFORMATION-PROPSS" />
  <xsl:template match="AR:DATA-TRANSFORMATION/AR:DATA-TRANSFORMATION-KIND" />
  <xsl:template match="AR:DIAG-EVENT-DEBOUNCE-COUNTER-BASED/AR:COUNTER-BASED-FDC-THRESHOLD-STORAGE-VALUE" />
  <xsl:template match="AR:DIAG-EVENT-DEBOUNCE-TIME-BASED/AR:TIME-BASED-FDC-THRESHOLD-STORAGE-VALUE" />
  <xsl:template match="AR:DIAGNOSTIC-ACCESS-PERMISSION/AR:ENVIRONMENTAL-CONDITION-REF" />
  <xsl:template match="AR:DIAGNOSTIC-DATA-IDENTIFIER/AR:DID-SIZE" />
  <xsl:template match="AR:DIAGNOSTIC-DATA-IDENTIFIER/AR:SUPPORT-INFO-BYTE" />
  <xsl:template match="AR:DIAGNOSTIC-DYNAMICALLY-DEFINE-DATA-IDENTIFIER-CLASS/AR:SUBFUNCTIONS" />
  <xsl:template match="AR:DIAGNOSTIC-ECU-RESET-CLASS/AR:RESPOND-TO-RESET" />
  <xsl:template match="AR:DIAGNOSTIC-ENABLE-CONDITION-PORT-MAPPING/AR:SWC-SERVICE-DEPENDENCY-IN-SYSTEM-IREF" />
  <xsl:template match="AR:DIAGNOSTIC-EVENT-PORT-MAPPING/AR:SWC-SERVICE-DEPENDENCY-IN-SYSTEM-IREF" />
  <xsl:template match="AR:DIAGNOSTIC-MEMORY-IDENTIFIER/AR:MEMORY-HIGH-ADDRESS-LABEL" />
  <xsl:template match="AR:DIAGNOSTIC-MEMORY-IDENTIFIER/AR:MEMORY-LOW-ADDRESS-LABEL" />
  <xsl:template match="AR:DIAGNOSTIC-OPERATION-CYCLE-PORT-MAPPING/AR:SWC-SERVICE-DEPENDENCY-IN-SYSTEM-IREF" />
  <xsl:template match="AR:DIAGNOSTIC-PARAMETER/AR:SUPPORT-INFO" />
  <xsl:template match="AR:DIAGNOSTIC-PERIODIC-RATE/AR:PERIODIC-RATE-CATEGORY" />
  <xsl:template match="AR:DIAGNOSTIC-ROUTINE/AR:ROUTINE-INFO" />
  <xsl:template match="AR:DIAGNOSTIC-SERVICE-SW-MAPPING/AR:MAPPED-SWC-SERVICE-DEPENDENCY-IN-SYSTEM-IREF" />
  <xsl:template match="AR:DIAGNOSTIC-STORAGE-CONDITION-PORT-MAPPING/AR:SWC-SERVICE-DEPENDENCY-IN-SYSTEM-IREF" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-J-1939/AR:DTC-PROPS-REF" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-J-1939/AR:FMI" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-J-1939/AR:KIND" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-J-1939/AR:NODE-REF" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-J-1939/AR:SPN-REF" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-OBD/AR:DTC-PROPS-REF" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-UDS/AR:CONSIDER-PTO-STATUS" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-UDS/AR:EVENT-OBD-READINESS-GROUP" />
  <xsl:template match="AR:DIAGNOSTIC-TROUBLE-CODE-UDS/AR:WWH-OBD-DTC-CLASS" />
  <xsl:template match="AR:ECU-INSTANCE/AR:ETH-SWITCH-PORT-GROUP-DERIVATION" />
  <xsl:template match="AR:ECU-INSTANCE/AR:V-2-X-SUPPORTED" />
  <xsl:template match="AR:ENTRY/AR:BGCOLOR" />
  <xsl:template match="AR:ETHERNET-CLUSTER-CONDITIONAL/AR:COUPLING-PORT-SWITCHOFF-DELAY" />
  <xsl:template match="AR:ETHERNET-COMMUNICATION-CONNECTOR/AR:NEIGHBOR-CACHE-SIZE" />
  <xsl:template match="AR:ETHERNET-COMMUNICATION-CONNECTOR/AR:PATH-MTU-ENABLED" />
  <xsl:template match="AR:ETHERNET-COMMUNICATION-CONNECTOR/AR:PATH-MTU-TIMEOUT" />
  <xsl:template match="AR:ETHERNET-COMMUNICATION-CONTROLLER-CONDITIONAL/AR:MAC-LAYER-TYPE" />
  <xsl:template match="AR:FORMULA/AR:MODE-REF" />
  <xsl:template match="AR:GLOBAL-TIME-DOMAIN/AR:DEBOUNCE-TIME" />
  <xsl:template match="AR:GLOBAL-TIME-DOMAIN/AR:GLOBAL-TIME-DOMAIN-PROPS" />
  <xsl:template match="AR:GLOBAL-TIME-DOMAIN/AR:GLOBAL-TIME-PDU-TRIGGERING-REF" />
  <xsl:template match="AR:GLOBAL-TIME-DOMAIN/AR:MASTER/AR:USER-DEFINED-GLOBAL-TIME-MASTER" />
  <xsl:template match="AR:GLOBAL-TIME-DOMAIN/AR:SLAVES/AR:USER-DEFINED-GLOBAL-TIME-SLAVE" />
  <xsl:template match="AR:GLOBAL-TIME-ETH-MASTER/AR:CRC-SECURED" />
  <xsl:template match="AR:GLOBAL-TIME-ETH-SLAVE/AR:CRC-VALIDATED" />
  <xsl:template match="AR:GLOBAL-TIME-CAN-SLAVE/AR:FOLLOW-UP-TIMEOUT-VALUE" />
  <xsl:template match="AR:GLOBAL-TIME-ETH-SLAVE/AR:FOLLOW-UP-TIMEOUT-VALUE" />
  <xsl:template match="AR:GLOBAL-TIME-FR-SLAVE/AR:FOLLOW-UP-TIMEOUT-VALUE" />
  <xsl:template match="AR:I-PDU-PORT/AR:USE-AUTH-DATA-FRESHNESS" />
  <xsl:template match="AR:I-SIGNAL/AR:I-SIGNAL-TYPE" />
  <xsl:template match="AR:I-SIGNAL/AR:TIMEOUT-SUBSTITUTION-VALUE" />
  <xsl:template match="AR:I-SIGNAL-PORT/AR:FIRST-TIMEOUT" />
  <xsl:template match="AR:IMMEDIATE-RESUME-TIME" />
  <xsl:template match="AR:IPV-6-CONFIGURATION/AR:ENABLE-ANYCAST" />
  <xsl:template match="AR:J-1939-CLUSTER-CONDITIONAL/AR:NETWORK-ID" />
  <xsl:template match="AR:J-1939-CLUSTER-CONDITIONAL/AR:REQUEST-2-SUPPORT" />
  <xsl:template match="AR:J-1939-CLUSTER-CONDITIONAL/AR:USES-ADDRESS-ARBITRATION" />
  <xsl:template match="AR:LIN-SLAVE-CONFIG/AR:INITIAL-NAD" />
  <xsl:template match="AR:MC-DATA-INSTANCE/AR:RESULTING-RPT-SW-PROTOTYPING-ACCESS" />
  <xsl:template match="AR:MC-DATA-INSTANCE/AR:RPT-IMPL-POLICY" />
  <xsl:template match="AR:MC-SUPPORT/AR:RPT-SUPPORT-DATA" />
  <xsl:template match="AR:NM-PNC-PARTICIPATION" />
  <xsl:template match="AR:NM-CLUSTERS/AR:LIN-NM-CLUSTER" />
  <xsl:template match="AR:NONQUEUED-RECEIVER-COM-SPEC/AR:TIMEOUT-SUBSTITUTION-VALUE" />
  <xsl:template match="AR:NV-BLOCK-DESCRIPTOR/AR:MODE-SWITCH-EVENT-TRIGGERED-ACTIVITYS" />
  <xsl:template match="AR:NV-BLOCK-NEEDS/AR:SELECT-BLOCK-FOR-FIRST-INIT-ALL" />
  <xsl:template match="AR:OCCURRENCE-EXPRESSION/AR:MODES" />
  <xsl:template match="AR:PNC-MAPPING/AR:IDENT" />
  <xsl:template match="AR:PORT-API-OPTION/AR:SUPPORTED-FEATURES" />
  <xsl:template match="AR:RAPID-PROTOTYPING-SCENARIO/AR:RPT-PROFILES" />
  <xsl:template match="AR:REQUIRES-SYMBOLIC-NAME-VALUE" />
  <xsl:template match="AR:ROLE-BASED-MC-DATA-ASSIGNMENT/AR:EXECUTION-CONTEXT-REFS" />
  <xsl:template match="AR:ROLE-BASED-MC-DATA-ASSIGNMENT/AR:VARIATION-POINT" />
  <xsl:template match="AR:RPT-CONTAINER/AR:EXPLICIT-RPT-PROFILE-SELECTION-REFS" />
  <xsl:template match="AR:RPT-CONTAINER/AR:RPT-EXECUTABLE-ENTITY-PROPERTIES" />
  <xsl:template match="AR:RPT-CONTAINER/AR:RPT-IMPL-POLICY" />
  <xsl:template match="AR:RPT-CONTAINER/AR:RPT-SW-PROTOTYPING-ACCESS" />
  <xsl:template match="AR:SOMEIP-TRANSFORMATION-I-SIGNAL-PROPS-CONDITIONAL/AR:IMPLEMENTS-SOMEIP-STRING-HANDLING" />
  <xsl:template match="AR:SECURE-COMMUNICATION-PROPS/AR:AUTH-DATA-FRESHNESS-LENGTH" />
  <xsl:template match="AR:SECURE-COMMUNICATION-PROPS/AR:AUTH-DATA-FRESHNESS-START-POSITION" />
  <xsl:template match="AR:SECURE-COMMUNICATION-PROPS/AR:AUTHENTICATION-BUILD-ATTEMPTS" />
  <xsl:template match="AR:SECURE-COMMUNICATION-PROPS/AR:MESSAGE-LINK-LENGTH" />
  <xsl:template match="AR:SECURE-COMMUNICATION-PROPS/AR:MESSAGE-LINK-POSITION" />
  <xsl:template match="AR:SECURED-I-PDU/AR:AUTHENTICATION-PROPS-REF" />
  <xsl:template match="AR:SECURED-I-PDU/AR:FRESHNESS-PROPS-REF" />
  <xsl:template match="AR:SECURED-I-PDU/AR:USE-AS-CRYPTOGRAPHIC-I-PDU" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:DIAGNOSTIC-COMPONENT-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:DIAGNOSTIC-CONTROL-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:DIAGNOSTIC-RESPONSE-ON-EVENT-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:ERROR-TRACER-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:GLOBAL-SUPERVISION-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:J-1939-RM-INCOMING-REQUEST-SERVICE-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:J-1939-RM-OUTGOING-REQUEST-SERVICE-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:SECURE-ON-BOARD-COMMUNICATION-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:SUPERVISED-ENTITY-CHECKPOINT-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:V-2-X-FAC-USER-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:V-2-X-M-USER-NEEDS" />
  <xsl:template match="AR:SERVICE-ITEMS/AR:VENDOR-SPECIFIC-SERVICE-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:DIAGNOSTIC-COMPONENT-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:DIAGNOSTIC-CONTROL-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:DIAGNOSTIC-RESPONSE-ON-EVENT-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:ERROR-TRACER-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:GLOBAL-SUPERVISION-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:J-1939-RM-INCOMING-REQUEST-SERVICE-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:J-1939-RM-OUTGOING-REQUEST-SERVICE-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:SECURE-ON-BOARD-COMMUNICATION-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:SUPERVISED-ENTITY-CHECKPOINT-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:V-2-X-FAC-USER-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:V-2-X-M-USER-NEEDS" />
  <xsl:template match="AR:SERVICE-NEEDS/AR:VENDOR-SPECIFIC-SERVICE-NEEDS" />
  <xsl:template match="AR:SOCKET-CONNECTION/AR:ALLOWED-I-PV-6-EXT-HEADERS-REF" />
  <xsl:template match="AR:SOCKET-CONNECTION/AR:ALLOWED-TCP-OPTIONS-REF" />
  <xsl:template match="AR:SOCKET-CONNECTION-BUNDLE/AR:DIFFERENTIATED-SERVICE-FIELD" />
  <xsl:template match="AR:SOCKET-CONNECTION-BUNDLE/AR:FLOW-LABEL" />
  <xsl:template match="AR:SOCKET-CONNECTION-BUNDLE/AR:PATH-MTU-DISCOVERY-ENABLED" />
  <xsl:template match="AR:SOCKET-CONNECTION-BUNDLE/AR:UDP-CHECKSUM-HANDLING" />
  <xsl:template match="AR:SOCKET-CONNECTION-IPDU-IDENTIFIER/AR:PDU-COLLECTION-SEMANTICS" />
  <xsl:template match="AR:STRUCTURED-REQ/AR:APPLIES-TO-DEPENDENCIES" />
  <xsl:template match="AR:SUPERVISED-ENTITY-NEEDS/AR:CHECKPOINTSS" />
  <xsl:template match="AR:SW-AXIS-GROUPED/AR:MAX-GRADIENT" />
  <xsl:template match="AR:SW-AXIS-GROUPED/AR:MONOTONY" />
  <xsl:template match="AR:SW-AXIS-INDIVIDUAL/AR:MAX-GRADIENT" />
  <xsl:template match="AR:SW-AXIS-INDIVIDUAL/AR:MONOTONY" />
  <xsl:template match="AR:SWC-INTERNAL-BEHAVIOR/AR:EXCLUSIVE-AREA-POLICYS" />
  <xsl:template match="AR:SYSTEM/AR:J-1939-SHARED-ADDRESS-CLUSTERS" />
  <xsl:template match="AR:SYSTEM-MAPPING/AR:APPLICATION-PARTITION-TO-ECU-PARTITION-MAPPINGS" />
  <xsl:template match="AR:SYSTEM-MAPPING/AR:J-1939-CONTROLLER-APPLICATION-TO-J-1939-NM-NODE-MAPPINGS" />
  <xsl:template match="AR:SYSTEM-MAPPING/AR:SWC-TO-APPLICATION-PARTITION-MAPPINGS" />
  <xsl:template match="AR:TCP-TP/AR:RECEIVE-WINDOW-MIN" />
  <xsl:template match="AR:TCP-TP-CONFIG/AR:RECEIVE-WINDOW-MIN" />
  <xsl:template match="AR:TIME-LEAP-FUTURE-THRESHOLD" />
  <xsl:template match="AR:TIME-LEAP-HEALING-COUNTER" />
  <xsl:template match="AR:TIME-LEAP-PAST-THRESHOLD" />
  <xsl:template match="AR:TIMING-CONDITION-REF" />
  <xsl:template match="AR:TIMING-CONDITIONS" />
  <xsl:template match="AR:TIMING-DESCRIPTIONS/AR:TD-EVENT-FRAME-ETHERNET" />
  <xsl:template match="AR:TIMING-RESOURCE" />
  <xsl:template match="AR:TRANSFORMATION-TECHNOLOGY/AR:HAS-INTERNAL-STATE" />
  <xsl:template match="AR:TT/AR:TEX-RENDER" />
  <xsl:template match="AR:UDP-NM-CLUSTER/AR:NM-IMMEDIATE-NM-CYCLE-TIME" />
  <xsl:template match="AR:UDP-NM-CLUSTER/AR:NM-IMMEDIATE-NM-TRANSMISSIONS" />
  <xsl:template match="AR:UDP-NM-CLUSTER/AR:VLAN-REF" />
  <xsl:template match="AR:UNASSIGN-FRAME-ID/AR:MESSAGE-ID" />
  
  <!-- ============================================================ -->
  <!-- Enum Strings that don't exist in 4.2.2:                      -->
  <xsl:template match="AR:CALL-TYPE[contains(.,'CALLOUT')]" />
  <xsl:template match="AR:JUMP-TO-BOOT-LOADER[contains(.,'OEM-BOOT-RESP-APP')]" />
  <xsl:template match="AR:JUMP-TO-BOOT-LOADER[contains(.,'SYSTEM-SUPPLIER-BOOT-RESP-APP')]" />
  <xsl:template match="AR:PROCESSING-STYLE[contains(.,'PROCESSING-STYLE-ASYNCHRONOUS-WITH-ERROR')]" />
  <xsl:template match="AR:PHYSICAL-LAYER-TYPE[contains(.,'1000BASE-T')]" />
  <xsl:template match="AR:PHYSICAL-LAYER-TYPE[contains(.,'1000BASE-T1')]" />
  <xsl:template match="AR:PHYSICAL-LAYER-TYPE[contains(.,'100BASE-T1')]" />
  <xsl:template match="AR:PHYSICAL-LAYER-TYPE[contains(.,'100BASE-TX')]" />
  <xsl:template match="AR:PHYSICAL-LAYER-TYPE[contains(.,'IEEE802-11P')]" />
  <xsl:template match="AR:CRC-VALIDATED[contains(.,'CRC-OPTIONAL')]" />
  <xsl:template match="AR:HANDLE-TIMEOUT-TYPE[contains(.,'REPLACE-BY-TIMEOUT-SUBSTITUTION-VALUE')]" />
  <xsl:template match="AR:SERVICE-KIND[contains(.,'DEFAULT-ERROR-TRACER')]" />
  <xsl:template match="AR:SERVICE-KIND[contains(.,'J-1939-REQUEST-MANAGER')]" />
  <xsl:template match="AR:SERVICE-KIND[contains(.,'SECURE-ON-BOARD-COMMUNICATION')]" />
  <xsl:template match="*[@DEST='ABSTRACT-ACCESS-POINT']" />
  <xsl:template match="*[@DEST='ABSTRACT-CLASS-TAILORING']" />
  <xsl:template match="*[@DEST='ABSTRACT-ETHERNET-FRAME']" />
  <xsl:template match="*[@DEST='AGGREGATION-TAILORING']" />
  <xsl:template match="*[@DEST='APPLICATION-PARTITION']" />
  <xsl:template match="*[@DEST='APPLICATION-PARTITION-TO-ECU-PARTITION-MAPPING']" />
  <xsl:template match="*[@DEST='ATTRIBUTE-TAILORING']" />
  <xsl:template match="*[@DEST='BSW-ENTRY-RELATIONSHIP-SET']" />
  <xsl:template match="*[@DEST='CLASS-CONTENT-CONDITIONAL']" />
  <xsl:template match="*[@DEST='CLIENT-SERVER-INTERFACE-TO-BSW-MODULE-ENTRY-BLUEPRINT-MAPPING']" />
  <xsl:template match="*[@DEST='CONCRETE-CLASS-TAILORING']" />
  <xsl:template match="*[@DEST='CONSTRAINT-TAILORING']" />
  <xsl:template match="*[@DEST='DATA-EXCHANGE-POINT']" />
  <xsl:template match="*[@DEST='DATA-FORMAT-ELEMENT-REFERENCE']" />
  <xsl:template match="*[@DEST='DATA-FORMAT-ELEMENT-SCOPE']" />
  <xsl:template match="*[@DEST='DEVELOPMENT-ERROR']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-ABSTRACT-ALIAS-EVENT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-CLEAR-RESET-EMISSION-RELATED-INFO']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-CLEAR-RESET-EMISSION-RELATED-INFO-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-COMPONENT-NEEDS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-CONTROL-NEEDS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-ECU-INSTANCE-PROPS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-ENV-BSW-MODE-ELEMENT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-ENV-MODE-ELEMENT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-ENV-SWC-MODE-ELEMENT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-ENVIRONMENTAL-CONDITION']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FIM-ALIAS-EVENT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FIM-ALIAS-EVENT-GROUP']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FIM-ALIAS-EVENT-GROUP-MAPPING']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FIM-ALIAS-EVENT-MAPPING']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FIM-EVENT-GROUP']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FIM-FUNCTION-MAPPING']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FUNCTION-IDENTIFIER']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FUNCTION-IDENTIFIER-INHIBIT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-FUNCTION-INHIBIT-SOURCE']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-INFO-TYPE']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-INHIBIT-SOURCE-EVENT-MAPPING']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-IUMPR']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-IUMPR-DENOMINATOR-GROUP']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-IUMPR-GROUP']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-J-1939-EXPANDED-FREEZE-FRAME']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-J-1939-FREEZE-FRAME']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-J-1939-NODE']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-J-1939-SPN']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-J-1939-SPN-MAPPING']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-J-1939-SW-MAPPING']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-MEASUREMENT-IDENTIFIER']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-PARAMETER-IDENTIFIER']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-POWERTRAIN-FREEZE-FRAME']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-PROTOCOL']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-CONTROL-OF-ON-BOARD-DEVICE']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-CONTROL-OF-ON-BOARD-DEVICE-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-CURRENT-POWERTRAIN-DATA']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-CURRENT-POWERTRAIN-DATA-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC-PERMANENT-STATUS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-EMISSION-RELATED-DTC-PERMANENT-STATUS-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-ON-BOARD-MONITORING-TEST-RESULTS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-ON-BOARD-MONITORING-TEST-RESULTS-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-POWERTRAIN-FREEZE-FRAME-DATA']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-POWERTRAIN-FREEZE-FRAME-DATA-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-VEHICLE-INFO']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-REQUEST-VEHICLE-INFO-CLASS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-RESPONSE-ON-EVENT-NEEDS']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-TEST-RESULT']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-TEST-ROUTINE-IDENTIFIER']" />
  <xsl:template match="*[@DEST='DIAGNOSTIC-TROUBLE-CODE-UDS-TO-TROUBLE-CODE-OBD-MAPPING']" />
  <xsl:template match="*[@DEST='DOCUMENT-ELEMENT-SCOPE']" />
  <xsl:template match="*[@DEST='ECUC-ABSTRACT-EXTERNAL-REFERENCE-DEF']" />
  <xsl:template match="*[@DEST='ECUC-ABSTRACT-INTERNAL-REFERENCE-DEF']" />
  <xsl:template match="*[@DEST='ENUMERATION-MAPPING-TABLE']" />
  <xsl:template match="*[@DEST='ERROR-TRACER-NEEDS']" />
  <xsl:template match="*[@DEST='GLOBAL-SUPERVISION-NEEDS']" />
  <xsl:template match="*[@DEST='I-PV-6-EXT-HEADER-FILTER-LIST']" />
  <xsl:template match="*[@DEST='I-PV-6-EXT-HEADER-FILTER-SET']" />
  <xsl:template match="*[@DEST='IMPLEMENTATION-DATA-TYPE-ELEMENT']" />
  <xsl:template match="*[@DEST='J-1939-CONTROLLER-APPLICATION']" />
  <xsl:template match="*[@DEST='J-1939-RM-INCOMING-REQUEST-SERVICE-NEEDS']" />
  <xsl:template match="*[@DEST='J-1939-RM-OUTGOING-REQUEST-SERVICE-NEEDS']" />
  <xsl:template match="*[@DEST='J-1939-SHARED-ADDRESS-CLUSTER']" />
  <xsl:template match="*[@DEST='LIN-NM-CLUSTER']" />
  <xsl:template match="*[@DEST='PNC-MAPPING-IDENT']" />
  <xsl:template match="*[@DEST='POSSIBLE-ERROR-REACTION']" />
  <xsl:template match="*[@DEST='PRIMITIVE-ATTRIBUTE-TAILORING']" />
  <xsl:template match="*[@DEST='REFERENCE-TAILORING']" />
  <xsl:template match="*[@DEST='RPT-COMPONENT']" />
  <xsl:template match="*[@DEST='RPT-EXECUTABLE-ENTITY']" />
  <xsl:template match="*[@DEST='RPT-EXECUTABLE-ENTITY-EVENT']" />
  <xsl:template match="*[@DEST='RPT-EXECUTION-CONTEXT']" />
  <xsl:template match="*[@DEST='RPT-PROFILE']" />
  <xsl:template match="*[@DEST='RPT-SERVICE-POINT']" />
  <xsl:template match="*[@DEST='RUNTIME-ERROR']" />
  <xsl:template match="*[@DEST='SDG-ABSTRACT-FOREIGN-REFERENCE']" />
  <xsl:template match="*[@DEST='SDG-ABSTRACT-PRIMITIVE-ATTRIBUTE']" />
  <xsl:template match="*[@DEST='SDG-AGGREGATION-WITH-VARIATION']" />
  <xsl:template match="*[@DEST='SDG-ATTRIBUTE']" />
  <xsl:template match="*[@DEST='SDG-CLASS']" />
  <xsl:template match="*[@DEST='SDG-DEF']" />
  <xsl:template match="*[@DEST='SDG-FOREIGN-REFERENCE']" />
  <xsl:template match="*[@DEST='SDG-FOREIGN-REFERENCE-WITH-VARIATION']" />
  <xsl:template match="*[@DEST='SDG-PRIMITIVE-ATTRIBUTE']" />
  <xsl:template match="*[@DEST='SDG-PRIMITIVE-ATTRIBUTE-WITH-VARIATION']" />
  <xsl:template match="*[@DEST='SDG-REFERENCE']" />
  <xsl:template match="*[@DEST='SDG-TAILORING']" />
  <xsl:template match="*[@DEST='SECURE-COMMUNICATION-AUTHENTICATION-PROPS']" />
  <xsl:template match="*[@DEST='SECURE-COMMUNICATION-FRESHNESS-PROPS']" />
  <xsl:template match="*[@DEST='SECURE-COMMUNICATION-PROPS-SET']" />
  <xsl:template match="*[@DEST='SECURE-ON-BOARD-COMMUNICATION-NEEDS']" />
  <xsl:template match="*[@DEST='SOMEIP-TP-CONFIG']" />
  <xsl:template match="*[@DEST='SOMEIP-TRANSFORMATION-PROPS']" />
  <xsl:template match="*[@DEST='SPEC-ELEMENT-REFERENCE']" />
  <xsl:template match="*[@DEST='SPEC-ELEMENT-SCOPE']" />
  <xsl:template match="*[@DEST='SPECIFICATION-DOCUMENT-SCOPE']" />
  <xsl:template match="*[@DEST='SUPERVISED-ENTITY-CHECKPOINT-NEEDS']" />
  <xsl:template match="*[@DEST='SWC-TO-APPLICATION-PARTITION-MAPPING']" />
  <xsl:template match="*[@DEST='TCP-OPTION-FILTER-LIST']" />
  <xsl:template match="*[@DEST='TCP-OPTION-FILTER-SET']" />
  <xsl:template match="*[@DEST='TD-EVENT-FRAME-ETHERNET']" />
  <xsl:template match="*[@DEST='TIMING-CONDITION']" />
  <xsl:template match="*[@DEST='TIMING-EXTENSION-RESOURCE']" />
  <xsl:template match="*[@DEST='TIMING-MODE-INSTANCE']" />
  <xsl:template match="*[@DEST='TRACED-FAILURE']" />
  <xsl:template match="*[@DEST='TRANSFORMATION-PROPS']" />
  <xsl:template match="*[@DEST='TRANSFORMATION-PROPS-SET']" />
  <xsl:template match="*[@DEST='TRANSIENT-FAULT']" />
  <xsl:template match="*[@DEST='USER-DEFINED-GLOBAL-TIME-MASTER']" />
  <xsl:template match="*[@DEST='USER-DEFINED-GLOBAL-TIME-SLAVE']" />
  <xsl:template match="*[@DEST='V-2-X-FAC-USER-NEEDS']" />
  <xsl:template match="*[@DEST='V-2-X-M-USER-NEEDS']" />
  <xsl:template match="*[@DEST='VENDOR-SPECIFIC-SERVICE-NEEDS']" />
  <!-- ============================================================ -->
  <!-- Template to translate NUMERICAL types							-->
  <xsl:template name="NUMERICAL">
	<xsl:copy>
		<xsl:for-each select="text()">
			<xsl:choose>
				<xsl:when test="current()='INF'">
					<xsl:value-of select="."/>
				</xsl:when>
				<xsl:when test="current()='-INF'">
					<xsl:value-of select="."/>
				</xsl:when>
				<xsl:when test="contains(current(),'.')">
					<xsl:value-of select="translate(current(),'e','E')" />
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="translate(current(),'ABCDEFX','abcdefx')" />
				</xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>
		<xsl:apply-templates select="*[not(self::text())]"/>
	</xsl:copy>
  </xsl:template>
  
  <xsl:template match="AR:ABS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ACCEPTED-STARTUP-RANGE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ACCESS-DATA-RECORD-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ACTION-POINT-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ADDRESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ALLOW-PASSIVE-TO-ACTIVE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:APPL-WATCHDOG-LIMIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ARRAY-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ASSIGNED-TRAFFIC-CLASS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ASSIGNMENT-PRIORITY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:AUTH-INFO-TX-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:AUTHENTICATION-RETRIES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:AVERAGE-MEMORY-CONSUMPTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BASE-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BASE-TYPE-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BASIC-CYCLE-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BAUDRATE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BIT-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BIT-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BOR-COUNTER-L-1-TO-L-2"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BUFFER-RATIO"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BYTE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:BYTE-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CAN-FD-BAUDRATE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CAS-RX-LOW-MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CHANNEL-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CLIENT-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CLIENT-SERVICE-MAJOR-VERSION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CLIENT-SERVICE-MINOR-VERSION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CLUSTER-DRIFT-DAMPING"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COLD-START-ATTEMPTS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CONFIGURED-NAD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CONNECTION-PRIO-PDUS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CONSTR-LEVEL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-DECREMENT-STEP-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-FAILED-THRESHOLD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-INCREMENT-STEP-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-JUMP-DOWN-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-JUMP-UP-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUNTER-PASSED-THRESHOLD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:COUPLING-PORT-SPEED"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CRC-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CSE-CODE-FACTOR"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CURRENT-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CUSTOM-SERVICE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CUSTOM-SUB-FUNCTION-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CYCLE-COUNT-MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CYCLE-COUNTER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:CYCLE-REPETITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DATA-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DATA-ID-NIBBLE-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DATA-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DATA-LENGTH-REQUEST"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DATA-LENGTH-RESPONSE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DATA-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DECODING-CORRECTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DEFAULT-PRIORITY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DELAY-COMPENSATION-A"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DELAY-COMPENSATION-B"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DIAGNOSTIC-ADDRESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DIAGNOSTIC-MESSAGE-TYPE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DID-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DOMAIN-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DTC-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DTC-SETTING-PARAMETER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DTC-STATUS-AVAILABILITY-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:DYNAMIC-SLOT-IDLE-PHASE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ECU-INSTANCE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ELEMENT-BYTE-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ELEMENT-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:END-TO-END-PROFILE/AR:DATA-ID-MODE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ERROR-CODE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:EVENT-GROUP-IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:EXPECTED-TX-TRIGGER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:EXTERN-OFFSET-CORRECTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:EXTERN-RATE-CORRECTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FDC-THRESHOLD-STORAGE-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FIFO-DEPTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FM-ATTRIBUTE-DEF/AR:DEFAULT-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FM-ATTRIBUTE-VALUE/AR:VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FRAME-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FRESHNESS-COUNTER-SYNC-ATTEMPTS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FRESHNESS-TIMESTAMP-TIME-PERIOD-FACTOR"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FRESHNESS-VALUE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FRESHNESS-VALUE-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FRESHNESS-VALUE-TX-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FUNCTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FUNCTION-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FUNCTION-INSTANCE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:FUNCTIONAL-UNIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:HEADER-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:HEADER-ID-LONG-HEADER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:HEADER-ID-SHORT-HEADER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:HEADER-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:HOP-COUNT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:IDENTITIY-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:IDLE-SLOPE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:IGNORE-AFTER-TX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INDEX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INDUSTRY-GROUP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INFO-TYPE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INGRESS-PRIORITY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INITIAL-NAD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INITIAL-REF-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INITIAL-REPETITIONS-MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INSTANCE-IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INTERFACE-VERSION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:INVERT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:IP-ADDRESS-PREFIX-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:KEEP-ALIVE-PROBES-MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:KEY-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:KEY-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:KEY-SLOT-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LATEST-TX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LENGTH-CLIENT-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LENGTH-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LENGTH-SEQUENCE-COUNTER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LISTEN-NOISE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LISTEN-TIMEOUT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LOWER-CAN-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:LUMINOUS-INTENSITY-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MACRO-INITIAL-OFFSET-A"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MACRO-INITIAL-OFFSET-B"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MACRO-PER-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MANUFACTURER-CODE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MASS-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-AR"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-AS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-BASE-TYPE-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-BLOCK-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-BS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-BUFFER-REQUEST"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-BUFFER-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-CYCLES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-DATA-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-DELTA-COUNTER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-DELTA-COUNTER-INIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-DID-TO-READ"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-DIFF"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-ERROR-STATE-INIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-ERROR-STATE-INVALID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-ERROR-STATE-VALID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-EXP-BS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-FC-WAIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-FR-IF"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-GRADIENT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NO-NEW-OR-REPEATED-DATA"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-FREEZE-FRAME-RECORDS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-ELEMENTS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-EVENT-ENTRIES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-NPDU-PER-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-OCCURRENCES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-REQUEST-CORRECTLY-RECEIVED-RESPONSE-PENDING"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-RESP-PENDING-FRAMES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-NUMBER-OF-TIME-QUANTA-PER-BIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-PERIODIC-DID-TO-READ"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-RETRIES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-SIZE-TO-FILL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-SLOTS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-SOURCE-ELEMENT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-WITHOUT-CLOCK-CORRECTION-FATAL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAX-WITHOUT-CLOCK-CORRECTION-PASSIVE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAXIMUM-DYNAMIC-PAYLOAD-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAXIMUM-KEY-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAXIMUM-MEMORY-CONSUMPTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAXIMUM-RECEIVE-BUFFER-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAXIMUM-TRANSMISSION-UNIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MAXIMUM-TRANSMIT-BUFFER-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MEM-ALIGNMENT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MEMORY-CONSUMPTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MEMORY-HIGH-ADDRESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MEMORY-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MEMORY-LOW-ADDRESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MESSAGE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:META-DATA-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MICRO-INITIAL-OFFSET-A"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MICRO-INITIAL-OFFSET-B"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MICRO-PER-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-DATA-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-NUMBER-OF-OCCURRENCES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-NUMBER-OF-TIME-QUANTA-PER-BIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-OK-STATE-INIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-OK-STATE-INVALID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MIN-OK-STATE-VALID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MINIMUM-MEMORY-CONSUMPTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MINISLOT-ACTION-POINT-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MINISLOT-DURATION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MODE-DECLARATION/AR:VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MODULE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MOLAR-AMOUNT-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MSG-ID-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MSG-ID-MATCH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:MULTICAST-THRESHOLD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:N-DATA-SETS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:N-ROM-BLOCKS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NETWORK-IDLE-TIME"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NETWORK-MANAGEMENT-VECTOR-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NEW-NAD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-CAR-WAKE-UP-BIT-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-CAR-WAKE-UP-FILTER-NODE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-CBV-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-CHANNEL-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-COORD-CLUSTER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-DATA-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-IMMEDIATE-NM-TRANSMISSIONS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-INSTANCE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-NID-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-NODE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-READY-SLEEP-COUNT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-REPETITION-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-USER-DATA-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NM-VOTING-CYCLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NUM-FAILED-SECURITY-ACCESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NUMBER-OF-BITS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NUMBER-OF-MINISLOTS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NUMBER-OF-REPETITIONS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:NUMBER-OF-STATIC-SLOTS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:OBD-DTC-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:OFFSET-CORRECTION-OUT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:OFFSET-CORRECTION-START"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ON-BOARD-MONITOR-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:ON-TRANSITION-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PADDING-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PARAMETER-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PAYLOAD-LENGTH-STATIC"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PDU-COLLECTION-MAX-BUFFER-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PDU-COUNTER-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PDU-COUNTER-START-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PDU-COUNTER-THRESHOLD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PDU-REPLICATION-VOTING"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PDUR-TP-CHUNK-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PERIOD"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PGN"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PIN-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-FILTER-DATA-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-VECTOR-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-VECTOR-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-WAKEUP-CAN-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-WAKEUP-CAN-ID-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-WAKEUP-DATA-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PNC-WAKEUP-DLC"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PORT-ADDRESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PORT-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:POSITION-IN-TABLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PRIORITY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:PROP-SEG"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:QUEUE-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RANGE-MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RANGE-MIN"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RATE-CORRECTION-OUT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RECORD-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:REGENERATED-PRIORITY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RELATIVE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:REQUEST-SEED-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RESPONSE-ERROR-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RID-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:RX-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SAFETY-MARGIN"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SAMPLES-PER-MICROTICK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SCHEDULER-MAX-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SECOND-KEY-SLOT-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SECONDARY-FRESHNESS-VALUE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SECURITY-ACCESS-LEVEL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SEED-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SEGMENT-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SEGMENT-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SELECTOR-FIELD-CODE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SELECTOR-FIELD-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SELECTOR-FIELD-START-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SEPARATION-CYCLE-EXPONENT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SEQUENCE-COUNTER-JUMP-WIDTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SERVER-SERVICE-MAJOR-VERSION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SERVICE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SERVICE-IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SIZE-OF-ARRAY-LENGTH-FIELDS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SIZE-OF-STRUCT-LENGTH-FIELDS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SIZE-OF-UNION-LENGTH-FIELDS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SLOT-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SPEED"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SSRC"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:START-INDEX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:START-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:STATIC-SLOT-DURATION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:STREAM-IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SUB-NODE-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SUB-TYPE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SUBNET-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SUPPLIER-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SW-ALIGNMENT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SW-FILL-CHARACTER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SW-INTENDED-RESOLUTION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SW-RECORD-LAYOUT-GROUP-STEP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SW-RECORD-LAYOUT-V-FIX-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SYMBOL-WINDOW"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SYMBOL-WINDOW-ACTION-POINT-OFFSET"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SYNC-COUNTER-INIT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SYNC-FRAME-ID-COUNT-MAX"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:SYNC-JUMP-WIDTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TARGET-MODULE-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TEMPERATURE-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TEST-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:THRESHOLD-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TIME-EXP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TIME-MARK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TIME-MASTER-PRIORITY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TIME-SEG-1"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TIME-SEG-2"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TIME-TRIGGERED-CAN-LEVEL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TOL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TOLERATED-FAILED-CYCLES"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TP-ADDRESS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TP-ADDRESS-EXTENSION-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TRAFFIC-CLASS"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TRANSMISSION-START-SEQUENCE-DURATION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TTL"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TX-ENABLE-WINDOW-LENGTH"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TX-MASK"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:TYP"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UDS-DTC-NUMBER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UDS-DTC-VALUE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UNIT-AND-SCALING-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UNUSED-BIT-PATTERN"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UPDATE-INDICATION-BIT-POSITION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UPPER-CAN-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:UPPER-HEADER-BITS-TO-SHIFT"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:V"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:VARIANT-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:VEHICLE-SYSTEM"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:VEHICLE-SYSTEM-INSTANCE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:VENDOR-ID"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:VERSION"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:VLAN-IDENTIFIER"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WAKE-UP-PATTERN"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WAKEUP-RX-IDLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WAKEUP-RX-LOW"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WAKEUP-RX-WINDOW"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WAKEUP-TX-ACTIVE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WAKEUP-TX-IDLE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WINDOW-SIZE"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:WRITING-FREQUENCY"><xsl:call-template name="NUMERICAL"/></xsl:template>
  <xsl:template match="AR:X"><xsl:call-template name="NUMERICAL"/></xsl:template>
  
  <!-- ============================================================ -->
  <!-- Template to remove elements whose string pattern changed     -->
  <xsl:template match="AR:ADDRESS-RANGE-LOWER-BOUND"/>
  <xsl:template match="AR:ADDRESS-RANGE-UPPER-BOUND"/>
  <xsl:template match="AR:ALIGNMENT"/>
  <xsl:template match="AR:DEFAULT-GATEWAY"/>
  <xsl:template match="AR:DEFAULT-ROUTER"/>
  <xsl:template match="AR:DNS-SERVER-ADDRESS"/>
  <xsl:template match="AR:IPV-4-ADDRESS"/>
  <xsl:template match="AR:IPV-6-ADDRESS"/>
  <xsl:template match="AR:MAC-MULTICAST-ADDRESS"/>
  <xsl:template match="AR:MAC-UNICAST-ADDRESS"/>
  <xsl:template match="AR:NETWORK-MASK"/>
  
  <!-- ============================================================ -->
  <!-- Template to copy the comment                                 -->
  <xsl:template match="comment()">
    <xsl:copy />
  </xsl:template>
  <!-- ============================================================ -->
  <!-- Default template to copy all attributes of a node and invoke templates on children     -->
  <xsl:template match="*">
    <xsl:copy>
      <xsl:copy-of select="@*" />
      <xsl:apply-templates />
    </xsl:copy>
  </xsl:template>
</xsl:transform>