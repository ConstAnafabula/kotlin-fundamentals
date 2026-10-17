open class Employee(val name: String, val department: String) {
    fun display() {
        println("$name is from $department")
    }
}

class Manager(name: String, department: String, val teamSize: Int): Employee(name, department) {
    fun displayTeamSize() {
        println("The team size is $teamSize")
    }
}

fun main() {
    val e1 = Manager("Kaizer Entrata", "IT Department", 20)

    e1.display()
    e1.displayTeamSize()
}