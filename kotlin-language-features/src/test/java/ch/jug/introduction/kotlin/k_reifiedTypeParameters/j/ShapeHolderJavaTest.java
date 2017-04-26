package ch.jug.introduction.kotlin.k_reifiedTypeParameters.j;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ShapeHolderJavaTest {

    @Test
    public void testCircleShapeHolder() {
        final ShapeHolderJava shapeHolder = new ShapeHolderJava();
        shapeHolder.addShape(new Rectangle());
        shapeHolder.addShape(new Rectangle());
        shapeHolder.addShape(new Circle());

        final List<Circle> circles = shapeHolder.filterByType(Circle.class);
        Assert.assertEquals(1,circles.size());
    }
}