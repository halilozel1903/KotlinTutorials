
/*

Do-while : While döngüsüne benzemektedir.
Tek farkı ilk önce koşula bakılmadan ilk adım yapılıyor sonrada artık koşul içindeki işlemlere bakılıyor.

Sytanx :

do {
   // codes inside body of do while loop
} while (testExpression);

 */

fun main(args: Array<String>) {

    // Example - 1

    var i = 6 // i değerini tanımladık.
    do {
        println(i) // i değerini ekrana yazdır.
        i++ // i değerini arttır.
    }
    while (i<=5); // i değeri 5'e eşit veya  5 ten küçükse



    // Example - 2

    var j = 1 // j değerini tanımladık.
    do {
        println(j) // koşula bakmadan ilk işlem yapılıyor.
        j++ // j değerini arttır.
    }
    while (j<=5); // koşul devam ettikçe işlemleri yap.


}