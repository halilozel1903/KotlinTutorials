/**
The while loop repeats a block of code.
It runs as long as the condition is true.

Syntax

while (testExpression) {
    // code inside while loop
}
 */


fun main() {
    var i = 1 // Initial value.

    while (i <= 5) { // Continue while i <= 5
        println("$i") // Print i.
        ++i // Prefix increment
    }

    // Program that sums numbers from 10 down to 1.
    var sum = 0 // Accumulator
    var j = 10 // Initial value

    while (j != 0) { // Run until j reaches 0
        sum += j     // sum = sum + j
        --j // Decrement j
    }
    println("sum = $sum") // Print total.
}