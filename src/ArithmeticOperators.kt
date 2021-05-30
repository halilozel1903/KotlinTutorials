
    /*

    Aritmetik Operatörler

    + : Toplama

    - : Çıkarma

    * : Çarpma

    / : Bölme

    % : Mod Alma

     */

fun main(args: Array<String>) {

    val number1  = 28.0  // number1 değeri verildi.

    val number2  = 7.0 // number2 değeri verildi.

    var result : Double // sonuç değeri tanımlandı.


    result = number1 + number2 // toplama işlemi yapıldı.

    println("$number1 + $number2 = "+result)
    // javascript veya php gibi dilleri kullandıysanız bu tip yazdırma ile karşılaşmanız olasıdır.
    // İlerleyen derslerde ayrıntılı olarak açıklanacaktır.


    result = number1 - number2 // çıkartma işlemi yapıldı.

    println("$number1 - $number2 = "+result) // çıkartma işleminin sonucu ekranda gösterildi.


    result = number1 * number2 // çarpma işlemi yapıldı.

    println("$number1 * $number2 = "+result) // çarpma işleminin ekranda gösterildi.


    result = number1 / number2 // bölme işlemi yapıldı.

    println("$number1 / $number2 = "+result) // bölme işleminin ekranda gösterildi.


    result = number1 % number2 // mod alma işlemi yapıldı.

    println("$number1 % $number2 = "+result) // mod sonucu ekranda gösterildi.


    // + operatörü ayrıca String değerlerinin birleştirilmesi için kullanılır.

    val start = "Talk is cheap. " // baş cümle
    val middle = "Show me the code. " // orta cümle
    val end = "- Linus Torvalds" // sözün yazarı

    val sentence = start + middle + end // cümle değişkeninde onları birleştirdik.
    println(sentence) // birleştirilen string ifadeler ekranda gösterildi.



}