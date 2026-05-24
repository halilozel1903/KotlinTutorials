/**
 * Central lesson runner for the tutorial project.
 *
 * Usage examples:
 * - `./gradlew run --args='list'`
 * - `./gradlew run --args='run variables'`
 */
private data class LessonEntry(
    val key: String,
    val title: String,
    val estimatedMinutes: Int,
    val interactive: Boolean,
    val run: () -> Unit,
)

private val lessons = listOf(
    LessonEntry("variables", "Variables", 8, false, ::lessonVariables),
    LessonEntry("arithmetic", "Arithmetic Operators", 8, false, ::lessonArithmeticOperators),
    LessonEntry("range", "Ranges", 10, false, ::lessonRange),
    LessonEntry("for-loop", "For Loop", 10, false, ::lessonForLoop),
    LessonEntry("while-loop", "While Loop", 8, false, ::lessonWhileLoop),
    LessonEntry("do-while", "Do-While Loop", 6, false, ::lessonDoWhileLoop),
    LessonEntry("in-operator", "In Operator", 5, false, ::lessonInOperator),
    LessonEntry("null-safety", "Null Safety", 10, false, ::lessonNullSafety),
    LessonEntry("infix", "Infix Function", 7, false, ::lessonInfixFunction),
    LessonEntry("operator-overloading", "Operator Overloading", 10, false, ::lessonOperatorOverloading),
    LessonEntry("class-objects", "Class and Objects", 10, false, ::lessonClassObjects),
    LessonEntry("nested-class", "Nested Class", 8, false, ::lessonNestedClass),
    LessonEntry("global-local", "Global vs Local Variables", 7, false, ::lessonGlobalLocalVariables),
    LessonEntry("inc-dec", "Increment / Decrement", 5, false, ::lessonIncrementDecrementOperators),
    LessonEntry("functions", "Functions", 12, true, ::lessonFunctions),
    LessonEntry("if-else-if", "If / Else If", 12, true, ::lessonIfElseIfExpression),
    LessonEntry("when", "When Expression", 12, true, ::lessonWhen),
    LessonEntry("input-output", "Input / Output", 8, true, ::lessonInputOutput),
)

private fun printLessonList() {
    println("Available lessons:")
    lessons.forEach {
        val mode = if (it.interactive) "interactive" else "non-interactive"
        println("- ${it.key.padEnd(20)} | ${it.title.padEnd(24)} | ${it.estimatedMinutes} min | $mode")
    }
}

private fun runLesson(key: String) {
    val lesson = lessons.firstOrNull { it.key == key }
    if (lesson == null) {
        println("Unknown lesson key: $key")
        printLessonList()
        return
    }

    println("Running lesson: ${lesson.title}")
    lesson.run()
}

fun lessonRunnerMain(args: Array<String>) {
    when {
        args.isEmpty() || args[0] == "list" -> printLessonList()
        args[0] == "run" && args.size == 2 -> runLesson(args[1])
        else -> {
            println("Usage: list | run <lesson-key>")
            printLessonList()
        }
    }
}

fun main(args: Array<String>) {
    lessonRunnerMain(args)
}

