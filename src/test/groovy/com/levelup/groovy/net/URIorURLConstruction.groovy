package com.levelup.groovy.net

import groovyx.net.http.URIBuilder
import org.junit.Test


/**
 * This groovy example will show
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/build-manipulate-uri-url-with-uribuilder/'>Build a URI or URL</a>
 */
class URIorURLConstruction {


    @Test
    void general_operations() {

        def uri = new URIBuilder( 'http://www.leveluplunch.com:80/examples/' )

        assert "www.leveluplunch.com" == uri.host
        assert "/examples/" == uri.path
        assert "http" == uri.scheme
        assert 80 == uri.port
    }

    @Test
    void working_with_fragments() {

        def uri = new URIBuilder( 'http://www.leveluplunch.com/#fragment' )

        assert "fragment" == uri.fragment
    }

    @Test
    void working_with_query_parameters() {

        def uri = new URIBuilder( 'http://www.leveluplunch.com?a=10&b=15' )

        //get
        assert uri.query.a == '10'
        assert uri.query.b == '15'

        //remove parameters
        uri.removeQueryParam 'a'
        assert "http://www.leveluplunch.com?b=15" == uri.toString()

        //add parameters
        uri.addQueryParam "foo", "bar"
        assert "http://www.leveluplunch.com?b=15&foo=bar" == uri.toString()

        //add multiple query parameters
        uri.addQueryParams([n:10, c:33])
        assert "http://www.leveluplunch.com?b=15&foo=bar&n=10&c=33" == uri.toString()

        //replace existing query parameters
        uri.query = [java:"examples", groovy:"examples", exercises:"java"]
        assert "http://www.leveluplunch.com?java=examples&groovy=examples&exercises=java" == uri.toString()

    }





}
