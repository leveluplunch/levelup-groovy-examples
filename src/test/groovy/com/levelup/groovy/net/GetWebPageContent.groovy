package com.levelup.groovy.net

import org.junit.Test

/**
 * This groovy example will show how to make a get request to a URL
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/make-get-request-httpbuilder-apache-httpcomponents/'>Make a get request to a URI or URL</a>
 */
class GetWebPageContent {

    @Test
    public void contentFromUrl() {

        def urlContents = "https://github.com/leveluplunch/levelup-java-examples/blob/master/README.md"
                .toURL().getText()

        urlContents.eachLine {
            println it //read each line of the web page99
        }
    }
}