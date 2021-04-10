fun main() {
    for (i in 0 until 10 step 2) {
        println(i)
    }
    for (i in 20 downTo 10 step 2) {
        println(i)
    }
    for (j in 0..23 step 4){
        println(j)
    }

    var c = 0
    while (c < 10) {
        print(c)
        c++
    }

    val i = 12
    if (i in 1..7){
        println("yes")
    }else{
        println("NO")
    }
    val animals = listOf<Animal>(
        Animal("cat"),
        Animal("Dog"),
        Animal("Bear"),
    )
    val moreAnimals = listOf<Animal>(
        Animal("cat"),
        Animal("Dog"),
        Animal("Bear"),
        Animal("Bear"),
        Animal("Bear"),
    )
    // union
    val uniqueValues = animals.union(moreAnimals)
    println(uniqueValues)

    // forEachIndex
    animals.forEachIndexed { index, animal ->
        println("$index and $animal")
    }
}

data class Animal(val name: String)