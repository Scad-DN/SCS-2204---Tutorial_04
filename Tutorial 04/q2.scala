package Package
import scala.io.StdIn.readInt

object q2 {
  def main(args: Array[String]): Unit = {
    print("Enter the Integer : ")
    var number = readInt()

    PatternMatching(number)
  }

  def PatternMatching(num: Int): Unit = {
    if(num <= 0){
      println("Negative/Zero")
    }
    else if(num % 2 == 0){
      println("Even number")
    }
    else{
      println("Odd number")
    }
  }
}
