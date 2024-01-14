var i = 5 // global değişken tanımı

/*
    Bir metot kendi kendine çalıştırılabiliyorsa bu metotlara özyinelemeli metotlar denir.
    Değişken sıfır veya sıfırdan büyük olduğu sürece metot ekrana mesaj yazdıktan sonra
    kendisini çağırır. Her çağrımda i değişkeni azalır.

 */

fun rekursif(): Unit {

    i-- // i değeri bir azalır.

    // i değişkeni bir azaldıktan sonra sıfır veya sıfırdan büyükse ekrana mesaj yazdır ve kendini tekrar çağır.
    if (i >= 0) {
        println("rekursif mesaj")
        rekursif()
    } else { // i değişkeni sıfırdan küçükse mesaj bastır.
        print("rekursif sonu")
    }


}

fun main() {
    rekursif() // rekürsif metot önce main() içinden çağrılmalıdır.
}