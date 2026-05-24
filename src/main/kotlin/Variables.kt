/**
 * Introduces Kotlin variable declarations using `val` (read-only) and `var` (mutable).
 */
fun lessonVariables() {
    val name: String
    name = "Halil"
    println("My name is: $name")

    val pi: Double = 3.14
    println("pi: $pi")

    /*
     * Kotlin often infers types from assigned values.
     *
     * Java: String name = "Name"
     * Kotlin: var name = "Name"
     *
     * Common declaration styles:
     * 1) var name = "Name"              // Type is inferred.
     * 2) var name: String; name = "Name" // Type declared, value assigned later.
     * 3) var name: String = "Name"       // Type and value together.
     */
}

fun main() {
    lessonVariables()
}
