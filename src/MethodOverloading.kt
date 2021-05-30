
/*

Overloading : İsimleri aynı ancak parametre tipleri farklı olan metotlara denir.
Metot isimleri aynı ve parametreler farklı olmalıdır.

 */



// gelen sayıyı return ile döndürür.
fun mix(x:Int):Int{

    return x
}

// gelen iki sayıyı toplar ve sonucunu return ile döndürür.
fun mix(x:Int,y:Int):Int{

    return x+y
}

// gelen üç sayıyı toplar ve sonucu return ile döndürür.
fun mix(x:Int,y:Int,z:Int):Int{

    return x+y+z
}

fun main(args: Array<String>) {


    // her metot tek tek çağrılır.
    println("mix(x):"+mix(10))
    println("10+20 : "+mix(10,20))
    println("10+20+30 :"+mix(10,20,30))


}