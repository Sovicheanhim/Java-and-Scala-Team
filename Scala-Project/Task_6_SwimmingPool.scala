import scala.io.StdIn._
object Task_6_SwimmingPool {
  def main(args: Array[String]): Unit = {

    val fixedAverageVolume = 1000.00
    val rateOfFlow = 50.00
    val gallonsPerCubicFoot = 7.50
    val feePerMinute = 8.00/60.00

    println("Enter the length :")
    val length = readDouble()
    println("Enter the width :")
    val width = readDouble()
    println("Enter the depth :")
    val depth = readDouble()

    val customerAverageVolume = length * width * depth
    val cleaningFee = (customerAverageVolume * 75)/fixedAverageVolume
    val averagePoolCapacity = customerAverageVolume*gallonsPerCubicFoot
    val averageMinute = averagePoolCapacity/rateOfFlow
    val fillingFee = averageMinute*feePerMinute
    val totalFee = cleaningFee + fillingFee

    println(f"The Total Service Fees is ${totalFee}%.2f")
  }
}
