/**
 * Demonstrates nested `if` expressions.
 *
 * Nesting works, but the standard library usually expresses the same intent more
 * clearly - see the `maxOf` call at the end.
 */
fun lessonNestedIfExpression() {
    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max = if (n1 > n2) {
        if (n1 > n3) n1 else n3
    } else {
        if (n2 > n3) n2 else n3
    }

    println("max = $max")
    println("maxOf = ${maxOf(n1, n2, n3)}")
}

fun main() {
    lessonNestedIfExpression()
}
