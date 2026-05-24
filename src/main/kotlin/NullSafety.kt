/**
 * Demonstrates Kotlin null-safety features: nullable types, safe calls,
 * and null-related behavior.
 */
fun main() {
    val name: String? = null
    println(name)
    println(name?.length)
    // println(name!!.length) // Would throw NullPointerException when `name` is null.

    var number: Int?
    number = 10
    println(number)

    number = null
    println(number)

    // `toString()` on a nullable reference is safe and returns "null" when value is null.
    println(number.toString().length)
}