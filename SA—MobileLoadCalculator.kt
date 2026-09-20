fun main() {
    print("Current Balance: ")
    var current = readln().toDouble()
    print("Load Purchased: ")
    var purchased = readln().toDouble()

    var total = current + purchased

    println("Total Balance: $total")
}