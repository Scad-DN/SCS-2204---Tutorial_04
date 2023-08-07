package Package

object q2 {
  def main(args: Array[String]): Unit = {
    var input = List(1, 2, 3, 4, 5)

    var output = calculateSquare(input)
    println(output)
  }

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }
}
