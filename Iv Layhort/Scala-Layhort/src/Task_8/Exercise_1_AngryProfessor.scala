package Task_8
import io.StdIn._

object Exercise_1_AngryProfessor {
  def main(args: Array[String]): Unit = {
    println("Enter the number of test case: ")
    val testCase = readInt()
    for(_ <- 1 to testCase){
      println("Enter the number of students and cancellation threshold respectively")
      val convert = readLine().split(" ").map(_.toInt)
      val (numberOfStudents, cancellationThreshold) = (convert(0),convert(1))
      println("Enter the student arrival time respectively")
      var arrivalTime = readLine().split(" ")
      while(arrivalTime.length < numberOfStudents)
        arrivalTime = readLine().split(" ")
      println(if(arrivalTime.map(_.toInt).count(_ <= 0) <= cancellationThreshold) "YES" else "NO")
    }
  }
}
