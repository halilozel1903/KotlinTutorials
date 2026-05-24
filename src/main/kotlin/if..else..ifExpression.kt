fun main() {


    // Positive / negative number check

    val number = 58 // Example input value.

    val result = if (number > 0) // If number is greater than 0
        "positive number"
    else if (number < 0) // If number is less than 0
        "negative number"
    else // Otherwise number is 0
        "zero"

    println("number is $result") // Print evaluation result.


    // University letter grade example


    print("Enter midterm grade: ") // Request midterm grade.

    val midterm = readLine()!!.toDouble() // Read as Double.

    print("Enter final grade: ") // Request final grade.

    val finalExam = readLine()!!.toDouble() // Read as Double.

    val average = (midterm * 0.4) + (finalExam * 0.6) // Weighted average.

    val letterGrade = if (average >= 70)
        "AA"
    else if (average < 70 || average >= 60)
        "BB"
    else if (average < 60 || average >= 50)
        "CC"
    else if (average < 50 || average >= 40)
        "DD"
    else
        "FF"

    println("Average: $average") // Print weighted average.
    println("Result: $letterGrade") // Print letter grade.

}