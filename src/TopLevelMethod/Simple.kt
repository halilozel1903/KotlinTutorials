package TopLevelMethod

/*

Herhangi bir sınıf nesne veya arayüz içinde olmadığından dolayı bu metot
top-level metodudur. import ile bu metot doğrudan başka bir projeye eklenebilir.
Bunun için nesne tanımlamaya gerek yoktur.

 */

fun topLevelMethods(){
    println("bu top-level metodunun bir mesajıdır.")
}

/*

Bu metot local olduğu ve bir sınıf içinde tanımlandığından dolayı import ile doğrudan
başka bir projeye eklenmez. Bu metoda erişim için Simple sınıfından bir nesne oluşturmak gerekir.

 */

class Simple {

    fun localMethod(){
        println("bu local metodunun bir mesajıdır.")
    }
}