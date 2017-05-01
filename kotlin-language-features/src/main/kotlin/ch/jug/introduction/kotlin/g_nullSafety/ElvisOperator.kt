package ch.jug.introduction.kotlin.g_nullSafety

/**
 * Der Elvis Operator (oder null-coalescing operator) braucht zwei Werte
 * Liefert den zweiten Wert wenn der erste Wert null ist.
 * Ansonsten den ersten Wert
 */
fun sendLetter(address: String?): String? = address ?: "Return to sender, address unknow ... "


/**
 * Kann z.B. verwendet werden um Preconditions zu prüfen
 */
fun sendLetter(superhero: Superhero) {
    superhero.address ?: throw IllegalArgumentException()

    with(superhero.address) {
        println(town)
    }

}

fun main(args: Array<String>) {
    println(sendLetter("I gave a letter to the postman"))
    println(sendLetter(null))

    sendLetter(Superhero("Batman", Address("Gotham City")))
    sendLetter(Superhero("Batman", null))
}


class Superhero(val name: String, val address: Address?)

class Address(val town: String)
