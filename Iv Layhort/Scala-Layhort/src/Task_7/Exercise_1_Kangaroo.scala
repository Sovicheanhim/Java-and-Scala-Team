package Task_7
import scala.io.StdIn._
import util.control.Breaks._
object Exercise_1_Kangaroo {
  def main(args: Array[String]): Unit = {
    println("Enter the first kangaroo starting point :")
    var firstKangarooStartingPoint = readInt()
    println("Enter the first kangaroo jumping steps :")
    var firstKangarooJumpingSteps = readInt()
    println("Enter the second kangaroo starting point :")
    var secondKangarooStartingPoint = readInt()
    println("Enter the second kangaroo jumping steps :")
    var secondKangarooJumpingSteps = readInt()
    breakable{
      while(firstKangarooStartingPoint<=secondKangarooStartingPoint){
        if(firstKangarooStartingPoint == secondKangarooStartingPoint){
          println("Yes")
          break()
        }
        firstKangarooStartingPoint += firstKangarooJumpingSteps
        secondKangarooStartingPoint+= secondKangarooJumpingSteps
      }
      println("No")
    }
  }
}
