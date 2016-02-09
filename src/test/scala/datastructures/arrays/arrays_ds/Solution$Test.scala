package datastructures.arrays.arrays_ds

import java.io.ByteArrayInputStream

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class Solution$Test extends FunSuite with BeforeAndAfterEach {

  val unit = Solution
  override def beforeEach() {
    val in = new ByteArrayInputStream("4 1 4 3 2".getBytes())
    System.setIn(in)
  }

  override def afterEach() {

  }

  test("testMain") {
    unit.main(null)
  }

}
