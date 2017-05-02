package ch.jug.introduction.kotlin.j_smartcasts

import ch.jug.introduction.kotlin.Superpower
import ch.jug.introduction.kotlin.Superpower.*

interface Super

data class Superhero(val name: String, val superpower: Superpower) : Super
data class Superheroine(val name: String, val superpower: Superpower) : Super {
    fun myFriends() {}
}


//***
fun main(args: Array<String>) {

    val loki: Super = Superhero("Loki", SHAPE_SHIFTING)
    val elektra = loki as Superheroine

    println(elektra)
}



//    val elektra = loki as? Superheroine

