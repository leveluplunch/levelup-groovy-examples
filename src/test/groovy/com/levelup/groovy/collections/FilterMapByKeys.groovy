package com.levelup.groovy.collections

import org.junit.Test


/**
 * This groovy example will show how to get a subset of map in groovy
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/filter-map-by-keys-submap/'>Get a subset of a map</a>
 */
class FilterMapByKeys {

    @Test
    void filter_map_by_key() {

        def MONTHS = [
                1: "January",
                2: "February",
                3: "March",
                4: "April",
                5: "May",
                6: "June",
                7: "July",
                8: "August",
                9: "September",
                10: "October",
                11: "November",
                12: "December",
        ]

        assert [1: "January",
                2: "February",
                3: "March"] == MONTHS.subMap([1, 2, 3])
    }


}
