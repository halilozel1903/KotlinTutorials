/**
 * Demonstrates Kotlin ranges, descending ranges, stepping, and `until`.
 */
fun main() {
    val numbers = 1..20
    val letters = 'a'..'z'

    val numbersReverse = 20 downTo 1
    val lettersReverse = 'z' downTo 'a'

    val oneToTwenty = 1.rangeTo(20)
    val oneToTwentyReverse = 20.downTo(1)

    val stepByFiveNumbers = 0.rangeTo(100).step(5)
    val stepByFiveNumbersReverse = (100 downTo 5).step(5)

    println(stepByFiveNumbers.first)
    println(stepByFiveNumbers.last)
    println(stepByFiveNumbers.step)

    // `until` excludes the end value.
    for (i in 1 until 5) {
        println(i)
    }

    // Keep variables referenced so every declaration is demonstrated.
    println(numbers)
    println(letters)
    println(numbersReverse)
    println(lettersReverse)
    println(oneToTwenty)
    println(oneToTwentyReverse)
    println(stepByFiveNumbersReverse)
}