/**
 * Demonstrates interfaces.
 *
 * An interface can declare abstract members and default implementations, but it
 * cannot hold state: its properties have no backing field.
 */
interface MyInterface {

    val seasonNumber: Int

    fun askQuestion(): String

    fun sayHi() {
        println("Hey, Fellas!")
    }
}

class InterfaceSample : MyInterface {
    override val seasonNumber: Int = 2
    override fun askQuestion() = "Biscuit or Cookie"
}

fun lessonInterface() {
    val interfaceSample = InterfaceSample()

    println("season Number = ${interfaceSample.seasonNumber}")
    interfaceSample.sayHi()
    println(interfaceSample.askQuestion())

    val anonymous = object : MyInterface {
        override val seasonNumber = 3
        override fun askQuestion() = "Tea or Coffee"
        override fun sayHi() = println("Hi from an anonymous object!")
    }
    anonymous.sayHi()
    println("Season ${anonymous.seasonNumber}: ${anonymous.askQuestion()}")
}

fun main() {
    lessonInterface()
}
