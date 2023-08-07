package Package

object q3 {
  def main(args: Array[String]): Unit = {
    var input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var output = filterPrime(input)
    println(output)
  }

  def prime(n: Int, divisor: Int = 2): Boolean = n match {
    case n if (n <= 2)                  => n == 2
    case n if (n % divisor == 0)        => false
    case n if (divisor * divisor > n)   => true
    case _                              => prime(n, divisor + 1)
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(number => prime(number))
  }
}
