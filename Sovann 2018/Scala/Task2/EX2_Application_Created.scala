package Homework

object Application_Created {
  def main(args: Array[String]): Unit = {
    println("Input your prices pay")
    var Pr=scala.io.StdIn.readInt()
    println("Enter % of commission ")
    var Com=scala.io.StdIn.readInt()
    var CoPr=(Pr*Com)/100
    println("Enter % of Discount ")
    var Dis=scala.io.StdIn.readInt()
    var DisPr=(Pr*Dis)/100
    var Total= Prices(Pr,CoPr,DisPr)
    println(s"Total $Total")
  }
  def Prices(P:Int,spr:Int,dr:Int): Int ={
    return ((P+spr)-dr)

  }

}

