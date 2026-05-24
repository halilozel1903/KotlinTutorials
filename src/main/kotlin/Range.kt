/*
    A range represents values between a start and an end.
    It is useful when you want to check whether a value is inside an interval.
    Kotlin also provides helper APIs to iterate over these values.

 */

fun main() {

    val numbers = 1..20 // Forward range from 1 to 20.
    val aToZ = 'a'..'z'  // Forward range from a to z.

    val numbersReverse = 20 downTo 1 // Reverse range from 20 to 1.
    val lettersReverse = 'z' downTo 'a' // Reverse range from z to a.


    val oneToTwenty = 1.rangeTo(20) // Alternative syntax for 1..20.

    val oneToTwentyReverse = 20.downTo(1) // Alternative syntax for reverse range.


    val stepByFiveNumbers = 0.rangeTo(100).step(5) // Count by 5 up to 100.


    val stepByFiveNumbersReverse = (100 downTo 5).step(5) // Reverse count by 5.

    println(stepByFiveNumbers.first) // First element.
    println(stepByFiveNumbers.last) // Last element.
    println(stepByFiveNumbers.step) // Step value.

    for (i in 1 until 5) { // `until` excludes the end value.

        println(i) // Print each value.
    }

    // Keep variables used so examples stay warning-free.
    println(numbers)
    println(aToZ)
    println(numbersReverse)
    println(lettersReverse)
    println(oneToTwenty)
    println(oneToTwentyReverse)
    println(stepByFiveNumbersReverse)
}