import toplevelmethod.Simple
import toplevelmethod.topLevelMethods

/**
 * Demonstrates top-level functions.
 *
 * Kotlin does not require a wrapper class for functions: a top-level function is
 * compiled into a `FileNameKt` facade class and imported by name.
 */
fun lessonTopLevelMethod() {
    topLevelMethods()

    val simple = Simple()
    simple.localMethod()
}

fun main() {
    lessonTopLevelMethod()
}
