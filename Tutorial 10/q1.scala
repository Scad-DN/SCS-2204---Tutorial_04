package Package

object q1 {
  def main(args: Array[String]): Unit = {
    //val input = List(0.0, 10.0, 20.0, 30.0)

    println("Enter a list of Celsius temperatures (separated by commas):")
    val userInput = scala.io.StdIn.readLine()
    val input = userInput.split(",").map(_.toDouble).toList

    var output = calculateAverage(input)
    println(s"Average Fahrenheit temperature : $output")
  }

  def calculateAverage(celciusTemp: List[Double]): Double = {
    val value = 9.00/5.00
    val fahrenheitTemp = celciusTemp.map(cTemp => cTemp*value + 32)

    val total = fahrenheitTemp.reduce(_+_)
    total / celciusTemp.length
  }
}