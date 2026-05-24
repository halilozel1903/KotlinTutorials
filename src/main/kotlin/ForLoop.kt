/**
 * Demonstrates common `for` loop use-cases over ranges, strings, arrays,
 * and nested iterations.
 */
fun main() {
    // Print the same message 10 times.
    for (i in 1..10) {
        println("We Love Kotlin")
    }

    // Iterate over a String and format characters as comma-separated output.
    val name = "Halil Ibrahim Ozel"
    for (ch in name) {
        if (ch != name.last()) {
            print("$ch,")
        } else {
            println(ch)
        }
    }

    // Sum all values in an array.
    val numbers = arrayOf(3, 4, 5, 6)
    var total = 0
    for (num in numbers) {
        total += num
    }
    println("Total: $total")

    // Nested loop example.
    for (i in 1..3) {
        for (j in 1..3) {
            println("$i + $j = ${i + j}")
        }
    }

}