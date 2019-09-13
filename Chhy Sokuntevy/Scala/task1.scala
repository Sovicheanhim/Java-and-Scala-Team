package taskday1

import scala.io.StdIn

object task1 {
  def main(args: Array[String]): Unit = {
    println("Enter the number of hours")
     var credit = StdIn.readInt()
    var cost = 0
    println("do you play sport? Y/n")
    var sport = StdIn.readLine()
    if (sport == "Y")
      {
        cost = credit*85+65
      }
    else
    {
      cost = credit*85
    }
    println("Enter the book fee")
    var bookfee = StdIn.readInt()
    var totalcost = cost + bookfee
    println(s"The total cost is $totalcost USD")




  }

}
