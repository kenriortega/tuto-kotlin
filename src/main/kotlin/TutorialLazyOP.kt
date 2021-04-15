import java.lang.Thread.sleep
import kotlin.random.Random

fun main() {
    val result = lazy { someExpensiveOperation() }
    println(result)
    println("Is initialized: ${result.isInitialized()}")
    println(result.value)
}

fun someExpensiveOperation(): Int {
    println("computed")
    sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}
