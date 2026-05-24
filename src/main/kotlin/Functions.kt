/*
Just like variables, functions can return assigned values.
When the function is called, the returned age is printed.
 */

fun myAge() = 21

fun main() {


    // Function call.
    println("My Age : ${myAge()}")


    println("Main method")
    showMessage() // Function invocation


    sumFun() // Call helper method


    print("Enter a message: ") // Prompt
    val message: String = readLine()!! // Read user input
    showMessage(message) // Pass value to function


    print("Enter first number: ") // Read first value
    val number1: Double = readLine()!!.toDouble()

    print("Enter second number: ") // Read second value
    val number2: Double = readLine()!!.toDouble()

    val sum: Double = sumComingNumbers(number1, number2) // Send values to function

    println("Sum of numbers: $sum") // Print sum


}


// Functions without parameters


fun showMessage(): Unit {

    println("Hello, this is the first function")

}


// sumFun() prints the sum of numbers from 1 to 10.

fun sumFun(): Unit {

    var sum = 0 // Accumulator

    for (i in 1..10) { // Iterate and accumulate
        sum += i
    }

    println("Sum of numbers: $sum") // Print sum

}


// Functions with parameters

fun showMessage(comingMessage: String): Unit {

    println(comingMessage) // Print received value

}


// Returns a Double by summing x and y.
fun sumComingNumbers(x: Double, y: Double): Double {

    return x + y // Return sum
}

