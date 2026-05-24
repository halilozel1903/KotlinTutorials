

fun main() {

    for (i in 1..10) {

        if (i == 8)
            break

        println(i)
    }

    for (char in "Halil&Ozel") {

        if (char == '&')
            break
        print(char)
    }
}