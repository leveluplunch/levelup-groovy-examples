package com.levelup.groovy.xml

import org.junit.Test

/**
 * This groovy example will demonstrate how to read rss with XMLSlurper
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/parse-rss-xml-feed-with-xmlsluper/'>Parse rss feed with XMLSlurper</a>
 */
class ParseRSSXMLSlurper {


    @Test
    public void parse_rss_xml_feed() {

        def rssFeed = "http://www.leveluplunch.com/feed/rss-groovy-examples.xml".toURL().text

        def rss = new XmlSlurper().parseText(rssFeed)
        rss.channel.item.each{
            println it.title
            println it.pubDate
            println it.link
            println "******"
        }
    }
}
