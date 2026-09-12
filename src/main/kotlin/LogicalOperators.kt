/**
 * Demonstrates logical operators: `&&`, `||`, and `!`.
 *
 * `&&` and `||` are short-circuiting: the right operand is evaluated only when it
 * can still change the result.
 */
fun lessonLogicalOperators() {
    val a = true
    val b = true

    println(a && b)
    println(!a && b)
    println(a && !b)
    println(!a && !b)

    println("------------------------------")

    println(a || b)
    println(!a || b)
    println(a || !b)
    println(!a || !b)

    println("------------------------------")

    println("Short circuit: ${shortCircuitAnd(left = false, label = "no call")}")
    println("Evaluated: ${shortCircuitAnd(left = true, label = "called")}")
}

private fun shortCircuitAnd(left: Boolean, label: String): Boolean =
    left && isPositive(label)

private fun isPositive(label: String): Boolean {
    println("isPositive evaluated for '$label'")
    return true
}

fun main() {
    lessonLogicalOperators()
}
