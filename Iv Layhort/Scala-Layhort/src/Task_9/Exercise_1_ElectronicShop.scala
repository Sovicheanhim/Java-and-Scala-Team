package Task_9
import io.StdIn._
import util.control.Breaks._
object Exercise_1_ElectronicShop {
  def main(args: Array[String]): Unit = {
    println("Enter the amount of money, number of keyboards and number of USB drive respectively :")
    val Array(amountOfMoney,numberOfKeyBoard,numberOfUSB) = readLine().split(" ").map(_.toInt)
    var arrayOfKeyboard = new Array[Int](numberOfKeyBoard)
    var arrayOfUSB = new Array[Int](numberOfUSB)
    println("Enter the price for each keyboard :")
    for(_ <- 1 to numberOfKeyBoard){arrayOfKeyboard = readLine().split(" ").map(_.toInt)}
    println("Enter the price for each USB :")
    for(_ <- 1 to numberOfUSB){arrayOfUSB = readLine().split(" ").map(_.toInt)}

    var max:Int = -1
    breakable{
      for(i<- arrayOfKeyboard.indices){
        for(j<-arrayOfUSB.indices){
          if(arrayOfKeyboard(i)+arrayOfUSB(j)<=amountOfMoney) max = arrayOfKeyboard(i)+arrayOfUSB(i)
          else break()
        }
      }
    }
    println(max)
  }
}
