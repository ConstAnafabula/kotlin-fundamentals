fun main() {
    print("Enter a number: ")
    var number = readln().toInt()

    if (number < 0) print("Result: Negative")
    else if (number > 0) print("Result: Positive")
    else print("Result: Zero")
}