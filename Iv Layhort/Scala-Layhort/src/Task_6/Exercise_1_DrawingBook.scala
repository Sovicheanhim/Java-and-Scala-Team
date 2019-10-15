package Task_6
import scala.io.StdIn._
object Exercise_1_DrawingBook {
  def main(args: Array[String]): Unit = {
    println("Enter the number of pages and destination page respectively :")
    val Array(numberOfPages,destinationPage) = readLine().split(" ").map(_.toInt)
    println(if(pageTurn(numberOfPages,destinationPage)==0) "No need to turn" else s"You have to turn ${pageTurn(numberOfPages,destinationPage)} time/times)
  }
  def pageTurn(numberOfPages:Int,destinationPage:Int):Int={
    val totalPageTurnCountFromFront = numberOfPages/2
    val targetPageTurnCountFromFront = destinationPage/2
    val targetPageTurnCountFromBack = totalPageTurnCountFromFront-targetPageTurnCountFromFront

    Math.min(targetPageTurnCountFromFront,targetPageTurnCountFromBack)
  }
}
