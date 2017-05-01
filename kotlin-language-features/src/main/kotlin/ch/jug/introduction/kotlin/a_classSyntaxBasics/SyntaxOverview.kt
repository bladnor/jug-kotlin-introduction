package ch.jug.introduction.kotlin.a_classSyntaxBasics

/**
 * - Per default ist eine Klasse `final` und `public`
 * - Direkt nach dem Klassen Namen folgt der Primär Konstruktor.
 * - Für Values (val) wird ein Property und ein Getter generiert
 * - Für Variables (var) wird ein Property und ein Getter und Setter generiert
 *
 * @param name Ist ein Value der nicht verändert werden kann
 * @param realName Ist ein Value der nicht verändert werden kann mit einem default Wert
 * @param status Ist eine Variable die verändert werden kann
 */
// TODO rbe: show default values / types after the variable/value
class Superhero(val name: String, val realName: String = "", var status: String)

/**
 * Funktionen (Methoden) müssen nicht innerhalb Klassen definiert werden.
 */
// TODO rbe: show expression body / block body / remove type; no semicolons at eol
fun sum(a: Int, b: Int): Int {
    return a + b
}


//***
fun main(args: Array<String>) {
    val superhero = Superhero("The Flash", "Barry Allen", "top fit")

    println(superhero.name)

    println(sum(2, 3))
}




