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

fun showMessage() {
    println("Hello, this is the first function")
}

fun sumFun() {
    val sum = (1..10).sum()
    println("Sum of numbers: $sum")
}

fun showMessage(inputMessage: String) {
    println(inputMessage)
}

fun sumComingNumbers(x: Double, y: Double): Double = x + y
