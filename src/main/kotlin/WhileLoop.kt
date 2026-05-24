/**
 * Demonstrates `while` loops in Kotlin.
 *
 * A `while` loop repeats a block as long as its condition is true.
 */
fun main() {
    var i = 1
    while (i <= 5) {
        println(i)
        ++i
    }

    // Sum numbers from 10 down to 1.
    var sum = 0
    var j = 10
    while (j != 0) {
        sum += j
        --j
    }
    println("sum = $sum")
}