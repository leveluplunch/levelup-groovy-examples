package com.levelup.groovy.xml

import groovy.xml.XmlUtil
import org.junit.Test

/**
 * This groovy example will demonstrate how to create a sitemap.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/create-sitemap-xml-with-streaming-markupbuilder/'>Create sitemap with markupbuilder</a>
 */
class CreateSitemapMarkupbuilder {

    class MyUrls {
        def loc
        def lastmod
        def changefreq
        def priority
    }

    @Test
    public void create_sitemap_markupbuilder() {

        def writer = new StringWriter()
        def builder = new groovy.xml.MarkupBuilder(writer)

        def myUrls = [new MyUrls(changefreq: "weekly", loc: "http://www.leveluplunch.com/groovy/examples/", lastmod: "2014-07-22T11:46:18-05:00", priority: "0.8"),
                      new MyUrls(changefreq: "weekly", loc: "http://www.leveluplunch.com/java/examples/", lastmod: "2014-07-22T11:46:18-05:00", priority: "0.8")]

        builder.urlset {
            myUrls.each() { obj ->
                url() {
                    changefreq(obj.changefreq)
                    loc(obj.loc)
                    lastmod(obj.lastmod)
                    priority(obj.priority)
                }
            }
        }
        println writer.toString()
    }


    @Test
    public void create_sitemap_streamingmarkupbuilder() {

        def myUrls = [new MyUrls(changefreq: "weekly", loc: "http://www.leveluplunch.com/blog/2014/09/29/amazon-cloudfront-s3-subfolders-default-index/", lastmod: "2014-07-22T11:46:18-05:00", priority: "0.8"),
                      new MyUrls(changefreq: "weekly", loc: "http://www.leveluplunch.com/blog/2013/12/30/convert-recorded-audio-text-using-osx-dictation-audacity-soundflower/", lastmod: "2014-07-22T11:46:18-05:00", priority: "0.8")]

        def builder = new groovy.xml.StreamingMarkupBuilder()
        builder.encoding = 'UTF-8'
        def mySitemap = builder.bind {
            mkp.xmlDeclaration()
            mkp.declareNamespace(
                    "xsi ":"http://www.w3.org/2001/XMLSchema-instance",
                    "schemaLocation" : "http://www.sitemaps.org/schemas/sitemap/0.9 http://www.sitemaps.org/schemas/sitemap/0.9/sitemap.xsd",
                    "":"http://www.sitemaps.org/schemas/sitemap/0.9")
            urlset() {
                myUrls.each() { obj ->
                    url() {
                        changefreq(obj.changefreq)
                        loc(obj.loc)
                        lastmod(obj.lastmod)
                        priority(obj.priority)
                    }
                }
            }
        }
        println XmlUtil.serialize(mySitemap)
    }
}