import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testGetArea() {
        
        Point p1 = new Point(0, 0);  
        Point p2 = new Point(0, 4);  
        Point p3 = new Point(5, 4);  
        Point p4 = new Point(5, 0); 

       
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);

 
        double expectedArea = 20.0;  // 5 * 4 = 20
        double actualArea = rectangle.getArea();


        assertEquals(expectedArea, actualArea, 0.001);
    }
