/**
 * Demonstrates a user-defined infix function in Kotlin.
 */
class Check {
    infix fun dataType(value: Any): String = when (value) {
        is String -> "String"
        is Int -> "Integer"
        is Double -> "Double"
        is Char -> "Char"
        is Float -> "Float"
        else -> "Unsupported"
    }
}

fun lessonInfixFunction() {
    val check = Check()
    val result = check dataType "Halil"
    println(result)
}

fun main() {
    lessonInfixFunction()
}
