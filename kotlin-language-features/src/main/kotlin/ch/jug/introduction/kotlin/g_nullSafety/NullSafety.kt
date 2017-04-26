package ch.jug.introduction.kotlin.g_nullSafety


//var nonNullableType: String = null
var nonNullableType: String = "abc"

var nullableType: String? = null


//***
fun main(args: Array<String>) {

    val lengthA = nullableType?.length
    println("Länge: $lengthA")

    val lengthB = nonNullableType.length
    println("Länge: $lengthB")

}


