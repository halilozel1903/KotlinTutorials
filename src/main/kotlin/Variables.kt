/*

Kotlin has two variable keywords:
`var` and `val`.

`var` is used for mutable values.

`val` is used for read-only values.

`val` is conceptually similar to Java's `final` reference.


 */


fun main() {

    val name: String // Declare a variable named `name`.

    name = "Halil" // Assign a String value.

    println("My name is :$name") // Print the value of `name`.

    val pi: Double = 3.14 // Declare a `Double` value named `pi`.

    println("pi :$pi") // Print the value of `pi`.

    /*

    Kotlin does not always require explicit type declarations.
    The compiler can infer the type from the assigned value.

    Java: String name = "Name"

    Kotlin: var name = "Name"

    Common declaration styles:

    1 - var name = "Name" // Type is inferred automatically.

    2 - var name : String // Declare type first, assign later.
        name = "Name"

    3 - var name : String = "Name"  // Declare type and value on one line.
     */
}