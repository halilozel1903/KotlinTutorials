/*

Arithmetic Operators

+ : Addition

- : Subtraction

* : Multiplication

/ : Division

% : Modulo

 */

fun main() {

    val number1 = 28.0  // First operand.

    val number2 = 7.0 // Second operand.

    var result: Double = number1 + number2 // Addition result.

    println("$number1 + $number2 = $result")
    // This is Kotlin string interpolation.
    // It keeps output formatting concise and readable.


    result = number1 - number2 // Subtraction.

    println("$number1 - $number2 = $result") // Print subtraction result.


    result = number1 * number2 // Multiplication.

    println("$number1 * $number2 = $result") // Print multiplication result.


    result = number1 / number2 // Division.

    println("$number1 / $number2 = $result") // Print division result.


    result = number1 % number2 // Modulo.

    println("$number1 % $number2 = $result") // Print modulo result.

    // `+` can also concatenate String values.

    val start = "Talk is cheap. " // First fragment.
    val middle = "Show me the code. " // Middle fragment.
    val end = "- Linus Torvalds" // Author fragment.

    val sentence = start + middle + end // Merge sentence parts.
    println(sentence) // Print final sentence.
}