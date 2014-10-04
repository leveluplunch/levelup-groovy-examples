package groovy.com.levelup.groovy.collections

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This groovy example will demonstrate how to remove nulls from a list.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/remove-filter-null-items-from-arraylist-collection/'>Remove null from list</a>
 */
class FilterNullFromCollection {

    @Test
    void remove_null_from_collection() {

        def collection = [
                89,
                32,
                null,
                55
        ] - null

        assert [89, 32, 55], list

    }

    @Test
    void remove_null_with_minus_from_collection() {

        def collection = [
                89,
                32,
                null,
                55
        ].minus(null)

        assert [89, 32, 55], collection
    }

}
