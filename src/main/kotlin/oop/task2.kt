package oop

class Person(val fullName: String, var age: String) {
    constructor() : this(fullName = "",age = "") {
    }

    fun move() {
        println("The ${fullName} is move")
    }

    fun talk() {
        println("The ${fullName} talk")
    }
}

fun main(){
    var person1 = Person()
    var person2 = Person("Valeriy Meladze", "12")

    person2.move()
    person2.talk()
    println()
    person1.talk()

}