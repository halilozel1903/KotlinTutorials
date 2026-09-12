/**
 * Demonstrates `break`, including labeled breaks for nested loops.
 */
fun lessonBreak() {
    for (i in 1..10) {
        if (i == 8) break
        println(i)
    }

    for (char in "Halil&Ozel") {
        if (char == '&') break
        print(char)
    }
    println()

    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i * j > 4) break@outer
            println("$i * $j = ${i * j}")
        }
    }
}

fun main() {
    lessonBreak()
}
