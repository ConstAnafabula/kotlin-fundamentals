package termOutputChapter3

open class Person(val name: String, val age: Int) {
    fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
    }
}

class Student(name: String, age: Int, val studentID: String, val course: String): Person(name, age) {
    fun enroll() {
        println("Student ID: $studentID")
        println("Course: $course")
        println("Enrolled in $course")
    }
}

class Teacher(name: String, age: Int, val employeeID: String, val specialization: String): Person(name, age) {
    fun teach() {
        println("Employee ID: $employeeID")
        println("Specialization: $specialization")
        println("Teaching $specialization")
    }
}

fun main() {
    val s1 = Student("Kaizer Entrata", 19, "EKV05110700", "BSIT")
    val s2 = Student("Shormaush Urdal", 21, "USS03230400", "BSCpE")
    val s3 = Student("Sahn Uzal", 18, "USC04130800", "BSIS")

    val t1 = Teacher("Mr. Smith", 35, "EMP001", "Programming")
    val t2 = Teacher("Ms. Jane", 32, "EMP002", "Engineering")

    println("=== STUDENT 1 ===")
    s1.displayInfo()
    s1.enroll()
    println()

    println("=== STUDENT 2 ===")
    s2.displayInfo()
    s2.enroll()
    println()

    println("=== STUDENT 3 ===")
    s3.displayInfo()
    s3.enroll()
    println()

    println("=== TEACHER 1 ===")
    t1.displayInfo()
    t1.teach()
    println()

    println("=== TEACHER 2 ===")
    t2.displayInfo()
    t2.teach()
    println()
}