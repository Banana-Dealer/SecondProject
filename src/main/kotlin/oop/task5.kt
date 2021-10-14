package oop

class Num (var a: Int, var b: Int){

fun recursia() {
    var s = 0
    if (a>b && a != b){
        println(a--)
    }
    else if (a<b && a!=b){
        println(a++)
    }
}
}
fun main() {
    var num1=Num(10,20)
    .recursia()

}





//fun main() {
//    var A = 20
//    var B = 30
//    for (i in A..B){
//        println(i)
//        A++
//    }
//
//}
