package lab5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testPerimeter() {
        Point center = new Point(0, 0);
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        double perimeter = circle.perimeter();
        assertEquals(2 * Math.PI * radius, perimeter);
    }

    @Test
    void testArea() {
        Point center = new Point(0, 0);
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        double area = circle.area();
        assertEquals(Math.PI * radius * radius, area);
    }

    @Test
    void testIsCircleTrue() {
        Point center = new Point(0, 0);
        double radius = 5.0;
        Circle circle = new Circle(center, radius);
        assertTrue(circle.isCircle());
    }

    @Test
    void testIsCircleFalse() {
        Point center = new Point(0, 0);
        double radius = 0.0;
        Circle circle = new Circle(center, radius);
        assertFalse(circle.isCircle());
    }
}