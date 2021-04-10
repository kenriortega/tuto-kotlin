class User(
    var firstName:String,
    var lastName:String,
    var isPlatium:Boolean
){
    // properties
    var fullName = "$firstName $lastName"
        get() = "Name: $field"
        set(value) {
            if (value.isNotEmpty()) field = value.toUpperCase()
        }
    val fullNameLength =  fullName.length
    init {
        println("setup inicial for $fullName")
    }

    // second constructor
    constructor(firstName: String,lastName: String):this(firstName,lastName, isPlatium=false){
        println("2do")
    }
    constructor(firstName: String):this(firstName,"unknown"){
        println("3rd")
    }

    override fun toString(): String {
        return printFullName()
    }
    fun printFullName():String{
        return "My fullname is $firstName $lastName"
    }

    fun updateName(newName: String): Unit {
        firstName = newName
    }

    fun firstNameLength(){
        println(firstName.length)
    }

    // muy parecido a static methods
    companion object {
        val users = mutableListOf<User>()
        fun createUser(firstName: String,lastName: String):User{
            return User(firstName, lastName)
        }
        fun createUsers(count:Int):List<User>{
            for (i in 0..count){
                users.add(User("FirstName${i}","LastName$i"))
            }
            return users
        }
    }
}

fun User.toJSON():String{
    return """
        {
            "firstName":${this.firstName},        
            "lastName":${this.lastName},        
        }
    """.trimIndent()
}