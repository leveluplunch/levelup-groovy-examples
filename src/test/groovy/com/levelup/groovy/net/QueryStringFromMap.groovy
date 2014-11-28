package com.levelup.groovy.net

import org.junit.Test

/**
 * This groovy example will show how convert a map to a query string.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/transform-build-query-string-from-map/'>Convert query string from map</a>
 */
class QueryStringFromMap {

    @Test
    void query_string_from_map() {

        def queryParamsAsMap = [
            "gws_rd": "ssl", "safe": "off", "q": "level+up+lunch"
        ]

        def queryString = queryParamsAsMap
                                .collect { k,v -> "$k=$v" }
                                .join('&')

        assert "gws_rd=ssl&safe=off&q=level+up+lunch" == queryString

    }
}




