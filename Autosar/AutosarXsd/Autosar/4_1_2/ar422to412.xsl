<?xml version="1.0" encoding="utf-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:AR="http://autosar.org/schema/r4.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="AR" >
	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" xalan:indent-amount="0" xmlns:xalan="http://xml.apache.org/xslt"/>
	<!-- Template for root node -->
	<xsl:template match="AR:AUTOSAR">
		<xsl:choose>
			<xsl:when test="contains(string(@*), 'AUTOSAR_4-2-2.xsd')">
				<xsl:variable name="ARPATH" select="substring-after(string(@*), 'r4.0 ')"/>
				<AUTOSAR xsi:schemaLocation="{concat('http://autosar.org/schema/r4.0 ', concat(substring-before($ARPATH, '4-2-2'), '4-1-2', substring-after($ARPATH, '4-2-2') ))}" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://autosar.org/schema/r4.0">
					<xsl:apply-templates/>
				</AUTOSAR>
			</xsl:when>
			<xsl:otherwise>
				<AUTOSAR xsi:schemaLocation="http://autosar.org/schema/r4.0 AUTOSAR_4-1-2.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://autosar.org/schema/r4.0">
					<xsl:apply-templates/>
				</AUTOSAR>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>
	<!-- ============================================================ -->
	<!--AR-Elements that don't exist befor 4.2.1: -->
	<xsl:template match="AR:ELEMENTS/AR:CLIENT-ID-DEFINITION-SET"/>
	<xsl:template match="AR:ELEMENTS/AR:DATA-TRANSFORMATION-SET"/>
	<!-- ============================================================ -->
	<!-- Properties that don't exist befor 4.2.1: -->
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
	<xsl:template match="AR:EVENTS[AR:TRANSFORMER-HARD-ERROR-EVENT]">
		<xsl:if test="*!=AR:TRANSFORMER-HARD-ERROR-EVENT">
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