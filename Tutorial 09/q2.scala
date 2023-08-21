package Package

class Rational2(n: Int, d: Int) {
  require(d > 0, "Denominator must be greater than 0")

  def numerator   = n
  def denominator = d

  def sub(other: Rational2): Rational2 = {
    val newX = this.numerator * other.denominator - other.numerator * this.denominator
    val newY = this.denominator * other.denominator
    new Rational2(newX, newY)
  }

  override def toString: String = numerator + "/" + denominator
}

object q2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational2(3, 4)
    val y = new Rational2(5, 8)
    val z = new Rational2(2, 7)

    val result = x.sub(y).sub(z)
    println(result)
  }
}
