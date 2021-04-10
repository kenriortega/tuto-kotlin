package data

// para heredar debe ser open la clase
open class Persona(var name:String, var age:Int) {

    fun info() {
        println("Persona name: $name, age: $age")
    }

}

class Chef(name: String,age: Int, var favoriteFood:String):Persona(name, age){
//    protected var favoriteFood = "unknown"
//
//    init {
//        favoriteFood = favFood
//    }
    protected fun printMyFavoriteFood(){
        println(favoriteFood)
    }
    fun setMyFavoriteFood(food:String){
        favoriteFood = food
        printMyFavoriteFood()
    }
}