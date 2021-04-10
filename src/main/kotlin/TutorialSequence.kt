import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {
    lateinit var list: List<Int>
    measure {
        list = generateSequence(1) { it + 1 }
//        .take(50_000_000) // no hacer con 4gb RAM
            .take(5_000_0) // no hacer con 4gb RAM
            .toList()

        val result = list
            .filter { it % 3 == 0 }
            .average()

        println("Done - list")
        println(result)
    }
    lateinit var listAsSequence: List<Int>
    measure {
        listAsSequence = generateSequence(1) { it + 1 }
//        .take(50_000_000) // no hacer con 4gb RAM
            .take(5_000_0) // no hacer con 4gb RAM
            .toList()

        val result = listAsSequence.asSequence()
            .filter { it % 3 == 0 }
            .average()

        println("Done - listAsSequence")
        println(result)
    }
    lateinit var sequence: Sequence<Int>
    measure {
        sequence = generateSequence(1) { it + 1 }
//        .take(50_000_000) // no hacer con 4gb RAM
            .take(5_000_0) // no hacer con 4gb RAM


        val result = sequence
            .filter { it % 3 == 0 }
            .average()

        println("Done - sequence")
        println(result)
    }
}

fun measure(block: () -> Unit) {
    val nanotime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanotime)
    println("$millis ms")
}

/*
* Done - list
* 25000.5
* 46 ms
* Done - listAsSequence
* 25000.5
* 18 ms
* Done - sequence
* 25000.5
* 15 ms
* */