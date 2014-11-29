package com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will demonstrate how to take the first N of elements in groovy.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/take-or-limit-number-of-elements-from-arraylist/'>Limit number of elements in arraylist</a>
 */
class LimitNumberOfElementsList {

    @Test
    void using_range() {

        def list = [1, 2, 3, 4, 5]

        assert [1, 2, 3] == list[0..2]
    }

    @Test
    void take_first_of_strings() {

        def stringList = ["overlax", "traducing",
                          "daemonian", "clarsach",
                          "raptus"]

        assert ["overlax", "traducing",
                "daemonian"] == stringList.take(3)
    }


    @Test
    void limit_numbers_in_list() {

        def list = [1, 2, 3, 4, 5]

        assert [1, 2, 3] == list.take(3)
    }

}
