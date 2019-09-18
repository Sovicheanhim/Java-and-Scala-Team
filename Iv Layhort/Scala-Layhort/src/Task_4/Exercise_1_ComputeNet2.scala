package Task_4
import scala.io.StdIn._

object Exercise_1_ComputeNet2 {
  def main(args: Array[String]): Unit = {
    println("Enter the hourly rate : ")
    val hourlyRate:Double = readDouble()
    println("Enter the hours work : ")
    val hoursWorked:Double = readDouble()

    val grossPay = hourlyRate * hoursWorked

    val witholdingTax:Double = if(grossPay<=300.00) grossPay*0.10 else if((grossPay>300)&&(grossPay<=400)) grossPay*0.12 else if((grossPay>400)&&(grossPay<=500)) grossPay*0.15 else grossPay*0.2

    val netPay = grossPay - witholdingTax

    println(s"The gross pay is : ${grossPay%.2f}")
    println(s"The witholding tax is : ${witholdingTax%.2f}")
    println(s"The net pay is : ${netPay%.2f}")
  }
}
