
// Tip dönüşümleri

/*

   Kotlin'de, bir türün sayısal değeri, diğer tür daha büyük olduğunda bile otomatik olarak başka bir türe dönüştürülmez.
   Bu durum Javada daha farklı bir durumdur.

    */

fun main(args: Array<String>) {

    /*

    Java da,

    int number1 = 55;
    long number2 = number1;

     Burada, int türünün number1 değeri otomatik olarak uzunluğuna dönüştürülür ve değişken number2'ye atanır.

     */


    //val number1: Int = 55
    //val number2: Long = number1   // Error: type mismatch.


    /*

    Long'un boyutu Int'ten büyük olsa da, Kotlin otomatik olarak Int'ten Long'a dönüşmez.

    Bunun yerine, toLong () öğesini  kullanmanız gerekir.
    Kotlin, sürprizlerden kaçınmak ve  tip güvenliği için yapıyor.

    */

    val number1: Int = 55 // int türünde bir değişken tanımlandı.
    val number2: Long = number1.toLong() // number1 değişkenini toLong() metodu yardımıyla long türüne dönüştürdük.
    println(number2) // dönüştürülen değişken ekranda gösterildi.


    /*

    Kotlin'de tip dönüşümü için kullanılan işlevlerin listesi:

    toByte()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

    Bool türler için dönüştürme yoktur.

    Büyük tipten daha küçük tipe dönüşüm vardır.

    Bu dönüşümde değer kaybı olmaktadır.

     */


    val number_1: Int = 545344 // int türünde bir değişken
    val number_2: Byte = number_1.toByte() // int türündeki değişken byte türüne dönüştürülüyor.
    println("number_1 = $number_1") // 545344
    println("number_2 = $number_2") // 64


}