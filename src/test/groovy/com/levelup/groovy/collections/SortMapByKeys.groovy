package groovy.com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will demonstrate how to sort map by keys .
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/sort-map-dictionary-by-keys/'>Sort map by keys</a>
 */
class SortMapByKeys {

	@Test
	void sort_map_by_keys() {

		def myMap = ["Toms International":"Yankie Bar", "Mars":"3 Musketeers", "Nestlé": "Yorkie", "Hershey's":"Eat-more"]

		assert [
			"Hershey's",
			"Mars",
			"Nestlé",
			"Toms International"] == myMap.sort()*.key
	}
	
	@Test
	void sort_map_by_key_in_reverse() {

		def myMap = ["Toms International" : "Yankie Bar", "Mars" : "3 Musketeers", "Nestlé" : "Yorkie", "Hershey's" : "Eat-more"]

		assert [
			"Toms International",
			"Nestlé",
			"Mars",
			"Hershey's"			
			] == myMap.sort(Collections.reverseOrder())*.key
				
	}
}
