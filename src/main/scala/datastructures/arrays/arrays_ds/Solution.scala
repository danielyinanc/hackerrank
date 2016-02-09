package datastructures.arrays.arrays_ds

object Solution {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    var t = sc.nextInt()
    var arr = new Array[Int](t)

    for (arr_i <- 0 until t) {
      arr(arr_i) = sc.nextInt()

    }

    for(arr_j <- arr.size -1 to 0 by -1) {
      print(arr(arr_j) + " ")
    }
  }
}
