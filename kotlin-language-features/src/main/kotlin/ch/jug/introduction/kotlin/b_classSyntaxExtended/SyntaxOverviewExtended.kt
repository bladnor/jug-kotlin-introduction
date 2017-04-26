package ch.jug.introduction.kotlin.b_classSyntaxExtended

// TODO rbe: show interfaces can have implementation
interface Super {
    fun calculatePower(): Int
    fun currentMood(): String {
        return "happy"
    }
}

/**
 * @param firstApperance Für Parameter ohne `val` oder `var` wird kein Property und keine Getter
 * oder Setter erzeugt.
 */
class Superhero(val name: String, val realName: String = "", var status: String, firstApperance: String) : Super {
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
    Superhero("The Flash") // Calls Sekundär Konstruktor

    flash.createdBy = "Bill Finger"
    println(flash.createdBy)
}
