class BankAccount(val accountName: String, val balance: Double) {
    fun deposit(amount: Double) {
        println("Deposit: ₱$amount")
    }
    fun withdraw(amount: Double) {
        println("Withdraw: ₱$amount")
    }
    fun displayBalance() {
        println("Initial Balance: ₱$balance")
    }
}

fun main() {
    val ba = BankAccount("Kaizer's Account", 5000.0)

    ba.displayBalance()
    ba.deposit(1500.0)
    ba.withdraw(2000.0)

}