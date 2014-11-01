package com.levelup.groovy.html

import groovy.xml.MarkupBuilder
import org.junit.Test


/**
 * This groovy example will demonstrate how to generate html document
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/generate-html-with-markupbuilder/'>Generate html with markupbuilder</a>
 */
class GenerateHtmlWithMarkupBuilder {

    @Test
    public void generate_html_with_markupbuilder() {

        def writer = new StringWriter()
        def html = new MarkupBuilder(writer)
        html.html {
            head {
                title: "Creating html document with groovy"
                script: "alert('hello');"
            }
            body(id: "main") {
                h2 id: "book-mark",  "Tutorial on how to generate html with groovy"
                p {
                    mkp.yield "Mixing text with"
                    strong "strong"
                    mkp.yield " elements."
                }
                a href: "http://www.leveluplunch.com/java/tutorials/", "Java tutorials"
            }
        }
        println writer
    }
}
