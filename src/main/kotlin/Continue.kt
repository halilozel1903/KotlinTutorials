


/*

    Continue : Döngü yine çalışmaya devam eder. Ancak belirli bir şart sağlandığında, döngü içinde
    bulunan sonraki satırlara geçmeden döngü başa gider. Bazı değerleri çalıştırır.
 */




fun main() {

    for (i in 1..10){ // i 1'den 10'a kadar dön

        if (i == 8){ // i değeri 8 ise

            continue // 8 değerini geç
        }

        println(i) // elemanları ekranda göster.
    }


    for (char in "Halil&İbrahim"){ // string türde bir ifade kadar dön

        if (char == '&'){ // bu karakter varsa

            print(" ") // boşluk bırak

            continue //o kısmı atla devam et
        }

        print(char) // çıktıyı ekranda bastır.
    }

}