/**
`when` is similar to Java's `switch-case` construct.
It is more flexible and can be used in expression form.
 */

fun main() {

    val a = 12
    val b = 5

    print("Enter operator either +, -, * or / : ") // Ask for an operator.

    val result = when (val operator = readlnOrNull()) { // Read selected operator.
        "+" -> a + b // Addition
        "-" -> a - b // Subtraction
        "*" -> a * b // Multiplication
        "/" -> a / b // Division
        else -> "$operator operator is invalid operator." // Invalid input
    }

    println("result = $result") // Print result.


    // Example: matching multiple values in one branch.

    val n = -1 // Example value.

    when (n) { // Evaluate n.
        1, 2, 3 -> println("n is a positive integer less than 4.") // Matches 1,2,3
        0 -> println("n is zero") // Matches zero
        -1, -2 -> println("n is a negative integer greater than 3.") // Matches -1,-2
    }


    // Example: using ranges in `when`.

    val j = 100 // Assign sample value.

    when (j) { // Evaluate j.
        in 1..10 -> println("A positive number less than 11.") // In 1..10
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)") // In 10..100
    }
}