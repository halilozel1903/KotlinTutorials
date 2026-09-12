/**
 * Demonstrates custom getters and setters.
 *
 * Kotlin generates accessors automatically; declare them explicitly only when you
 * need validation, transformation, or a computed value.
 */
class Book(title: String, var pageCount: Int) {

    var title: String = title.trim()
        set(value) {
            field = value.trim()
        }

    val readingMinutes: Int
        get() = pageCount * MINUTES_PER_PAGE

    var readCount: Int = 0
        private set

    fun markAsRead() {
        readCount++
    }

    private companion object {
        const val MINUTES_PER_PAGE = 2
    }
}

fun lessonGettersSetters() {
    val book = Book("  Dune  ", pageCount = 412)
    println("Title: '${book.title}'")

    book.title = "  Dune Messiah "
    println("Updated title: '${book.title}'")
    println("Reading minutes: ${book.readingMinutes}")

    book.markAsRead()
    book.markAsRead()
    println("Read count: ${book.readCount}")
}

fun main() {
    lessonGettersSetters()
}
