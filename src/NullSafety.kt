fun main(args: Array<String>) {

    val name : String ? = null // name değişkeni String veya null da olabilir.

    println(name) // null değer dönderir.

    println(name?.length) // güvenli bir şekilde ekranda gösterme içerisinde null olabilir diye belirttik.

    // println(name!!.length)  null olup olmaması önmeli değil kullanımıdır. Null Pointer Exception fırlatır.


    var sayi : Int? // int türünde ama null değerde olabilir.
    sayi = 10
    println(sayi) // sayi değeri ekranda gösterildi.

    sayi = null // int türündeki değişkene null değer atandı.
    println(sayi) // sayi değeri ekranda gçsterdik.
    println(sayi.toString().length) // sayi değerini stringe dönüştür ve uzunluğunu bul

}