fun main() {

    val name: String? = null // `name` can be String or null.

    println(name) // Prints null.

    println(name?.length) // Safe call for nullable value.

    // println(name!!.length) // Throws NullPointerException if name is null.


    var number: Int? // Int that can also be null.
    number = 10
    println(number)

    number = null
    println(number)
    println(number.toString().length) // Convert to string and get length.

}