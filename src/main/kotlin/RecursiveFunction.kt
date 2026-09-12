/**
 * Demonstrates recursion.
 *
 * Passing the state as a parameter keeps the function pure and repeatable, unlike
 * a shared mutable counter.
 */
fun countDown(counter: Int) {
    if (counter > 0) {
        println("recursive message ($counter)")
        countDown(counter - 1)
    } else {
        println("recursive end")
    }
}

tailrec fun factorial(n: Int, accumulator: Long = 1): Long =
    if (n <= 1) accumulator else factorial(n - 1, accumulator * n)

fun lessonRecursiveFunction() {
    countDown(counter = 5)
    println("10! = ${factorial(10)}")
}

fun main() {
    lessonRecursiveFunction()
}
