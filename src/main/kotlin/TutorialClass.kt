fun main() {
    val kali = User(
        firstName = "Karit",
        lastName = "Ortde",
        isPlatium = true
    )
    println(kali.fullName)
    kali.fullName = "async"
    println(kali.fullName)
    println(kali.toJSON())
    val user = User.createUser("Mom","DOw")
    println(user)
    val users = User.createUsers(2)
    users.forEach { println(it) }

    println(FavoriteFood.name)
    println(FavoriteFood.cook())
}

object FavoriteFood{
    var name ="unknown"
    var ingredients = mutableListOf<String>()

    fun cook(){
        println("cooking")
    }
}


