package com.levelup.groovy.string

import org.junit.Test

/**
 * This groovy example will demonstrate how to remove part of a string.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/remove-part-of-string/'>Remove part of a string</a>
 */
class RemovePartOfString {


    @Test
    void remove_part_of_string_minus() {

        def part = "hit the ground running"

        assert "hit the ground" == part.minus(" running")
    }

    @Test
    void remove_part_of_string_operator() {

        def part = "hit the ground running"

        assert "hit the ground" == part - " running"
    }

}
