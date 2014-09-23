package groovy.com.levelup.groovy.collections

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This groovy example will demonstrate how to sum values in a list .
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/sum-values-arraylist/'>Sum elements of arraylist</a>
 */
class SumValueInList {
	
	@Test
	void sum_numbers_in_list() {
		
		assert 10, [1, 2, 3, 4].sum();
	}

	@Test
	void sum_with_initial_value() {
		
		assert 110, [1, 2, 3, 4].sum(100);
	}
	
}
