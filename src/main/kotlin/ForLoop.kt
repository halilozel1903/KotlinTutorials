
/*
    For Döngüsü : Belirli aralıklarla tekrar eden işlemleri çok kolay ve en az kod yazılacak şekilde kullanılır.

    Syntax :

    for (x in koleksiyon){
    // kodlar buraya yazılır.}

    - Döngüde belirtilen alana : dizi,liste,range veya string ifadeler gelebilir.

 */

fun main() {


    // 1 den 10'a kadar ekranda "We Love Kotlin" mesajı bastır.

    for (i in 1..10){

        println("We Love Kotlin")
    }




    // name değişkenine adımı yazdırıp onun karakterlerini ekranda tek tek gösteriyoruz.

    val name ="Halil İbrahim Özel" // name değeri verildi.

    for (ad in name){

        if (!ad.equals(name.last())){ // son eleman değilse
            print(ad+",") // name değerini virgüllerle ile yaz.
        }else{ // bu şartında dışında bir durumsa
            println(ad) // direkt name karakterlerini yaz
        }
    }



    // Bu örneğimizde array tanımlanıyor. Tanımlanan array değerlerini toplanıp sonucu ekranda gösteriliyor

    val sayilar = arrayOf(3,4,5,6) // array tanımı
    var toplam = 0 // toplam değişkeni

    for (num in sayilar){ // sayılar dizisinin içeriği kadar gez

        toplam += num // dizi elemanları toplanıyor.
    }

    println("Toplam : $toplam") // dizi içinde toplanan değerler ekranda gösteriliyor.



    // Son örneğimizde iç içe for döngülerinde 1 den 3'e kadar dönüp onların toplamını ekranda gösteriyoruz.

    for (i in 1..3){ // i değeri 1 den 3 kadar

        for (j in 1..3){ // j değeride 1 den 3 e kadar

            println("$i + $j = ${i+j}") // dıştaki for çalışıyor ve sonra içteki for'a girip işlemleri yapıyor.
            // Sonrada değerler yazdırılıyor.
        }
    }

}