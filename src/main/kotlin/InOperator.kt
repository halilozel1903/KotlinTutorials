/**
 * Demonstrates the `in` operator for membership checks.
 */
fun lessonInOperator() {
    val numbers = intArrayOf(1, 4, 42, -3)

    if (4 in numbers) {
        println("The numbers array contains 4")
    }
}

fun main() {
    lessonInOperator()
}
