
/*
    Kotlin, Java gibi statik olarak yazılmış bir dildir.
    Yani, derleme zamanı sırasında bir değişkenin tipi bilinir.
 */


/*
    Kotlin'deki yerleşik tipler şu şekilde kategorize edilebilir:

    Numbers
    Characters
    Booleans
    Arrays

 */



/*

    Number Type

    Kotlin'deki sayılar Java'ya benzer.
    Sayıları temsil eden 6 yerleşik tip vardır :

    - Byte
    - Short
    - Int
    - Long
    - Float
    - Double

    */

fun main() {

    /*

    Byte

    Byte veri türü -128 ila 127 (8 bit imzalı ikili tamsayı) değerlerine sahip olabilir.
    Bir değişkenin değerinin [-128, 127] içinde olacağından emin olduğunda,
    belleği kaydetmek için Int veya diğer tamsayı veri türleri yerine kullanılır.

    */



    val range : Byte = 111 // byte türünde bir değişken tanımlandı.
    println("range : $range") // değişken değeri -128 ile 127 arasında bir değer olduğu için ekrana range değerini yazar

    // val rangeTwo : Byte = 133 Ya bunu toByte ile byte dönüştür ya da int tipine dönüştür




    /*

    Short

    Short veri tipi -32768 ile 32767 arasında değerlere sahip olabilir
    (16 bit imzalı iki tamamlayıcı tamsayı).
    Değişkenin değerinin [-32768, 32767] içinde olacağından emin olduğunda,
    belleği kaydetmek için diğer tamsayı veri türleri yerine kullanılır.

     */



    val temp : Short = 12345 // temp değeri Short tipinin aralığında olduğu için sıkıntı olmayacaktır.
    println("temp : $temp") // ekrana içeriği bastırılıyor.




    /*

    Int

    Int veri türü -2^31 ile 2^31-1 arasında değerlere sahip olabilir ^
    (32 bit imzalı iki tamamlayıcı tamsayı).

     */


    val result : Int = 1000000 // int turunde bir değişken tanımlandı.
    println(result) // ekrana sonucu bastırıldı.



    /*

    Eğer türünü açıkça belirtmeden bir değişkene -2^31 ila 2^31-1 arasında bir tamsayı atadığınızda,
    değişken Int türünde olacaktır.^


     */

    val number = 1903 // tipi belirtilmezse int türünde işleme tabi tutulur.


    /*

    Long

    Uzun veri tipi -2^63 ila 2^63-1 arasında değerlere sahip olabilir ^
    (64 bit imzalı iki tamamlayıcı tamsayı).

     */

    val score : Long = 9999 // long tipinde bir değişken tanımlandı.
    println(score) // score değeri ekranda gösterildi.

    /*
    Bir değişkeni 2 ^ 31-1'den büyük veya -2 ^ 31'den küçük bir değişkene
    (türünü açıkça belirtmeden) atarsanız, değişken Long tipi olacaktır.
     */


    // distance değişkeni long türünde , ctrl+shift+p tuşlarına basarak değişkenin tipini öğrenebilirsiniz
    val distance = 10000000000


    // Benzer şekilde, değişkenin Long türünde olduğunu belirtmek için büyük harf L'yi kullanabilirsiniz.

    val newValue = 100L // long tipinde bir değişkendir.



    // Double : çift hassasiyetli bir 64-bit kayan noktalı sayıdır.

    val examNote : Double = 99.9 // noktalı sayılarda kullanılır.
    println("examNote : $examNote") // 0.01 puanı nereden kırdın be Zalım hoca :)



    // Float : Veri tipi tek hassasiyetli bir 32 bit kayan noktadır.

    val coldValue : Float = -10F // f parametresiyle birlikte kullanılır.
    println(coldValue) // değişkenin içeriği ekranda gsöterilir.

    /*
    Yukarıdaki programda 19.5 yerine 19.5F kullandık.
    Bunun nedeni, 19.5'in bir Double değişken olmasıdır ve Float'ın bir değişkenine Double değerini atayamazsınız.
    Derleyicinin 19.5'i Float olarak ele alması için, değişkenin sonunda F'yi kullanmanız gerekir.
     */


    var myNumber : Number = 1903  // int tipinde

    println(myNumber) // 1903

    myNumber = 19.03 // double tipinde

    println(myNumber) // 19.03

    myNumber = 1903F // float tipinde

    println(myNumber) // 1903.0

    myNumber = 1903L // long tipinde

    println(myNumber) // 1903



   // Char :  Kotlin'de bir karakteri temsil etmek için Char tipleri kullanılır.


    val character : Char = 'A' // char türünde bir değişken tanımlandı.

    println(character) // karakter değeri ekranda gösterildi.


    // Java'da ascii tablosundaki değeri verilip ona göre karşılığı elde edilebilir.

    // char letter = 65;

    // Ama Kotlin böyle bir işleme izin vermez hatalı kullanım olduğunu bildirir.



    // Boolean : Veri türü, true veya false olmak üzere iki olası değere sahiptir.

    val state : Boolean = true // true ya da false sonuclarını atayabiliriz.
    println(state) // durum sonucu



}