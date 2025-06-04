import java.util.ArrayList;
import java.util.List;

/*
Problem description:
Can you fix the code so that sumAllAreas() works with Shape and all its subtypes ?
 */
class ShapeUtilities {

    public static double sumAllAreas(List<? extends Shape> shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes)
            totalArea += shape.getArea();
        return totalArea;
    }

}
