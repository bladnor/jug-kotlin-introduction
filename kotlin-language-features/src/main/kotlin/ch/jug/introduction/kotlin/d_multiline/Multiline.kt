package ch.jug.introduction.kotlin.d_multiline

val superpower = "unbreakable"

/**
 * - Multiline Strings unterstützen und brauchen keine Escape Zeichen. Bsp: '\n'
 * - Zeilenumbrüche sind enthalten.
 * - String Templates können verwendet werden
 * - Ein $ Zeichen muss als Embedded expression
 * - Zu formatierungs Zwecken kann ein Zeichen als 'Left Margin' verwendet werden. Per default ein '|'
 * - Unter anderem nützlich in Tests
 * TODO rbe Show prefix as margin
 */
val wolverine = """Born with super-human senses and the power to heal from almost any wound,
                   |Wolverine was captured by a secret Canadian organization and given an
                   |$superpower skeleton and claws.

                   |Ein Dollarzeichen ${'$'}"""
fun main(args: Array<String>) {
//    println(wolverine)
    println(wolverine.trimMargin())

}
