package com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will show how to count occurrences of keys or values within a map
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/count-occurrences-key-value-in-map/'>Count occurrences of key or value in map</a>
 */
class CountOccurrencesByKeyOrValueMap {


    @Test
    void count_keys_in_map () {

        def map = [name: "Lincoln Home National Historic Site",
                   address: "8th & Jackson Streets",
                   state: "Illinois",
                   city: "Springfield"]

        def frequency = map.count { key, value -> key.contains("it") }

        assert 1 == frequency
    }

    @Test
    void count_values_in_map () {

        def map = [name: "Lincoln Home National Historic Site",
                   address: "8th & Jackson Streets",
                   state: "Illinois",
                   city: "Springfield"]

        def frequency = map.count { key, value -> value.endsWith("s") }

        assert 2 == frequency
    }

}
