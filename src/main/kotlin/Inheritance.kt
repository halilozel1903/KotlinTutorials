/*
Inheritance is one of the key features of object-oriented programming.
It allows user to create a new class (inherited class) from an existing class (base class).

The derived class inherits all the features from the base class and can have additional features of its own.
 */


open class Human(age: Int, name: String) {
    init {
        println("My name is $name.")
        println("My age is $age")
    }
}

class Developer(age: Int, name: String) : Human(age, name) {

    fun writeCodes() {
        println("I write code in Halil Company.")
    }
}

class FootballPlayer(age: Int, name: String) : Human(age, name) {
    fun playFootball() {
        println("I play for Besiktas JK.")
    }
}

fun main() {
    val developer = Developer(25, "Halil")
    developer.writeCodes()

    println()

    val footballPlayer = FootballPlayer(38, "Ricardo")
    footballPlayer.playFootball()
}

/*
If the class has a primary constructor, the base must be initialized using the parameters of
the primary constructor. In the above program, both derived classes have two parameters age and name,
and both these parameters are initialized in primary constructor in the base class.
 */