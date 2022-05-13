/*
    Range : Türkçe Aralık anlamındadır.
    Örnek verirsek elimizde bir değer var ve bu değerin belirttiğimiz aralıkta mı yoksa değil mi ?
    onun cevabını kolayca bulmamız için geliştirilmiş bir yapıdır.

 */

fun main() {

    var sayilar = 1..20 // 1 den 20 ye kadar ileri
    var adanZye = 'a'..'z'  // z den a ya kadar ileri

    var sayilarTersten = 20..1 // 20 den 1 e kadar geriye
    var harfleTersten = 'z'..'a' // z den a ya kadar geriye


    var oneToTwenty = 1.rangeTo(20) // 1 den 20 ye kadar

    var oneToTwentyReverse = 20.downTo(1) // 20 den geriye doğru  aralık büyükten küçüğe doğru ise kullanılır.


    var beserBeserSayilar = 0.rangeTo(100).step(5) // 5 er 5 er 100'e kadar


    var beserBeserSayilarReverse = 100.rangeTo(5).step(5) // 5 er 5 er 100'e kadar

    println(beserBeserSayilar.first) // ilk elemanı
    println(beserBeserSayilar.last) // son elemanı
    println(beserBeserSayilar.step) // kaçar kaçar işlem yapılıyor.

    for (i in 1 until 5) { // until : 1 den 5 e kadar anlamında kullanılır. (..) yerine kullanılabilir.

        println(i) // ekranda i değerleri gösterildi.
    }


}