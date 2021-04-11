fun main() {
    val listOfString = listOf("kotlin", "c#", "erlang", "javascript")
    val listOfInt = listOf(1, 2, 3, 4, 5)

    val result = EvenList(listOfString)
    println(result.evenItems())

    val otherResult = EvenList(listOfInt)
    println(otherResult.evenItems())

    val pets = listOf(
        Pet(name = "bear"),
        Pet(name = "dog"),
        Pet(name = "cat")
    )
    println(EvenList(pets).evenItems())
}
data class Pet(val name: String)
class EvenList<T>(val list: List<T>) {
    fun evenItems(): List<T> {
        return list.filterIndexed { index, _ -> index % 2 == 0 }
    }
}