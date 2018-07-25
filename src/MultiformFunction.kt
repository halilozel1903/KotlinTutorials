
// Çok Biçimli Metodlar : İsimleri aynı , parametre tipleri farklı olan yapılardır.


// showInformation() 3 metodun parametre tipleri farklı olduğu için bu metoda çok biçimli metod deniliyor.

// bu metot ile kişinin ismi alınır ve print ile ekrana yazılır.
fun showInformation(name:String):Unit{
    println("İsminiz : $name")
}

// bu metot ile kişinin yaş bilgisi alınır ve print ile ekrana yazılır.
fun showInformation(age:Int):Unit{
    println("Yaşınız : $age")
}


// bu metot ile kişinin doğum tarihi alınır ve print ile ekrana yazılır.
fun showInformation(birth:Long):Unit{
    println("Doğum Tarihiniz : $birth")
}

fun main(args: Array<String>) {

// her metod tek tek ilgili parametreleriyle çağrılır.

    showInformation("Halil")
    showInformation(21)
    showInformation(birth = 1997)



}