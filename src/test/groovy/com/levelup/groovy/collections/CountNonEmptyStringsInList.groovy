package groovy.com.levelup.groovy.collections

import org.junit.Test;

/**
 * This groovy example will demonstrate how to count non null strings in a list.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/count-non-empty-strings-collection-arraylist/'>Count non empty strings in arraylist</a>
 */
class CountNonEmptyStringsInList {

	@Test
	void count_non_empty_strings_in_arraylist() {

		def occurrences = [
			"packers",
			null,
			"",
			"fans",
			null,
			"Go pack Go!"
		].count ({ it -> it != null && it.length() > 0 })

		assert 3, occurrences
	}
	
	@Test
	void count_non_empty_strings_java8_in_arraylist() {

		def occurrences = [
			"packers",
			null,
			"",
			"fans",
			null,
			"Go pack Go!"
		].count ({ it -> Objects.nonNull(it) && it.length() > 0 })

		assert 3, occurrences
	}

}
