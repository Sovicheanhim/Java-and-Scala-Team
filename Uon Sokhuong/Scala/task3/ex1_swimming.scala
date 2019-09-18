import scala.io.StdIn

object swimming{
    def check(prompt:String):Float={
        println(prompt)
        try{
            val input=StdIn.readFloat()
            return if(input>0) input else check(prompt)
        }catch{
            case x: Exception => return check(prompt)
        }
        return 0
    }
    def main(args:Array[String]){
        val length=check("Please enter the length of the pool in feet:")
        val width=check("Please enter the width of the pool in feet:")
        val depth=check("Please enter the average depth of the pool in feet:")
        
        val pool_valume=length*width*depth
        val pool_capacity=pool_valume*7.5
        val time_minutes=pool_capacity/50
        val time_hour=time_minutes/60
        val total_fee=75+time_hour*8

        println("Total fee for the service is: $"+s"${total_fee}")
    }
}