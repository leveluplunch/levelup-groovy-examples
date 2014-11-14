package com.levelup.groovy.collections

import groovy.transform.ToString
import org.junit.Test

/**
 * This groovy example will show how to filter a list of objects by field in the class.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/filter-find-list-collection-by-object-class-field/'>Filter list by class field</a>
 */
class FilterCollection {

    @ToString
    class Currency {
        def amount
        def year
        def country
    }

    @Test
    void filter_object_by_field () {

        def currencyCollection = [new Currency(amount: 1.04, year: 1998, country: "US"),
                      new Currency(amount: 1.02, year: 2001, country: "US"),
                      new Currency(amount: 1.07, year: 2005, country: "EU")]

        def filteredList = currencyCollection.findAll({p -> p.amount > 1.03})

        print(filteredList)

        assert 2 == filteredList.size()
    }

    @Test
    void filter_even_numbers() {

        def numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

        def evenNumbers = numbers.findAll({ it % 2 == 0 })

        assert [2, 4, 6, 8] == evenNumbers
    }

}
