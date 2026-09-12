/**
 * Demonstrates inner classes.
 *
 * A nested class is static by default. Marking it `inner` gives it a reference to
 * the outer instance, which is what makes the outer members accessible.
 */
class Outside {
    private val outside = "Outside Nested class."

    inner class Inner {
        fun tellMe() = outside

        fun outerReference() = this@Outside
    }
}

fun lessonInnerClass() {
    val outer = Outside()
    println("Outside : ${outer.Inner().tellMe()}")

    val inner = Outside().Inner()
    println("Inner : ${inner.tellMe()}")
    println("Same outer instance: ${outer.Inner().outerReference() === outer}")
}

fun main() {
    lessonInnerClass()
}
