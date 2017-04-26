package ch.jug.introduction.kotlin.l_reifiedTypeParameters.k

import kotlin.streams.toList


/**
 * Restriktionen zu reified type parametern aus dem Buch 'Kotlin in Action'
 *
 * Was man machen kann:
 * - In type checks and casts (is, !is, as, as?)
 * - To use the Kotlin reflection APIs
 * - To get the corresponding java.lang.Class (::class.java)
 * - As a type argument to call other functions
 *
 * Was man nicht machen kann:
 * - Create new instances of the class specified as a type parameter
 * - Call methods on the companion object of the type parameter class
 * - Use a non-reified type parameter as a type argument when calling a function with a reified type parameter
 * - Mark type parameters of classes, properties, or non-inline functions as reified
 */
internal class ShapeHolderKotlin {

    private val shapes = mutableListOf<Shape>()

    /**
     * In Kotlin kann der parametrisierte Typ für den 'is' (instance) check
     * verwendet werden, wenn die function als 'inline' definiert ist und für den
     * Typ Parameter der 'reified' modifier verwendet wird.
     */
    inline fun <reified T : Shape> filterByType(): List<T> {
        return this.shapes.stream()
                .filter { it is T }
                .map { it as T }
                .toList()
    }

    fun <T : Shape> addShape(shape: T) {
        this.shapes.add(shape)
    }
}

internal abstract class Shape {
    private val color: String? = null
}

internal class Rectangle : Shape()
internal class Circle : Shape()


/**
 * Kotlin hat in der Standard Library eine Extension Function die das gleiche erledigt
 */
fun main(args: Array<String>) {
    val list = mutableListOf<Shape>()
    list.add(Rectangle())
    list.add(Rectangle())
    list.add(Circle())

    val filteredList = list.filterIsInstance<Circle>()
    println(filteredList.size)

}

