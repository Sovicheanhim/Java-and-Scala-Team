import scala.io.StdIn

object ticket_number{
    def check(prompt:String):Int={
        println(prompt)
        while(true){
            try{
                val input=StdIn.readInt()
                return if(input>100000 && input<1000000) input else check(prompt)
            }catch{
                case x: Exception =>println("Invalid Input!    \n"+prompt)
            }
        }
        return 0
    }
    def validate(number:Int):String={
        return if((number/10)%7==number%10) "Valid Ticket number" else "Invalid Ticket number"
    }
    def main(args:Array[String]){
        val number=check("Please enter the ticket number:")
        println(validate(number))
    }
}

