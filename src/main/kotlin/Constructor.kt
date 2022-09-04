/**
In Kotlin, constructor is a block of code similar to method. Constructor is declared with the same name
as the class followed by parenthesis '()'. Constructor is used to initialize the variables at the time of object creation.
 */

class Student(val name: String, var id: Int)

fun main() {
    val student = Student("Halil", 34)

    println("Name = ${student.name}")
    println("Id = ${student.id}")
}