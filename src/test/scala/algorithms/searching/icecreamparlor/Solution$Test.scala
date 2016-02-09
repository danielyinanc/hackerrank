package algorithms.searching.icecreamparlor

import java.io.ByteArrayInputStream

import org.scalatest.{BeforeAndAfterEach, FunSuite}

class Solution$Test extends FunSuite with BeforeAndAfterEach {

  val unit = Solution
  override def beforeEach() {
    val in = new ByteArrayInputStream("2 4 5 1 4 5 3 2 4 4 2 2 4 3".getBytes())
    System.setIn(in)
  }

  override def afterEach() {

  }

  test("testMain") {
    unit.main(null)
  }

}
