/**
 * Demonstrates maps: creation, lookup, iteration, and mutation.
 *
 * `mapOf` returns a read-only map, `mutableMapOf` a mutable one.
 */
fun lessonMap() {
    val squad = mapOf(7 to "Ricardo Quaresma", 34 to "Hugo Almeida", 31 to "Simao Sabrosa")
    println("map-1: ${squad[34]}")
    println("Missing key returns null: ${squad[99]}")
    println("With default: ${squad.getOrDefault(99, "Unknown")}")

    val availability = hashMapOf(19.93 to true, 19.97 to false, 19.95 to true)
    val emptyFlags = hashMapOf<String, Boolean>()
    println(19.95 in availability)
    println("Halil" in emptyFlags)
    emptyFlags.clear()
    println(emptyFlags)

    for ((key, value) in availability) {
        println("$key -> $value")
    }

    val years = mutableMapOf<Char, Int>()
    years['b'] = 2015
    years['j'] = 2016
    years['k'] = 2021
    println(years)

    println("Keys: ${squad.keys}")
    println("Filtered: ${squad.filterKeys { it > 10 }}")
    println("Mapped: ${squad.mapValues { (_, name) -> name.uppercase() }}")
}

fun main() {
    lessonMap()
}
