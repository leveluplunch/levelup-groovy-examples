package groovy.com.levelup.groovy.collections

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This groovy example will demonstrate how to count booleans in a list.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/count-boolean-true-false-values-in-arraylist/'>Count true values in list</a>
 */
class CountBooleansInList {

	@Test
	void count_boolean_in_arraylist() {

		def occurrences = [
			true,
			false,
			true,
			false,
			false
		].count (true)

		assert 2, occurrences
	}
}
