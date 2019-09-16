package Homework

import scala.io.StdIn
import scala.util.matching.Regex


object EX1_HTML_String {
  def main(args: Array[String]): Unit = {
    println("Enter the number of lines :")
    var testCases = scala.io.StdIn.readInt()
    while(testCases > 0){
      var Str =StdIn.readLine()
      var matchFound = false
      val pattern = "<(.+)>([^<]+)</\\1>".r
      pattern.findAllIn(Str).matchData foreach{
        G=>println(G.group(2))
          matchFound = true }
      if(!matchFound) println("None")

      testCases -= 1
    }
  }

}
