package Homework

import scala.io.StdIn

object Ex1_BOOk_pages {
  def main(args: Array[String]): Unit = {
    println("Enter Sheets of pages and page search")
    var Book,Fpages=StdIn.readInt()
    println(if(Fpages>Book/2)s"number pages is${Book-Fpages/2} from back"
             else s"number pages is ${Fpages/2} from fround")


  }

}
