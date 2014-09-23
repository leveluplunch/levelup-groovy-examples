package groovy.com.levelup.groovy.collections

import org.junit.Test;

/**
 * This groovy example will demonstrate how to sort map by value .
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/sort-map-dictionary-by-values/'>Sort map by value</a>
 */
class SortMapByValue {

	@Test
	void sort_map_by_value() {

		def myMap = [1:"More", 2:"Mark as read", 3: "Mark as important", 4:"Add to tasks"]

		assert [
			"Add to tasks",
			"Mark as important",
			"Mark as read",
			"More"] == myMap.sort({a, b -> a.value <=> b.value})*.value
	}
	
	@Test
	void sort_map_by_value_reverse() {

		def myMap = [1:"More", 2:"Mark as read", 3: "Mark as important", 4:"Add to tasks"]

		assert [
			"More",
			"Mark as read",
			"Mark as important",
			"Add to tasks"] == myMap.sort({a, b -> b.value <=> a.value})*.value
	}

	@Test
	void sort_map_by_value_case_insensitive() {

		def myMap = [1:"More", 2:"Mark as read", 3: "Mark as important", 4:"Add to tasks"]

		assert [
			"Add to tasks",
			"Mark as important",
			"Mark as read",
			"More"] == myMap.sort({a, b -> a.value.toLowerCase() <=> b.value.toLowerCase()})*.value
	}

}
