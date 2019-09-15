package Task_1
import scala.io.StdIn._
object Exercise_2_DollarsConverter {
  def main(args: Array[String]): Unit = {
    println("Enter the dollar amount :")
    val dollarAmount = readDouble()

    val rielAmount = dollarAmount * 4100

    val num2000 = (rielAmount / 2000).toInt
    val num1000 = ((rielAmount - (2000*num2000))/1000).toInt
    val num500 = ((rielAmount - (2000*num2000 + 1000*num1000))/500).toInt
    val num100 = ((rielAmount - (2000*num2000 + 1000*num1000 + 500*num500))/100).toInt

    println(s"There are $num2000: 2000 riel, $num1000: 1000 riel, $num500: 500 riel and $num100: 100 riel")
  }
}
