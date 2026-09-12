/**
 * Demonstrates the `in` operator for membership checks.
 */
fun lessonInOperator() {
    val numbers = intArrayOf(1, 4, 42, -3)

    if (4 in numbers) {
        println("The numbers array contains 4")
    }

    val range = 1..10
    println("7 in 1..10: ${7 in range}")
    println("'k' in Kotlin: ${'k' in "Kotlin"}")
}

fun main() {
    lessonInOperator()
}
