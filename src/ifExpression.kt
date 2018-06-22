
// if : İngilizce eğer anlamına gelmektedir. Şart sözcüğüdür.
// Örneğin şu yaşındaysam ben gencim tarzında bir mesaj verdirilir.
// Farklı bir yaşta ise diğer bir şart ifadesi olan else devreye girer.


fun main(args: Array<String>) {


    val number = 10 // number değişkeni tanımlandı.

    val result = if (number > 0) { // eğer number 0 dan büyükse
        "Positive number" // pozitif
    } else { // eğer 0 dan farklı ise
        "Negative number" // negatif
    }

    println(result) // sonuç değeri yazdırıldı.


    

    val a = 9 // int türünde pozitif bir tam sayı tanımlandı.
    val b = -11 // negatif türde bir tam sayı tanımlandı.

    val max = if (a > b) { // eğer a b den büyükse
        println("$a is larger than $b.") // a b den büyüktür.
        println("max variable holds value of a.") // B max değişkeni
        a // 9
    } else { // farklı bir durumda ise
        println("$b is larger than $a.") // b a dan büyüktür.
        println("max variable holds value of b.") // A max değişkeni
        b // -11
    }
    println("max = $max") // max değeri ekranda gösterildi.


}