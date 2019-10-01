import scala.io.StdIn

object kangaroo{
    def check(prompt:String,numberOfInput:Int):Array[Int]={
        println(prompt)
        val input=StdIn.readLine()
        var splitInput=input.split("[,.;:' ']").filter(_!="")
        var data=Array[Int]()
        if(splitInput.length!=4){
            return check(prompt)
        }else{
            try{
                for(e<-splitInput)data=data++Array(e.toInt)
                
            }catch{
                case x:Exception=>return check(prompt)
            }
        }
        return data
    }
    
    // def main(args:Array[String]){
    //     val testCase=check("Please enter the number of test case:",1)
    //     val 
        
    // }
}
