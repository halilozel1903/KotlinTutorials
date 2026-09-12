/**
 * Demonstrates data classes.
 *
 * A `data class` generates `equals`, `hashCode`, `toString`, `copy`, and
 * `componentN` functions from the properties declared in its primary constructor.
 */
fun lessonDataClass() {
    val player = Player(34, "Halil Ozel", "Besiktas JK")
    println("Player's Name: ${player.name} -> Team: ${player.team} -> Number: ${player.number}")
    println(player)

    val transferred = player.copy(team = "Fenerbahce")
    println("Copied: $transferred")
    println("Equal: ${player == Player(34, "Halil Ozel", "Besiktas JK")}")

    val (number, name, team) = player
    println("Destructured -> $number / $name / $team")
}

fun main() {
    lessonDataClass()
}
