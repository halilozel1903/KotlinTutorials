/**
 * Demonstrates inheritance.
 *
 * Classes and members are final by default in Kotlin, so a base class must be
 * marked `open` before it can be inherited from, and a member must be `open`
 * before it can be overridden.
 */
open class Human(private val age: Int, private val name: String) {

    init {
        println("My name is $name.")
        println("My age is $age")
    }

    open fun introduce() = "I am $name ($age)"
}

class Developer(age: Int, name: String) : Human(age, name) {

    fun writeCodes() {
        println("I write code in Halil Company.")
    }

    override fun introduce() = "${super.introduce()} and I write Kotlin."
}

class FootballPlayer(age: Int, name: String) : Human(age, name) {
    fun playFootball() {
        println("I play for Besiktas JK.")
    }
}

fun lessonInheritance() {
    val developer = Developer(25, "Halil")
    developer.writeCodes()
    println(developer.introduce())

    println()

    val footballPlayer = FootballPlayer(38, "Ricardo")
    footballPlayer.playFootball()
    println(footballPlayer.introduce())
}

fun main() {
    lessonInheritance()
}
