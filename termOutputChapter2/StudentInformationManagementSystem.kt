package termOutputChapter2

fun main() {
    displayStudentInfo()
}

fun computingAvg() {
    val grades = arrayOf(89, 90, 87)
    val avg = grades.average()

    println("Average Grade: $avg")
    if (avg >= 90) {
        println("Status: Excellent")
    } else if (avg >= 85) {
        println("Status: Very Good")
    } else if (avg >= 75) {
        println("Status: Passed")
    } else {
        println("Status: Failed")
    }
}
fun displayStudentInfo() {
    val name: String = "Kaizer"
    val course: String = "BSIT"
    val section: Char = 'A'
    val subjects = arrayOf("Programming", "Networking", "Database")

    println("===== STUDENT REPORT =====")
    println("Name: $name")
    println("Course: $course")
    println("Enter section: 3$section")
    println("Subjects:")
    for (s in subjects ) {
        println(s)
    }
    computingAvg()
}