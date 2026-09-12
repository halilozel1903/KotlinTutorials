/**
 * Demonstrates overloading by parameter type.
 *
 * The compiler picks the overload from the static type of the argument, so a named
 * argument is sometimes needed to disambiguate literals.
 */
fun showInformation(name: String) {
    println("Your name: $name")
}

fun showInformation(age: Int) {
    println("Your age: $age")
}

fun showInformation(birth: Long) {
    println("Your birth year: $birth")
}

fun lessonMultiformFunction() {
    showInformation("Halil")
    showInformation(21)
    showInformation(birth = 1997L)
}

fun main() {
    lessonMultiformFunction()
}
