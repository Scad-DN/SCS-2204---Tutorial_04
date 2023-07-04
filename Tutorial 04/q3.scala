package Package

object q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))

    println(formatNames("Niroshan", str => {
      val temptxt = str.charAt(1).toUpper
      str.updated(1, temptxt)
    }))

    println(formatNames("Saman", toLower))

    println(formatNames("Kumara", str => {
      val temptxt = str.charAt(5).toUpper
      str.updated(5, temptxt)
    }))
  }

  def toUpper(txt: String): String = txt.toUpperCase()

  def toLower(txt: String): String = txt.toLowerCase()

  def formatNames(name: String, formatElements: String => String): String = {
    formatElements(name)
  }
}
