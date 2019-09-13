import scala.io.StdIn._
object Task_1_FeesCalculate {
  def main(args: Array[String]): Unit = {
    var totalBookPrize = 0
    println("Enter the number of credit hours :")
    val creditHour = readInt()
    val totalCreditHourPrize = creditHour * 85

    println("Enter the number of book")
    val numberOfBook = readInt()
    val bookPrize:Array[Int] = new Array[Int](numberOfBook)
    if(numberOfBook == 1){
      println("Enter the book prize")
      bookPrize(0) = readInt()
      for(i<- bookPrize)
        totalBookPrize+=i
    }
    else if(numberOfBook>1){
      for(i<-bookPrize.indices){
        println(s"Enter the price for book $i")
        bookPrize(i) = readInt()
      }
      for(i<-bookPrize)
        totalBookPrize+=i
    }

    println("Did you do athletic? Enter true or false!")
    val answer = readBoolean()
    if(answer){
      println("Enter the athletic hours")
      val athletic = readInt()
      val totalAthleticPrize = athletic * 65

      println(s"The total prize is ${calculateTotalPrize(totalCreditHourPrize,totalBookPrize,totalAthleticPrize)}")
    }
    else{
      println(s"The total prize is ${calculateTotalPrize(totalBookPrize,totalBookPrize,0)}")
    }
  }
  def calculateTotalPrize(tcp:Int,tbp:Int,tap:Int):Int={
    tcp+tbp+tap
  }
}