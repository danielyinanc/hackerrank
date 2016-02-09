package algorithms.sorting.quicksort2

import scala.collection.mutable

object Solution {
  def main(args: Array[String]) {

    val sc = new java.util.Scanner(System.in)
    var n = sc.nextInt()
    var arr = new Array[Int](n)
    for (arr_i <- 0 until n) {
      arr(arr_i) = sc.nextInt()
    }

    val valuesCounter = new mutable.HashMap[Int, Int]()
    for (arrVal <- arr) {
      if (valuesCounter.contains(arrVal)) {
        valuesCounter.put(arrVal, valuesCounter.get(arrVal).get + 1)
      } else {
        valuesCounter.put(arrVal, 1)
      }

    }

    printValFromMap(valuesCounter, arr)


  }

  def printValFromMap(mapToPrint: mutable.HashMap[Int, Int], intArr: Array[Int]): Unit = {
    for (i <- 0 until 100) {
      if (mapToPrint.contains(i)) {
        for (j <- 0 until mapToPrint.get(i).get) {
          print(i + " ")
        }
      }
    }
  }
}
