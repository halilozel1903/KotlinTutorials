/**
 * Demonstrates `continue`, including labeled continues for nested loops.
 */
fun lessonContinue() {
    for (i in 1..10) {
        if (i == 8) continue
        println(i)
    }

    for (char in "Halil&Ibrahim") {
        if (char == '&') {
            print(" ")
            continue
        }
        print(char)
    }
    println()

    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (j == 2) continue@outer
            println("i=$i, j=$j")
        }
    }
}

fun main() {
    lessonContinue()
}
