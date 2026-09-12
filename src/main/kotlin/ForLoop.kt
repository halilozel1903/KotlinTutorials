/**
 * Demonstrates common `for` loop use-cases over ranges, strings, arrays,
 * and nested iterations.
 */
fun lessonForLoop() {
    // Print the same message a few times. `repeat` is the idiomatic choice when
    // the index is not needed.
    repeat(3) {
        println("We Love Kotlin")
    }

    // Iterate over a String and format characters as comma-separated output.
    val name = "Halil Ibrahim Ozel"
    for ((index, ch) in name.withIndex()) {
        if (index == name.lastIndex) {
            println(ch)
        } else {
            print("$ch,")
        }
    }

    val numbers = arrayOf(3, 4, 5, 6)
    var total = 0
    for (number in numbers) {
        total += number
    }
    println("Total: $total")
    println("Total (sum): ${numbers.sum()}")

    for (i in 1..3) {
        for (j in 1..3) {
            println("$i + $j = ${i + j}")
        }
    }
}

fun main() {
    lessonForLoop()
}
