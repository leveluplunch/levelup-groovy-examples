package com.levelup.groovy.string

import org.junit.Test

/**
 * This groovy example will demonstrate how to pad a string with trailing spaces.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/right-pad-string-ending-with-spaces/'>Right pad string with spaces</a>
 */
class RightPadStringWithSpaces {

    @Test
    void right_pad_string_with_spaces() {

        def warhawksPadded = "Warhawks".padRight(10, " ")

        assert "Warhawks  " == warhawksPadded
        assert 10 == warhawksPadded.length()
    }



}

