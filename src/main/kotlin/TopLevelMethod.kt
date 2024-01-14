import toplevelmethod.Simple
import toplevelmethod.topLevelMethods


fun main() {
    topLevelMethods() // metoda erişim için projeye doğrudan import edilir.

    val obj = Simple() //metoda erişim için Simple sınıfından bir nesne oluşturup kullanmak gerekir.
    print(obj.localMethod())
}