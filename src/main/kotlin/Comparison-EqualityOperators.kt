/*

>   : küçüktür
<   : büyüktür
>=  : büyük eşittir
<=	: küçük eşittir
==	: eşittir
!=  : eşit değildir.

 */


fun main() {
    val a = -12

    val b = 12

    // if kontrol yapısı sonraki derslerde anlatılacaktır.
    val max = if (a > b) { // eğer a b den büyükse
        println("a is larger than b.") // a b den daha büyüktür.
        a // ekrana a değeri ekrana basar.
    } else { // diğer durumlar için
        println("b is larger than a.") // b a dan daha büyüktür.
        b // ekrana b değeri ekrana basar.
    }

    println("max = $max") // max değeri ekranda yazdırılıyor.
}