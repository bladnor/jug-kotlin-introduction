package ch.jug.introduction.kotlin.j_smartcasts

interface Shape {
    fun area(): Double
}

class Circle(val radius: Double) : Shape {
    override fun area(): Double {
        return radius * radius * Math.PI
    }
}

class Square(val edge: Double) : Shape {
    override fun area(): Double {
        return edge * edge
    }
}

//***
fun main(args: Array<String>) {
    val shape : Shape = Circle(2.0)

    if (shape is Circle) {
        println(shape.radius)
    } else if (shape is Square) {
        println(shape.edge)
    } else {
        print(shape.area())
    }

    // 'if' expessions wie oben können in kotlin mit 'when' ersetzt werden
    when (shape) {
        is Circle -> println(shape.radius)
        is Square -> println(shape.edge)
        else -> println(shape.area())
    }
}
