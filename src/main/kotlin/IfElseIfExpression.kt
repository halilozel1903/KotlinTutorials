/**
 * Demonstrates `if / else if / else` as both a statement and an expression.
 */
fun lessonIfElseIfExpression() {
    val number = 58
    val signDescription = if (number > 0) {
        "positive number"
    } else if (number < 0) {
        "negative number"
    } else {
        "zero"
    }
    println("The value is a $signDescription")

    print("Enter midterm grade: ")
    val midterm = readlnOrNull()?.toDoubleOrNull()

    print("Enter final grade: ")
    val finalExam = readlnOrNull()?.toDoubleOrNull()

    if (midterm == null || finalExam == null) {
        println("Invalid input. Please enter numeric values.")
        return
    }

    val average = (midterm * 0.4) + (finalExam * 0.6)
    val letterGrade = when {
        average >= 70 -> "AA"
        average >= 60 -> "BB"
        average >= 50 -> "CC"
        average >= 40 -> "DD"
        else -> "FF"
    }

    println("Average: $average")
    println("Letter grade: $letterGrade")
}

fun main() {
    lessonIfElseIfExpression()
}
