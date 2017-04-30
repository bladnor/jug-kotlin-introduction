package ch.jug.introduction.kotlin.g_nullSafety


/**
 *
 */
fun main(args: Array<String>) {
    println(Buch("Kotlin in Action").author?.adresse?.stadt?.berechneEinwohnerZahl())
}

class Buch(val title: String) {
    val author: Author? = null
}

class Author (val name:String, val adresse: Adresse?)

class Adresse ( val stadt: Stadt? )

class Stadt ( val name: String){
    fun berechneEinwohnerZahl(): Int {
        // berechnen
        return 4
    }
}
