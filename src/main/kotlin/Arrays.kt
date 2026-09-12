/**
 * Demonstrates arrays: creation, indexed access, iteration, and common helpers.
 *
 * Arrays have a fixed size. Prefer [List] for everyday collections and reach for
 * arrays only when you need a fixed-size, mutable, JVM-native container.
 */
fun lessonArrays() {
    val counters = Array(5) { 0 }
    counters[0] = 1

    for (element in counters) {
        println(element)
    }

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numbers[0])
    println(numbers[2])
    println("Size: ${numbers.size}")

    val primitiveNumbers = intArrayOf(1, 2, 3, 4, 5)
    println("Sum: ${primitiveNumbers.sum()}")

    val names: Array<String> = arrayOf("Halil", "Ibrahim", "Ozel")
    println("Not empty: ${names.isNotEmpty()}")
    println("Joined: ${names.joinToString()}")

    val mixedValues: Array<Any> = arrayOf(1, true, 19.00, "halil")
    println("Empty: ${mixedValues.isEmpty()}")
    println("Content: ${mixedValues.contentToString()}")
    println("Structural equality: ${numbers contentEquals arrayOf(1, 2, 3, 4, 5)}")
}

fun main() {
    lessonArrays()
}
