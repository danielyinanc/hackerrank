package algorithms.searching.icecreamparlor

import scala.util.control.Breaks._

object Solution {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    var t = sc.nextInt()

    for (a <- 0 until t) {
      var m = sc.nextInt()
      var n = sc.nextInt()
      var arr = new Array[Int](n)
      for (arr_i <- 0 until n) {
        arr(arr_i) = sc.nextInt()
      }
      identifyFlavor(arr, m)
    }
  }


  def identifyFlavor(inputArr: Array[Int], totalCash: Int): Unit = {
    var i: Int = 0
    var j: Int = 0
    breakable {
      while (i < inputArr.size) {
        val compVal = inputArr(i)
        j = i + 1
        while (j < inputArr.size) {
          if (compVal + inputArr(j) == totalCash) {
            break
          }
          j = j + 1
        }
        i = i + 1
      }
    }

    i = i + 1
    j = j + 1

    println(i + " " + j)

  }

}
