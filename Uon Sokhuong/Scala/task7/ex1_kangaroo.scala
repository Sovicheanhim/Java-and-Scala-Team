import scala.io.StdIn

object kangaroo{
    def check(prompt:String):Array[Int]={
        println(prompt)
        val input=StdIn.readLine()
        var splitInput=input.split("[,.;:' ']").filter(_!="")
        var data=Array[Int]()
        if(splitInput.length!=4){
            return check(prompt)
        }else{
            try{
                for(e<-splitInput)data=data++Array(e.toInt)
                //Constrains........
                return if(0<=data(0) && data(0)<data(2) && data(2)<=10000 && 1<=data(1) && data(1)<=10000 && 1<=data(3) && data(3)<=10000) data else check(prompt)
            }catch{
                case x:Exception=>return check(prompt)
            }
        }
        return data
    }
    
    def kangaroo(x1: Int, v1: Double, x2: Int, v2: Double): String = {
        var a=(x2-x1)/(v1-v2)
        return if(a>0 && a%1==0) "YES" else "NO"
    }
    def main(args:Array[String]){
        val axisAndSpeed=check("Please enter the LOCATION and SPEED of BOTH kangaroo seperated by A SPACE BETWEEN EACH VALUE\nCondition:\n    0 ≤ X1 < X2 ≤ 10000\n    1 ≤ V1 ≤ 10000\n    1 ≤ V2 ≤ 10000")
        println(kangaroo(axisAndSpeed(0),axisAndSpeed(1),axisAndSpeed(2),axisAndSpeed(3)))
    }
}
