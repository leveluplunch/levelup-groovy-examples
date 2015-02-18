package com.levelup.groovy.string

import org.junit.Test

/**
 * This groovy example will demonstrate how to split a string with a comma as a delimiter.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/split-string-on-comma/'>Seperate string by comma</a>
 */
class SplitStringOnComma {

    @Test
    void split_string_on_comma_tokenize() {

        def seperateStringByComma = "and, but, for, nor, yet, or, so".tokenize(", ")

        assert ["and", "but", "for", "nor", "yet", "or", "so"] == seperateStringByComma
    }

    @Test
    void split_string_on_comma_split() {

        def splitStringComma = "and, but, for, nor, yet, or, so".split(", ")

        assert ["and", "but", "for", "nor", "yet", "or", "so"] == splitStringComma
    }
}
