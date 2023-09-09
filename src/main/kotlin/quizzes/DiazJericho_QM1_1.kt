package quizzes

class BankAccount(amount: Double) {
    private var balance: Double = amount
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: $amount. New Balance: $balance")
        } else {
            println("Invalid deposit amount. Please try again.")
        }
    }
    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrawn: $amount. New Balance: $balance")
        } else {
            println("Invalid withdrawal amount or insufficient balance. Please try again.")
        }
    }
    fun checkBalance() {
        println("Balance: $balance")
    }
}

fun main() {
    val account = BankAccount(1000.0)
    account.checkBalance()
    account.deposit(500.0)
    account.withdraw(200.0)
}