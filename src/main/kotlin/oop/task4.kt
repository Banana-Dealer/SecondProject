package oop

class Reader(val fullName: String, val number: String, val birthDate: String, val fac: String,
             val mobilePhone: String){

    fun takeBook(n: Int){
        println("$fullName take $n books")
}
    fun takeBook(vararg names: String){
        println("$fullName take $names books")
    }

    fun returnBook(n: Int){
        println("$fullName return $n books")
    }

    fun returnBook(vararg names: String){
        println("$fullName take $names books")
    }
}

class Book(var bookName: String, var autorName: String){

//    fun takeBook (vararg Book) {
//        println(Book)
//    }
}


fun main() {
//    val readers = List(5){Reader(
//        "Petrov V.A", "23", "1.11.2021", "TIT", "+23422342")}
    var book1 = Book("Galgadot", "Bergen A.B")
    var book2 = Book("Braun", "Marcus T.N")
    var book3 = Book("Deregat", "Sonner V.I.")
}