package Homework

object Sum_and_Different {
  def main(args: Array[String]): Unit = {
    Sum(12,12)
    Diff(12,13)
    var Pr=Product()
    println(Pr)

  }
  def Sum(a:Int,b:Int): Unit ={
    var result=a+b
    println(s"Sum :$result")
  }
  def Diff(c:Int,d:Int): Unit ={
     if(c!=d)
       println("Different")
     else
       println("Equal")
  }
  def Product(Pr:String="Cats"): String ={
    return Pr
  }
}
