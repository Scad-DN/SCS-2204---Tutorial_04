package Package

object q3 {
  def main(args: Array[String]): Unit = {
    val result = sum(5);
    println(s"Result = $result");
  }

  def sum(n: Int): Int = {
    var result = 0
    if(n <= 0) {
      0;
    }
    else {
      n + sum(n - 1);
    }
  }
}
