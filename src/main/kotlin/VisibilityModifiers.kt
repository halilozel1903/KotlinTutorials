/**
 * Demonstrates visibility modifiers.
 *
 * - `public` (default): visible everywhere
 * - `private`: visible inside the declaring class, or file for top-level members
 * - `internal`: visible inside the same module
 * - `protected`: visible inside the declaring class and its subclasses
 */
class TeamOne {
    var number = 100
}

class TeamTwo {
    var number = 200
    fun show() {
        println("Accessible everywhere: $number")
    }
}

private class TeamThree {
    private val number = 50
    fun show() {
        println(number)
        println("Accessing number successful")
    }
}

internal class TeamFour

class TeamFive {
    internal val number = 300
    internal fun show() = println("Internal member: $number")
}

open class TeamSix {
    protected val number = 75
}

class TeamSeven : TeamSix() {
    fun getValue(): Int = number
}

fun lessonVisibilityModifiers() {
    val teamOne = TeamOne()
    println("teamOne - Number : ${teamOne.number}")

    TeamTwo().show()
    TeamThree().show()
    println("Internal class: ${TeamFour()::class.simpleName}")
    TeamFive().show()

    println("Value: ${TeamSeven().getValue()}")
}

fun main() {
    lessonVisibilityModifiers()
}
