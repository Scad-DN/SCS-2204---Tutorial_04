package Package

class Account(val accountNumber: String, initialBalance: Double) {
  private var balance: Double = initialBalance

  def deposit(amount: Double): Unit = {
    balance = balance + amount
    println(s"Deposited $amount to account $accountNumber. New balance: $balance")
  }

  def withdraw(amount: Double): Unit = {
    if (amount <= balance) {
      balance = balance - amount
      println(s"Withdraw $amount from account $accountNumber. New balance: $balance")
    }else {
      println(s"Insufficient balance of  account $accountNumber")
    }
  }

  def transfer(targetAccount: Account, amount: Double): Unit = {
    if (amount <= balance) {
      withdraw(amount)
      targetAccount.deposit(amount)
      println(s"Transferred $amount from account $accountNumber to account ${targetAccount.accountNumber}.")
    } else {
      println(s"Insufficient balance of  account $accountNumber")
    }
  }
}

object q3 extends App {
  val account1 = new Account("AB123", 5000)
  val account2 = new Account("CD456", 1000)

  account1.deposit(1000)
  println("")

  account1.withdraw(2000)
  println("")

  account1.transfer(account2, 1000)
  println("")
}
