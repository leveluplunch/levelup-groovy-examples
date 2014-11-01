package com.levelup.groovy.xml

import org.junit.Test

/**
 * This groovy example will demonstrate how to read sitemap with XMLSlurper
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/parse-sitemap-xml-with-xmlsluper/'>Parse sitemap with XmlSlurper</a>
 */
class ParseSitemapXmlSlurper {

    @Test
    public void parse_rss_xml_feed() {

        def siteMapLocation = "http://www.leveluplunch.com/sitemap.xml".toURL().text

        def urlset = new XmlSlurper().parseText(siteMapLocation)
        urlset.url.each{
            println it.loc
            println it.lastmod
            println it.priority
            println "^^^^^^^^"
        }
    }

}
