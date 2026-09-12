/**
 * Central lesson runner for the tutorial project.
 *
 * Usage:
 * ```
 * ./gradlew run --args='list'
 * ./gradlew run --args='run variables'
 * ./gradlew runAllLessons
 * ```
 */
private data class LessonEntry(
    val key: String,
    val title: String,
    val estimatedMinutes: Int,
    val interactive: Boolean,
    val run: () -> Unit,
)

private val lessons = listOf(
    LessonEntry("hello-world", "Hello World", 3, false, ::lessonHelloWorld),
    LessonEntry("variables", "Variables", 8, false, ::lessonVariables),
    LessonEntry("basic-types", "Basic Types", 10, false, ::lessonBasicTypes),
    LessonEntry("type-conversion", "Type Conversion", 8, false, ::lessonTypeConversion),
    LessonEntry("arithmetic", "Arithmetic Operators", 8, false, ::lessonArithmeticOperators),
    LessonEntry("assignment", "Assignment Operators", 6, false, ::lessonAssignmentOperators),
    LessonEntry("comparison", "Comparison & Equality", 8, false, ::lessonComparisonEqualityOperators),
    LessonEntry("logical", "Logical Operators", 6, false, ::lessonLogicalOperators),
    LessonEntry("inc-dec", "Increment / Decrement", 5, false, ::lessonIncrementDecrementOperators),
    LessonEntry("input-output", "Input / Output", 8, true, ::lessonInputOutput),
    LessonEntry("if-expression", "If Expression", 8, false, ::lessonIfExpression),
    LessonEntry("if-else-if", "If / Else If", 12, true, ::lessonIfElseIfExpression),
    LessonEntry("nested-if", "Nested If", 6, false, ::lessonNestedIfExpression),
    LessonEntry("when", "When Expression", 12, true, ::lessonWhen),
    LessonEntry("for-loop", "For Loop", 10, false, ::lessonForLoop),
    LessonEntry("while-loop", "While Loop", 8, false, ::lessonWhileLoop),
    LessonEntry("do-while", "Do-While Loop", 6, false, ::lessonDoWhileLoop),
    LessonEntry("range", "Ranges", 10, false, ::lessonRange),
    LessonEntry("break", "Break", 6, false, ::lessonBreak),
    LessonEntry("continue", "Continue", 6, false, ::lessonContinue),
    LessonEntry("in-operator", "In Operator", 5, false, ::lessonInOperator),
    LessonEntry("arrays", "Arrays", 10, false, ::lessonArrays),
    LessonEntry("map", "Maps", 10, false, ::lessonMap),
    LessonEntry("null-safety", "Null Safety", 10, false, ::lessonNullSafety),
    LessonEntry("functions", "Functions", 12, true, ::lessonFunctions),
    LessonEntry("method-overloading", "Method Overloading", 8, false, ::lessonMethodOverloading),
    LessonEntry("multiform", "Multiform Function", 6, false, ::lessonMultiformFunction),
    LessonEntry("recursive", "Recursive Function", 8, false, ::lessonRecursiveFunction),
    LessonEntry("infix", "Infix Function", 7, false, ::lessonInfixFunction),
    LessonEntry("extension", "Extension Function", 8, false, ::lessonExtensionFunction),
    LessonEntry("top-level", "Top-Level Methods", 6, false, ::lessonTopLevelMethod),
    LessonEntry("global-local", "Global vs Local Variables", 7, false, ::lessonGlobalLocalVariables),
    LessonEntry("class-objects", "Class and Objects", 10, false, ::lessonClassObjects),
    LessonEntry("constructor", "Constructors", 8, false, ::lessonConstructor),
    LessonEntry("getters-setters", "Getters & Setters", 8, false, ::lessonGettersSetters),
    LessonEntry("visibility", "Visibility Modifiers", 8, false, ::lessonVisibilityModifiers),
    LessonEntry("inheritance", "Inheritance", 10, false, ::lessonInheritance),
    LessonEntry("abstract-class", "Abstract Class", 8, false, ::lessonAbstractClass),
    LessonEntry("interface", "Interfaces", 8, false, ::lessonInterface),
    LessonEntry("nested-class", "Nested Class", 8, false, ::lessonNestedClass),
    LessonEntry("inner-class", "Inner Class", 8, false, ::lessonInnerClass),
    LessonEntry("data-class", "Data Class", 8, false, ::lessonDataClass),
    LessonEntry("sealed-class", "Sealed Class", 8, false, ::lessonSealedClass),
    LessonEntry("companion", "Companion Object", 7, false, ::lessonCompanionObject),
    LessonEntry("operator-overloading", "Operator Overloading", 10, false, ::lessonOperatorOverloading),
)

private fun printLessonList() {
    println("Available lessons:")
    lessons.forEach {
        val mode = if (it.interactive) "interactive" else "non-interactive"
        println("- ${it.key.padEnd(22)} | ${it.title.padEnd(28)} | ${it.estimatedMinutes} min | $mode")
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

private fun runAllNonInteractive() {
    val batch = lessons.filterNot { it.interactive }
    println("Running ${batch.size} non-interactive lessons...")
    batch.forEach { lesson ->
        println()
        println("======== ${lesson.title} ========")
        lesson.run()
    }
}

fun lessonRunnerMain(args: Array<String>) {
    when {
        args.isEmpty() || args[0] == "list" -> printLessonList()
        args[0] == "run-all" -> runAllNonInteractive()
        args[0] == "run" && args.size == 2 -> runLesson(args[1])
        else -> {
            println("Usage: list | run <lesson-key> | run-all")
            printLessonList()
        }
    }
}

fun main(args: Array<String>) {
    lessonRunnerMain(args)
}
