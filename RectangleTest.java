
package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testGetPerimeter() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(5, 4);
        Point p4 = new Point(5, 0);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        assertEquals(18, rectangle.getPerimeter(rectangle), "The perimeter should be 18");
    }

    @Test
    public void testRectangleConstructor() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 4);
        Point p3 = new Point(5, 4);
        Point p4 = new Point(5, 0);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);
        assertNotNull(rectangle, "The rectangle object should be created");
    }
}
