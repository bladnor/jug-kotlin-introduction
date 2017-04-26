package ch.jug.introduction.kotlin.m_exceptions

import java.io.IOException

/**
 * - Kotlin Exceptions funktionieren grundsätzlich wie in Java aber ...
 * - Es gibt keine Checked Exceptions in Kotlin und somit auch keine `throws` clause
 * - `try` ist kein Statements wie in Java sondern leiten eine Expression ein (für `if` gilt übrigends das gleiche) .
 */
fun standardThrow(percentage: Int): Int {
    if (percentage !in 1..100) {
        throw IllegalArgumentException("Wert muss zwischen 1 und 100 liegen. Ist aber '$percentage'")
//        throw IOException()
    }
    return percentage
}


/**
 * Im Gutfall  wird der letzte Wert im `try` Block verwendet
 * Im Fehlerfall wird der letzte Wert im `catch` Block verwendet
 */
fun tryAsPartOfExpression(value: String): Int {
    val percentage = try {
        Integer.valueOf(value)
    } catch (e: NumberFormatException) {
        0
    }
    return percentage
}

//***
fun main(args: Array<String>) {
        println("percentage: ${standardThrow(10)}")
        println("percentage: ${tryAsPartOfExpression("5")}")
}
