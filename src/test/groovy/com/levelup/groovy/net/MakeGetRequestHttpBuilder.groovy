package com.levelup.groovy.net

import groovyx.net.http.ContentType
import groovyx.net.http.HTTPBuilder
import groovyx.net.http.Method
import org.junit.Test

/**
 * This groovy example will show how to make a get request to a URL
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/make-get-request-httpbuilder-apache-httpcomponents/'>Make a get request to a URI or URL</a>
 */
class MakeGetRequestHttpBuilder {


    @Test
    void make_get_request() {

        def http = new HTTPBuilder()

        http.request( 'http://www.leveluplunch.com', Method.GET, ContentType.TEXT ) { req ->

            uri.path = '/groovy/examples/'
            headers.'User-Agent' = "Mozilla/5.0 Firefox/3.0.4"
            headers.Accept = 'application/json'

            response.success = { resp, reader ->
                assert resp.statusLine.statusCode == 200
                println "Got response: ${resp.statusLine}"
                println "Content-Type: ${resp.headers.'Content-Type'}"
                println reader.text
            }

            response.'404' = {
                println 'Not found'
            }
        }
    }

    @Test
    void make_shorthand_get_request() {

        def http = new HTTPBuilder('http://www.leveluplunch.com')

        http.get( path : '/groovy/examples/',
                contentType : ContentType.TEXT) { resp, reader ->

            println "response status: ${resp.statusLine}"
            println 'Headers: -----------'
            resp.headers.each { h ->
                println " ${h.name} : ${h.value}"
            }
            println 'Response data: -----'
            System.out << reader
            println '\n--------------------'
        }
    }
}
