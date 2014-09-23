package com.levelup.groovy.collections

import static org.junit.Assert.*;
import groovy.transform.ToString;

import org.junit.Before;
import org.junit.Test;

/**
 * This groovy example will demonstrate how to convert a list to a map.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/convert-list-to-map/'>Convert list to map in groovy</a>
 */
class ConvertListToMap {

	@ToString
	class Bike {

		def name
		def brand

		public Bike(String name, String brand) {
			this.name = name
			this.brand = brand
		}
	}

	def bikes

	@Before
	void before() {

		bikes = [
			new Bike("SuperFly", "Trek"),
			new Bike("X-Caliber", "Trek"),
			new Bike("Big Daddy", "Huffy"),
			new Bike("CranBrook", "Huffy"),
		]
	}

	@Test
	void convert_list_of_objects_to_map() {

		def bikeMap = bikes.collectEntries { b ->
			[b.name, b.brand]
		}

		assert 4 == bikeMap.size()
		assert 'Trek' == bikeMap['SuperFly']
	}

	@Test
	void convert_list_of_strings_to_map() {

		def list = [
			'green bay',
			'packers',
			'cincinnati',
			'bengals'] as Object[]

		def map = list.toSpreadMap()

		assert 2 == map.size()
		assert 'packers' == map['green bay']
	}
}
