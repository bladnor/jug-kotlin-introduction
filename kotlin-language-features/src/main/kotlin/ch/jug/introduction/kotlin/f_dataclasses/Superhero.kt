package ch.jug.introduction.kotlin.f_dataclasses

/**
 * - Bei data Klassen werden automatisch equals(), hashCode(), toString() generiert.
 * - Zusätzlich wird eine copy() function und sog. componentN() functions erzeugt
 * - Data Klassen brauchen einen Primär Konstruktor mit mindestens einem Parameter
 * - Properties die nicht im Primär Konstruktor deklariert sind, nehmen nicht Teil
 *   an equals() und hashCode()
 */
data class Superhero(var gender: String, val name: String, var realName: String)


//***
fun main(args: Array<String>) {
    val hero1 = Superhero("male", "Captain America", "Steven \"Steve\" Rogers")

    /** copy function */
    // TODO rbe: show named parameters
    val hero2 = hero1.copy(name = "Thor", realName = "Thor Odinson")

    // componentN Functions. Werden in den destructuring delarations verwendet.
    // Achtung: Reihenfolge beachten bei Refactorings des primär Constructors
    println("Component1 : " + hero1.component1())
    println("Component1 : " + hero1.component2())
    println("Component1 : " + hero1.component3())
    println()

    // TODO rbe: show destructuring declarations
    val superheroes = listOf(hero1, hero2)
    for ((_, shortName, longName) in superheroes) {
        println(shortName.padEnd(20, ' ') + ": " + longName)
    }
}
