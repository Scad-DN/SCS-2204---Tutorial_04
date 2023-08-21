package Package

class Account2(val accountNumber: String, initialBalance: Double) {
  private var balance: Double = initialBalance

  def applyInterest(): Unit = {
    var interest: Double = 0
    if (balance > 0) {
      interest = balance * 0.05
      balance = balance + interest
    } else if (balance < 0){
      interest = balance * 0.1
      balance = balance - interest
    }
  }

  def getBalance: Double = balance
}

class Bank (val accounts: List[Account2]){
  def getAccountsWithNegativeBalances: List[Account2] = {
    accounts.filter(_.getBalance < 0)
  }

  def calculateTotalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAllAccounts(): Unit ={
    accounts.foreach((_.applyInterest()))
  }
}

object q4 extends App {
  val account1 = new Account2("AB123", 5000)
  val account2 = new Account2("CD456", 1000)
  val account3 = new Account2("EF789", -100)

  val bank = new Bank(List(account1, account2, account3))

  println("Accounts with negative balances:")
  val accountsWithNegativeBalances = bank.getAccountsWithNegativeBalances
  accountsWithNegativeBalances.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))

  println("\nTotal balance of all accounts: " + bank.calculateTotalBalance)

  bank.applyInterestToAllAccounts()
  println("\nFinal balances after applying interest:")
  bank.accounts.foreach(account => println(s"${account.accountNumber}: ${account.getBalance}"))
}
