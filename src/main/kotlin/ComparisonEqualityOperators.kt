/**
 * Demonstrates comparison and equality operators.
 *
 * `==` compares structurally (it calls `equals`), while `===` compares references.
 */
fun lessonComparisonEqualityOperators() {
    val a = -12
    val b = 12

    println("a > b  -> ${a > b}")
    println("a < b  -> ${a < b}")
    println("a >= b -> ${a >= b}")
    println("a <= b -> ${a <= b}")
    println("a == b -> ${a == b}")
    println("a != b -> ${a != b}")

    val max = if (a > b) a else b
    println("max = $max")
    println("maxOf = ${maxOf(a, b)}")

    val first = StringBuilder("Kotlin").toString()
    val second = StringBuilder("Kotlin").toString()
    println("Structural equality (==):  ${first == second}")
    println("Referential equality (===): ${first === second}")
    println("compareTo: ${first.compareTo(second)}")
}

fun main() {
    lessonComparisonEqualityOperators()
}
