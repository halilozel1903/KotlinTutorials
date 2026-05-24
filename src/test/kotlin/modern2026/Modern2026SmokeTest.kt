package modern2026
import kotlin.test.Test
import kotlin.test.assertTrue
class Modern2026SmokeTest {
    @Test
    fun `email value class validates valid format`() {
        val result = Email.of("learner@kotlin.dev")
        assertTrue(result.isSuccess)
    }
    @Test
    fun `email value class rejects invalid format`() {
        val result = Email.of("invalid-email")
        assertTrue(result.isFailure)
    }
}
