/*
 Sealed yapilar, durum modellemesini kapali bir hiyerarsi ile yapar.
 Boylece when kullaniminda tum olasiliklar compile-time'da zorunlu hale gelir.
 */

sealed class UiState {
    data object Idle : UiState()
    data object Loading : UiState()
    data class Success(val message: String) : UiState()
    data class Error(val reason: String) : UiState()
}

fun render(state: UiState): String =
    when (state) {
        UiState.Idle -> "State: Idle"
        UiState.Loading -> "State: Loading"
        is UiState.Success -> "State: Success -> ${state.message}"
        is UiState.Error -> "State: Error -> ${state.reason}"
    }

fun main() {
    val states = listOf(
        UiState.Idle,
        UiState.Loading,
        UiState.Success("Data loaded"),
        UiState.Error("Network timeout")
    )

    states.forEach { println(render(it)) }
}

