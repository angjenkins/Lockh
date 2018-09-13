<?xml version="1.0" encoding="windows-1252" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="text"/>

<!--   <xsl:strip-space elements = "*" /> -->

<xsl:template match="text()">

  <xsl:for-each select="ancestor-or-self::*">
    <xsl:text>/</xsl:text>
    <xsl:value-of select="name()" />
  </xsl:for-each>

  <xsl:text></xsl:text>
 <!--   <xsl:value-of select="." /> -->
  <xsl:text>&#xA;</xsl:text>

  <xsl:apply-templates/>

</xsl:template>

</xsl:stylesheet>