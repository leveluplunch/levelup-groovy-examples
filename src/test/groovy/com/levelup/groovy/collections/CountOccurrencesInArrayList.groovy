package com.levelup.groovy.collections

import org.junit.Test


/**
 * This groovy example will show how to count occurrences of strings and numbers in a list
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/count-occurrences-element-in-arraylist/'>Count occurrences of element in list</a>
 */
class CountOccurrencesInArrayList {

    @Test
    void count_elements_in_list () {

        def listOfStrings = ["Six-man football", "Sprint", "Touch football"]

        def frequency = listOfStrings.count { it.startsWith("S") && it.contains("football") }

        assert 1 == frequency
    }

    @Test
    void count_elements_gt_value() {

        def listOfNumbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        def rate = listOfNumbers.count { it > 7 }

        assert 3 == rate
    }

}
