package ch.jug.introduction.kotlin.k_reifiedTypeParameters.j;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ShapeHolderJava {

    private List<Shape> shapes = new ArrayList<>();

    /**
     * Wegen der type erasure kann zur Laufzeit nicht auf den parametrisierten Typ T
     * zugegriffen werden. Es muss ein Class object als Parameter verwendet werden damit der
     * Instance check gemacht werden kann.
     */
    public <T extends Shape> List<T> filterByType(Class<T> typeToFilter) {
        return this.shapes.stream()
                .filter(typeToFilter::isInstance)
                .map(shape -> (T) shape)
                .collect(Collectors.toList());
    }

    public <T extends Shape> void addShape(T shape) {
        this.shapes.add(shape);
    }
}


