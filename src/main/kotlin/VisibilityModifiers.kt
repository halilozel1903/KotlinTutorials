/**
public: Visible everywhere
private: Visible inside the same class only
internal: Visible inside the same module
protected: Visible inside the same class and its subclasses
 */

// By Default Public Class
class TeamOne {
    var number = 100
}

// Specified with Public modifier
public class TeamTwo {
    var number = 200
    fun show() {
        println("Accessible everywhere")
    }
}

// TeamThree is accessible from same source file
private class TeamThree {
    private val number = 50
    fun show() {
        // We can access number in the same class
        println(number)
        println("Accessing number successful")
    }
}

// Internal modifier benefits in writing APIs and implementations.
internal class TeamFour {}

public class TeamFive {
    internal val number = 300
    internal fun show() {}
}

open class TeamSix {
    // Protected variable
    protected val number = 75
}

// Inherited Class
class TeamSeven : TeamSix() {
    fun getValue(): Int {
        // Accessed from the subclass
        return number
    }
}

fun main() {
    val teamOne = TeamOne()

    println("teamOne - Number : ${teamOne.number}")

    val teamTwo = TeamTwo()
    teamTwo.show()

    val teamThree = TeamThree()
    teamThree.show()

    // println(teamThree.number) -> Can not access 'number': it is private in class TeamThree

    val teamSeven = TeamSeven()
    println("Value: " + teamSeven.getValue())
}
