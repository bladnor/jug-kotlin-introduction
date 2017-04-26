package ch.jug.introduction.kotlin.o_sealedClasses

/**
 * - Seald classes definieren ein 'geschlossenes' Set an Subklassen
 * - Wenn sealed classes in einer when expression verwendet werden, sorgt der
 *   Compiler dafür dass alle branches behandelt werden.
 *
 */
sealed class Shapes {
    class Circle(val radius: Double) : Shapes() {
        fun area(): Double {
            return radius * radius * Math.PI
        }
    }

    class Square(val edge: Double) : Shapes() {
        fun area(): Double {
            return edge * edge
        }
    }
}

/**
 *  Seit Kotlin 1.1 können Subklassen einer 'sealed' Klasse im gleichen File aber ausserhalb
 *  der 'sealed' Klasse definiert werden.
 */
class Rectangle(val longEdge: Double, val shortEdge: Double) : Shapes() {
    fun area(): Double {
        return longEdge * shortEdge
    }
}


fun area(shape: Shapes): Double =
        when (shape) {
            is Shapes.Circle -> shape.area()
            is Shapes.Square -> shape.area()
            is Rectangle -> shape.area()
        }

//***
fun main(args: Array<String>) {
    val area = area(Shapes.Circle(1.0))
    println(area)

}

