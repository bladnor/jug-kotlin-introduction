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

    // Unsafe cast geht immer. In diesem Fall führt das aber zu einer kotlin.TypeCastException
    val convertedToNonNullable: String = nullableType as String
    nonNullableType = convertedToNonNullable

//     Zuweisung eines nullable Typs zu einem nicht nullable Typ geht nicht
//    nonNullableType = nullableType

    // Zuweisung einer nicht nullable Typs zu einem nullable Typ geht
    nullableType = nonNullableType

}


