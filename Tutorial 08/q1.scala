package Package01

import scala.io.StdIn.readDouble

object q1 {
  def main(args: Array[String]): Unit = {
    print("Enter the Deposit amount : ")
    var depositAmount = readDouble()

    println("The interest earned on entered amount = " + calculateInterest(depositAmount))
  }

  def calculateInterest: Double => Double = (depamount) => depamount match{
    case depamount if (depamount < 20000)    =>   0.02 * depamount
    case depamount if (depamount < 200000)   =>   0.04 * depamount
    case depamount if (depamount < 2000000)  =>   0.035 * depamount
    case _                                   =>   0.065 * depamount
  }

}
