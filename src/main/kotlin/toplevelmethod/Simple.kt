package toplevelmethod

/** A function declared outside of any class. */
fun topLevelMethods() {
    println("This is a message from the top-level method.")
}

/** A regular class whose member function needs an instance to be called. */
class Simple {

    fun localMethod() {
        println("This is a message from the local method.")
    }
}
