fun main() {
    print("First number: ")
    var num1 = readln().toInt()
    print("Operator: ")
    var operator = readln()
    print("Second number: ")
    var num2 = readln().toInt()

    when (operator) {
        "+" -> println("Result: " + (num1 + num2))
        "-" -> println("Result: " + (num1 - num2))
        "*" -> println("Result: " + (num1 * num2))
        "/" -> println("Result: " + (num1 / num2))
        "%" -> println("Result: " + (num1 % num2))
        else -> println("Invalid operator.")
    }
}