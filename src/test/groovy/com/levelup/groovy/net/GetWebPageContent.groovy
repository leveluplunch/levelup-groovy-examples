package com.levelup.groovy.net

import org.junit.Test

/**
 * This groovy example will show how to fetch web page contents
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/get-webpage-content-url-uri/'>Get webpage content form URL</a>
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