import scala.io.StdIn

object pages{
    def check(prompt:String,totalPages:Int= 0):Int={
        println(prompt)
        try{
            val input=StdIn.readInt()
            return if((totalPages== 0 && 1<=input && input<=math.pow(10,5)) || (totalPages!= 0 && 1<=input && input<=totalPages) ) input else check(prompt)
        }catch{
            case x: Exception =>return check(prompt)
        }
        return 0
    }
    def shortPath(totalPages:Int,pageToReach:Int):Int={
        val pages=0 to totalPages
        val pagesInBook= if(totalPages%2!=0) pages else pages++Array(0)
        val reversedPagesInBook=pagesInBook.reverse
        
        for(i<-0 to pagesInBook.length/2 by 2){
            if(pagesInBook(i)==pageToReach || pagesInBook(i+1)==pageToReach || reversedPagesInBook(i)==pageToReach || reversedPagesInBook(i+1)==pageToReach){
                return i/2
            }
        }
        return 100
    }
    def main(args:Array[String]){
        val totalPages=check("Please enter the total pages of the book:")
        val pageToReach=check("Please enter the page that you want to reach:",totalPages)
        
        println(s"The minimium number of page turns is: ${shortPath(totalPages,pageToReach)}")
    }
}
