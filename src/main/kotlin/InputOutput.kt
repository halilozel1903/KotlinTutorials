/**
 * Demonstrates basic console input and output in Kotlin.
 *
 * Prefer [readlnOrNull] over the deprecated `readLine()`.
 */
fun lessonInputOutput() {
    println("1. println")
    println("2. println")

    print("1. print ")
    print("2. print")
    println()

    val score = 99
    println("score")
    println(score)
    println("score: $score")

    print("What is your name: ")
    val name = readlnOrNull().orEmpty()
    println("My name is $name")

    print("How old are you: ")
    val age = readlnOrNull()?.toIntOrNull()
    if (age == null) {
        println("Invalid age input")
    } else {
        println("I am $age years old")
    }
}

fun main() {
    lessonInputOutput()
}
