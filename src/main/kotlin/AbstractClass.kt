/**
 * Demonstrates abstract classes.
 *
 * An abstract class cannot be instantiated; it exists to be inherited from.
 * Its members are concrete unless they are explicitly marked `abstract`.
 */
abstract class Person(private val name: String) {

    init {
        println("My name is $name.")
    }

    fun showNumber(number: Int) {
        println("$name's number: $number")
    }

    abstract fun showPosition(position: String)
}

class BasketballPlayer(name: String) : Person(name) {
    override fun showPosition(position: String) {
        println("Position: $position")
    }
}

fun lessonAbstractClass() {
    val basketballPlayer = BasketballPlayer("Halil Ozel")
    basketballPlayer.showPosition("Guard")
    basketballPlayer.showNumber(34)
}

fun main() {
    lessonAbstractClass()
}
