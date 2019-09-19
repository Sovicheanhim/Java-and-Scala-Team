package Homework

import scala.io.StdIn

object EX1_Kangaroo {
  def main(args: Array[String]): Unit = {
    println("Enter start position and step of kangaroo1 and 2")
    var K1,Step1,K2,Step2=StdIn.readInt()
    println(if (Step2<Step1 && (K2-K1)%(Step1-Step2)==0)"yes" else "No")
  }

}
