package lab4;

public class Rectangle {
    private Point tLeft;
    private Point tRight;
    private Point bRight;
    private Point bLeft;


    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.bRight = p1;
        this.tLeft = p2;
        this.bRight = p3;
        this.bLeft = p4;
    }

    public double getArea() {
    	double w = Math.abs(this.tRight.x - this.bLeft.x);
    	double l = Math.abs(this.tRight.y - this.bLeft.y);

        return w*l;
    }

    public double getPerimeter(Rectangle r1) {
    	double w = Math.abs(this.tRight.x - this.bLeft.x);
    	double l = Math.abs(this.tRight.y - this.bLeft.y);

        return 2 * (w + l);
    }

}

