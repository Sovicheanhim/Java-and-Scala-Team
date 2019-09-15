package taskday1

import scala.io.StdIn

object task2 {
  def main(args: Array[String]): Unit = {
    println("Enter USD dollar")
    var usd = StdIn.readInt()
    var riel = usd*4000
    println("Enter the type of money you want")
    println("2000r= 1, 1000r= 2, 500r = 3, 100r = 4 ")
    var i = StdIn.readInt()
    i match {
      case 1 => println(s"Total = ${riel/2000}")
      case 2 => println(s"Total = ${riel/1000}")
      case 3 => println(s"Total = ${riel/500}")
      case 4 => println(s"Total = ${riel/100}")
    }

  }
}
