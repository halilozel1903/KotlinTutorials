var counter = 5 // Global counter

/*
    A recursive function is a function that calls itself.
    As long as the value is zero or positive, it prints a message
    and calls itself again. The counter decreases on each call.

 */

fun recursive(): Unit {

    counter-- // Decrease by one.

    // If counter is still non-negative, keep recursing.
    if (counter >= 0) {
        println("recursive message")
        recursive()
    } else { // Base case
        print("recursive end")
    }


}

fun main() {
    recursive() // Entry point call
}