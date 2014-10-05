package com.levelup.groovy.string

import static org.junit.Assert.*

import org.junit.Test

/**
 * This groovy example will demonstrate how to pad a string with leading spaces.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/pad-string-left-start-with-spaces/'>Left pad string with spaces</a>
 */
class LeftPadStringWithSpaces {

    @Test
    void left_pad_string_with_spaces() {

        def ninePadded = "Nine".padLeft(9, " ")

        assert "     Nine" == ninePadded
        assert 9 == ninePadded.length()

    }
}
