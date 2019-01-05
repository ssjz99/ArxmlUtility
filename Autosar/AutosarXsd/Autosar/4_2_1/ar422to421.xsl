<?xml version="1.0" encoding="utf-8"?>
<xsl:transform version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:AR="http://autosar.org/schema/r4.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" exclude-result-prefixes="AR" >
	<xsl:output method="xml" version="1.0" encoding="utf-8" indent="yes" xalan:indent-amount="0" xmlns:xalan="http://xml.apache.org/xslt"/>
	<!-- Template for root node -->
	<xsl:template match="AR:AUTOSAR">
		<xsl:choose>
			<xsl:when test="contains(string(@*), 'AUTOSAR_4-2-2.xsd')">
				<xsl:variable name="ARPATH" select="substring-after(string(@*), 'r4.0 ')"/>
				<AUTOSAR xsi:schemaLocation="{concat('http://autosar.org/schema/r4.0 ', concat(substring-before($ARPATH, '4-2-2'), '4-2-1', substring-after($ARPATH, '4-2-2') ))}" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://autosar.org/schema/r4.0">
					<xsl:apply-templates/>
				</AUTOSAR>
			</xsl:when>
			<xsl:otherwise>
				<AUTOSAR xsi:schemaLocation="http://autosar.org/schema/r4.0 AUTOSAR_4-2-1.xsd" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://autosar.org/schema/r4.0">
					<xsl:apply-templates/>
				</AUTOSAR>
			</xsl:otherwise>
		</xsl:choose>
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