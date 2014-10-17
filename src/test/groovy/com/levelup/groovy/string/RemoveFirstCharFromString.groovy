package com.levelup.groovy.string

import org.junit.Test

/**
 * This groovy example will demonstrate how to remove first char from a string.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/remove-first-character-from-string/'>Remove first char from string</a>
 */
class RemoveFirstCharFromString {

    @Test
    void remove_first_char_with_getAt() {

        def phrase = "groovy"

        assert "roovy" == phrase.getAt(1..phrase.length() - 1)

        //or equivalent shortcut

        assert "roovy" == phrase[1..phrase.length() - 1]
    }

    @Test
    void remove_first_char_with_substring() {

        def phrase = "groovy"

        assert "roovy" == phrase.substring(1)
    }

    @Test
    void remove_first_char_with_subsequence() {

        def phrase = "groovy"

        assert "roovy" == phrase.subSequence(1, phrase.length())
    }

}
