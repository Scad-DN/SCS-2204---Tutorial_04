package Package

object q4 {
  def main(args: Array[String]): Unit = {
    println(isEven(4))
  }

  def isEven(num: Int): Boolean = num match {
    case num if(num == 0)   =>  true
    case num if(num == 1)   =>  false
    case _                  =>  isEven(num - 2)
  }
}
