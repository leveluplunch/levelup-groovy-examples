package com.levelup.groovy.string

import org.junit.Test;

/**
 * This groovy example will demonstrate how to count the 
 * number of occurrences of a char in a string.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/count-number-of-occurrences-of-character-in-string/'>Count number of chars in string</a>
 */
class CountCharsInString {

    @Test
    void count_chars_in_string() {

        def lombardiQuote = "The achievements of an organization are " +
                "the results of the combined effort of each individual."

        assert 11, lombardiQuote.count("e")
    }

    @Test
    void count_chars_with_filter_string() {

        def lombardiQuote = "Individual commitment to a group effort – that is " +
                "what makes a team work, a company work, a society work, " +
                "a civilization work."

		assert 11, lombardiQuote.findAll {it -> it.equalsIgnoreCase "e" }.size()
    }

    @Test
    void count_chars_in_string_chars() {

        def lombardiQuote = "People who work together will win, whether it be against "
        "complex football defenses, or the problems of modern society."

        assert 7, lombardiQuote.getChars().count(101)
    }
}
