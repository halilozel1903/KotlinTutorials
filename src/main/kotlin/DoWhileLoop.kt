/**
 * Demonstrates the `do-while` loop, where the loop body executes at least once
 * before the condition is evaluated.
 */
fun lessonDoWhileLoop() {
    var i = 6
    do {
        println(i)
        i++
    } while (i <= 5)

    var j = 1
    do {
        println(j)
        j++
    } while (j <= 5)
}

fun main() {
    lessonDoWhileLoop()
}
