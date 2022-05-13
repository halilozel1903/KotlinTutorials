/*
Değişkenlerde olduğu gibi atama operatörü ile metoda bir değer atanmıştır.
Metot çağrıldığında yaş bilgisi ekrana yazılır.
 */

fun myAge() = 21

fun main() {


    //metod çağrıldı.
    println("My Age : ${myAge()}")


    println("Main metodu")
    showMessage() // fonksiyon çağırımı


    sumFun() // metodu çağır


    print("mesaj yazınız : ") // mesaj yazınız bildirimi
    val message: String = readLine()!! // kullanıcıdan değer al
    showMessage(message) // alınan değeri metoda yolla


    print("1. sayıyı giriniz : ") // 1. sayıyı al
    val number1: Double = readLine()!!.toDouble()

    print("2.sayıyı giriniz : ") // 2. sayıyı al
    val number2: Double = readLine()!!.toDouble()

    val sum: Double = sumComingNumbers(number1, number2) // girilen değerleri metoda yolladık.

    println("sayıların toplamı :" + sum) // toplam değerini yazdır.


}


// Parametre almayan metotlar


fun showMessage(): Unit {

    println("Merhaba bu ilk fonksiyon")

}


// sumFun() 1 ile 10 arasındaki sayıların toplamını bulan ve ekrana yazdıran parametre almayan bir metoddur.

fun sumFun(): Unit {

    var sum = 0 // toplam değeri için değişken tanımlandı.

    for (i in 1..10) { // for loop ile toplanacak sayı değerlerini topladık
        sum += i
    }

    println("sayıların toplamı : $sum") // toplam değeri yazdır.

}


// Parametre alan metodlar

fun showMessage(commingMessage: String): Unit {

    println(commingMessage) // yollanan değeri ekranda yazdır.

}


// double tipinde x ve y değerleri tanımlanmıştır. metot return olarak Double tipinde bir değer döndürür.
fun sumComingNumbers(x: Double, y: Double): Double {

    return x + y // gelen x ve y değerleri toplanıp return ile gönderilir.
}

