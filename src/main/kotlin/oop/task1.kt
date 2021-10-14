package oop

class Phone (var number: String, var model: String, var weight: Double ) {
     constructor ( number: String, model: String) : this (number, model, weight = 0.0){
}
//    constructor() : this() {
//    println("nothin")
//    }

    fun recieveCall(name: String) {
        println("Calling ${name} ")
    }

    fun getNumber() {
        println("Telephone " + number)
    }

    fun recieveCall(name: String, inCallNumber: String){
        println("Calling ${name} ${inCallNumber}")
    }
    fun sendMessage(vararg numbers: String){
        for (n in numbers)
            println(n)
    }

}

    fun main() {
        var phone1 = Phone("1","231")
        var phone2 = Phone("2","111", 1.8)
        var phone3 = Phone("3","34sa", 3.4)

        println("${phone1.number} ${phone1.weight} ${phone1.model}")
        println("${phone2.number} ${phone2.weight} ${phone2.model}")
        println("${phone3.number} ${phone3.weight} ${phone3.model}")
        println()

        phone1.recieveCall("Sergey")
        println()
        phone1.recieveCall("Tatiana", "212412")
        println()
        phone1.getNumber()
        println()
        phone1.sendMessage("123213","2131211", "112357753")
    }


