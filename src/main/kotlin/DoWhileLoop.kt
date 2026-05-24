/**
 * Demonstrates the `do-while` loop, where the loop body executes at least once
 * before the condition is evaluated.
 */
fun lessonDoWhileLoop() {
    // Example 1: condition is false, but body still runs once.
    var i = 6
    do {
        println(i)
        i++
    } while (i <= 5)

    // Example 2: regular repetition while condition remains true.
    var j = 1
    do {
        println(j)
        j++
    } while (j <= 5)
}

fun main() {
    lessonDoWhileLoop()
}

