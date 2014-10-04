package com.levelup.groovy.collections

import org.junit.Test

import static junit.framework.Assert.assertEquals

/**
 * This groovy example will demonstrate how to get the shortest string within a list.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/get-shortest-length-string-arraylist/'>Get shortest string in list</a>
 */
class FindShortestStringInList {

    @Test
    void smallest_string_arraylist() {

        def collection = [
                "Dark Horse",
                "Roar",
                "This is how we do",
                "Firework",
                "Birthday"]

        assertEquals("Roar",
                collection.sort({ a, b -> a.length() <=> b.length() })[0])
    }

}
