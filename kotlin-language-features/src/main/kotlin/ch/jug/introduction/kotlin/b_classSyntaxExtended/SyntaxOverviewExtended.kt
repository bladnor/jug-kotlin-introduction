package ch.jug.introduction.kotlin.b_classSyntaxExtended

// TODO rbe: show interfaces can have implementation
interface SuperInterface {
    fun currentMood(): String {
        return "happy"
    }
}

/**
 * Klassen sind "final by default". Wenn man subklassen erstellen will muss die class mit 'open' deklariert werden.
 */
open class SuperClass {
     open fun calculatePower(): Int = 0

}

/**
 * @param firstApperance Für Parameter ohne `val` oder `var` wird kein Property und keine Getter
 * oder Setter erzeugt.
 */
class Superhero(val name: String, val realName: String = "", var status: String, firstApperance: String) : SuperClass() {
    init {
        println("init called '$firstApperance' of $this")
    }

    // TODO rbe: show named parameter / secondary constructor
    constructor(name: String): this(name, status = "topfit", firstApperance = "undef") {
        println("secondary constructor called of $this")
    }


    var createdBy: String = ""
        get() = "Creator: ".plus(field)
        set(nameOfCreator) {
            // Custom Setter code kann hier implementiert werden
            field = nameOfCreator
        }

    // TODO rbe: show override is keyword
    override fun calculatePower(): Int {
        throw UnsupportedOperationException("not implemented")
    }
}

//***
fun main(args: Array<String>) {
    // Named Parameters
    val flash = Superhero("The Flash", status = "top fit", firstApperance = "1940")  // Calls Primär Konstruktor

    println()

    Superhero("The Flash") // Calls Sekundär Konstruktor

}
