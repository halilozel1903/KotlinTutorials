/*
You can also define how operator works for objects by overloading its corresponding function.
For example, you need define how + operator works for objects by overloading plus() function.

 */

fun main() {

    val numbersOne = Numbers(3, 5)
    val numbersTwo = Numbers(7, 1)

    val sum: Numbers = numbersOne + numbersTwo
    println("sum = (${sum.numberOne}, ${sum.numberTwo})")
    println(Numbers().numberOne)
    println(Numbers().numberTwo)
}

class Numbers(val numberOne: Int = 19, val numberTwo: Int = 3) {

    // Overloading plus function
    operator fun plus(numbers: Numbers): Numbers {
        return Numbers(numberOne + numbers.numberOne, numberTwo + numbers.numberTwo)
    }
}

/*
- When you overload operators, you should try to maintain the original spirit of the operator.
- Unlike languages like Scala, only a specific set of operators can be overloaded in Kotlin.
 */