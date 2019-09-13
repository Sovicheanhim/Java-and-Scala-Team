package Task_2
import scala.io.StdIn._
object Exercise_2_FinalPrice {
  def main(args: Array[String]): Unit = {
    println("Enter the product price : ")
    val productPrice = readDouble()
    println("Enter the commission rate in percentage :")
    val commissionRate = readDouble()
    println("Enter the discount rate in percentage :")
    val discountRate = readDouble()

    println(s"The final price is ${calculateFinalPrice(productPrice,commissionRate,discountRate)}")
  }

  val calculateFinalPrice:(Double,Double,Double)=> Double = (productPrice:Double,commissionRate:Double,discountRate:Double)=>{
    val commissionAmount = productPrice * (commissionRate/100.00)
    val discountAmount = productPrice * (commissionRate/100.00)

    (productPrice + commissionAmount) - discountAmount
  }
}
