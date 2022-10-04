// Abstract

abstract class Foo {

    abstract val color: String
    abstract fun bar() // not implemented get

}

class A : Foo() {

    override val color: String = "White"

    override fun bar() {
        println("Now it is implemented")
    }

}

fun main() {
    val b = A()
    b.bar()
}