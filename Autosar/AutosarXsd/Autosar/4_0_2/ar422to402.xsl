<?xml version="1.0" encoding="utf-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:AR="http://autosar.org/schema/r4.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="AR" >
	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" xalan:indent-amount="0" xmlns:xalan="http://xml.apache.org/xslt"/>
	<!-- Template for root node -->
	<xsl:template match="AR:AUTOSAR">
		<xsl:choose>
			<xsl:when test="contains(string(@*), 'AUTOSAR_4-2-2.xsd')">
				<xsl:variable name="ARPATH" select="substring-after(string(@*), 'r4.0 ')"/>
				<AUTOSAR xsi:schemaLocation="{concat('http://autosar.org/schema/r4.0 ', concat(substring-before($ARPATH, '4-2-2'), '4-0-2', substring-after($ARPATH, '4-2-2') ))}" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://autosar.org/schema/r4.0">
					<xsl:apply-templates/>
				</AUTOSAR>
			</xsl:when>
			<xsl:otherwise>
				<AUTOSAR xsi:schemaLocation="http://autosar.org/schema/r4.0 AUTOSAR_4-0-2.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://autosar.org/schema/r4.0">
					<xsl:apply-templates/>
				</AUTOSAR>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!-- ============================================================ -->
	<!--AR-Elements that don't exist before 4.2.1: -->
	<xsl:template match="AR:ELEMENTS/AR:CLIENT-ID-DEFINITION-SET"/>
	<xsl:template match="AR:ELEMENTS/AR:DATA-TRANSFORMATION-SET"/>
	<!-- ============================================================ -->
	<!-- Properties that don't exist before 4.2.1: -->
	<xsl:template match="AR:APPLICATION-ARRAY-DATA-TYPE/AR:DYNAMIC-ARRAY-SIZE-PROFILE"/>
	<xsl:template match="AR:APPLICATION-ARRAY-ELEMENT/AR:ARRAY-SIZE-HANDLING"/>
	<xsl:template match="AR:ASSIGNED-DATA-TYPES"/>
	<xsl:template match="AR:DATA-TRANSFORMATION"/>
	<xsl:template match="AR:DATA-TRANSFORMATION-REF-CONDITIONAL"/>
	<xsl:template match="AR:DATA-TRANSFORMATION-SET"/>
	<xsl:template match="AR:EVENTS/AR:TRANSFORMER-HARD-ERROR-EVENT"/>
	<xsl:template match="AR:IMPLEMENTATION-DATA-TYPE/AR:DYNAMIC-ARRAY-SIZE-PROFILE"/>
	<xsl:template match="AR:IMPLEMENTATION-DATA-TYPE-ELEMENT/AR:ARRAY-SIZE-HANDLING"/>
	<xsl:template match="AR:INVALID-VALUE[./AR:ARRAY-VALUE-SPECIFICATION]"/>
	<xsl:template match="AR:INVALID-VALUE[./AR:RECORD-VALUE-SPECIFICATION]"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:CYCLIC-WRITING-PERIOD"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:STORE-CYCLIC"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:STORE-EMERGENCY"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:STORE-IMMEDIATE"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:USE-AUTO-VALIDATION-AT-SHUT-DOWN"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:USE-CRC-COMP-MECHANISM"/>
	<xsl:template match="AR:NONQUEUED-RECEIVER-COM-SPEC/AR:HANDLE-DATA-STATUS"/>
	<xsl:template match="AR:PORT-API-OPTION/AR:ERROR-HANDLING"/>
	<xsl:template match="AR:REPLACE-WITH"/>
	<xsl:template match="AR:SW-DATA-DEF-PROPS-CONDITIONAL/AR:STEP-SIZE"/>
	<xsl:template match="AR:TRANSFORMATION-COM-SPEC-PROPSS"/>
	<xsl:template match="AR:TRIGGER-REF[@DEST='TRANSFORMER-HARD-ERROR-EVENT']"/>
	<xsl:template match="*[@HANDLE-INVALID='EXTERNAL-REPLACEMENT']"/>
	
	<!-- Clean empty EVENTS -->
	<xsl:template match="AR:EVENTS[AR:TRANSFORMER-HARD-ERROR-EVENT] | AR:EVENTS[AR:INIT-EVENT]">
		<xsl:if test="count(*)!=count(./AR:TRANSFORMER-HARD-ERROR-EVENT)+count(./AR:INIT-EVENT) ">
			<xsl:copy>
				<xsl:copy-of select="@*"/>
				<xsl:apply-templates/>
			</xsl:copy>
		</xsl:if>
	</xsl:template>

	<!-- Clean empty PORT-API-OPTIONS -->
	<xsl:template match="AR:PORT-API-OPTIONS">
		<xsl:if test="count(./*/*)!=count(./*/AR:ERROR-HANDLING)+count(./*/AR:PORT-REF)">
			<xsl:copy>
				<xsl:copy-of select="@*"/>
				<xsl:apply-templates/>
			</xsl:copy>
		</xsl:if>
	</xsl:template>
	
	<!-- Clean empty PORT-API-OPTION's -->
	<xsl:template match="AR:PORT-API-OPTION">
		<xsl:if test="count(*)!=count(./AR:ERROR-HANDLING)+count(./AR:PORT-REF)">
			<xsl:copy>
				<xsl:copy-of select="@*"/>
				<xsl:apply-templates/>
			</xsl:copy>
		</xsl:if>
	</xsl:template>
	<!-- ============================================================ -->
	<!-- Properties that don't exist before 4.1.2: -->
	<xsl:template match="AR:MODE-ACCESS-POINT/AR:IDENT"/>
	<xsl:template match="AR:MODE-SWITCH-RECEIVER-COM-SPEC/AR:MODE-GROUP-REF"/>
	
	<!--Clean empty ModeAccessPoints -->	
	<xsl:template match="AR:MODE-ACCESS-POINTS[AR:MODE-ACCESS-POINT/AR:IDENT]">
		<xsl:if test="*/*!=*/AR:IDENT">
			<xsl:copy>
				<xsl:copy-of select="@*"/>
				<xsl:apply-templates/>
			</xsl:copy>
		</xsl:if>
	</xsl:template>
	<xsl:template match="AR:MODE-ACCESS-POINT[AR:IDENT]">
		<xsl:if test="*!=AR:IDENT">
			<xsl:copy>
				<xsl:copy-of select="@*"/>
				<xsl:apply-templates/>
			</xsl:copy>
		</xsl:if>
	</xsl:template>	
	<!-- ============================================================ -->
	<!-- Properties that don't exist before 4.1.1: -->
	<xsl:template match="AR:EXCLUSIVE-AREA-NESTING-ORDER-REFS"/>  <!-- In abstract: ExecutableEntity -->
	<xsl:template match="AR:EVENTS/AR:INIT-EVENT"/>
	<xsl:template match="AR:ACTIVATION-REASON-REPRESENTATION-REF"/> 	<!-- In abstract: Event -->
	<xsl:template match="AR:INTERNAL-BEHAVIOUR/AR:EXCLUSIVE-AREA-NESTING-ORDERS"/>
	<xsl:template match="AR:MAX-NO-NEW-OR-REPEATED-DATA"/> 			<!-- In abstract: ReceiverComSpec -->
	<xsl:template match="AR:MODE-DECLARATION-GROUP/AR:MODE-TRANSITIONS"/>
	<xsl:template match="AR:MODE-DECLARATION-GROUP/AR:MODE-MANAGER-ERROR-BEHAVIOR"/>
	<xsl:template match="AR:MODE-DECLARATION-GROUP/AR:MODE-USER-ERROR-BEHAVIOR"/>
	<xsl:template match="AR:NV-BLOCK-NEEDS/AR:RAM-BLOCK-STATUS-CONTROL"/>
	<xsl:template match="AR:PORT-API-OPTION[AR:PORT-REF[@DEST='PR-PORT-PROTOTYPE']]"/>
	<xsl:template match="AR:PR-PORT-PROTOTYPE"/>
	<xsl:template match="AR:RUNNABLE-ENTITY/AR:ACTIVATION-REASONS"/>
	<xsl:template match="AR:SYNC-COUNTER-INIT"/>				<!-- In abstract: ReceiverComSpec -->
	<xsl:template match="AR:SYNCHRONOUS-SERVER-CALL-POINT/AR:CALLED-FROM-WITHIN-EXCLUSIVE-AREA-REF"/>
	<xsl:template match="AR:VARIABLE-ACCESS[AR:ACCESSED-VARIABLE/AR:AUTOSAR-VARIABLE-IREF/AR:PORT-PROTOTYPE-REF[@DEST='PR-PORT-PROTOTYPE']]"/>
	<xsl:template match="*[@DEST='PR-PORT-PROTOTYPE']"/>
	<!-- ============================================================ -->
	<!-- Properties that don't exist before 4.0.3: -->
	<xsl:template match="AR:COMPU-SCALE/AR:SYMBOL"/>
	<xsl:template match="AR:DATA-CONSTR-RULE/AR:CONSTR-LEVEL"/>
	<xsl:template match="AR:HANDLE-OUT-OF-RANGE-STATUS"/>		<!-- In abstract: ReceiverComSpec -->
	<xsl:template match="AR:IMPLEMENTATION-DATA-TYPE/AR:TYPE-EMITTER"/>
	<xsl:template match="AR:MAX-DELTA-COUNTER-INIT"/>
	<xsl:template match="AR:MODE-DECLARATION/AR:VALUE"/>
	<xsl:template match="AR:MODE-DECLARATION-GROUP/AR:ON-TRANSITION-VALUE"/>
	<xsl:template match="AR:MODE-DECLARATION-GROUP-PROTOTYPE/AR:SW-CALIBRATION-ACCESS"/>
	<xsl:template match="AR:MODE-GROUP/AR:SW-CALIBRATION-ACCESS"/>
	<xsl:template match="AR:PER-INSTANCE-MEMORY/AR:SW-DATA-DEF-PROPS"/>
	<xsl:template match="AR:PROVIDED-COM-SPECS/AR:NV-PROVIDE-COM-SPEC"/>
	<xsl:template match="AR:RUNNABLE-ENTITY/AR:ARGUMENTS"/>
	<xsl:template match="AR:SERVICE-KIND"/>		<!-- In abstract: PortInterface -->
	<xsl:template match="AR:SYMBOL-PROPS"/>	<!-- In abstract: AtomicSwComponentType -->
	<!-- ============================================================ -->
	<!-- Renamed Properties since 4.0.3: -->
	<xsl:template match="AR:SW-CALPRM-AXIS/AR:CATEGORY">
		<xsl:copy>
			<xsl:value-of select="translate(.,'_','-')"/>
		</xsl:copy>
	</xsl:template>
	<xsl:template match="AR:LOCAL-PARAMETER-REF | AR:ROOT-PARAMETER-DATA-PROTOTYPE-REF">
		<xsl:copy>
			<xsl:copy-of select="@*[not(DEST)]"/>
			<xsl:attribute name="DEST">PARAMETER-DATA-PROTOTYPE</xsl:attribute>
			<xsl:apply-templates/>
		</xsl:copy>
	</xsl:template>
	<xsl:template match="AR:MODE-DECLARATION-GROUP-REF">
		<xsl:element name="AR:MODE-DECLARATION-REF">
			<xsl:copy-of select="@*"/>
			<xsl:apply-templates/>
		</xsl:element>	
	</xsl:template>
	<!-- ============================================================ -->
	<!-- Template to copy the comment-->
	<xsl:template match="comment()">
		<xsl:copy/>
	</xsl:template>
	<!-- ============================================================ -->
	<!-- Default template to copy all attributes of a node and invoke templates on children -->
	<xsl:template match="*">
		<xsl:copy>
			<xsl:copy-of select="@*"/>
			<xsl:apply-templates/>
		</xsl:copy>
	</xsl:template>
</xsl:transform>