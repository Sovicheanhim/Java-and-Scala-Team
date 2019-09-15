import scala.io.StdIn

object convert_dollar_to_riel{
    def check(prompt:String):Float={
        println(prompt)
        while(true){
            try{
                val input=StdIn.readFloat()
                return if(input>0) input else check(prompt)
            }catch{
                case x: Exception =>println(prompt)
            }
        }
        return 0
    }
    def convert(dollars:Float):String={
        var riel=dollars*4000
        val dominations=Array[Int](2000,1000,500,100)
        var result=0
        for(i<-0 to 3){
            result=result+riel/dominations(i)
            riel=riel%dominations(i)
        }
        return s"Output    $result"
    }
    def main(args:Array[String]){
        val dollars=check("Please enter the amount of money in dollars:")
        println(convert(dollars))
    }
}

