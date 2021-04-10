fun main() {
    val items = arrayOf("dd", "das", "3ee", "cu", "no")
    val itemsInt = intArrayOf(1, 2, 3, 4, 5)

    items.groupBy { it[0] }.forEach { value -> println(value) }

    val elements = listOf(
        Element("call"),
        Element("sms"),
        Element("accounts")
    )
    elements.forEach { println(it) }

    val firstElement = elements.first()
    println(firstElement)

    val name: String? = null
    val stuf = name?.let {
        listOf(name)
    } ?: run { emptyList() }
    println(stuf)
    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4)
    numbers.add(5)
    numbers.add(6)
    numbers[3] = 344
    numbers.forEach { println(it) }

    println(numbers[4])

    // filters collections day 50
    val languages = listOf("kotlin", "java", "javascript", "golang", "c#", "php", "erlang")
    val filtered = languages
        .groupBy { it[0] }
        .filter(::isGroupByMapContainChar)
        .flatMap { it.value }
    println(filtered)

    val result = languages.find { it == "java" } ?: "unknown"
    println(result.length)

    val selected = mutableListOf("dartLang", "swift")

    languages.filterTo(selected, { it.length greaterThan 4 })
    println(selected)

    // merge and extract collections
    val merge = languages.plus(selected)
    println(merge.minus(selected))


    // map collections
    val abbreviation = languages
        .map { it.substring(0, 2).toUpperCase() }
        .sumBy { it.length }
    println(abbreviation)

    // map Day 49
    val frameworkOrLib = listOf(
        FrameworkOrLib("Vue.js", Rol.FRONTEND),
        FrameworkOrLib("React.js", Rol.FRONTEND),
        FrameworkOrLib("Ktor", Rol.BACKEND),
        FrameworkOrLib("JetPackCompose", Rol.MOBILDEV),
    )
    val resultFrameworkOrLib = frameworkOrLib
        .groupBy { it.role }
        .map { element ->
            """
            Role:${element.key} projects: ${element.value.size}             
            	 - ${element.value.joinToString { it.name }}
        """.trimIndent()
        }

    resultFrameworkOrLib.forEach { println(it) }

    // sets
    val frameworks = mutableSetOf(
        FrameworkOrLib("Vue.js", Rol.FRONTEND),
        FrameworkOrLib("Vue.js", Rol.FRONTEND),
        FrameworkOrLib("Vue.js", Rol.FRONTEND),
        FrameworkOrLib("React.js", Rol.FRONTEND),
        FrameworkOrLib("Ktor", Rol.BACKEND),
        FrameworkOrLib("JetPackCompose", Rol.MOBILDEV),
    )
    println(frameworks)

}

data class FrameworkOrLib(val name: String, val role: Rol)
enum class Rol {
    BACKEND,
    FRONTEND,
    MOBILDEV
}

infix fun Int.greaterThan(value: Int) = this > value

private fun isGroupByMapContainChar(groupMap: Map.Entry<Char, List<String>>): Boolean {
    return groupMap.value.toString().toLowerCase().contains('j')
}


data class Element(var name: String)