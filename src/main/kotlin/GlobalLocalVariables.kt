/**
 * Demonstrates global and local variable scope.
 */
var globalNumber = 12

fun fun1() {
    val localNumber = 21
    println("fun1 -> globalNumber: $globalNumber")
    println("fun1 -> localNumber: $localNumber")
}

fun fun2() {
    println("fun2 -> globalNumber: $globalNumber")
}

fun lessonGlobalLocalVariables() {
    println("main -> globalNumber: $globalNumber")
    fun1()
    fun2()
}

fun main() {
    lessonGlobalLocalVariables()
}
