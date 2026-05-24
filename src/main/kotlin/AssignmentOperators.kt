/*

Assignment Operators

a +=b	a = a + b
a += b	a = a + b
a *= b	a = a * b
a /= b	a = a / b
a %= b	a = a % b

 */


fun main() {
    var a = 10
    val b = 5

    val result: Int = a + b  // Sum of a and b.

    println(result) // Prints 15.

    a += b // Add b into a.

    println(a) // a becomes 15
}