package modern2026

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking

private suspend fun fetchProfileName(): String {
    delay(150)
    return "Halil"
}

private suspend fun fetchProfileScore(): Int {
    delay(200)
    return 98
}

private fun scoreStream(): Flow<Int> = flow {
    for (score in listOf(40, 60, 75, 90, 100)) {
        delay(50)
        emit(score)
    }
}

private suspend fun loadProfileSummary(): String = coroutineScope {
    val nameDeferred = async { fetchProfileName() }
    val scoreDeferred = async { fetchProfileScore() }
    return@coroutineScope "${nameDeferred.await()} - score ${scoreDeferred.await()}"
}

fun lessonCoroutinesFlow2026() = runBlocking {
    println()
    println("[Lesson] Coroutines + Flow")

    val summary = loadProfileSummary()
    println("Structured concurrency result: $summary")

    val strongScores = scoreStream().map { it + 5 }.toList()
    println("Flow collected scores: $strongScores")
}

fun main() {
    lessonCoroutinesFlow2026()
}
