/**
 * Demonstrates function declarations, overloading, parameters, and return values.
 */
fun myAge(): Int = 21

fun lessonFunctions() {
    println("My age: ${myAge()}")

    println("Main method")
    showMessage()

    sumFun()

    print("Enter a message: ")
    val message = readlnOrNull()
    if (message == null) {
        println("No message provided.")
    } else {
        showMessage(message)
    }

    print("Enter first number: ")
    val number1 = readlnOrNull()?.toDoubleOrNull()

    print("Enter second number: ")
    val number2 = readlnOrNull()?.toDoubleOrNull()

    if (number1 == null || number2 == null) {
        println("Invalid numeric input.")
        return
    }

    val sum = sumComingNumbers(number1, number2)
    println("Sum of numbers: $sum")
}

fun main() {
    lessonFunctions()
}

/** Prints a default greeting message. */
fun showMessage() {
    println("Hello, this is the first function")
}

/** Prints the sum of numbers from 1 to 10. */
fun sumFun() {
    var sum = 0
    for (i in 1..10) {
        sum += i
    }
    println("Sum of numbers: $sum")
}

/**
 * Overloaded version of [showMessage] that prints caller-provided content.
 */
fun showMessage(inputMessage: String) {
    println(inputMessage)
}

/** Returns the sum of two numbers. */
fun sumComingNumbers(x: Double, y: Double): Double = x + y
