fun main() {
    println("1 - Profile")
    println("2 - Messages")
    println("3 - Settings")
    println("4 - Logout")

    print("Enter Choice: ")
    var choice = readln()

    if (choice == "1") {
        print("Opening profile...")
    } else if (choice == "2") {
        print("Opening messages...")
    } else if (choice == "3") {
        print("Opening settings...")
    } else if (choice == "4") {
        print("Logging out...")
    }
}