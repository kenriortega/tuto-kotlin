fun main() {
    printUserInfo(
        age = 29,
        lastName = "Ortega",
        notas = arrayOf(2,33,44,53,123)
    )
    printUserInfo("kalix","kotlin","javascript","python")
}
// check video 1:35:40
fun printUserInfo(firstName: String,vararg languages:String){
    println(message = "First name: $firstName, languages ${languages.map { it }}")
}
fun printUserInfo(
    firstName: String = "JE",
    lastName: String,
    age: Int,
    event: Event = Event.CHANGED_VIEW,
    notas:Array<Int>
){
    println(message = "First name: $firstName, Last name: $lastName and age: $age and event:${event} promedio: ${notas.mean()}")
}
// Extensions
fun Array<Int>.mean():Double {
    var sum = 0.0
    this.forEach {
        sum += it
    }
    return  sum / this.size
}

enum class Event{
    TEXT,
    CICKED,
    FOCUSED,
    CHANGED_VIEW
}