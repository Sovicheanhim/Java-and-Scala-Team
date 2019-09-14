import scala.io.StdIn

object credit_hour_student{
    def check(prompt:String,wanted_type:String):Int={
        println(prompt)
        while(true){
            try{
                if(wanted_type=="int"){
                    return StdIn.readInt()
                }else{
                    var input=StdIn.readLine().toLowerCase()
                    return if((input=="y")||(input=="yes")) 65 else(if((input=="n")||(input=="no")) 0 else check(prompt,"string"))
                }
            }catch{
                case x: Exception =>println("Invalid Input!    "+prompt)
            }
        }
        return 0
    }
    def main(args:Array[String]){
        val credit_hour=check("Please enter the total credit hour: ","int")
        val book_amount=check("Please enter the total amount of book(s): ","int")
        val book_price=check("Please enter price per book: ","int")
        val sport:Int=check("Are you interested in sport?(y/n): ","string")
        println("The total fee for this course is : $"+s"${credit_hour*85+book_amount*book_price+sport}")
    }
}