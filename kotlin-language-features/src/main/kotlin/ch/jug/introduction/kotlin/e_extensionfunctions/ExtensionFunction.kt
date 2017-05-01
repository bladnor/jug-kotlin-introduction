package ch.jug.introduction.kotlin.e_extensionfunctions

/**
 * Was es zu beachten gibt
 *
 * - Extension Functions werden statisch aufgelöst
 * - Extension Functions können Member Functions 'überschreiben',
 *     wenn die Signature unterschiedlich ist. Wenn sie gleich ist,
 *    gewinnt immer die Member Function
 * - `this` bezieht sich auf den Receiver
 *
 */
fun String.theQuestion(): String {
    return this + "the ultimate question of life the universe and everything?"
}

// TODO rbe: show Extension Function ist prefixed mit dem 'Receiver Type'
fun String.theAnswer(): String {
    return this + " 42"
}


//***
fun main(args: Array<String>) {
    println("What is the answer to ".theQuestion().theAnswer())
}
