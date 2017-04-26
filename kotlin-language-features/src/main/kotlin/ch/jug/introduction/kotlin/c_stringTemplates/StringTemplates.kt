package ch.jug.introduction.kotlin.c_stringTemplates


fun simpleName() {
    val i = 10
    println("der index ist: $i")
}

fun expressionInCurlyBraces() {
    val s = "abc"
    println("die länge von $s beträgt $s.length")
}

//***
fun main(args: Array<String>) {
    simpleName()
    expressionInCurlyBraces()
}
