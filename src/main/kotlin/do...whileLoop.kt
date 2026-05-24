/*

Do-while is similar to a while loop.
The body runs first, then the condition is checked.

Syntax:

do {
   // codes inside body of do while loop
} while (testExpression);

 */

fun main() {

    // Example - 1

    var i = 6 // Initial value for i.
    do {
        println(i) // Print i.
        i++ // Increment i.
    } while (i <= 5) // Continue while i is less than or equal to 5.


    // Example - 2

    var j = 1 // Initial value for j.
    do {
        println(j) // First iteration runs before condition check.
        j++ // Increment j.
    } while (j <= 5) // Keep running while condition is true.


}