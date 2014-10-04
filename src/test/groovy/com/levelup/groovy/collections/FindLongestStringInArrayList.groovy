package com.levelup.groovy.collections

import org.junit.Test

import static junit.framework.Assert.assertEquals

/**
 * This groovy example will demonstrate how to get the shortest string within a list.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/get-shortest-length-string-arraylist/'>Get shortest string in list</a>
 */
class FindLongestStringInList {

    @Test
    void longest_string_arraylist() {

        def collection = [
                "Morwenna",
                "Hammy",
                "Benjy",
                "Mickey Mouse",
                "Speedy Gonzales"]

        assertEquals "Speedy Gonzales",
                collection.sort({ a, b -> b.length() <=> a.length() })[0]
    }

}
