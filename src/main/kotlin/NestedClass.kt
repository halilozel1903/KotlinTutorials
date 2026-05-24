class External {
    val outerInfo = "This is outside the nested class."

    class Nested {
        val innerInfo = "This is inside the nested class."
        fun callMeUp() = "Function call from inside Nested class."
    }
}

/**
 * Demonstrates Kotlin nested classes and how to access outer and nested members.
 */
fun main() {
    println(External.Nested().innerInfo)

    val external = External()
    println(external.outerInfo)

    val nested = External.Nested()
    println(nested.callMeUp())
}