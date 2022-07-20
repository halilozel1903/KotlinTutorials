/*
 A sealed class defines a set of subclasses within it.
 It is used when it is known in advance that a type will conform to one of the subclass types.
 Sealed classes ensure type safety by restricting the types to be matched at compile-time rather than at runtime.
 */


sealed class Demo {
    object One : Demo() {
        fun display() {
            println("Object A of Sealed class Demo ")
        }
    }

    object Two : Demo() {
        fun display() {
            println("Object B of sealed class Demo")
        }
    }
}

fun main() {
    val objOne = Demo.One
    objOne.display()
    val objTwo = Demo.Two
    objTwo.display()
}

