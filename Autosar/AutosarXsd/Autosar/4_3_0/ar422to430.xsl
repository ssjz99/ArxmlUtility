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
      <xsl:when test="contains(string(@*), &#39;AUTOSAR_4-2-2.xsd&#39;)">
        <xsl:variable name="ARPATH"
                      select="substring-after(string(@*), &#39;r4.0 &#39;)" />
        <AUTOSAR xsi:schemaLocation="{concat(&#39;http://autosar.org/schema/r4.0 &#39;, concat(substring-before($ARPATH, &#39;4-2-2&#39;), &#39;4-3-0&#39;, substring-after($ARPATH, &#39;4-2-2&#39;) ))}"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xmlns="http://autosar.org/schema/r4.0">
          <xsl:apply-templates />
        </AUTOSAR>
      </xsl:when>
      <xsl:otherwise>
        <AUTOSAR xsi:schemaLocation="http://autosar.org/schema/r4.0 AUTOSAR_4-3-0.xsd"
                 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                 xmlns="http://autosar.org/schema/r4.0">
          <xsl:apply-templates />
        </AUTOSAR>
      </xsl:otherwise>
    </xsl:choose>
  </xsl:template>
  <!-- ============================================================ -->
  <!-- Template to copy the comment                                 -->
  <xsl:template match="comment()">
    <xsl:copy />
  </xsl:template>
  <!-- ============================================================ -->
  <!-- Default template to copy all attributes of a node and invoke templates on children -->
  <xsl:template match="*">
    <xsl:copy>
      <xsl:copy-of select="@*" />
      <xsl:apply-templates />
    </xsl:copy>
  </xsl:template>
</xsl:transform>
