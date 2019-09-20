package Task_2
import scala.io.StdIn._

object Exercise_2_FinalPrice {
  def main(args: Array[String]): Unit = {
    println("Enter the product price,commission rate and discount rate respectively :")
    val Array(productPrice,commissionRate,discountRate) = readLine().split(" ").map(_.toInt)
    println(s"The final price is ${calculateFinalPrice(productPrice,commissionRate,discountRate)}")
  }

  val calculateFinalPrice:(Double,Double,Double)=> Double = (productPrice:Double,commissionRate:Double,discountRate:Double)=>{
    val commissionAmount = productPrice * (commissionRate/100.00)
    val discountAmount = ((commissionAmount+productPrice)*discountRate)/100.00

    (productPrice + commissionAmount) - discountAmount
  }
}