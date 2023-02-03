
/*
Abstract keyword is used to declare abstract classes in Kotlin.
An abstract class cannot be instantiated. You can inherit subclasses from them.
 */

abstract class Person(name: String) {

    init {
        println("My name is $name.")
    }

    fun showNumber(number: Int) {
        println("My Number : $number")
    }

    abstract fun showPosition(position: String)
}

class BasketballPlayer(name: String) : Person(name) {
    override fun showPosition(position: String) {
        println(position)
    }
}

/*
Properties and methods of an abstract class are non-abstract unless you explicitly
use abstract keyword to make them abstract.
 */

fun main() {
    val basketballPlayer = BasketballPlayer("Halil Ozel")
    basketballPlayer.showPosition("Guard")
    basketballPlayer.showNumber(34)
}