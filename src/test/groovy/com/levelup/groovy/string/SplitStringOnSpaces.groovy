package com.levelup.groovy.string

import org.junit.Test

/**
 * This groovy example will demonstrate how to split a string on whitespace.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/split-string-on-whitespaces/'>Split string on white space</a>
 */
class SplitStringOnSpaces {

    @Test
    void split_string_on_space_tokenize() {

        def baconSplit = "Bacon ipsum dolor sit amet eiusmod".tokenize(" ")

        assert ["Bacon", "ipsum", "dolor", "sit", "amet", "eiusmod"] == baconSplit
    }

    @Test
    void split_string_on_space_split() {

        def baconSplit = "Bacon ipsum dolor sit amet eiusmod".split(" ")

        assert ["Bacon", "ipsum", "dolor", "sit", "amet", "eiusmod"] == baconSplit
    }

}
