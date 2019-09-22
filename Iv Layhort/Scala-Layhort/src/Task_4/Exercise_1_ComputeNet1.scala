package Task_4

import scala.io.StdIn._
object Exercise_1_ComputeNet1 {
  def main(args: Array[String]): Unit = {

    println("Enter the hourly rate : ")
    val hourlyRate = readDouble()
    println("Enter the hours work : ")
    val hoursWorked = readDouble()

    val grossPay = hourlyRate * hoursWorked
    val witholdingTax = if(grossPay<=300) grossPay*0.10 else grossPay*0.12
    val netPay = grossPay - witholdingTax

    println(s"The gross pay is : ${grossPay%.2f}")
    println(s"The witholding tax is : ${witholdingTax%.2f}")
    println(s"The net pay is : ${netPay%.2f}")
  }
}
