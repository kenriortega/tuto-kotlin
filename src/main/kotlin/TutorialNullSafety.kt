fun main() {
    val name: String? = null

/* // Old usage
    val length = if (name != null) name.length else {
        0
    }
    println(length)
    */

    // !! is used to force that this element never is null
//    val length = requireNotNull(name,{"Not null"}).length
    val length2 = name?.length ?: 0

    val pokemon:Pokemon? = null
    if (checkNotNull(pokemon).name == "pikachu"){
        println("Hi pokemon")
    }else{
        println("Not pokemon detected")
    }

    val pokemons = listOf(
        Pokemon("pikachu"),
        Pokemon("dito"),
        Pokemon("raychu"),
        null,
    )
    val pokemonThatNotNull = pokemons.filterNotNull()
    println(pokemonThatNotNull)

}

class  Pokemon(val name:String)