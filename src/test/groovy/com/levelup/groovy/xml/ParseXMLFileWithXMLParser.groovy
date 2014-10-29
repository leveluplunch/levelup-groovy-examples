package com.levelup.groovy.xml

import org.junit.Test

import java.nio.file.Path
import java.nio.file.Paths

/**
 * This groovy example will demonstrate how to count the
 * number of occurrences of a char in a string.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/parse-xml-from-file-with-xmlparser/'>Parse xml from file with XMLParser</a>
 */
class ParseXMLFileWithXMLParser {

    @Test
    void parse_xml_file() {

        Path xmlFilePath = Paths
                .get("src/test/resources/com/levelup/groovy/xml/bart-route-dublin.xml")
                .toAbsolutePath()

        def root = new XmlParser().parse(xmlFilePath.toFile())

        // get the root nodes name
        assert "root" == root.name()

        // get text of
        assert "ROUTE 11" == root.routes.route[0].routeID.text()

        // verify that each station is in list
        assert root.routes.route[0].config.station.each {
                assert it.text() in ['DUBL', 'WDUB', 'CAST', 'BAYF'] }

        //get attribute with value
        assert "DUBL" == root.routes.route[0].config.station.find{it['@val'] == '1'}.text()
    }

}
