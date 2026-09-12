/**
 * Demonstrates sealed hierarchies.
 *
 * A sealed type has a closed set of subclasses known at compile time, which makes
 * `when` exhaustive: adding a new state turns into a compile error at every place
 * that has to handle it.
 */
sealed class UiState {
    data object Idle : UiState()
    data object Loading : UiState()
    data class Success(val message: String) : UiState()
    data class Error(val reason: String) : UiState()
}

fun renderUiState(state: UiState): String =
    when (state) {
        UiState.Idle -> "State: Idle"
        UiState.Loading -> "State: Loading"
        is UiState.Success -> "State: Success -> ${state.message}"
        is UiState.Error -> "State: Error -> ${state.reason}"
    }

fun lessonSealedClass() {
    val states = listOf(
        UiState.Idle,
        UiState.Loading,
        UiState.Success("Data loaded"),
        UiState.Error("Network timeout")
    )

    states.forEach { println(renderUiState(it)) }
}

fun main() {
    lessonSealedClass()
}
