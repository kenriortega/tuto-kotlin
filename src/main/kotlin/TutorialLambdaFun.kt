fun main() {
//    Day54
    // val lambdaName: (InputType) -> ReturnType = { arguments:WithType -> body}

    val greeter: (String, Int) -> String = { name: String, age: Int ->
        val foo = age
        "Hello $name and $foo"
    }
    val result = greeter("kalix", 29)
    println(result)

    val counterPlus10 = { count: Int ->
        count + 10
    }
    println(counterPlus10(24))

    lineLogger {
        println("#KotlinCuba")
    }
}

fun lineLogger(block: () -> Unit) {
    repeat(5) { println("------") }
    block()
    repeat(5) { println("------") }
}