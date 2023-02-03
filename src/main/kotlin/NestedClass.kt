class External {

    val lowInfo = "This is Outside Nested Class."

    class Nested {
        val highInfo = "This is Inside Nested Class."
        fun callMeUp() = "Function call from inside Nested Class."
    }
}

/*
 Kotlin allows you to define a class within another class known as nested class.
 */

fun main() {

    // Accessing member of Nested class
    println(External.Nested().highInfo)

    // Accessing member of External class
    val external = External()
    println(external.lowInfo)

    // Creating object of Nested class
    val nested = External.Nested()
    println(nested.callMeUp())
}