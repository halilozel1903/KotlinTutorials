fun main() {

    println("1. println ");
    println("2. println ");

    print("1. print ");
    print("2. print");

    val score = 99

    println("score")
    println(score)
    println("score : $score")
    println("$score")
    println("score : $score")

    print("What is your name : ")

    val name = readLine()

    println("My name is $name")

    print("How old are you : ")
    val age = readLine()!!.toInt()
    println("I am $age years old")

}