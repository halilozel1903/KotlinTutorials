/*

Değişkenler verileri tutan sembolik kavramlardır. Uygulama içinde değişkenler global ve yerel olmak
üzere ikiye ayrılır. Global değişkenlere uygulama içinde herhangi bir yerden erişim sağlanır.
Local değişkenlere ise sadece tanımlandıkları kod bloğu içinden erişilebilir.

 */


var globalNumber = 12 // bu değişken global olduğu için verilen metotların hepsi bu değişkeni kullanabilir.

fun fun1(): Unit {

    // bu değişken local olduğu için sadece fun1 metodu bu değişkene erişilebilir.
    // Diğer kod bloklarından erişilemez.
    var localNumber = 21
    println("fun1-global değişken : $globalNumber")
}


fun fun2(): Unit {
    println("fun2-global değişken : $globalNumber")
    // println("fun2-global değişken : $localNumber")
}

fun main() {

    println("main-global değişken : $globalNumber")
    // println("main-global değişken : "+localNumber)
    fun1()
    fun2()
}