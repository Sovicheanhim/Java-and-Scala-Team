package Task_1
import scala.io.StdIn._
object Exercise_3_TicketNumber {
  def main(args: Array[String]): Unit = {
    var numberOfDigit = 0
    var removedLastDigit= 0
    var ticketNumberAfterRemoved = 0
    var remainderTicketNumber=0
    println("Enter the ticket number : Six-Digits only :)")
    var ticketNumber = readInt()
    val temp = ticketNumber
    while(ticketNumber!=0){
      ticketNumber/=10
      numberOfDigit+=1
    }
    ticketNumber = temp
    if(numberOfDigit==6){
      removedLastDigit = ticketNumber%10
      ticketNumberAfterRemoved = ticketNumber/10
      remainderTicketNumber = ticketNumberAfterRemoved%7

      if(remainderTicketNumber == removedLastDigit)
        println("Valid Ticket Number ;)")
      else
        println("Invalid Ticket Number !!!")
    }
    else
      println("Enter six digits please!!!")
  }
}
