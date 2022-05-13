fun main() {

    println("1. println "); // ln eki işlemi yap sonra alt satıra geç anlamında kullanılır.
    println("2. println ");

    print("1. print "); // print metodu ise işlemi yap herhangi bir atlama vs olmadan devam et
    print("2. print");


    val score = 99

    println("score") // score
    println(score) // 99
    println("score : $score") // score : 99
    println("$score") // 99
    println("score : $score") // score : 99

    /*

    Ekranda değeri göstermek için birden farklı yol bulunmaktadır :

    1- Direkt değişken değeri verilir

    2 - String ifade ile kullanıp daha sonra + işaretini koyup yanına değişken adı verilir.

    3 - Çift tırnaklar arasına $ işaretinin yanına değişken eklenir. Bu yöntem PHP ve Javascript dillerinde de mevcuttur.

    4- String ifadeler içinde hem değişken adı hem içeriği $ işareti ile kullanılarak yapılabilir.
     */


    // Kotlinde kullanıcıdan bir veri veya değer almak için readLine() metodu kullanılır.


    print("What is your name : ") // adını girmesi için bir soru soruldu.

    val name = readLine() // readLine metoduyla adını okunuyor

    println("My name is $name") // ekranda adı yazdırılıyor


    // Eğer alınan değer String bir ifadeden farklı ise readLine()!!.toX şeklinde kullanılır.
    // X yerine değişkenin türü : Int,Float,Double vs

    print("How old are you : ") // kaç yaşındasınız sorusu soruldu.
    val age = readLine()!!.toInt() // int türünde değer okuması yapıldı.
    println("I am $age years old") // okunan değer ekranda gösterildi.


}