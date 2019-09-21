package Task_8

import io.StdIn._
object Exercise_1_AngryProfessor_2 {
  def main(args: Array[String]): Unit = {
    println("Enter the test case: ")
    val testCase = readInt()
    for(_ <- 1 to testCase){
      println("Enter the number of students and cancellation threshold respectively: ")
      val Array(numberOfStudents,cancellationThreshold) = readLine().split(" ").map(_.toInt)
      println("Enter the arrival time of each and every student: ")
      var onTime = readLine().split(" ").map(_.toInt)
      while(onTime.length > numberOfStudents){ onTime = readLine().split(" ").map(_.toInt) }
      println(if(onTime.count(_ <= 0) >= cancellationThreshold) "NO" else "YES")
    }
  }
}
