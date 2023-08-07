package Package

object q1 {
  def main(args: Array[String]): Unit = {
    var input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    var output = filterEvenNumbers(input)
    println(output)
  }

  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(number => number % 2 ==0)
  }
}
