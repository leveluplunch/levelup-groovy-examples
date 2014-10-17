package com.levelup.groovy.string

import org.junit.Test

/**
 * This groovy example will demonstrate how to remove last char from a string.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/remove-last-character-from-string/'>Remove last char from string</a>
 */
class RemoveLastCharFromString {

    @Test
    void remove_last_char_with_getAt() {

        def removeString = "groovy"

        def lengthMinus2 = removeString.length() - 2

        assert "groov" == removeString.getAt(0..lengthMinus2)

        //or equivalent shorthand

        assert "groov" == removeString[0..lengthMinus2]
    }

    @Test
    void remove_last_char_with_substring() {

        def removeString = "groovy"

        assert "groov" == removeString.substring(0, removeString.length() - 1)
    }


    @Test
    void remove_last_char_with_subSequence () {

        def removeString = "groovy"

        assert "groov" == removeString.subSequence(0, removeString.length() - 1)
    }
}
