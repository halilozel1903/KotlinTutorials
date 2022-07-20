/*
In Kotlin, if you want to write a function or any member of the class that can be called without having the
instance of the class then you can write the same as a member of a companion object inside the class.
 */

class CallMe {
    companion object {
        fun callMe() = println("You're calling.")
        const val NAME = "Halil Ozel"
    }
}

fun main() {
    CallMe.callMe()
    println("Name: ${CallMe.NAME}")
}