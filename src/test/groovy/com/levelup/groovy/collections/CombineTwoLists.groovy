package groovy.com.levelup.groovy.collections

import org.junit.Test;

/**
 * This groovy example will demonstrate how to combine two lists.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/join-combine-concatenate-two-lists/'>Combine two lists in groovy</a>
 */
class CombineTwoLists {

	@Test
	public void combine_two_lists () {

		def first = ["a", "b", "c"]
		def second = ["d", "e", "f"]

		assert ["a", "b", "c", "d", "e", "f"], first.addAll(second)
	}
}
