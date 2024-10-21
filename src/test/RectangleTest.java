import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testGetArea() {
        // 创建四个点，分别表示矩形的顶点
        Point p1 = new Point(0, 0);  // bottom-left
        Point p2 = new Point(0, 4);  // top-left
        Point p3 = new Point(5, 4);  // top-right
        Point p4 = new Point(5, 0);  // bottom-right

        // 创建矩形对象
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);

        // 计算面积
        double expectedArea = 20.0;  // 5 * 4 = 20
        double actualArea = rectangle.getArea();

        // 断言：实际面积应与预期的面积相同
        assertEquals(expectedArea, actualArea, 0.001);
    }
