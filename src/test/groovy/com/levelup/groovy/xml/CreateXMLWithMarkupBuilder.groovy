package com.levelup.groovy.xml

import org.junit.Test

/**
 * This groovy example will demonstrate how to build simple xml with markupbuilder
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/creating-xml-with-markupbuilder/'>Create xml with markupbuilder</a>
 */
class CreateXMLWithMarkupBuilder {

    @Test
    public void create_simple_xml() {

        def writer = new StringWriter()
        def xml = new groovy.xml.MarkupBuilder(writer).books {
            book() {
                author("Kent Beck")
                title("Test Driven Development: By Example")
                price("37.99")
                description("Quite simply, test-driven development is meant to eliminate fear in application development.")
            }
        }

        println writer.toString()
    }

    @Test
    public void create_xml_with_attribute () {

        def writer = new StringWriter()
        def xml = new groovy.xml.MarkupBuilder(writer).books {
            book("id": 101) {
                author("Robert C. Martin")
                title("Clean Code: A Handbook of Agile Software Craftsm.")
                price("38.43")
                description("Even bad code can function.")
            }
        }

        println writer.toString()
    }

    @Test
    public void create_xml_with_omit_attribute () {

        def writer = new StringWriter()
        def xml = new groovy.xml.MarkupBuilder(writer).books {
            setOmitEmptyAttributes(true)
            setOmitNullAttributes(true)
            book("id": "", "isbn": null) {
                author("Kishori Sharan")
                title("Beginning Java 8 APIs")
                price("free")
                description("Beginning Java 8 APIs, Extensions and Libraries...")
            }
        }

        println writer.toString()
    }


}
