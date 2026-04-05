package modern2026

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
private data class LessonCard(
    val id: Int,
    val topic: String,
    val level: String,
    val minutes: Int
)

private val json = Json {
    prettyPrint = true
    ignoreUnknownKeys = true
}

fun lessonSerialization2026() {
    println()
    println("[Lesson] Serialization")

    val card = LessonCard(
        id = 1,
        topic = "Coroutines + Flow",
        level = "Intermediate",
        minutes = 45
    )

    val encoded = json.encodeToString(LessonCard.serializer(), card)
    println("Encoded JSON:")
    println(encoded)

    val decoded = json.decodeFromString(LessonCard.serializer(), encoded)
    println("Decoded object: $decoded")
}

fun main() {
    lessonSerialization2026()
}
