package ch.jug.introduction.kotlin.g_nullSafety


var nonNullableType: String = "abc"

var nullableType: String? = null

//var nonNullableTypeForcedNullInit: String

//***
fun main(args: Array<String>) {

    val lengthA = nullableType?.length
    println("Länge: $lengthA")

    val lengthB = nonNullableType.length
    println("Länge: $lengthB")

    // Zuweisung einer nicht nullable Typs zu einem nullable Typ geht
    nullableType = nonNullableType

//     Zuweisung eines nullable Typs zu einem nicht nullable Typ geht nicht
//    nonNullableType = nullableType
}


