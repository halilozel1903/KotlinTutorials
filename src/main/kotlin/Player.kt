/**
 * Simple data holder used by the data class lesson.
 *
 * Properties are declared as `val` so instances stay immutable; use `copy` to
 * create a modified version.
 */
data class Player(
    val number: Int,
    val name: String,
    val team: String
)
