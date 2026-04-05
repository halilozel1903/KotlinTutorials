package modern2026

private data class Profile(val id: Int, val fullName: String, val city: String)

private fun loadProfile(id: Int): Result<Profile> =
    runCatching {
        require(id > 0) { "Profile id must be positive" }
        Profile(id = id, fullName = "Ada Lovelace", city = "London")
    }

fun lessonResultAndScopeFunctions2026() {
    println("\n[Lesson] Result + scope functions")

    listOf(1, 0).forEach { profileId ->
        loadProfile(id = profileId)
            .map { it.copy(fullName = it.fullName.uppercase()) }
            .onSuccess {
                it.let { profile ->
                    println("Profile loaded: ${profile.id} - ${profile.fullName} (${profile.city})")
                }
            }
            .onFailure { println("Load error: ${it.message}") }
    }
}

fun main() {
    lessonResultAndScopeFunctions2026()
}

