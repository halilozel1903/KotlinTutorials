/**
 * Demonstrates arithmetic operators and String concatenation in Kotlin.
 */
fun lessonArithmeticOperators() {
    val number1 = 28.0
    val number2 = 7.0

    println("$number1 + $number2 = ${number1 + number2}")
    println("$number1 - $number2 = ${number1 - number2}")
    println("$number1 * $number2 = ${number1 * number2}")
    println("$number1 / $number2 = ${number1 / number2}")
    println("$number1 % $number2 = ${number1 % number2}")

    val start = "Talk is cheap. "
    val middle = "Show me the code. "
    val end = "- Linus Torvalds"
    println("$start$middle$end")
}

fun main() {
    lessonArithmeticOperators()
}
