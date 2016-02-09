package datastructures.stacks.maximum_element

import java.io.ByteArrayInputStream

import datastructures.stacks.Solution
import org.scalatest.{BeforeAndAfterEach, FunSuite}

class Solution$Test extends FunSuite with BeforeAndAfterEach {
  val unit = Solution

  override def beforeEach() {
    val in = new ByteArrayInputStream("68\n1 1\n1 44\n3\n3\n2\n3\n3\n1 3\n1 37\n2\n3\n1 29\n3\n1 73\n1 51\n3\n3\n3\n1 70\n3\n1 8\n2\n1 49\n1 56\n1 81\n2\n1 59\n1 44\n2\n3\n3\n2\n3\n3\n1 4\n3\n1 89\n2\n1 37\n1 50\n1 64\n2\n1 49\n1 35\n1 85\n3\n1 41\n2\n3\n3\n1 86\n3\n1 60\n1 8\n3\n1 100\n3\n1 83\n3\n1 47\n2\n1 78\n2\n1 55\n1 97\n2\n3\n1 40".getBytes())
    System.setIn(in)
  }

  override def afterEach() {
    System.setIn(System.in)
  }

  test("testMain") {
    unit.main(null)
  }

}
