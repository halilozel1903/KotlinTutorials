
// in : operatörü bir dizinin ya da yapının içinde herhangi bir eleman bulunuyor mu onu kontrol edilir.
// string bir metod olan contains ile aynı işlevi yapmaktadır.

fun main(args: Array<String>) {

    val numbers = intArrayOf(1, 4, 42, -3) // int türünde değerler içeren bir yapı

    if (4 in numbers) { // numbers içinde 4 var mı acaba ?
        println("numbers array contains 4") // 4 bulunduğu ile ilgili mesajı yazdırıyoruz

    }

}