package modern2026

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class Modern2026SmokeTest {

    @Test
    fun `email value class validates valid format`() {
        val result = Email.of("learner@kotlin.dev")
        assertTrue(result.isSuccess)
        assertEquals("learner@kotlin.dev", result.getOrThrow().value)
    }

    @Test
    fun `email value class rejects invalid format`() {
        val result = Email.of("invalid-email")
        assertTrue(result.isFailure)
    }

    @Test
    fun `email value class trims whitespace`() {
        val result = Email.of("  ada@kotlin.dev  ")
        assertEquals("ada@kotlin.dev", result.getOrThrow().value)
    }

    @Test
    fun `sealed screen states stay exhaustive`() {
        val labels = listOf(
            ScreenState.Idle,
            ScreenState.Loading,
            ScreenState.Content("Kotlin 2.4"),
            ScreenState.Failure("Timeout")
        ).map { state ->
            when (state) {
                ScreenState.Idle -> "Idle"
                ScreenState.Loading -> "Loading..."
                is ScreenState.Content -> "Content: ${state.title}"
                is ScreenState.Failure -> "Error: ${state.reason}"
            }
        }

        assertEquals(4, labels.size)
        assertTrue(labels.last().startsWith("Error"))
    }
}
