/**
 * Demonstrates `if` as an expression.
 *
 * Kotlin has no ternary operator because `if` already returns a value; the last
 * expression of each branch becomes the result.
 */
fun lessonIfExpression() {
    val number = 10

    val result = if (number > 0) "Positive number" else "Negative number"
    println(result)

    val a = 9
    val b = -11

    val max = if (a > b) {
        println("$a is larger than $b.")
        println("max variable holds value of a.")
        a
    } else {
        println("$b is larger than $a.")
        println("max variable holds value of b.")
        b
    }
    println("max = $max")
}

fun main() {
    lessonIfExpression()
}
