fun main() {


    // Pozitif - Negatif Sayı Bulma

    val number = 58 // number değişken tanımı

    val result = if (number > 0) // number 0 dan büyükse
        "positive number"  // pozitif
    else if (number < 0) // number 0 dan küçükse
        "negative number" // negatif
    else // ya da başka bir değere eşitse yani 0'a eşitse
        "zero" // sıfır

    println("number is $result") // sonucun ne olduğu ekranda gösteriliyor.


    // Üniversite harf notu hesaplama örneği


    print("Vize notunuz :") // vize notu isteniyor.

    val vize = readLine()!!.toDouble() // vize notu double türde alınıyor.

    print("Final notunuz :") // final notu isteniyor.

    val final = readLine()!!.toDouble() // final notu double türde alınıyor.

    val ortalama = (vize * 0.4) + (final * 0.6) // ortalama hesabı yapılıyor.

    val sonuc = if (ortalama >= 70) //eğer ortalama 70'e eşit ve üstü ise
        "AA"
    else if (ortalama < 70 || ortalama >= 60) // ortalama 70 den küçük veya 60 a eşit ve büyükse
        "BB"
    else if (ortalama < 60 || ortalama >= 50) // ortalama 60 dan küçük veya 50 ye eşit ve büyükse
        "CC"
    else if (ortalama < 50 || ortalama >= 40) // ortalama 50 den küçük veya 40 a eşit ve büyükse
        "DD"
    else // farklı bir değerde ise
        "FF"

    println("Ortalama : " + ortalama) // ortalama değeri
    println("Sonuc : $sonuc") // sonuc değeri

}