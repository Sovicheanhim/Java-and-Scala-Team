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
    def yesNo(axisAndSpeed:Array[Int]):String={
        val x1_At0=axisAndSpeed(0)
        val v1=axisAndSpeed(1)
        val x2_At0=axisAndSpeed(2)
        val v2=axisAndSpeed(3)

        var x1=x1_At0
        var x2=x2_At0
        if(v1<=v2)return "NO"
        var answer="NO"
        while(x1<=x2){
            if(x1==x2 && (x1-x1_At0)/v1==(x2-x2_At0)/v2  ) answer="YES"
            x1+=v1
            x2+=v2
        }
        return answer
    }
    def main(args:Array[String]){
        val axisAndSpeed=check("Please enter the LOCATION and SPEED of BOTH kangaroo seperated by A SPACE BETWEEN EACH VALUE\nCondition:\n    0 ≤ X1 < X2 ≤ 10000\n    1 ≤ V1 ≤ 10000\n    1 ≤ V2 ≤ 10000")
        println(yesNo(axisAndSpeed))
    }
}
