package modern2026

sealed interface ScreenState {
    data object Idle : ScreenState
    data object Loading : ScreenState
    data class Content(val title: String) : ScreenState
    data class Failure(val reason: String) : ScreenState
}

private fun render(state: ScreenState): String =
    when (state) {
        ScreenState.Idle -> "Idle"
        ScreenState.Loading -> "Loading..."
        is ScreenState.Content -> "Content: ${state.title}"
        is ScreenState.Failure -> "Error: ${state.reason}"
    }

fun lessonSealedAndDataObject2026() {
    println("\n[Lesson] Sealed + data object")

    val states = listOf(
        ScreenState.Idle,
        ScreenState.Loading,
        ScreenState.Content("Kotlin 2026"),
        ScreenState.Failure("Timeout")
    )

    states.forEach { println(render(it)) }
}

fun main() {
    lessonSealedAndDataObject2026()
}

