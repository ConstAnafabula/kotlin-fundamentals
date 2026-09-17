fun main() {
    print("Enter Grade: ")
    var grade = readln().toDouble()

    if (grade >= 90 && grade <= 100) {
        print("Excellent")
    } else if (grade >= 85) {
        print("Very Good")
    } else if (grade >= 80) {
        print("Good")
    } else if (grade >= 75) {
        print("Fair")
    } else if (grade < 75) {
        print("Failed")
    } else {
        print("Invalid Input")
    }
}