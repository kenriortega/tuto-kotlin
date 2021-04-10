package calculator

fun main() {
    val button = Button()
    // inline object to call and interfaces
    button.setMyListener(object : OnClickListener {
        override fun onclick() {
            println("onclick")
        }
    })
    button.click()

    val map = Map()
    map.clickListener = object: OnClickListener{
        override fun onclick() {
            println("Click on Map")
        }
    }
    map.click()
}


interface OnClickListener {
    fun onclick()
}

abstract class View {
    lateinit var clickListener: OnClickListener

    fun setMyListener(clickListener: OnClickListener) {
        this.clickListener = clickListener
    }

    fun click() {
        clickListener.onclick()
    }
}

class Button : View()
class Image : View()
class Map : View()