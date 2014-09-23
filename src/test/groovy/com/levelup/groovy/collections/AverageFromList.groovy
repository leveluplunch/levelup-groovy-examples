package groovy.com.levelup.groovy.collections

import static org.junit.Assert.*

import org.junit.Test

/**
 * This groovy example will demonstrate how to find the average in groovy.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/calculate-average-of-list/'>Calculate average of list</a>
 */
class AverageFromList {

	@Test
	void average_with_groovy() {

		def numbers = [1, 2, 3, 4]

		def average = numbers.sum() / numbers.size()

		assertEquals 2.5, average
	}

	// or if you want to define a method

    def findAverage = { list -> list.sum() / list.size() }

	@Test
	void average_with_groovy_call_method() {

		def numbers = [1, 2, 3, 4]

		assertEquals 2.5, findAverage(numbers)
	}


}
