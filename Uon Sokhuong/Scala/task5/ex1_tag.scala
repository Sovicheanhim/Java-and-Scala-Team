import scala.io.StdIn
import scala.math
object tag{
    def check(prompt:String):Int={
        println(prompt)
        while(true){
            try{
                val input=StdIn.readInt()
                return if(input>=1 && input<=100) input else check(prompt)
            }catch{
                case x: Exception =>println("Invalid Input!    \n"+prompt)
            }
        }
        return 0
    }
    def validate(element:String):String={
        val part=element.split("[<>]").filter(_!="")
        if(part.length%2==0)return "None"
        val contentIndex=part.length/2.toInt
        var valid_tags=Array[String]()
        for(i<-0 to contentIndex){
            if("/"+part(i)==part((part.length)-i-1)){
                valid_tags=valid_tags++Array(part(i))
            }
        }
        return if(valid_tags.length==contentIndex) part(contentIndex) else "None"
    }
    def main(args:Array[String]){
        val number_of_lines=check("Please enter the number of line that you want to input:")
        println("Please enter the script below:")
        var all_content=Array[String]()
        for(i<-0 until number_of_lines){
            var inp=StdIn.readLine()
            all_content=all_content++Array(inp)
        }
        println("Here you get!")
        val characters=all_content.mkString("").length
        if(characters>math.pow(10,6)){
            println("Oop! maximium characters must be less than 1,000,000 characters")
        }else{
            for(element<-all_content){
                println(validate(element))
            }
        }
    }
}
