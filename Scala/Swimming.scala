package Homework

object Swimming {
  def main(args: Array[String]): Unit = {
    println("Enter langth of pool")
    var L=scala.io.StdIn.readInt()
    println("Enter high of pool ")
    var H=scala.io.StdIn.readInt()
    println("Enter depth of pool")
    var D=scala.io.StdIn.readInt()
    println("There are 75$ for cleaning pool")
    var clean=75
    var Valum=L*H*D
    println(s"valum of pool is $Valum")
    var gallon=7.5
    var R_flow=50
    var P_capacity_gallon=Valum*gallon
    var min=P_capacity_gallon/50
    var Price_H=8/60
    var Water_prices=Price_H*min
    println(s"Price for clean is $Water_prices")
    var Service=Water_prices+75
    println(s"price services is $Service")




  }

}
