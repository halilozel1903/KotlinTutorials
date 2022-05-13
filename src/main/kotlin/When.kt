/*

when yapısı Javada kullanılan switch-case yapısına benzemektedir.
Daha esnek bir yapıya sahip olan When ile daha kolay şartları yapabileceksiniz.

 */

fun main() {


    val a = 12
    val b = 5

    print("Enter operator either +, -, * or / : ") // istenilen işlem ile ilgili seçeneği seçiliyor.

    val operator = readLine() // seçilen operatör okunuyor.

    val result = when (operator) {
        "+" -> a + b // + ise : toplama işlemi
        "-" -> a - b // - ise : çıkarma işlemi
        "*" -> a * b // * ise : çarpma işlemi
        "/" -> a / b // / ise : bölme işlemi
        else -> "$operator operator is invalid operator." // başka bir karakter girilirse
    }

    println("result = $result") // sonuç ekranda gösteriliyor.


    // Birden fazla değere sahip ifadenin içeriğinde bulunup bulunmamasına bakılıyor.

    val n = -1 // değişken tanımlandı.

    when (n) { // n değeri
        1, 2, 3 -> println("n is a positive integer less than 4.") // 1,2,3 den biriyse
        0 -> println("n is zero") // n 0 dır.
        -1, -2 -> println("n is a negative integer greater than 3.") // -1,-2 ise negatif
    }


    // range(aralık) belirtilerekde kullanılabilir.

    val j = 100 // j değişkenine 100 değeri atandı.

    when (j) { // j değeri
        in 1..10 -> println("A positive number less than 11.") // 1 ile 10 arasında ise
        in 10..100 -> println("A positive number between 10 and 100 (inclusive)") // 10 ile 100 arasında ise
    }


}