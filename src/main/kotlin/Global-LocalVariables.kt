

var globalNumber = 12

fun fun1(): Unit {

    var localNumber = 21
    println("fun1-global variable: $globalNumber")
}

fun fun2(): Unit {
    println("fun2-global variable: $globalNumber")

}

fun main() {

    println("main-global variable: $globalNumber")

    fun1()
    fun2()
}