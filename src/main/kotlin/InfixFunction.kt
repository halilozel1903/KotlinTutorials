/*Kotlin provides infix notation with which we can call a function with the class object without using
a dot and parentheses across the parameter. Using infix function provides more readability to
a function similar to other operators like in, is, as in Kotlin.*/

class Check {
    // user defined infix member function
    infix fun dataType(types: Any): Any {
        val type = when (types) {
            is String -> "String"
            is Int -> "Integer"
            is Double -> "Double"
            is Char -> "Char"
            is Float -> "Float"
            else -> "Invalid"
        }
        return type
    }
}

fun main() {
    val check = Check()
    // call using infix notation
    val result = check dataType "Halil"
    println(result)
}


