/**
While döngüsü, programın bir bölümünü birkaç kez yinelemek için kullanılır.
Döngü, koşul doğru olana kadar kod bloğunu yürütür.

Syntax

while (testExpression) {
    // while döngüsünün içindeki kodlar
}
 */


fun main() {
    var i = 1 // i değeri verildi.

    while (i <= 5) { // i 5'e eşit veya 5 ten küçük olana kadar
        println("$i") // i değerini yazdır.
        ++i // önden arttırım
    }

    // 0 dan 10 'a kadar olan sayıların toplamını bulan program
    var sum = 0 // toplama değişkeni tanımlandı.
    var j = 10 // j değeri verildi.

    while (j != 0) { // j değeri 0 dan farklı ise
        sum += j     // sum = sum + j; // sum ile j değerini topla
        --j // j değerini azalt ve döngüye devam et
    }
    println("sum = $sum") // toplam değerini yazdır.
}