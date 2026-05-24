/**
 * Demonstrates operator overloading by implementing `plus` for a custom type.
 */
fun lessonOperatorOverloading() {
    val numbersOne = Numbers(3, 5)
    val numbersTwo = Numbers(7, 1)

    val sum: Numbers = numbersOne + numbersTwo
    println("sum = (${sum.numberOne}, ${sum.numberTwo})")
    println(Numbers().numberOne)
    println(Numbers().numberTwo)
}

fun main() {
    lessonOperatorOverloading()
}

/**
 * Simple pair-like type used to show operator overloading.
 */
class Numbers(val numberOne: Int = 19, val numberTwo: Int = 3) {
    /**
     * Adds the corresponding values of two [Numbers] instances.
     */
    operator fun plus(numbers: Numbers): Numbers {
        return Numbers(numberOne + numbers.numberOne, numberTwo + numbers.numberTwo)
    }
}
