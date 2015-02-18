package com.levelup.groovy.date

import org.junit.Test

/**
 * This groovy example will demonstrate how to find the number of days between two dates.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/number-of-days-between-two-dates/'>Calculate days between two dates</a>
 */
class DaysBetweenDates {

    @Test
    public void difference_between_date_in_days() {

        def today = new Date()
        def yesterday = today - 1

        assert 1 == today.minus(yesterday)
        assert 1 == today - yesterday
    }

}
