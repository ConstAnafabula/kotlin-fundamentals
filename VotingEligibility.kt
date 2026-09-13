fun main() {
    print("Enter age: ")
    var age = readln().toInt()

    if (age >= 18) {
        println("You are eligible to vote")
        if (age <= 59) print("You are a Regular Voter")
        else print("You are a Senior Voter")
    }
    else print("You are not eligible to vote")
}