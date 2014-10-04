package com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will demonstrate how to find the max element in arraylist.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/maximum-value-in-arraylist/'>Find max value in arraylist</a>
 */
class MaxValueInArrayList {

    @Test
    void locate_max_element() {

        def maximum = [2007, 2009, 2010, 2011, 2013]

        assert 2013, maximum.max()
    }

    @Test
    void locate_max_element_with_collections() {

        def maximumElements = [2007, 2009, 2010, 2011, 2013]

        assert 2013, Collections.max(maximumElements)
    }

    @Test
    void max_is_null_aware() {

        def elements = [2007, 2009, 2010, 2011, 2013, null]

        assert 2013, elements.max()
    }

    @Test
    void string_with_max_length () {

        def elements = ["Bringing", "Home", "The", "Bacon"]

        assert "Bringing", elements.max { it.size() }
    }
}
