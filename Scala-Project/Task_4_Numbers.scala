object Task_4_Numbers {
  def main(args: Array[String]): Unit = {
    val num1 = 20
    val num2 = 10

    sum(num1,num2)
    difference(num1,num2)
    println(s"The product is ${product(num1,num2)}")

  }

  val sum: (Int, Int) => Unit = (a:Int, b:Int)=> println(s"The sum is ${a+b}")
  val difference: (Int, Int) => Unit = (a:Int, b:Int)=> println(s"The difference is ${a-b}")
  val product: (Int, Int) => Int = (a:Int, b:Int) => a*b

}