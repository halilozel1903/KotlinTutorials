/*
In Kotlin, you can also use extension function to extend a class with new functionalities.
Basically, an extension function is a member function of a class that is defined outside the class.

For example, you need to use a method to the String class that returns a new string with first and
last character removed; this method is not already available in String class.
You can use extension function to accomplish this task.
 */


fun String.removeFirstLastChar(): String = this.substring(1, this.length - 1)

fun main() {
    val myString = "Hello Kotlin"
    val result = myString.removeFirstLastChar()
    println("First character is: $result")
}