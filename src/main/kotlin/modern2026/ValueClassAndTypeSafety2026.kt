package modern2026

@JvmInline
value class Email private constructor(val value: String) {
    companion object {
        fun of(raw: String): Result<Email> {
            val normalized = raw.trim()
            return if ('@' in normalized && normalized.substringAfter('@').contains('.')) {
                Result.success(Email(normalized))
            } else {
                Result.failure(IllegalArgumentException("Invalid email format"))
            }
        }
    }
}

private data class User(val name: String, val email: Email)

fun lessonValueClassAndTypeSafety2026() {
    println("\n[Lesson] Value class + type safety")

    Email.of("developer@kotlinlang.org")
        .map { User(name = "Halil", email = it) }
        .onSuccess { println("User created: ${it.name} -> ${it.email.value}") }
        .onFailure { println("Validation failed: ${it.message}") }

    Email.of("invalid-email")
        .onFailure { println("Rejected: ${it.message}") }
}

fun main() {
    lessonValueClassAndTypeSafety2026()
}
