/**
 * Demonstrates arithmetic operators and String concatenation in Kotlin.
 */
fun lessonArithmeticOperators() {
    val number1 = 28.0
    val number2 = 7.0

    var result = number1 + number2
    println("$number1 + $number2 = $result")

    result = number1 - number2
    println("$number1 - $number2 = $result")

    result = number1 * number2
    println("$number1 * $number2 = $result")

    result = number1 / number2
    println("$number1 / $number2 = $result")

    result = number1 % number2
    println("$number1 % $number2 = $result")

    // `+` also concatenates String values.
    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"

    val sentence = start + middle + end
    println(sentence)
}

fun main() {
    lessonArithmeticOperators()
}
