

fun showInformation(name: String): Unit {
    println("Your name: $name")
}

fun showInformation(age: Int): Unit {
    println("Your age: $age")
}

fun showInformation(birth: Long): Unit {
    println("Your birth year: $birth")
}

fun main() {

    showInformation("Halil")
    showInformation(21)
    showInformation(birth = 1997)

}