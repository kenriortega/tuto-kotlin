import java.lang.IllegalArgumentException

fun main() {
//    day 51
    val w = Worker(name = "WorkerA", age = 12)
    try {
        checkAge(w)
        println("Done")
    } catch (e: Exception) {
        when (e) {
            is InvalidAgeException -> println(e.message)
            is IllegalArgumentException -> println(e.message)
            else -> throw e
        }
    }
}

private fun checkAge(w: Worker) {
    if (w.age < 19) {
        throw InvalidAgeException(w.age, "Invalid age")
    }
}

class InvalidAgeException(
    val age: Int,
    message: String
) : IllegalArgumentException("Invalid age: $age. $message")

data class Worker(val name: String, val age: Int)