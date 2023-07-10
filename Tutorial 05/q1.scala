package Package

object q1 {
  def main(args: Array[String]): Unit = {
    println(prime(8))
  }

  def prime(n: Int, divisor: Int= 2): Boolean = n match {
    case n if (n <= 2)                  =>  n==2
    case n if (n % divisor == 0)        =>  false
    case n if (divisor * divisor > n)   =>  true
    case _                              =>  prime(n, divisor + 1)
  }
}