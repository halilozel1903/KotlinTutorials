/**
 * Demonstrates method overloading: same name, different parameter lists.
 */
fun mix(x: Int): Int = x

fun mix(x: Int, y: Int): Int = x + y

fun mix(x: Int, y: Int, z: Int): Int = x + y + z

fun lessonMethodOverloading() {
    println("mix(x): ${mix(10)}")
    println("10+20: ${mix(10, 20)}")
    println("10+20+30: ${mix(10, 20, 30)}")
    println("Default arguments: ${mixAll()}")
    println("Named argument: ${mixAll(z = 30)}")
}

fun mixAll(x: Int = 10, y: Int = 20, z: Int = 0): Int = x + y + z

fun main() {
    lessonMethodOverloading()
}
