package ch.jug.introduction.kotlin.g_nullSafety


/**
 * Chane of safe calls (ohne verschachtelte null checks wie in java)
 */
fun main(args: Array<String>) {
    val buch = Buch("Kotlin in Action")
    println(buch.author?.adresse?.stadt?.berechneEinwohnerZahl())
}

class Buch(val title: String) {
    val author: Author? = Author("Walt Disney")
}

class Author (val name:String, val adresse: Adresse? = null)

class Adresse ( var stadt: Stadt? )

class Stadt ( val name: String){
    fun berechneEinwohnerZahl(): Int {
        // berechnen
        return 4
    }
}
