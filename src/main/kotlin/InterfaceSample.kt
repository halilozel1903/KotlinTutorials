/*
Kotlin interface is similar to interface in Java.
They can contain definitions of abstract methods as well as implementations of non-abstract methods.
Interface cannot contain any state.
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

fun main() {

    val interfaceSample = InterfaceSample()

    println("season Number = ${interfaceSample.seasonNumber}")

    interfaceSample.sayHi()

    println(interfaceSample.askQuestion())
}