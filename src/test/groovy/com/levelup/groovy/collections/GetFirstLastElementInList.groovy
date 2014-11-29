package com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will demonstrate how to find the first and last element in groovy.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/get-first-last-element-in-arraylist-iterable/'>Get First/Last element in ArrayList</a>
 */
class GetFirstLastElementInList {

    @Test
    void get_first_element_in_list() {

        def list = ["Wisconsin", "Minnesota", "Nebraska",
                    "Iowa", "Illinois", "Northwestern",
                    "Purdue"]

        assert "Wisconsin" == list.first()
    }

    @Test
    void get_last_element_in_list() {

        def list = ["Ohio State", "Michigan State", "Maryland",
                    "Michigan", "Penn State", "Rutgers",
                    "Indiana"]

        assert "Indiana" == list.last()
    }

}







