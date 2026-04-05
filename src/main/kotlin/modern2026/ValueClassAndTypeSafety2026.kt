package modern2026

@JvmInline
value class Email private constructor(val value: String) {
    companion object {
        fun of(raw: String): Result<Email> =
            if ('@' in raw && raw.length >= 5) {
                Result.success(Email(raw.trim()))
            } else {
                Result.failure(IllegalArgumentException("Invalid email format"))
            }
    }
}

private data class User(val name: String, val email: Email)

fun lessonValueClassAndTypeSafety2026() {
    println("\n[Lesson] Value class + type safety")

    val maybeEmail = Email.of("developer@kotlinlang.org")
    maybeEmail
        .map { User(name = "Halil", email = it) }
        .onSuccess { println("User created: ${it.name} -> ${it.email.value}") }
        .onFailure { println("Validation failed: ${it.message}") }
}

fun main() {
    lessonValueClassAndTypeSafety2026()
}

