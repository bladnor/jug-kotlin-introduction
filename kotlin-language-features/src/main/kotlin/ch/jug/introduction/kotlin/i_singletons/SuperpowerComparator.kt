package ch.jug.introduction.kotlin.i_singletons

import ch.jug.introduction.kotlin.Gender
import ch.jug.introduction.kotlin.Gender.*
import ch.jug.introduction.kotlin.Superpower
import ch.jug.introduction.kotlin.Superpower.*
import java.util.*

/**
 * - Mit dem Keyword 'object' wird ein Singleton deklariert. Es wird also ein class Deklaration und eine einzige Instanzierung
 * kombiniert.
 * - Kann z.B gut für Comparatoren verwendet werden.
 * - In objects sind weder ein primär noch ein sekundär Konstruktor erlaubt
 * - Vererbung ist möglich
 *
 */
object SuperpowerComparator : Comparator<Superhero> {
    override fun compare(o1: Superhero, o2: Superhero): Int {
        return o1.superpower.usefulnessRating.compareTo(o2.superpower.usefulnessRating)
    }
}



data class Superhero(var gender: Gender, var name: String, var superpower: Superpower)

//***
fun main(args: Array<String>) {
    val superhero1 = Superhero(FEMALE, "She-Hulk", REGENERATIVE_HEALING)
    val superhero2 = Superhero(ANDROGYNY, "Loki", BODY_PART_SUBSTITUTION)
    val superhero3 = Superhero(MALE, "Silver Surfer", POWER_MANIPULATION)
    listOf<Superhero>(superhero1, superhero2, superhero3).sortedWith(SuperpowerComparator).forEach { println(it) }
}