/**
 * Demonstrates Kotlin null-safety: nullable types, safe calls, the Elvis
 * operator, safe casts, and smart casts.
 */
fun lessonNullSafety() {
    val name: String? = null
    println(name)
    println(name?.length)

    var number: Int? = 10
    println(number)

    number = null
    println(number)
    println(number.toString().length)

    val length = name?.length ?: 0
    println("Length with fallback: $length")

    val anyValue: Any = "Kotlin"
    val asInt: Int? = anyValue as? Int
    println("Safe cast result: $asInt")

    val maybeText: String? = "Hello"
    if (maybeText != null) {
        println("Smart cast length: ${maybeText.length}")
    }

    maybeText?.let { println("Inside let: ${it.uppercase()}") }

    val values: List<String?> = listOf("a", null, "b")
    println("Without nulls: ${values.filterNotNull()}")
}

fun main() {
    lessonNullSafety()
}
