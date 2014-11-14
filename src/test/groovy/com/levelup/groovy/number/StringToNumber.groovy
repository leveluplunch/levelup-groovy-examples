package com.levelup.groovy.number

import org.junit.Test

/**
 * This groovy example will show how to convert from a string to a number.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/convert-string-to-number/'>Convert string to a number</a>
 */
class StringToNumber {

    @Test
    void convert_string_to_number_float () {

        String string = "5,873.22".replaceAll(",", "")
        float convertedNumber = Float.parseFloat(string)

        assert 5,873.22 == convertedNumber
    }

    @Test
    void convert_string_to_number_double () {

        String string = "2,421.22".replaceAll(",", "")
        double convertedNumber = Double.parseDouble(string)

        assert 5,873.22 == convertedNumber
    }


}
