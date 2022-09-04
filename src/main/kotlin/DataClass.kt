/**
Kotlin has introduced the concept of Data Class, whose main purpose is to simply hold data without the
boilerplate code needed in Java to create a POJO Class. Kotlin’s solution enables us to avoid writing getters, setters,
equals, and hashCode methods, so it makes the model classes cleaner & more readable.

 */

fun main() {
    val player = Player(34, "Halil Ozel", "Besiktas JK")

    println("Player's Name: ${player.name} -> Team: ${player.team} -> Number: ${player.number}")
}