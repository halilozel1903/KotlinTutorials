fun main() {

    val mapOne = mapOf<Int, String>(7 to "Ricardo Quaresma", 34 to "Hugo Almeida", 31 to "Simao Sabrosa")
    println("map-1: ${mapOne[34]}")

    val mapTwo = hashMapOf<Double, Boolean>(19.93 to true, 19.97 to false, 19.95 to true)
    val mapFour = hashMapOf<String, Boolean>()
    println(mapTwo.contains(19.95))
    println(mapFour.contains("Halil"))
    mapFour.clear()
    println(mapFour)

    for (entity in mapTwo) {
        println(entity)
    }

    val mapYears = mutableMapOf<Char, Int>()

    mapYears.put('b', 2015)
    mapYears.put('j', 2016)
    mapYears.put('k', 2021)

    println(mapYears)
}