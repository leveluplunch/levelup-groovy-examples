package com.levelup.groovy.xml

import org.junit.Test

/**
 * This groovy example will demonstrate how to build simple xml with markupbuilder
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/build-xml-from-map-with-markupbuilder/'>Generate xml from map</a>
 */
class CreateXMLFromMap {

    @Test
    public void create_xml_from_map() {

        def writer = new StringWriter()
        def builder = new groovy.xml.MarkupBuilder(writer)
        def myMap = ["author": "Eric T. Freeman, Elisabeth Robson",
                     "title": "Head First JavaScript Programming",
                     "price": "42.99",
                     "description": "This brain-friendly guide teaches you everything from JavaScript language fundamentals to advanced topics."]

        builder.books {
            book() {
                myMap.each() { key, value ->
                    "${key}" "${value}"
                }
            }
        }
        println writer.toString()
    }
}
