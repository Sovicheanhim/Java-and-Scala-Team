package Homework

import scala.io.StdIn

object EX2_Employee {
  def main(args: Array[String]): Unit = {
    println("Enter work our")
    var H=StdIn.readInt()
    println("Enter Pay rat")
    var PR=StdIn.readFloat()
    var crossPay=H*PR
    var Hold_Tax=0.00
    if(crossPay<=300)
       Hold_Tax=crossPay*10/100
    else if(crossPay>300&&crossPay<=400)
       Hold_Tax=crossPay*12/100
    else if(crossPay>400&&crossPay<=500)
      Hold_Tax=crossPay*15/100
    else if(crossPay>500)
      Hold_Tax=crossPay*20/100

    var Net_pay=crossPay-Hold_Tax
    var Total=crossPay+Hold_Tax+Net_pay
    println(s"Total Pay is: $Total")

  }

}
