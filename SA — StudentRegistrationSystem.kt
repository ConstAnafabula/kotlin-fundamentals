import termOutputChapter3.Student

class Student(var studentID: String, name1: Int, var name: String, var course: String)

fun main() {
    val s1 = Student("EKV05110700", 21, "Kaizer Entrata", "BS InfoTech")
    val s2 = Student("ABC12345678", 21, "Shormaush Urdal", "BS ComEng")
    val s3 = Student("CBJ06330132", 21, "Sahn Uzal", "BS InfoSys")

    println("${s1.studentID} | ${s1.name} | ${s1.course}")
    println()
    println("${s2.studentID} | ${s2.name} | ${s2.course}")
    println()
    println("${s3.studentID} | ${s3.name} | ${s3.course}")
}