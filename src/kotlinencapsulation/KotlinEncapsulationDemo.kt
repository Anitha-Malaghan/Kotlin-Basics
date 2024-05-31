package kotlinencapsulation

class BankAccount(private var accountNumber: String, private var balance: Double) {

// Public method to deposit money
fun deposit(amount: Double) {
    if (amount > 0) {
        balance += amount
        println("Deposited $$amount, new balance is $$balance")
    } else {
        println("Invalid deposit amount")
    }
}

// Public method to withdraw money
fun withdraw(amount: Double) {
    if (amount > 0 && amount <= balance) {
        balance -= amount
        println("Withdrew $$amount, new balance is $$balance")
    } else {
        println("Invalid or insufficient funds for withdrawal")
    }
}

// Public method to check balance
fun getBalance(): Double {
    return balance
}

// Public method to get account number
fun getAccountNumber(): String {
    return accountNumber
}
}

fun main() {
    val account = BankAccount("1234567890", 1000.0)

    println("Account Number: ${account.getAccountNumber()}")
    println("Initial Balance: ${account.getBalance()}")

    account.deposit(500.0)
    account.withdraw(200.0)
    account.withdraw(1500.0)

    println("Final Balance: ${account.getBalance()}")
}
