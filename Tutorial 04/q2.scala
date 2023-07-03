package Package
import scala.io.StdIn.readInt

object q2 {
  def main(args: Array[String]): Unit = {
    print("Enter the Integer : ")
    var number = readInt()

    PatternMatching(number)
  }

  def PatternMatching(num: Int): Unit = {
    num match {
      case num if (num <= 0)        => println("Negative/Zero")
      case num if (num % 2 == 0)    => println("Even number")
      case _                        => println("Odd number")
    }
  }
}
