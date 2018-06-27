
/*
    Array, Kotlin'deki Int, String vb. türden benzer verilerden oluşan bir koleksiyondur.

 */



fun main(args: Array<String>) {

    val myArray = Array<Int>(5){0} // 5 elemanı olan ve elemanlarıda 0 olan bir dizi tanımı

    myArray[0] = 1 // 0.indis 1 olarak güncellendi.

    for(element in myArray){
        println(element) // array'in elemanları ekranda gösterildi.
    }

    val my_array : Array<Int> = arrayOf(1,2,3,4,5) // int türünde bir array tanımı

    println(my_array[0]) // dizinin 0.indisini getir.

    println(my_array.get(2)) // dizinin 2.indisini getir.

    println(my_array.size) // dizinin boyutu



    val array_2 : Array<String> = arrayOf("Halil","İbrahim","Özel") // string türde bir array tanımı

    println(array_2.isNotEmpty()) // dizinin elemanları varsa yani dizi boş değilse

    val any_array : Array<Any> = arrayOf(1,true,19.00,"halil") // any belli bir tür belirtmeden bütün türlerden kullanmaya izin verir.

    println(any_array.isEmpty()) // dizinin içeriği boş mu ? diye kontrol edilir.





}