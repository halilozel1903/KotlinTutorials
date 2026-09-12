/**
 * Demonstrates explicit type conversion.
 *
 * Kotlin performs no implicit widening between numeric types: conversion is always
 * explicit, which makes truncation visible in the code.
 */
fun lessonTypeConversion() {
    val number1: Int = 55
    val number2: Long = number1.toLong()
    println(number2)

    val large: Int = 545_344
    val truncated: Byte = large.toByte()
    println("large = $large")
    println("truncated = $truncated")

    println("Double -> Int drops the fraction: ${9.99.toInt()}")
    println("Char -> code: ${'A'.code}, code -> Char: ${66.toChar()}")
    println("Parsed: ${"42".toIntOrNull()}")
    println("Unparsable: ${"forty two".toIntOrNull()}")
}

fun main() {
    lessonTypeConversion()
}
