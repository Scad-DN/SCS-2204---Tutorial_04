package Package

object q2 {
  def main(args: Array[String]): Unit = {
    //var input = List("apple", "banana", "cherry", "date" )

    println("Enter a list of words (separated by commas):")
    val userInput = scala.io.StdIn.readLine()
    val input = userInput.split(",").toList

    var output = countLetterOccurances(input)
    println(s"Total count of letter occurrences : $output")
  }

  def countLetterOccurances(wordList: List[String]): Int = {
    val letterCount = wordList.map(_.length)
    letterCount.reduce(_+_)
  }
}
