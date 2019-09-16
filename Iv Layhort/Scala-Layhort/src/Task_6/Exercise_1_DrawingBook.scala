package Task_6
import scala.io.StdIn._
object Exercise_1_DrawingBook {
  def main(args: Array[String]): Unit = {
    println("Enter the number of pages :")
    val numberOfPages = readInt()
    println("Enter the destination page :")
    val destinationPage = readInt()

    if(pageTurn(numberOfPages,destinationPage)==0) println("No need to turn") else println(s"You have to turn ${pageTurn(numberOfPages,destinationPage)} time/times")
  }
  def pageTurn(numberOfPages:Int,destinationPage:Int):Int={
    val totalPageTurnCountFromFront = numberOfPages/2
    val targetPageTurnCountFromFront = destinationPage/2
    val targetPageTurnCountFromBack = totalPageTurnCountFromFront-targetPageTurnCountFromFront

    Math.min(targetPageTurnCountFromFront,targetPageTurnCountFromBack)
  }
}
