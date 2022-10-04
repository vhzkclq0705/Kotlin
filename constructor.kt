// Constructor

/// class with sub constructor
class Person1 {

    var name: String
    var age: Int
    var isMarried: Boolean

    constructor(n: String, a: Int, i: Boolean) {
        this.name = n
        this.age = a
        this.isMarried = i
    }

    fun getName() = println("Your name is $name")

}

/// class with primary constructor
class Person(var name: String,
             var age: Int,
             var isMarried: Boolean) { // defines 3 properties

    var nickName: String = ""

    init { // initialize, continued with the primary constructor
        println("Beginning of the init block")
        println("name: ${this.name}, age: ${this.age}, isMarried = ${this.isMarried} ")
        println("End of the init block")
    }

    constructor(n: String, a: Int, i: Boolean, nk: String): this(n, a, i) {
        this.nickName = nk
    }

    fun getName() = println("The name is ${this.name}")

}

fun main() {
    val kwon = Person("Kwon", 25, false)
    val kim = Person("Kim", 23, true, "Dric")

    // scope function -> with, apply, let, ...
    with (kim) {
        println(name)
        println(age)
        println(isMarried)
        println(getName())
    }

    kwon.apply {
        println(name)
        println(age)
        println(isMarried)
        println(getName())
    }

}