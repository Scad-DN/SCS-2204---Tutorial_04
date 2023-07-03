package Package
import scala.io.StdIn.readDouble

object q1 {
  var interest = 0.0

  def main(args: Array[String]): Unit = {
    print("Enter the Deposit amount : ")
    var depositAmount = readDouble()
    findInterest(depositAmount)
  }

  def findInterest(depamount: Double): Unit = {
    var interest = 0.00
    if(depamount <= 20000){
      interest = 2.0/100.0
      finalAmounts(depamount, interest)
    }
    else if(depamount <= 200000){
      interest = 4.0/100.0
      finalAmounts(depamount, interest)
    }
    else if(depamount <= 2000000){
      interest = 3.5/100.0
      finalAmounts(depamount, interest)
    }
    else{
      interest = 6.5/100.0
      finalAmounts(depamount, interest)
    }
  }

  def finalAmounts(dAmount: Double , iAmount: Double): Unit = {
    var interestAmount = dAmount * iAmount
    println(s"The interest earned on Rs. $dAmount = Rs. $interestAmount")
  }
}
