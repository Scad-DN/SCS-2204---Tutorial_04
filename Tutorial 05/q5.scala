package Package

object q5 {
  def main(args: Array[String]): Unit = {
    val result = sumOfEven(10);
    println(s"Result = $result");
  }

  def sumOfEven(n: Int): Int = n match {
    case x if(x <= 0)       => 0
    case x if(x % 2 == 0)   => x + sumOfEven(x-2)
    case _                  => sumOfEven(n-1)
  }
}
