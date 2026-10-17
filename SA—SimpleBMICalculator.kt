fun main() {
    print("Enter weight: ")
    var weight = readln().toDouble()
    print("Enter height: ")
    var height = readln().toDouble()

    calculateBMI(weight, height)
}

fun calculateBMI(weight: Double, height: Double) {
    var BMI = weight / (height * height)
    println("BMI $BMI")
}