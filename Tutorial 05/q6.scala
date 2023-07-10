package Package

object q6 {
  def main(args: Array[String]): Unit = {
    fibonacciSeq(10)
  }

  def fibonacci(n: Int): Int = {
    if(n <= 1) {
      n
    }
    else {
      fibonacci(n-1) + fibonacci(n-2)
    }
  }

  def fibonacciSeq(n: Int): Unit = {
    for (i <- 0 until n){
      print(fibonacci(i)+ " " )
    }
  }
}
