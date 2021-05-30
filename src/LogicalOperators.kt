
/*

&& and(ve) : true - true koşulu için true değeri döndürür. Geri kalan işlemler için false döndürür.

|| or(veya) : false -  false koşulu için false değeri döndürür. Geri kalan işlemler için true döndürür.

 */


fun main(args: Array<String>) {


    val a = true

    val b = true

    println(a&&b) // true - true : true
    println(!a&&b) // false - true : false
    println(a&&!b) // true - false : false
    println(!a&&!b) // false - false : false

    println("------------------------------")

    println(a||b) // true - true : true
    println(!a||b) // false - true : true
    println(a||!b) // true - false : true
    println(!a||!b) // false - false : false


}