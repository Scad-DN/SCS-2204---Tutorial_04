package Package

class Rational(n: Int, d: Int) {
  require(d > 0, "Denominator must be greater than 0")

  def numerator   = n
  def denominator = d

  def neg: Rational = new Rational(-this.numerator, this.denominator)

  override def toString: String = numerator + "/" + denominator
}

object q1 {
  def main(args: Array[String]): Unit = {
    val obj1 = new Rational(1, 2)
    println(obj1.neg)
  }
}
