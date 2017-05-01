package ch.jug.introduction.kotlin.e_extensionfunctions

import java.util.*

/**
 * Extension Property (braucht explizit einen Getter)
 */
val Date.DATA_FORMAT_LONG: String get() = "dd.MM.yyyy"


//***
fun main(args: Array<String>) {
    val date = Date()
    print(date.DATA_FORMAT_LONG)
}
