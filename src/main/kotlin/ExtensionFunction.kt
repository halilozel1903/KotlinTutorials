/**
 * Demonstrates extension functions and extension properties.
 *
 * Extensions add behavior to a type without inheriting from it. They are resolved
 * statically, so they cannot override real members.
 */
fun String.removeFirstLastChar(): String =
    if (length <= 2) "" else substring(1, length - 1)

val String.initials: String
    get() = split(" ").filter { it.isNotBlank() }.joinToString(".") { it.first().uppercase() }

fun String?.orPlaceholder(): String = this ?: "<empty>"

fun lessonExtensionFunction() {
    val myString = "Hello Kotlin"
    println("Trimmed: ${myString.removeFirstLastChar()}")
    println("Initials: ${"Halil Ibrahim Ozel".initials}")
    println("Nullable receiver: ${null.orPlaceholder()}")
}

fun main() {
    lessonExtensionFunction()
}
