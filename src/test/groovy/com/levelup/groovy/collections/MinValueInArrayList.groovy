package com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will demonstrate how to find the min element in arraylist.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/minimum-value-in-arraylist/'>Find min value in arraylist</a>
 */
class MinValueInArrayList {


    @Test
    void locate_min_element() {

        def minimum = [2001, 1995, 1992, 1991, 1990]

        assert 1990, minimum.min()
    }

    @Test
    void locate_min_element_with_collections() {

        def minimumElements = [2001, 1995, 1992, 1991, 1990]

        assert 1990, Collections.min(minimumElements)
    }

    @Test
    void min_is_null_aware() {

        def elements = [2001, 1995, 1992, 1991, 1990, null]

        assert 1990, elements.min()
    }

    @Test
    void string_with_min_length () {

        def elements = ["Bringing", "Home", "The", "Bacon"]

        assert "The", elements.min { it.size() }
    }

}
