

fun mix(x: Int): Int {

    return x
}

fun mix(x: Int, y: Int): Int {

    return x + y
}

fun mix(x: Int, y: Int, z: Int): Int {

    return x + y + z
}

fun main() {

    println("mix(x):" + mix(10))
    println("10+20 : " + mix(10, 20))
    println("10+20+30 :" + mix(10, 20, 30))
}