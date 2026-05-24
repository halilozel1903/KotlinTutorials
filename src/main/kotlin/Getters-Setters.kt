/**
 * Demonstrates an explicit getter/setter definition for a mutable property.
 *
 * Kotlin generates default accessors automatically, but custom accessors are
 * useful when you need validation or transformation logic.
 */
var author: String = "Frank Herbert"
    get() = field
    set(value) {
        field = value.trim()
    }
