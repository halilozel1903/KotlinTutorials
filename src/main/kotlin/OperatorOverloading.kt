/**
 * Demonstrates operator overloading by implementing `plus` for a custom type.
 */
class Numbers(val numberOne: Int = 19, val numberTwo: Int = 3) {
    operator fun plus(numbers: Numbers): Numbers =
        Numbers(numberOne + numbers.numberOne, numberTwo + numbers.numberTwo)
}

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
