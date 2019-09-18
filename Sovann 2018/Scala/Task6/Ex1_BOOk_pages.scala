package Homework

import scala.io.StdIn

object Ex1_BOOk_pages {
  def main(args: Array[String]): Unit = {
    println("Enter Sheets of pages")
    var Book=StdIn.readInt()
    var page=0
    if(Book%2==0) {
      page = (Book * 2)
    }else {
      page = (Book * 2) - 1
    }
    println("Enter number of pages")
    var Fpages=StdIn.readInt()


     for (t <- 1 to page) {
       if (t == Fpages && Fpages>=Book/2) {
         println(s"Number sheets is:${Book/2-t/2} from Back count")
       }
       else if(t == Fpages && Fpages<=Book/2){
         println(s"Number sheets is:${t/2} from frond count")
       }
     }

  }

}
