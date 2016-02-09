package datastructures.stacks

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in)
    var t = sc.nextInt()
    val arr = new Array[Int](t)
    val cmd = new Array[Int](t)
    val stack: mutable.Stack[Int] = mutable.Stack()
    for (arr_i <- 0 until t) {
      val cmdVal = sc.nextInt()
      cmd(arr_i) = cmdVal
      if(cmdVal == 1) {
        arr(arr_i) = sc.nextInt()
      } else {
        arr(arr_i) = 0
      }
    }
    val maxList:ListBuffer[Int] = new ListBuffer[Int]()
    for(i<- cmd.indices) {
      if(cmd(i) == 1) {
        val elemCnd = arr(i)
        stack.push(elemCnd)
        maxList += elemCnd
        maxList.sorted
      }
       else if (cmd(i) == 2) {
        var posMax = stack.pop()
        maxList -= posMax
      } else if (cmd(i) == 3) {
        println(maxList.toList.sorted.last)
      }
    }
  }

}
