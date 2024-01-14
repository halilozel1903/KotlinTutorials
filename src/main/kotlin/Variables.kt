/*

Kotlinde iki tip değişken bulunmaktadır.
Bunlar : var ve val

var : variable kelimesinden gelmektedir. Değişen değerler için kullanılır.

val : value kelimesinden gelmektedir. Değişmeyen ya da sabit değerler için kullanılır.

val değişkenin kullanımı Javada final kelimesine denk gelmektedir.


 */


fun main() {

    val name: String // name adında bir değişken tanımlandı.

    name = "Halil" // tanımlanan değişkene String türünde bir içerik atandı.

    println("My name is :$name") // name değişkeninin içeriğini ekranda gösterir.

    val pi: Double = 3.14 // pi adında Double türünde bir değişken tanımı yapılıp değeri atandı.

    println("pi :$pi") // pi değerini ekrana yazdırır

    /*

    Kotlin Java gibi değişken türünü illa belirteceksin gibi bir zorunluluğu kaldırmıştır.
    Kullanıcı ister türünü belirtir isterse belirtmez kod işlendiği anda hangi değişken
    türüne ait onu kendisi anlamaktadır.

    Java'da : String name = "Name"

    Kotlin'de : var name = "Name"

    Değişken tanımı yapılınca aşağıdaki gibi yollar izlenilebilir :

    1 - var name = "Name" // 1. adımda değişken tipini belirtmeden direkt kullanılacak yapı atanır.

    2 - var name : String // 2. adımda ise öncelikle değişken türünü belirtip daha sonra içerik atanabilir.
        name = "Name"

    3 - var name : String = "Name"  // 3. adımda tek satırda hem değişken türü hem de içeriği verilir.
     */
}