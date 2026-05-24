/*
    An array is a collection of similar values such as Int, String, etc.

 */

fun main() {

    val myArray = Array<Int>(5) { 0 } // Array with 5 elements initialized to 0

    myArray[0] = 1 // Update index 0

    for (element in myArray) {
        println(element) // Print array elements
    }

    val my_array: Array<Int> = arrayOf(1, 2, 3, 4, 5) // Int array declaration

    println(my_array[0]) // Access index 0

    println(my_array[2]) // Access index 2

    println(my_array.size) // Array size


    val array_2: Array<String> = arrayOf("Halil", "Ibrahim", "Ozel") // String array declaration

    println(array_2.isNotEmpty()) // True when array is not empty

    val any_array: Array<Any> =
        arrayOf(1, true, 19.00, "halil") // Any allows mixed types

    println(any_array.isEmpty()) // Check whether array is empty
}