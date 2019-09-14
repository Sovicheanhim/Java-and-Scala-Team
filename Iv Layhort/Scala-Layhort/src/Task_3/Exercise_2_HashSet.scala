package Task_3

import scala.collection.mutable
import scala.io.StdIn._
object Exercise_2_HashSet {
  def main(args: Array[String]): Unit = {
    var mySet:mutable.HashSet[String] = new mutable.HashSet[String]()

    println("Enter the size : ")
    val size = readInt()

    for(i <- 0 until size){
      println("Enter the string pairs ;)")
      val left = readLine()
      val right = readLine()

      mySet += (left+" , "+right)

      println(mySet.size)
    }
  }
}
