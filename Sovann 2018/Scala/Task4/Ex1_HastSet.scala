package Homework

import java.util

import scala.collection.immutable.HashSet
import scala.io.StdIn

object Ex1_HastSet {
  def main(args: Array[String]): Unit = {
    println("Enter pair number")
    var P=StdIn.readInt()
    var hashSet: HashSet[String] = HashSet()
    for( i <-1 to P){
      var str1=StdIn.readLine().toLowerCase()
      var str2=StdIn.readLine().toLowerCase()
      hashSet+=(str1+","+str2)
      println(hashSet.size)
    }

  }

}
