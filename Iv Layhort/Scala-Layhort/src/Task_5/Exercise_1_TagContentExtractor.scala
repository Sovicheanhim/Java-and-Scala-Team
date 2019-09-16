package Task_5
import scala.io.StdIn._
object Exercise_1_TagContentExtractor {
  def main(args: Array[String]): Unit = {
    val pattern = "<([^>]+)>([^<]+)</\\1>".r
    println("Enter the number of lines :")
    var testCase = readInt()

    while(testCase>0){
      val string = readLine()
      var matcher = false
      pattern.findAllIn(string).matchData.foreach{
        m=> println(m.group(2))
          matcher=true
      }
      if(!matcher) println("None")
      testCase-=1
    }
  }
}
