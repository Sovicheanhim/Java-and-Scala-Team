package Task_4
import scala.io.StdIn._

object Exercise_1_ComputeNet2 {
  def main(args: Array[String]): Unit = {
    var witholdingTax:Double = 0.00
    println("Enter the hourly rate : ")
    val hourlyRate = readDouble()
    println("Enter the hours work : ")
    val hoursWorked = readDouble()

    val grossPay = hourlyRate * hoursWorked

    if (grossPay <= 300) witholdingTax = grossPay * 0.10
    else if (grossPay > 300 && grossPay <= 400) witholdingTax = grossPay * 0.12
    else if (grossPay > 400 && grossPay <= 500) witholdingTax = grossPay * 0.15
    else if (grossPay > 500) witholdingTax = grossPay * 0.20

    val netPay = grossPay - witholdingTax

    println(s"The gross pay is : $grossPay")
    println(s"The witholding tax is : $witholdingTax")
    println(s"The net pay is : $netPay")
  }
}
