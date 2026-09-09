fun main() {
    print("Enter length: ")
    var length = readln().toDouble()
    print("Enter width: ")
    var width = readln().toDouble()

    var area = length * width
    var perimeter = 2 * (length + width)

    println()
    println("Area: $area")
    println("Perimeter: $perimeter")
}