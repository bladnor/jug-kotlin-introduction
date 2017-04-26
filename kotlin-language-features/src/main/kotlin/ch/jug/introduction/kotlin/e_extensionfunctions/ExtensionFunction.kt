/**
 * Was es zu beachten gibt
 *
 * - Extension Functions werden statisch aufgelöst
 * - Extension Functions können Member Functions überschreiben,
 *     wenn die Signature unterschiedlich ist. Wenn sie gleich ist,
 *    gewinnt immer die Member Function
 * - `this` bezieht sich auf den Receiver
 *
 */
package ch.jug.introduction.kotlin.e_extensionfunctions

// TODO rbe: show Extension Function ist prefixed mit dem 'Receiver Type'
fun String.theAnswer(): String {
    return this + " 42"
}

fun String.theQuestion(): String {
    return this + "the ultimate question of life the universe and everything?"
}



//***
fun main(args: Array<String>) {
    println("What is the answer to ".theQuestion().theAnswer())
}
