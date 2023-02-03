class Outside {
    val outside = "Outside Nested class."

    /*
    class Inner {
        // Error! cannot access member of outer class.
        // fun doNotCallMeUp() = Let's do this!
    }*/

    // Inner classes carry a reference to an outside class and can access outside class members.
    inner class Inner {
        fun tellMe() = outside
    }
}

/*
The nested classes do not have access to the outer class instance.
 */

fun main() {

    val outer = Outside()
    println("Outside : ${outer.Inner().tellMe()}")

    // println(outer.Nested.doNotCallMeUp()) -> Classifier 'Nested' does not have a companion object, and thus must be initialized her.

    val inner = Outside().Inner()
    println("Inner : ${inner.tellMe()}")
}