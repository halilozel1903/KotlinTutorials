import toplevelmethod.Simple
import toplevelmethod.topLevelMethods

fun main() {
    topLevelMethods()

    val obj = Simple()
    print(obj.localMethod())
}