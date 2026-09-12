/**
 * Demonstrates assignment and augmented assignment operators.
 *
 * | Operator | Equivalent |
 * |----------|------------|
 * | `a += b` | `a = a + b` |
 * | `a -= b` | `a = a - b` |
 * | `a *= b` | `a = a * b` |
 * | `a /= b` | `a = a / b` |
 * | `a %= b` | `a = a % b` |
 */
fun lessonAssignmentOperators() {
    var a = 10
    val b = 5

    println("a + b = ${a + b}")

    a += b
    println("a += b -> $a")

    a -= b
    println("a -= b -> $a")

    a *= b
    println("a *= b -> $a")

    a /= b
    println("a /= b -> $a")

    a %= b
    println("a %= b -> $a")

    val scores = mutableListOf(1, 2)
    scores += 3
    println("scores: $scores")
}

fun main() {
    lessonAssignmentOperators()
}
