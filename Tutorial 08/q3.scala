package Package01

object q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))

    println(formatNames("Niroshan", str => { val temptxt = str.charAt(1).toUpper; str.updated(1, temptxt) }))

    println(formatNames("Saman", toLower))

    println(formatNames("Kumara", str => { val temptxt = str.charAt(5).toUpper; str.updated(5, temptxt) }))
  }

  def toUpper : String => String = txt => txt.toUpperCase()

  def toLower : String => String = txt => txt.toLowerCase()

  def formatNames : (String, String => String) => String = {
    (name, formatElements) => formatElements(name)
  }
}