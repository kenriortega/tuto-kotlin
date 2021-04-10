fun main() {
    val p1 = Person("ka", "or")
    val p2 = Person("ka", "or")

    println(p1 == p2)
    println(p1.nameLength())
    // destructuring same to js
    // p1first = p1.component1()
    // p1last = p1.component2()
    val (p1first, p1last) = p1
    println(p1first + p1last)

    // copy data class
    val sibling = p1.copy(firstName = "Kalixto")

    val order = Order(123,sibling)
    val newOrder = order.copy(233)

    val newOrder2 = order.copy(person = p2)

    println(newOrder)
    println(newOrder2)
}

// data class add equals/hascode/toString by defaults
data class Order(val amount:Int, val person: Person)
data class Person(
    val firstName: String = "unknown",
    val lastName: String
) {
    private fun fullName(): String {
        return "$firstName $lastName"
    }

    fun nameLength(): Int = fullName().length
}