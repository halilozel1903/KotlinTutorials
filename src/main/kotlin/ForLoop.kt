/*
    `for` loops are used for repeated operations over ranges or collections.

    Syntax:

    for (x in collection) {
        // code
    }

    - The loop target can be an array, list, range, or String.

 */

fun main() {


    // Print "We Love Kotlin" from 1 to 10.

    for (i in 1..10) {

        println("We Love Kotlin")
    }


    // Iterate over the name and print characters one by one.

    val name = "Halil Ibrahim Ozel" // Sample name value.

    for (ch in name) {

        if (!ch.equals(name.last())) { // If it is not the last character
            print("$ch,") // Print with comma
        } else {
            println(ch) // Print final character without comma
        }
    }


    // Define an array and print the sum of its elements.

    val numbers = arrayOf(3, 4, 5, 6) // Array declaration
    var total = 0 // Accumulator

    for (num in numbers) { // Iterate over all elements

        total += num // Add current element
    }

    println("Total: $total") // Print total sum.


    // Nested loop example from 1 to 3.

    for (i in 1..3) { // Outer loop

        for (j in 1..3) { // Inner loop

            println("$i + $j = ${i + j}") // Print pair-wise sums.
        }
    }

}