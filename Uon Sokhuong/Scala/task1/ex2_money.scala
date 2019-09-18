import scala.io.StdIn

object convert_dollar_to_riel{
    def check(prompt:String):Float={
        println(prompt)
        try{
            val input=StdIn.readFloat()
            return if(input>0) input else check(prompt)
        }catch{
            case x: Exception =>return check(prompt)
        }
        return 0
    }
    def convert(dollars:Float):String={
        var riel=dollars*4000
        val dominations=Array[Int](2000,1000,500,100)
        var result=""
        for(i<-0 to 3){

            result+=s"${dominations(i)} Riel: ${((riel/dominations(i)).toInt).toString} ${if((riel/dominations(i)).toInt>1)"papers"else "paper"}    "
            riel=riel%dominations(i)
        }
        return s"Converted:    $result "
    }
    def main(args:Array[String]){
        val dollars=check("Please enter the amount of money in dollars:")
        println(convert(dollars))
    }
}

