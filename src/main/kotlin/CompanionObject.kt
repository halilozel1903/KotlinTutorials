/**
 * Demonstrates companion objects.
 *
 * Kotlin has no `static` keyword. Members that belong to the class rather than to
 * an instance live inside a `companion object`.
 */
class CallMe private constructor(val caller: String) {

    fun describe() = "Call from $caller"

    companion object {
        const val NAME = "Halil Ozel"

        fun callMe() = println("You're calling.")

        fun create(caller: String = NAME) = CallMe(caller)
    }
}

fun lessonCompanionObject() {
    CallMe.callMe()
    println("Name: ${CallMe.NAME}")
    println(CallMe.create().describe())
    println(CallMe.create("Ibrahim").describe())
}

fun main() {
    lessonCompanionObject()
}
