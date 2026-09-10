fun main() {
    print("Enter a number from 1-7: ")
    var number = readln().toInt()

    when (number) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}