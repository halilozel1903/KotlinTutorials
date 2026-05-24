/**
 * Demonstrates `when` as a replacement for traditional `switch`-style branching.
 */
fun main() {
    val a = 12
    val b = 5

    print("Enter an operator (+, -, *, /): ")
    val result = when (val operator = readlnOrNull()) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "Invalid operator: $operator"
    }
    println("result = $result")

    // Match multiple values in one branch.
    val n = -1
    when (n) {
        1, 2, 3 -> println("n is a positive integer less than 4")
        0 -> println("n is zero")
        -1, -2 -> println("n is a negative integer greater than -3")
        else -> println("n is outside the demonstrated cases")
    }

    // Use ranges inside `when` conditions.
    val j = 100
    when (j) {
        in 1..10 -> println("A positive number less than 11")
        in 11..100 -> println("A positive number between 11 and 100 (inclusive)")
        else -> println("Not in the configured positive range")
    }
}