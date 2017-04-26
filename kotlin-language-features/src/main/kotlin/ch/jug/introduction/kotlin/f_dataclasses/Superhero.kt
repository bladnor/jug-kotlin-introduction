package ch.jug.introduction.kotlin.f_dataclasses
/**
 * - Bei data Klassen werden automatisch equals(), hashCode(), toString() generiert.
 * - Zusätzlich wird eine copy() function und sog. componentN() functions erzeugt
 * - Data Klassen brauchen einen Primär Konstruktor mit mindestens einem Parameter
 * - Properties die nicht im Primär Konstruktor deklariert sind, nehmen nicht Teil an equals() und hashCode()
 */
data class Superhero(var gender: String, var name: String, var realName: String)


//***
fun main(args: Array<String>) {
    val hero1 = Superhero("male", "Captain America", "Steven \"Steve\" Rogers")

    /** copy function */
    // TODO rbe: show named parameters
    val hero2 = hero1.copy(name = "Thor", realName = "Thor Odinson")

    // TODO rbe: show destructuring declarations
    val superheroes = mapOf(hero1.name to hero1,hero2.name to hero2)
    for ((name, hero) in superheroes) {
        println(name.padEnd(20,' ') + ": " + hero)
    }
}
