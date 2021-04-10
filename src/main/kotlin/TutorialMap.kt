fun main() {
    val states = mapOf(
        "Vue" to "javascript",
        "Reactjs" to "javascript",
        "Ktor" to "kotlin",
        "Flutter" to "dart",
    )
    val statesMutable = mutableMapOf(
        "Vue" to "javascript",
        "Reactjs" to "javascript",
        "Ktor" to "kotlin",
        "Flutter" to "dart",
    )

    val result = states.getOrDefault("Vue","unknown")
    val putdata = statesMutable.put("Reactjs","nodejs")
    val putdata2 = statesMutable.putIfAbsent("Reactjs","nodejs")
    statesMutable.remove("Flutter")
    statesMutable.getOrPut("Go-kit", { "golang" })
    if (statesMutable.any()){
        println("any")
    }
    if (statesMutable.none()){
        println("any")
    }
    // 6:10:30
}