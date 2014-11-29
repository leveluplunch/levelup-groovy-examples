package com.levelup.groovy.collections

import org.junit.Test

/**
 * This groovy example will demonstrate how to partition a list into sublists using groovy.
 *
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/groovy/examples/partition-split-collate-arraylist/'>Partition / Split / Collate arraylist</a>
 */
class PartitionSplitCollateArraylist {


    @Test
    void partition_list() {

        def list = ["a", "b", "c", "d", "e"]

        assert [["a", "b"], ["c", "d"], ["e"]] == list.collate(2)
    }

    @Test
    void partition_keep_remainder() {

        def list = ["a", "b", "c", "d", "e"]

        assert [["a", "b"], ["c", "d"]] == list.collate(2, false)
    }


}
