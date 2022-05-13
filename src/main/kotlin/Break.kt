/*
  Break :   Döngüden çıkılmasını sağlayan bir komuttur.

 */



fun main() {


    for (i in 1..10) { // 1 den 10'a kadar dön

        if (i == 8) // i değeri 8'e eşitse
            break // kır ve döngüden çık

        println(i) // i değerlerini ekranda göster.
    }



    for (char in "Halil&Özel") { // String bir ifade

        if (char == '&') // bu karakteri gördüğünde
            break // kır ve döngüden çık
        print(char) // break olmadan önceki değeri ekranda göster
    }


}