

fun main() {

    for (i in 1..10) {

        if (i == 8) {

            continue
        }

        println(i)
    }

    for (char in "Halil&Ibrahim") {

        if (char == '&') {

            print(" ")

            continue
        }

        print(char)
    }

}