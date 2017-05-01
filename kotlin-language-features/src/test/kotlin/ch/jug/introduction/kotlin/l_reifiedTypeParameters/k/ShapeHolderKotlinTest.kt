package ch.jug.introduction.kotlin.l_reifiedTypeParameters.k

import org.junit.Assert
import org.junit.Test

class ShapeHolderKotlinTest {

    @Test
    fun testCircleShapeHolder() {
        val shapeHolder = ShapeHolderKotlin()
        shapeHolder.addShape(Rectangle())
        shapeHolder.addShape(Rectangle())
        shapeHolder.addShape(Circle())

        val circles: List<Circle> = shapeHolder.filterByType<Circle>()
        Assert.assertEquals( 1, circles.size)
    }
}