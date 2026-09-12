/**
 * Demonstrates primary constructors, `init` blocks, and secondary constructors.
 *
 * A primary constructor is part of the class header; `init` blocks run in
 * declaration order when an instance is created.
 */
class Student(val name: String, var id: Int) {

    init {
        require(id > 0) { "Student id must be positive" }
    }

    constructor(name: String) : this(name, DEFAULT_ID)

    companion object {
        const val DEFAULT_ID = 1
    }
}

fun lessonConstructor() {
    val student = Student("Halil", 34)
    println("Name = ${student.name}")
    println("Id = ${student.id}")

    val guest = Student("Guest")
    println("Guest id = ${guest.id}")

    val invalid = runCatching { Student("Broken", -1) }
    println("Invalid student rejected: ${invalid.exceptionOrNull()?.message}")
}

fun main() {
    lessonConstructor()
}
