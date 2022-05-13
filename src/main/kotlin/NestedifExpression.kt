/*

İç içe if kullanımı birçok yerde bizlere kolaylık sağlıyor. Örneğin 3 adet sayıyı karşılaştırma
işleminde rahatlıkla iç içe if else kullanıp sonucu elde edebiliri.
 */

fun main() {

    val n1 = 3
    val n2 = 5
    val n3 = -2

    val max = if (n1 > n2) { // n1 değeri n2 değerinden büyükse
        if (n1 > n3) // n1 değeri n3 değerinden büyükse
            n1 // n1 max değerdir.
        else // yoksa
            n3 // n3 değeri maximumdur.
    } else { // n2 değeri n1 değerinden büyükse
        if (n2 > n3) // n2 değeri n3 değerinden büyükse
            n2 // n2 değeri max
        else // n3 değeri n2 den büyükse
            n3 // n3 değeri maximum
    }

    println("max = $max") // sonuç değeri ekranda gösteriliyor.

}