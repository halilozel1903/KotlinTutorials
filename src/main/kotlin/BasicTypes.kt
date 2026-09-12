/**
 * Demonstrates Kotlin's basic types and their value ranges.
 *
 * Kotlin has no primitive/boxed distinction in source code: every value is an
 * object, and the compiler maps it to a JVM primitive whenever possible.
 */
fun lessonBasicTypes() {
    val range: Byte = 111
    println("Byte: $range (${Byte.MIN_VALUE}..${Byte.MAX_VALUE})")

    val temp: Short = 12345
    println("Short: $temp (${Short.MIN_VALUE}..${Short.MAX_VALUE})")

    val result: Int = 1_000_000
    println("Int: $result (${Int.MIN_VALUE}..${Int.MAX_VALUE})")

    val number = 1903
    println("Inferred Int: $number")

    val distance = 10_000_000_000
    println("Inferred Long: $distance")

    val score: Long = 9999
    val newValue = 100L
    println("Long: $score and $newValue")

    val examNote: Double = 99.9
    println("Double: $examNote")

    val coldValue: Float = -10F
    println("Float: $coldValue")

    var myNumber: Number = 1903
    println("Number as Int: $myNumber")
    myNumber = 19.03
    println("Number as Double: $myNumber")
    myNumber = 1903F
    println("Number as Float: $myNumber")
    myNumber = 1903L
    println("Number as Long: $myNumber")

    val character: Char = 'A'
    println("Char: $character (code ${character.code})")

    val state: Boolean = true
    println("Boolean: $state")

    val flags: UInt = 4_294_967_295u
    println("UInt: $flags")
}

fun main() {
    lessonBasicTypes()
}
