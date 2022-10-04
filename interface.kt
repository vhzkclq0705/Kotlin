// Interface
// interface는 괄호가 절대로 포함되지 않는다.

interface Clickable {

    fun click()
    fun showOff() = println("I'm clickable")

}

interface Focusable {

    fun setFocus() = println("I'm focusable")
    fun showOff() = println("I'm focussed")

}

class Button: Clickable, Focusable {

    override fun click() {
        println("I'm clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

fun main() {
    val button = Button()

    button.apply {
        click()
        showOff()
    }
}